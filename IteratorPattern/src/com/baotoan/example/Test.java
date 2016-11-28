package com.baotoan.example;

public class Test {
	public static void main(String[] args) {
		ChannelCollection channelCollection = popularChannels();
		ChannelIterator channelIterator = channelCollection.iterator(ChannelType.ENGLISH);
		while(channelIterator.hasNext()) {
			System.out.println(channelIterator.next());
		}
	}
	
	private static ChannelCollection popularChannels() {
		ChannelCollection channelCollection = new ChannelCollectionImpl();
		channelCollection.addChannel(new Channel(32.332, ChannelType.ENGLISH));
		channelCollection.addChannel(new Channel(32.332, ChannelType.FRENCH));
		channelCollection.addChannel(new Channel(32.332, ChannelType.ENGLISH));
		channelCollection.addChannel(new Channel(32.332, ChannelType.FRENCH));
		channelCollection.addChannel(new Channel(32.332, ChannelType.ALL));
		channelCollection.addChannel(new Channel(32.332, ChannelType.INDIA));
		channelCollection.addChannel(new Channel(32.332, ChannelType.ENGLISH));
		return channelCollection;
	}
}
