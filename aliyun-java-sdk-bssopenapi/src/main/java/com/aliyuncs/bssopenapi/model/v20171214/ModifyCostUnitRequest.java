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
public class ModifyCostUnitRequest extends RpcAcsRequest<ModifyCostUnitResponse> {
	   

	private List<UnitEntityList> unitEntityLists;
	public ModifyCostUnitRequest() {
		super("BssOpenApi", "2017-12-14", "ModifyCostUnit", "bssopenapi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<UnitEntityList> getUnitEntityLists() {
		return this.unitEntityLists;
	}

	public void setUnitEntityLists(List<UnitEntityList> unitEntityLists) {
		this.unitEntityLists = unitEntityLists;	
		if (unitEntityLists != null) {
			for (int depth1 = 0; depth1 < unitEntityLists.size(); depth1++) {
				putQueryParameter("UnitEntityList." + (depth1 + 1) + ".NewUnitName" , unitEntityLists.get(depth1).getNewUnitName());
				putQueryParameter("UnitEntityList." + (depth1 + 1) + ".UnitId" , unitEntityLists.get(depth1).getUnitId());
				putQueryParameter("UnitEntityList." + (depth1 + 1) + ".OwnerUid" , unitEntityLists.get(depth1).getOwnerUid());
			}
		}	
	}

	public static class UnitEntityList {

		private String newUnitName;

		private Long unitId;

		private Long ownerUid;

		public String getNewUnitName() {
			return this.newUnitName;
		}

		public void setNewUnitName(String newUnitName) {
			this.newUnitName = newUnitName;
		}

		public Long getUnitId() {
			return this.unitId;
		}

		public void setUnitId(Long unitId) {
			this.unitId = unitId;
		}

		public Long getOwnerUid() {
			return this.ownerUid;
		}

		public void setOwnerUid(Long ownerUid) {
			this.ownerUid = ownerUid;
		}
	}

	@Override
	public Class<ModifyCostUnitResponse> getResponseClass() {
		return ModifyCostUnitResponse.class;
	}

}
