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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PutRecordStorageLifeCycleRequest extends RpcAcsRequest<PutRecordStorageLifeCycleResponse> {
	   

	@SerializedName("streamIds")
	private List<String> streamIds;

	private Long unixTimestamp;

	private String tag;
	public PutRecordStorageLifeCycleRequest() {
		super("live", "2016-11-01", "PutRecordStorageLifeCycle", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getStreamIds() {
		return this.streamIds;
	}

	public void setStreamIds(List<String> streamIds) {
		this.streamIds = streamIds;	
		if (streamIds != null) {
			putBodyParameter("StreamIds" , new Gson().toJson(streamIds));
		}	
	}

	public Long getUnixTimestamp() {
		return this.unixTimestamp;
	}

	public void setUnixTimestamp(Long unixTimestamp) {
		this.unixTimestamp = unixTimestamp;
		if(unixTimestamp != null){
			putBodyParameter("UnixTimestamp", unixTimestamp.toString());
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putBodyParameter("Tag", tag);
		}
	}

	@Override
	public Class<PutRecordStorageLifeCycleResponse> getResponseClass() {
		return PutRecordStorageLifeCycleResponse.class;
	}

}
