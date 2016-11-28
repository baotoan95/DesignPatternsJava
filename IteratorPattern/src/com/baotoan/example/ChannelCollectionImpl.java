package com.baotoan.example;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
	private List<Channel> channelsList;
	
	public ChannelCollectionImpl() {
		this.channelsList = new ArrayList<>();
	}

	@Override
	public void addChannel(Channel channel) {
		this.channelsList.add(channel);
	}

	@Override
	public void deleteChannel(Channel channel) {
		this.channelsList.remove(channel);
	}

	@Override
	public ChannelIterator iterator(ChannelType channelType) {
		return new ChannelIteratorImpl(channelType, channelsList);
	}
	
}
