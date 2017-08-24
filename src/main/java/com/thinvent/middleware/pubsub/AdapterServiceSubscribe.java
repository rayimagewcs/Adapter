package com.thinvent.middleware.pubsub;

import com.thinvent.library.redis.ThinventSubscribe;

public class AdapterServiceSubscribe extends ThinventSubscribe {
	
	public void onMessage(String channel, String message) {
		// Do nothing because of X and Y.
	}
}
