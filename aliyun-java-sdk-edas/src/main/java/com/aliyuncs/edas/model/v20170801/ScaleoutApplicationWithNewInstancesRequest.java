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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ScaleoutApplicationWithNewInstancesRequest extends RoaAcsRequest<ScaleoutApplicationWithNewInstancesResponse> {
	   

	private String templateVersion;

	private String templateInstanceId;

	private String appId;

	private String groupId;

	private Integer scalingNum;

	private String templateId;

	private String scalingPolicy;
	public ScaleoutApplicationWithNewInstancesRequest() {
		super("Edas", "2017-08-01", "ScaleoutApplicationWithNewInstances", "edas");
		setUriPattern("/pop/v5/scaling/scale_out");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}

	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
		if(templateVersion != null){
			putQueryParameter("TemplateVersion", templateVersion);
		}
	}

	public String getTemplateInstanceId() {
		return this.templateInstanceId;
	}

	public void setTemplateInstanceId(String templateInstanceId) {
		this.templateInstanceId = templateInstanceId;
		if(templateInstanceId != null){
			putQueryParameter("TemplateInstanceId", templateInstanceId);
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

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public Integer getScalingNum() {
		return this.scalingNum;
	}

	public void setScalingNum(Integer scalingNum) {
		this.scalingNum = scalingNum;
		if(scalingNum != null){
			putQueryParameter("ScalingNum", scalingNum.toString());
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	public String getScalingPolicy() {
		return this.scalingPolicy;
	}

	public void setScalingPolicy(String scalingPolicy) {
		this.scalingPolicy = scalingPolicy;
		if(scalingPolicy != null){
			putQueryParameter("ScalingPolicy", scalingPolicy);
		}
	}

	@Override
	public Class<ScaleoutApplicationWithNewInstancesResponse> getResponseClass() {
		return ScaleoutApplicationWithNewInstancesResponse.class;
	}

}
