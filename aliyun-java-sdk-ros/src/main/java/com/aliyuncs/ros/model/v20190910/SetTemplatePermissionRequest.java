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

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetTemplatePermissionRequest extends RpcAcsRequest<SetTemplatePermissionResponse> {
	   

	private String templateVersion;

	private String templateId;

	private String versionOption;

	private String shareOption;

	private List<String> accountIdss;
	public SetTemplatePermissionRequest() {
		super("ROS", "2019-09-10", "SetTemplatePermission", "ros");
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

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	public String getVersionOption() {
		return this.versionOption;
	}

	public void setVersionOption(String versionOption) {
		this.versionOption = versionOption;
		if(versionOption != null){
			putQueryParameter("VersionOption", versionOption);
		}
	}

	public String getShareOption() {
		return this.shareOption;
	}

	public void setShareOption(String shareOption) {
		this.shareOption = shareOption;
		if(shareOption != null){
			putQueryParameter("ShareOption", shareOption);
		}
	}

	public List<String> getAccountIdss() {
		return this.accountIdss;
	}

	public void setAccountIdss(List<String> accountIdss) {
		this.accountIdss = accountIdss;	
		if (accountIdss != null) {
			for (int i = 0; i < accountIdss.size(); i++) {
				putQueryParameter("AccountIds." + (i + 1) , accountIdss.get(i));
			}
		}	
	}

	@Override
	public Class<SetTemplatePermissionResponse> getResponseClass() {
		return SetTemplatePermissionResponse.class;
	}

}
