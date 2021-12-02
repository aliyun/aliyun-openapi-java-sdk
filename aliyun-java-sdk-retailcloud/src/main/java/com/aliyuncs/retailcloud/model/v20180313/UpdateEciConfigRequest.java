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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateEciConfigRequest extends RpcAcsRequest<UpdateEciConfigResponse> {
	   

	private Boolean scheduleVirtualNode;

	private Boolean enableEciSchedulePolicy;

	private Boolean mirrorCache;

	private Integer normalInstanceLimit;

	private Long appEnvId;

	private Integer eipBandwidth;
	public UpdateEciConfigRequest() {
		super("retailcloud", "2018-03-13", "UpdateEciConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getScheduleVirtualNode() {
		return this.scheduleVirtualNode;
	}

	public void setScheduleVirtualNode(Boolean scheduleVirtualNode) {
		this.scheduleVirtualNode = scheduleVirtualNode;
		if(scheduleVirtualNode != null){
			putQueryParameter("ScheduleVirtualNode", scheduleVirtualNode.toString());
		}
	}

	public Boolean getEnableEciSchedulePolicy() {
		return this.enableEciSchedulePolicy;
	}

	public void setEnableEciSchedulePolicy(Boolean enableEciSchedulePolicy) {
		this.enableEciSchedulePolicy = enableEciSchedulePolicy;
		if(enableEciSchedulePolicy != null){
			putQueryParameter("EnableEciSchedulePolicy", enableEciSchedulePolicy.toString());
		}
	}

	public Boolean getMirrorCache() {
		return this.mirrorCache;
	}

	public void setMirrorCache(Boolean mirrorCache) {
		this.mirrorCache = mirrorCache;
		if(mirrorCache != null){
			putQueryParameter("MirrorCache", mirrorCache.toString());
		}
	}

	public Integer getNormalInstanceLimit() {
		return this.normalInstanceLimit;
	}

	public void setNormalInstanceLimit(Integer normalInstanceLimit) {
		this.normalInstanceLimit = normalInstanceLimit;
		if(normalInstanceLimit != null){
			putQueryParameter("NormalInstanceLimit", normalInstanceLimit.toString());
		}
	}

	public Long getAppEnvId() {
		return this.appEnvId;
	}

	public void setAppEnvId(Long appEnvId) {
		this.appEnvId = appEnvId;
		if(appEnvId != null){
			putQueryParameter("AppEnvId", appEnvId.toString());
		}
	}

	public Integer getEipBandwidth() {
		return this.eipBandwidth;
	}

	public void setEipBandwidth(Integer eipBandwidth) {
		this.eipBandwidth = eipBandwidth;
		if(eipBandwidth != null){
			putQueryParameter("EipBandwidth", eipBandwidth.toString());
		}
	}

	@Override
	public Class<UpdateEciConfigResponse> getResponseClass() {
		return UpdateEciConfigResponse.class;
	}

}
