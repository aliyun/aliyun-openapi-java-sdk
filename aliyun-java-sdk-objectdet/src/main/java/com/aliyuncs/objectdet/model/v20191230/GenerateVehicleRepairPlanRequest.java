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

package com.aliyuncs.objectdet.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.objectdet.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GenerateVehicleRepairPlanRequest extends RpcAcsRequest<GenerateVehicleRepairPlanResponse> {
	   

	private List<DamageImageList> damageImageLists;
	public GenerateVehicleRepairPlanRequest() {
		super("objectdet", "2019-12-30", "GenerateVehicleRepairPlan", "objectdet");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DamageImageList> getDamageImageLists() {
		return this.damageImageLists;
	}

	public void setDamageImageLists(List<DamageImageList> damageImageLists) {
		this.damageImageLists = damageImageLists;	
		if (damageImageLists != null) {
			for (int depth1 = 0; depth1 < damageImageLists.size(); depth1++) {
				putBodyParameter("DamageImageList." + (depth1 + 1) + ".ImageUrl" , damageImageLists.get(depth1).getImageUrl());
				putBodyParameter("DamageImageList." + (depth1 + 1) + ".CreateTimeStamp" , damageImageLists.get(depth1).getCreateTimeStamp());
			}
		}	
	}

	public static class DamageImageList {

		private String imageUrl;

		private String createTimeStamp;

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getCreateTimeStamp() {
			return this.createTimeStamp;
		}

		public void setCreateTimeStamp(String createTimeStamp) {
			this.createTimeStamp = createTimeStamp;
		}
	}

	@Override
	public Class<GenerateVehicleRepairPlanResponse> getResponseClass() {
		return GenerateVehicleRepairPlanResponse.class;
	}

}
