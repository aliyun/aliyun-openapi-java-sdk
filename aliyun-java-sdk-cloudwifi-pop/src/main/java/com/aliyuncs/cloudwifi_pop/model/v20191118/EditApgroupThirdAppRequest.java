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

package com.aliyuncs.cloudwifi_pop.model.v20191118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudwifi_pop.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EditApgroupThirdAppRequest extends RpcAcsRequest<EditApgroupThirdAppResponse> {
	   

	private Integer applyToSubGroup;

	private String configType;

	private Integer inheritParentGroup;

	private String appName;

	private Long apgroupId;

	private String appCode;

	private String thirdAppName;

	private Long id;

	private Integer category;

	private String appData;
	public EditApgroupThirdAppRequest() {
		super("cloudwifi-pop", "2019-11-18", "EditApgroupThirdApp", "cloudap");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getApplyToSubGroup() {
		return this.applyToSubGroup;
	}

	public void setApplyToSubGroup(Integer applyToSubGroup) {
		this.applyToSubGroup = applyToSubGroup;
		if(applyToSubGroup != null){
			putQueryParameter("ApplyToSubGroup", applyToSubGroup.toString());
		}
	}

	public String getConfigType() {
		return this.configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
		if(configType != null){
			putQueryParameter("ConfigType", configType);
		}
	}

	public Integer getInheritParentGroup() {
		return this.inheritParentGroup;
	}

	public void setInheritParentGroup(Integer inheritParentGroup) {
		this.inheritParentGroup = inheritParentGroup;
		if(inheritParentGroup != null){
			putQueryParameter("InheritParentGroup", inheritParentGroup.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public Long getApgroupId() {
		return this.apgroupId;
	}

	public void setApgroupId(Long apgroupId) {
		this.apgroupId = apgroupId;
		if(apgroupId != null){
			putQueryParameter("ApgroupId", apgroupId.toString());
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	public String getThirdAppName() {
		return this.thirdAppName;
	}

	public void setThirdAppName(String thirdAppName) {
		this.thirdAppName = thirdAppName;
		if(thirdAppName != null){
			putQueryParameter("ThirdAppName", thirdAppName);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public Integer getCategory() {
		return this.category;
	}

	public void setCategory(Integer category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category.toString());
		}
	}

	public String getAppData() {
		return this.appData;
	}

	public void setAppData(String appData) {
		this.appData = appData;
		if(appData != null){
			putQueryParameter("AppData", appData);
		}
	}

	@Override
	public Class<EditApgroupThirdAppResponse> getResponseClass() {
		return EditApgroupThirdAppResponse.class;
	}

}
