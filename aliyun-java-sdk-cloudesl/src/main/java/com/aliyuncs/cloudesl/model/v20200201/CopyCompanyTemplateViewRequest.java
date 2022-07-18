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

package com.aliyuncs.cloudesl.model.v20200201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CopyCompanyTemplateViewRequest extends RpcAcsRequest<CopyCompanyTemplateViewResponse> {
	   

	private String extraParams;

	private String targetName;

	private String modelId;

	private String targetVersion;

	private String templateId;

	private Long targetGroupId;
	public CopyCompanyTemplateViewRequest() {
		super("cloudesl", "2020-02-01", "CopyCompanyTemplateView");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtraParams() {
		return this.extraParams;
	}

	public void setExtraParams(String extraParams) {
		this.extraParams = extraParams;
		if(extraParams != null){
			putBodyParameter("ExtraParams", extraParams);
		}
	}

	public String getTargetName() {
		return this.targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
		if(targetName != null){
			putBodyParameter("TargetName", targetName);
		}
	}

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putBodyParameter("ModelId", modelId);
		}
	}

	public String getTargetVersion() {
		return this.targetVersion;
	}

	public void setTargetVersion(String targetVersion) {
		this.targetVersion = targetVersion;
		if(targetVersion != null){
			putBodyParameter("TargetVersion", targetVersion);
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId);
		}
	}

	public Long getTargetGroupId() {
		return this.targetGroupId;
	}

	public void setTargetGroupId(Long targetGroupId) {
		this.targetGroupId = targetGroupId;
		if(targetGroupId != null){
			putBodyParameter("TargetGroupId", targetGroupId.toString());
		}
	}

	@Override
	public Class<CopyCompanyTemplateViewResponse> getResponseClass() {
		return CopyCompanyTemplateViewResponse.class;
	}

}
