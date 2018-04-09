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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ModifyChargeTypeRequest extends RpcAcsRequest<ModifyChargeTypeResponse> {
	
	public ModifyChargeTypeRequest() {
		super("Emr", "2016-04-08", "ModifyChargeType");
	}

	private Long resourceOwnerId;

	private List<ChargeTypeConfig> chargeTypeConfigs;

	private String clusterId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<ChargeTypeConfig> getChargeTypeConfigs() {
		return this.chargeTypeConfigs;
	}

	public void setChargeTypeConfigs(List<ChargeTypeConfig> chargeTypeConfigs) {
		this.chargeTypeConfigs = chargeTypeConfigs;	
		if (chargeTypeConfigs != null) {
			for (int depth1 = 0; depth1 < chargeTypeConfigs.size(); depth1++) {
				putQueryParameter("ChargeTypeConfig." + (depth1 + 1) + ".HostGroupId" , chargeTypeConfigs.get(depth1).getHostGroupId());
				putQueryParameter("ChargeTypeConfig." + (depth1 + 1) + ".ChargeType" , chargeTypeConfigs.get(depth1).getChargeType());
				putQueryParameter("ChargeTypeConfig." + (depth1 + 1) + ".Period" , chargeTypeConfigs.get(depth1).getPeriod());
			}
		}	
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public static class ChargeTypeConfig {

		private String hostGroupId;

		private String chargeType;

		private Integer period;

		public String getHostGroupId() {
			return this.hostGroupId;
		}

		public void setHostGroupId(String hostGroupId) {
			this.hostGroupId = hostGroupId;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}
	}

	@Override
	public Class<ModifyChargeTypeResponse> getResponseClass() {
		return ModifyChargeTypeResponse.class;
	}

}
