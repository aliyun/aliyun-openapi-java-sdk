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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDesktopSpecRequest extends RpcAcsRequest<ModifyDesktopSpecResponse> {
	   

	private Boolean autoPay;

	private String userDiskPerformanceLevel;

	private String resourceType;

	private String promotionId;

	private Integer userDiskSizeGib;

	private List<ResourceSpecs> resourceSpecss;

	private String desktopId;

	private String desktopType;

	private Integer rootDiskSizeGib;
	public ModifyDesktopSpecRequest() {
		super("ecd", "2020-09-30", "ModifyDesktopSpec", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
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

	public Integer getUserDiskSizeGib() {
		return this.userDiskSizeGib;
	}

	public void setUserDiskSizeGib(Integer userDiskSizeGib) {
		this.userDiskSizeGib = userDiskSizeGib;
		if(userDiskSizeGib != null){
			putQueryParameter("UserDiskSizeGib", userDiskSizeGib.toString());
		}
	}

	public List<ResourceSpecs> getResourceSpecss() {
		return this.resourceSpecss;
	}

	public void setResourceSpecss(List<ResourceSpecs> resourceSpecss) {
		this.resourceSpecss = resourceSpecss;	
		if (resourceSpecss != null) {
			for (int depth1 = 0; depth1 < resourceSpecss.size(); depth1++) {
				putQueryParameter("ResourceSpecs." + (depth1 + 1) + ".UserDiskSizeGib" , resourceSpecss.get(depth1).getUserDiskSizeGib());
				putQueryParameter("ResourceSpecs." + (depth1 + 1) + ".DesktopId" , resourceSpecss.get(depth1).getDesktopId());
				putQueryParameter("ResourceSpecs." + (depth1 + 1) + ".RootDiskSizeGib" , resourceSpecss.get(depth1).getRootDiskSizeGib());
			}
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

	public String getDesktopType() {
		return this.desktopType;
	}

	public void setDesktopType(String desktopType) {
		this.desktopType = desktopType;
		if(desktopType != null){
			putQueryParameter("DesktopType", desktopType);
		}
	}

	public Integer getRootDiskSizeGib() {
		return this.rootDiskSizeGib;
	}

	public void setRootDiskSizeGib(Integer rootDiskSizeGib) {
		this.rootDiskSizeGib = rootDiskSizeGib;
		if(rootDiskSizeGib != null){
			putQueryParameter("RootDiskSizeGib", rootDiskSizeGib.toString());
		}
	}

	public static class ResourceSpecs {

		private Integer userDiskSizeGib;

		private String desktopId;

		private Integer rootDiskSizeGib;

		public Integer getUserDiskSizeGib() {
			return this.userDiskSizeGib;
		}

		public void setUserDiskSizeGib(Integer userDiskSizeGib) {
			this.userDiskSizeGib = userDiskSizeGib;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public Integer getRootDiskSizeGib() {
			return this.rootDiskSizeGib;
		}

		public void setRootDiskSizeGib(Integer rootDiskSizeGib) {
			this.rootDiskSizeGib = rootDiskSizeGib;
		}
	}

	@Override
	public Class<ModifyDesktopSpecResponse> getResponseClass() {
		return ModifyDesktopSpecResponse.class;
	}

}
