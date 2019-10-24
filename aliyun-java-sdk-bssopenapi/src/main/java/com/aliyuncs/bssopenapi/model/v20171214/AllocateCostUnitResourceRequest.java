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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AllocateCostUnitResourceRequest extends RpcAcsRequest<AllocateCostUnitResourceResponse> {
	   

	private List<ResourceInstanceList> resourceInstanceLists;

	private Long fromUnitId;

	private Long toUnitId;

	private Long fromUnitUserId;

	private Long toUnitUserId;
	public AllocateCostUnitResourceRequest() {
		super("BssOpenApi", "2017-12-14", "AllocateCostUnitResource", "bssopenapi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}	public List<ResourceInstanceList> getResourceInstanceLists() {
		return this.resourceInstanceLists;
	}

	public void setResourceInstanceLists(List<ResourceInstanceList> resourceInstanceLists) {
		this.resourceInstanceLists = resourceInstanceLists;	
		if (resourceInstanceLists != null) {
			for (int depth1 = 0; depth1 < resourceInstanceLists.size(); depth1++) {
				putQueryParameter("ResourceInstanceList." + (depth1 + 1) + ".ResourceId" , resourceInstanceLists.get(depth1).getResourceId());
				putQueryParameter("ResourceInstanceList." + (depth1 + 1) + ".CommodityCode" , resourceInstanceLists.get(depth1).getCommodityCode());
				putQueryParameter("ResourceInstanceList." + (depth1 + 1) + ".ResourceUserId" , resourceInstanceLists.get(depth1).getResourceUserId());
			}
		}	
	}



	public Long getFromUnitId() {
		return this.fromUnitId;
	}

	public void setFromUnitId(Long fromUnitId) {
		this.fromUnitId = fromUnitId;
		if(fromUnitId != null){
			putQueryParameter("FromUnitId", fromUnitId.toString());
		}
	}

	public Long getToUnitId() {
		return this.toUnitId;
	}

	public void setToUnitId(Long toUnitId) {
		this.toUnitId = toUnitId;
		if(toUnitId != null){
			putQueryParameter("ToUnitId", toUnitId.toString());
		}
	}

	public Long getFromUnitUserId() {
		return this.fromUnitUserId;
	}

	public void setFromUnitUserId(Long fromUnitUserId) {
		this.fromUnitUserId = fromUnitUserId;
		if(fromUnitUserId != null){
			putQueryParameter("FromUnitUserId", fromUnitUserId.toString());
		}
	}

	public Long getToUnitUserId() {
		return this.toUnitUserId;
	}

	public void setToUnitUserId(Long toUnitUserId) {
		this.toUnitUserId = toUnitUserId;
		if(toUnitUserId != null){
			putQueryParameter("ToUnitUserId", toUnitUserId.toString());
		}
	}

	public static class ResourceInstanceList {

		private String resourceId;

		private String commodityCode;

		private Long resourceUserId;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public Long getResourceUserId() {
			return this.resourceUserId;
		}

		public void setResourceUserId(Long resourceUserId) {
			this.resourceUserId = resourceUserId;
		}
	}

	@Override
	public Class<AllocateCostUnitResourceResponse> getResponseClass() {
		return AllocateCostUnitResourceResponse.class;
	}

}
