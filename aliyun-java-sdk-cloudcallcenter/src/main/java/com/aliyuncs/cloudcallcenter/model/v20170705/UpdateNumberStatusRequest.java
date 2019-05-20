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
public class UpdateNumberStatusRequest extends RpcAcsRequest<UpdateNumberStatusResponse> {
	
	public UpdateNumberStatusRequest() {
		super("CloudCallCenter", "2017-07-05", "UpdateNumberStatus", "CloudCallCenter", "innerAPI");
	}

	private List<NumberStatus> numberStatuss;

	public List<NumberStatus> getNumberStatuss() {
		return this.numberStatuss;
	}

	public void setNumberStatuss(List<NumberStatus> numberStatuss) {
		this.numberStatuss = numberStatuss;	
		if (numberStatuss != null) {
			for (int depth1 = 0; depth1 < numberStatuss.size(); depth1++) {
				putQueryParameter("numberStatus." + (depth1 + 1) + ".Number" , numberStatuss.get(depth1).getNumber());
				putQueryParameter("numberStatus." + (depth1 + 1) + ".Inbound" , numberStatuss.get(depth1).getInbound());
				putQueryParameter("numberStatus." + (depth1 + 1) + ".Enable" , numberStatuss.get(depth1).getEnable());
				putQueryParameter("numberStatus." + (depth1 + 1) + ".RamId" , numberStatuss.get(depth1).getRamId());
				putQueryParameter("numberStatus." + (depth1 + 1) + ".Tenant" , numberStatuss.get(depth1).getTenant());
			}
		}	
	}

	public static class NumberStatus {

		private String number;

		private Boolean inbound;

		private Boolean enable;

		private Long ramId;

		private String tenant;

		public String getNumber() {
			return this.number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public Boolean getInbound() {
			return this.inbound;
		}

		public void setInbound(Boolean inbound) {
			this.inbound = inbound;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public Long getRamId() {
			return this.ramId;
		}

		public void setRamId(Long ramId) {
			this.ramId = ramId;
		}

		public String getTenant() {
			return this.tenant;
		}

		public void setTenant(String tenant) {
			this.tenant = tenant;
		}
	}

	@Override
	public Class<UpdateNumberStatusResponse> getResponseClass() {
		return UpdateNumberStatusResponse.class;
	}

}
