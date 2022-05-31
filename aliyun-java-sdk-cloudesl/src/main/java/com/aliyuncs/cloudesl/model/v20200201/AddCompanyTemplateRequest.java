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
public class AddCompanyTemplateRequest extends RpcAcsRequest<AddCompanyTemplateResponse> {
	   

	private String extraParams;

	private String eslSize;

	private Boolean ifPromotion;

	private String deviceType;

	private String scene;

	private String templateVersion;

	private String templateType;

	private String vendor;

	private Boolean ifDefault;

	private String templateName;

	private Boolean ifSourceCode;

	private Boolean ifMember;

	private Integer layout;

	private Boolean ifOutOfInventory;
	public AddCompanyTemplateRequest() {
		super("cloudesl", "2020-02-01", "AddCompanyTemplate");
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

	public String getEslSize() {
		return this.eslSize;
	}

	public void setEslSize(String eslSize) {
		this.eslSize = eslSize;
		if(eslSize != null){
			putBodyParameter("EslSize", eslSize);
		}
	}

	public Boolean getIfPromotion() {
		return this.ifPromotion;
	}

	public void setIfPromotion(Boolean ifPromotion) {
		this.ifPromotion = ifPromotion;
		if(ifPromotion != null){
			putBodyParameter("IfPromotion", ifPromotion.toString());
		}
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putBodyParameter("DeviceType", deviceType);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putBodyParameter("Scene", scene);
		}
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}

	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
		if(templateVersion != null){
			putBodyParameter("TemplateVersion", templateVersion);
		}
	}

	public String getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
		if(templateType != null){
			putBodyParameter("TemplateType", templateType);
		}
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
		if(vendor != null){
			putBodyParameter("Vendor", vendor);
		}
	}

	public Boolean getIfDefault() {
		return this.ifDefault;
	}

	public void setIfDefault(Boolean ifDefault) {
		this.ifDefault = ifDefault;
		if(ifDefault != null){
			putBodyParameter("IfDefault", ifDefault.toString());
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putBodyParameter("TemplateName", templateName);
		}
	}

	public Boolean getIfSourceCode() {
		return this.ifSourceCode;
	}

	public void setIfSourceCode(Boolean ifSourceCode) {
		this.ifSourceCode = ifSourceCode;
		if(ifSourceCode != null){
			putBodyParameter("IfSourceCode", ifSourceCode.toString());
		}
	}

	public Boolean getIfMember() {
		return this.ifMember;
	}

	public void setIfMember(Boolean ifMember) {
		this.ifMember = ifMember;
		if(ifMember != null){
			putBodyParameter("IfMember", ifMember.toString());
		}
	}

	public Integer getLayout() {
		return this.layout;
	}

	public void setLayout(Integer layout) {
		this.layout = layout;
		if(layout != null){
			putBodyParameter("Layout", layout.toString());
		}
	}

	public Boolean getIfOutOfInventory() {
		return this.ifOutOfInventory;
	}

	public void setIfOutOfInventory(Boolean ifOutOfInventory) {
		this.ifOutOfInventory = ifOutOfInventory;
		if(ifOutOfInventory != null){
			putBodyParameter("IfOutOfInventory", ifOutOfInventory.toString());
		}
	}

	@Override
	public Class<AddCompanyTemplateResponse> getResponseClass() {
		return AddCompanyTemplateResponse.class;
	}

}
