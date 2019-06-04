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

/**
 * @author auto create
 * @version 
 */
public class SetLiveStreamDelayConfigRequest extends RpcAcsRequest<SetLiveStreamDelayConfigResponse> {
	
	public SetLiveStreamDelayConfigRequest() {
		super("live", "2016-11-01", "SetLiveStreamDelayConfig", "live");
	}

	private String flvLevel;

	private String hlsLevel;

	private Integer rtmpDelay;

	private String domainName;

	private Long ownerId;

	private Integer flvDelay;

	private String rtmpLevel;

	private Integer hlsDelay;

	public String getFlvLevel() {
		return this.flvLevel;
	}

	public void setFlvLevel(String flvLevel) {
		this.flvLevel = flvLevel;
		if(flvLevel != null){
			putQueryParameter("FlvLevel", flvLevel);
		}
	}

	public String getHlsLevel() {
		return this.hlsLevel;
	}

	public void setHlsLevel(String hlsLevel) {
		this.hlsLevel = hlsLevel;
		if(hlsLevel != null){
			putQueryParameter("HlsLevel", hlsLevel);
		}
	}

	public Integer getRtmpDelay() {
		return this.rtmpDelay;
	}

	public void setRtmpDelay(Integer rtmpDelay) {
		this.rtmpDelay = rtmpDelay;
		if(rtmpDelay != null){
			putQueryParameter("RtmpDelay", rtmpDelay.toString());
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

	public Integer getFlvDelay() {
		return this.flvDelay;
	}

	public void setFlvDelay(Integer flvDelay) {
		this.flvDelay = flvDelay;
		if(flvDelay != null){
			putQueryParameter("FlvDelay", flvDelay.toString());
		}
	}

	public String getRtmpLevel() {
		return this.rtmpLevel;
	}

	public void setRtmpLevel(String rtmpLevel) {
		this.rtmpLevel = rtmpLevel;
		if(rtmpLevel != null){
			putQueryParameter("RtmpLevel", rtmpLevel);
		}
	}

	public Integer getHlsDelay() {
		return this.hlsDelay;
	}

	public void setHlsDelay(Integer hlsDelay) {
		this.hlsDelay = hlsDelay;
		if(hlsDelay != null){
			putQueryParameter("HlsDelay", hlsDelay.toString());
		}
	}

	@Override
	public Class<SetLiveStreamDelayConfigResponse> getResponseClass() {
		return SetLiveStreamDelayConfigResponse.class;
	}

}
