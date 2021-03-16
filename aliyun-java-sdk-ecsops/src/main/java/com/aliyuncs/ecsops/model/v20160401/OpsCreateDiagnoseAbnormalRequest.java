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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsCreateDiagnoseAbnormalRequest extends RpcAcsRequest<OpsCreateDiagnoseAbnormalResponse> {
	   

	private List<String> resourceIds;

	private List<Item> items;

	private String resourceType;
	public OpsCreateDiagnoseAbnormalRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateDiagnoseAbnormal", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getResourceIds() {
		return this.resourceIds;
	}

	public void setResourceIds(List<String> resourceIds) {
		this.resourceIds = resourceIds;	
		if (resourceIds != null) {
			for (int i = 0; i < resourceIds.size(); i++) {
				putQueryParameter("ResourceId." + (i + 1) , resourceIds.get(i));
			}
		}	
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;	
		if (items != null) {
			for (int depth1 = 0; depth1 < items.size(); depth1++) {
				putQueryParameter("Item." + (depth1 + 1) + ".ItemCategory" , items.get(depth1).getItemCategory());
				putQueryParameter("Item." + (depth1 + 1) + ".ItemCode" , items.get(depth1).getItemCode());
				putQueryParameter("Item." + (depth1 + 1) + ".Message" , items.get(depth1).getMessage());
			}
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

	public static class Item {

		private String itemCategory;

		private String itemCode;

		private String message;

		public String getItemCategory() {
			return this.itemCategory;
		}

		public void setItemCategory(String itemCategory) {
			this.itemCategory = itemCategory;
		}

		public String getItemCode() {
			return this.itemCode;
		}

		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public Class<OpsCreateDiagnoseAbnormalResponse> getResponseClass() {
		return OpsCreateDiagnoseAbnormalResponse.class;
	}

}
