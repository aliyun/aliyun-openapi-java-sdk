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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryLiveStreamingRequest extends RpcAcsRequest<QueryLiveStreamingResponse> {
	   

	private String scheme;

	private Integer encryptType;

	private String iotId;

	private Boolean shouldEncrypt;

	private Integer streamType;
	public QueryLiveStreamingRequest() {
		super("Linkvisual", "2018-01-20", "QueryLiveStreaming", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScheme() {
		return this.scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
		if(scheme != null){
			putQueryParameter("Scheme", scheme);
		}
	}

	public Integer getEncryptType() {
		return this.encryptType;
	}

	public void setEncryptType(Integer encryptType) {
		this.encryptType = encryptType;
		if(encryptType != null){
			putQueryParameter("EncryptType", encryptType.toString());
		}
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId);
		}
	}

	public Boolean getShouldEncrypt() {
		return this.shouldEncrypt;
	}

	public void setShouldEncrypt(Boolean shouldEncrypt) {
		this.shouldEncrypt = shouldEncrypt;
		if(shouldEncrypt != null){
			putQueryParameter("ShouldEncrypt", shouldEncrypt.toString());
		}
	}

	public Integer getStreamType() {
		return this.streamType;
	}

	public void setStreamType(Integer streamType) {
		this.streamType = streamType;
		if(streamType != null){
			putQueryParameter("StreamType", streamType.toString());
		}
	}

	@Override
	public Class<QueryLiveStreamingResponse> getResponseClass() {
		return QueryLiveStreamingResponse.class;
	}

}
