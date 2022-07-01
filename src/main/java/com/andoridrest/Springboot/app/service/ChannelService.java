package com.andoridrest.Springboot.app.service;

import com.andoridrest.Springboot.app.entity.Channel;
import com.andoridrest.Springboot.app.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class ChannelService {

    @Autowired
    private ChannelRepository channelRepository;

    public Channel createChannel(Channel channel) {
        Optional<Channel> optionalChannel = Optional.ofNullable(channelRepository.findByChannelName(channel.getName()));
        if (optionalChannel.isPresent()){
            return null;
        }
        return channelRepository.save(channel);
    }


}
