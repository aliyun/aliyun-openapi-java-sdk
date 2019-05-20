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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class UpdateTenantRequest extends RpcAcsRequest<UpdateTenantResponse> {
	
	public UpdateTenantRequest() {
		super("CloudCallCenter", "2017-07-05", "UpdateTenant", "CloudCallCenter", "innerAPI");
	}

	private List<UpdateTenantData> updateTenantDatas;

	public List<UpdateTenantData> getUpdateTenantDatas() {
		return this.updateTenantDatas;
	}

	public void setUpdateTenantDatas(List<UpdateTenantData> updateTenantDatas) {
		this.updateTenantDatas = updateTenantDatas;	
		if (updateTenantDatas != null) {
			for (int depth1 = 0; depth1 < updateTenantDatas.size(); depth1++) {
				putQueryParameter("UpdateTenantData." + (depth1 + 1) + ".tenantId" , updateTenantDatas.get(depth1).getTenantId());
				putQueryParameter("UpdateTenantData." + (depth1 + 1) + ".ramId" , updateTenantDatas.get(depth1).getRamId());
				putQueryParameter("UpdateTenantData." + (depth1 + 1) + ".status" , updateTenantDatas.get(depth1).getStatus());
			}
		}	
	}

	public static class UpdateTenantData {

		private Long tenantId;

		private Long ramId;

		private Integer status;

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public Long getRamId() {
			return this.ramId;
		}

		public void setRamId(Long ramId) {
			this.ramId = ramId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public Class<UpdateTenantResponse> getResponseClass() {
		return UpdateTenantResponse.class;
	}

}
