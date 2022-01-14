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
public class SaveApThirdAppRequest extends RpcAcsRequest<SaveApThirdAppResponse> {
	   

	private Integer addStyle;

	private Long apAssetId;

	private String appName;

	private String appCode;

	private String thirdAppName;

	private Long id;

	private Integer category;

	private String version;

	private String mac;

	private String appData;
	public SaveApThirdAppRequest() {
		super("cloudwifi-pop", "2019-11-18", "SaveApThirdApp", "cloudap");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getAddStyle() {
		return this.addStyle;
	}

	public void setAddStyle(Integer addStyle) {
		this.addStyle = addStyle;
		if(addStyle != null){
			putQueryParameter("AddStyle", addStyle.toString());
		}
	}

	public Long getApAssetId() {
		return this.apAssetId;
	}

	public void setApAssetId(Long apAssetId) {
		this.apAssetId = apAssetId;
		if(apAssetId != null){
			putQueryParameter("ApAssetId", apAssetId.toString());
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

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
		if(mac != null){
			putQueryParameter("Mac", mac);
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
	public Class<SaveApThirdAppResponse> getResponseClass() {
		return SaveApThirdAppResponse.class;
	}

}
