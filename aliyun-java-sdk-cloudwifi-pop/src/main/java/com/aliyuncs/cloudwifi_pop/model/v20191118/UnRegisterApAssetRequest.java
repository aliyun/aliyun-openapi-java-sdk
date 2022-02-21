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
public class UnRegisterApAssetRequest extends RpcAcsRequest<UnRegisterApAssetResponse> {
	   

	private String appName;

	private Long assetApgroupId;

	private Integer useFor;

	private String appCode;

	private Long id;

	private Integer category;

	private String mac;

	private String serialNo;
	public UnRegisterApAssetRequest() {
		super("cloudwifi-pop", "2019-11-18", "UnRegisterApAsset", "cloudap");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getAssetApgroupId() {
		return this.assetApgroupId;
	}

	public void setAssetApgroupId(Long assetApgroupId) {
		this.assetApgroupId = assetApgroupId;
		if(assetApgroupId != null){
			putQueryParameter("AssetApgroupId", assetApgroupId.toString());
		}
	}

	public Integer getUseFor() {
		return this.useFor;
	}

	public void setUseFor(Integer useFor) {
		this.useFor = useFor;
		if(useFor != null){
			putQueryParameter("UseFor", useFor.toString());
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

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
		if(mac != null){
			putQueryParameter("Mac", mac);
		}
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
		if(serialNo != null){
			putQueryParameter("SerialNo", serialNo);
		}
	}

	@Override
	public Class<UnRegisterApAssetResponse> getResponseClass() {
		return UnRegisterApAssetResponse.class;
	}

}
