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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyGroupRequest extends RpcAcsRequest<ModifyGroupResponse> {
	   

	private Integer captureVideo;

	private String description;

	private Boolean enabled;

	private String captureOssPath;

	private String pushDomain;

	private Integer captureImage;

	private String id;

	private String playDomain;

	private String outProtocol;

	private Integer captureInterval;

	private Long ownerId;

	private String inProtocol;

	private Boolean lazyPull;

	private String name;

	private String callback;

	private String region;

	private String captureOssBucket;
	public ModifyGroupRequest() {
		super("vs", "2018-12-12", "ModifyGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getCaptureVideo() {
		return this.captureVideo;
	}

	public void setCaptureVideo(Integer captureVideo) {
		this.captureVideo = captureVideo;
		if(captureVideo != null){
			putQueryParameter("CaptureVideo", captureVideo.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putQueryParameter("Enabled", enabled.toString());
		}
	}

	public String getCaptureOssPath() {
		return this.captureOssPath;
	}

	public void setCaptureOssPath(String captureOssPath) {
		this.captureOssPath = captureOssPath;
		if(captureOssPath != null){
			putQueryParameter("CaptureOssPath", captureOssPath);
		}
	}

	public String getPushDomain() {
		return this.pushDomain;
	}

	public void setPushDomain(String pushDomain) {
		this.pushDomain = pushDomain;
		if(pushDomain != null){
			putQueryParameter("PushDomain", pushDomain);
		}
	}

	public Integer getCaptureImage() {
		return this.captureImage;
	}

	public void setCaptureImage(Integer captureImage) {
		this.captureImage = captureImage;
		if(captureImage != null){
			putQueryParameter("CaptureImage", captureImage.toString());
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getPlayDomain() {
		return this.playDomain;
	}

	public void setPlayDomain(String playDomain) {
		this.playDomain = playDomain;
		if(playDomain != null){
			putQueryParameter("PlayDomain", playDomain);
		}
	}

	public String getOutProtocol() {
		return this.outProtocol;
	}

	public void setOutProtocol(String outProtocol) {
		this.outProtocol = outProtocol;
		if(outProtocol != null){
			putQueryParameter("OutProtocol", outProtocol);
		}
	}

	public Integer getCaptureInterval() {
		return this.captureInterval;
	}

	public void setCaptureInterval(Integer captureInterval) {
		this.captureInterval = captureInterval;
		if(captureInterval != null){
			putQueryParameter("CaptureInterval", captureInterval.toString());
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

	public String getInProtocol() {
		return this.inProtocol;
	}

	public void setInProtocol(String inProtocol) {
		this.inProtocol = inProtocol;
		if(inProtocol != null){
			putQueryParameter("InProtocol", inProtocol);
		}
	}

	public Boolean getLazyPull() {
		return this.lazyPull;
	}

	public void setLazyPull(Boolean lazyPull) {
		this.lazyPull = lazyPull;
		if(lazyPull != null){
			putQueryParameter("LazyPull", lazyPull.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getCallback() {
		return this.callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
		if(callback != null){
			putQueryParameter("Callback", callback);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getCaptureOssBucket() {
		return this.captureOssBucket;
	}

	public void setCaptureOssBucket(String captureOssBucket) {
		this.captureOssBucket = captureOssBucket;
		if(captureOssBucket != null){
			putQueryParameter("CaptureOssBucket", captureOssBucket);
		}
	}

	@Override
	public Class<ModifyGroupResponse> getResponseClass() {
		return ModifyGroupResponse.class;
	}

}
