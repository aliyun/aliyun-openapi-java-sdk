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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushFaultEventRequest extends RpcAcsRequest<PushFaultEventResponse> {
	   

	private String faultComment;

	private Long time;

	private Integer type;

	private String deviceSn;

	private String channelId;

	private String faultType;
	public PushFaultEventRequest() {
		super("UniMkt", "2018-12-12", "PushFaultEvent", "1.0.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFaultComment() {
		return this.faultComment;
	}

	public void setFaultComment(String faultComment) {
		this.faultComment = faultComment;
		if(faultComment != null){
			putBodyParameter("FaultComment", faultComment);
		}
	}

	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
		if(time != null){
			putBodyParameter("Time", time.toString());
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type.toString());
		}
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
		if(deviceSn != null){
			putBodyParameter("DeviceSn", deviceSn);
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putBodyParameter("ChannelId", channelId);
		}
	}

	public String getFaultType() {
		return this.faultType;
	}

	public void setFaultType(String faultType) {
		this.faultType = faultType;
		if(faultType != null){
			putBodyParameter("FaultType", faultType);
		}
	}

	@Override
	public Class<PushFaultEventResponse> getResponseClass() {
		return PushFaultEventResponse.class;
	}

}
