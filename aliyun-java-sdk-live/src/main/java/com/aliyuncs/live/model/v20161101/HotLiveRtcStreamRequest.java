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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class HotLiveRtcStreamRequest extends RpcAcsRequest<HotLiveRtcStreamResponse> {
	   

	private String videoMsid;

	private String regionCode;

	private String connectionTimeout;

	private String appName;

	private String audioMsid;

	private String mediaTimeout;

	private String streamName;

	private String domainName;

	private Long ownerId;
	public HotLiveRtcStreamRequest() {
		super("live", "2016-11-01", "HotLiveRtcStream", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVideoMsid() {
		return this.videoMsid;
	}

	public void setVideoMsid(String videoMsid) {
		this.videoMsid = videoMsid;
		if(videoMsid != null){
			putQueryParameter("VideoMsid", videoMsid);
		}
	}

	public String getRegionCode() {
		return this.regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
		if(regionCode != null){
			putQueryParameter("RegionCode", regionCode);
		}
	}

	public String getConnectionTimeout() {
		return this.connectionTimeout;
	}

	public void setConnectionTimeout(String connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
		if(connectionTimeout != null){
			putQueryParameter("ConnectionTimeout", connectionTimeout);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getAudioMsid() {
		return this.audioMsid;
	}

	public void setAudioMsid(String audioMsid) {
		this.audioMsid = audioMsid;
		if(audioMsid != null){
			putQueryParameter("AudioMsid", audioMsid);
		}
	}

	public String getMediaTimeout() {
		return this.mediaTimeout;
	}

	public void setMediaTimeout(String mediaTimeout) {
		this.mediaTimeout = mediaTimeout;
		if(mediaTimeout != null){
			putQueryParameter("MediaTimeout", mediaTimeout);
		}
	}

	public String getStreamName() {
		return this.streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
		if(streamName != null){
			putQueryParameter("StreamName", streamName);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<HotLiveRtcStreamResponse> getResponseClass() {
		return HotLiveRtcStreamResponse.class;
	}

}
