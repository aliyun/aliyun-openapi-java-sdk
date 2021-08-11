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

	private Boolean playUnLimited;

	private Integer encryptType;

	private Integer cacheDuration;

	private String iotId;

	private Boolean forceIFrame;

	private String iotInstanceId;

	private Boolean shouldEncrypt;

	private Integer streamType;

	private Integer urlValidDuration;
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

	public Boolean getPlayUnLimited() {
		return this.playUnLimited;
	}

	public void setPlayUnLimited(Boolean playUnLimited) {
		this.playUnLimited = playUnLimited;
		if(playUnLimited != null){
			putQueryParameter("PlayUnLimited", playUnLimited.toString());
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

	public Integer getCacheDuration() {
		return this.cacheDuration;
	}

	public void setCacheDuration(Integer cacheDuration) {
		this.cacheDuration = cacheDuration;
		if(cacheDuration != null){
			putQueryParameter("CacheDuration", cacheDuration.toString());
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

	public Boolean getForceIFrame() {
		return this.forceIFrame;
	}

	public void setForceIFrame(Boolean forceIFrame) {
		this.forceIFrame = forceIFrame;
		if(forceIFrame != null){
			putQueryParameter("ForceIFrame", forceIFrame.toString());
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
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

	public Integer getUrlValidDuration() {
		return this.urlValidDuration;
	}

	public void setUrlValidDuration(Integer urlValidDuration) {
		this.urlValidDuration = urlValidDuration;
		if(urlValidDuration != null){
			putQueryParameter("UrlValidDuration", urlValidDuration.toString());
		}
	}

	@Override
	public Class<QueryLiveStreamingResponse> getResponseClass() {
		return QueryLiveStreamingResponse.class;
	}

}
