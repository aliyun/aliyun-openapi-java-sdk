/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateEventSubRequest extends RpcAcsRequest<UpdateEventSubResponse> {
	   

	private String subscribeId;

	private List<String> userss;

	private String appId;

	private String callbackUrl;

	private String channelId;

	private List<String> eventss;
	public UpdateEventSubRequest() {
		super("live", "2016-11-01", "UpdateEventSub", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubscribeId() {
		return this.subscribeId;
	}

	public void setSubscribeId(String subscribeId) {
		this.subscribeId = subscribeId;
		if(subscribeId != null){
			putQueryParameter("SubscribeId", subscribeId);
		}
	}

	public List<String> getUserss() {
		return this.userss;
	}

	public void setUserss(List<String> userss) {
		this.userss = userss;	
		if (userss != null) {
			for (int i = 0; i < userss.size(); i++) {
				putQueryParameter("Users." + (i + 1) , userss.get(i));
			}
		}	
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putQueryParameter("CallbackUrl", callbackUrl);
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	public List<String> getEventss() {
		return this.eventss;
	}

	public void setEventss(List<String> eventss) {
		this.eventss = eventss;	
		if (eventss != null) {
			for (int i = 0; i < eventss.size(); i++) {
				putQueryParameter("Events." + (i + 1) , eventss.get(i));
			}
		}	
	}

	@Override
	public Class<UpdateEventSubResponse> getResponseClass() {
		return UpdateEventSubResponse.class;
	}

}
