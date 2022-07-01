package com.andoridrest.Springboot.app.controller;

import com.andoridrest.Springboot.app.entity.Channel;
import com.andoridrest.Springboot.app.repository.ChannelRepository;
import com.andoridrest.Springboot.app.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ChannelController {

    @Autowired
    private ChannelService channelService;

    @Autowired
    private ChannelRepository channelRepository;

    @PostMapping("/channel")
    public Channel createChannel(@RequestBody Channel channel) {
        return channelService.createChannel(channel);
    }

    @GetMapping("/channels")
    public List<Channel> getAllChannel() {
        return channelRepository.findAll();
    }

    @GetMapping("/channel/{id}")
    public ResponseEntity<Channel> getChannelById(@PathVariable("id") long id) {
        Optional<Channel> channelOptional = channelRepository.findById(id);
        return channelOptional.map(channel -> new ResponseEntity<>(channel, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/channel/{id}")
    public ResponseEntity<Channel> updateChannel(@PathVariable("id") long id, @RequestBody Channel channel) {
        Optional<Channel> channelOptional = channelRepository.findById(id);
        Optional<Channel> channelOptional1 = Optional.ofNullable(channelRepository.findByChannelName(channel.getName()));
        if (channelOptional1.isPresent()) {
            return null;
        }
        if (channelOptional.isPresent()) {
            Channel _channel = channelOptional.get();
            _channel.setName(channel.getName());
            _channel.setDescription(channel.getDescription());
            _channel.setImage(channel.getImage());
            return new ResponseEntity<>(channelRepository.save(_channel), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/channel/{id}")
    public ResponseEntity<HttpStatus> deleteChannelById(@PathVariable("id") long id) {
        try {
            channelRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/channels")
    public ResponseEntity<HttpStatus> deleteAllChannels() {
        try {
            channelRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
