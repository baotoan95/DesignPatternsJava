package com.baotoan.example;

public interface ChannelCollection {
	public void addChannel(Channel channel);
	public void deleteChannel(Channel channel);
	public ChannelIterator iterator(ChannelType channelType);
}
