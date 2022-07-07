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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDiskSpecRequest extends RpcAcsRequest<ModifyDiskSpecResponse> {
	   

	private String rootDiskPerformanceLevel;

	private Boolean autoPay;

	private String userDiskPerformanceLevel;

	private String promotionId;

	private String desktopId;
	public ModifyDiskSpecRequest() {
		super("ecd", "2020-09-30", "ModifyDiskSpec");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRootDiskPerformanceLevel() {
		return this.rootDiskPerformanceLevel;
	}

	public void setRootDiskPerformanceLevel(String rootDiskPerformanceLevel) {
		this.rootDiskPerformanceLevel = rootDiskPerformanceLevel;
		if(rootDiskPerformanceLevel != null){
			putQueryParameter("RootDiskPerformanceLevel", rootDiskPerformanceLevel);
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public String getUserDiskPerformanceLevel() {
		return this.userDiskPerformanceLevel;
	}

	public void setUserDiskPerformanceLevel(String userDiskPerformanceLevel) {
		this.userDiskPerformanceLevel = userDiskPerformanceLevel;
		if(userDiskPerformanceLevel != null){
			putQueryParameter("UserDiskPerformanceLevel", userDiskPerformanceLevel);
		}
	}

	public String getPromotionId() {
		return this.promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
		if(promotionId != null){
			putQueryParameter("PromotionId", promotionId);
		}
	}

	public String getDesktopId() {
		return this.desktopId;
	}

	public void setDesktopId(String desktopId) {
		this.desktopId = desktopId;
		if(desktopId != null){
			putQueryParameter("DesktopId", desktopId);
		}
	}

	@Override
	public Class<ModifyDiskSpecResponse> getResponseClass() {
		return ModifyDiskSpecResponse.class;
	}

}
