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

package com.aliyuncs.kms.model.v20160120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.kms.transform.v20160120.GetKmsInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetKmsInstanceResponse extends AcsResponse {

	private String requestId;

	private KmsInstance kmsInstance;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public KmsInstance getKmsInstance() {
		return this.kmsInstance;
	}

	public void setKmsInstance(KmsInstance kmsInstance) {
		this.kmsInstance = kmsInstance;
	}

	public static class KmsInstance {

		private String instanceId;

		private String instanceName;

		private String status;

		private String createTime;

		private Long spec;

		private Long keyNum;

		private String secretNum;

		private Long vpcNum;

		private String vpcId;

		private String zoneIds;

		private String vswitchIds;

		private String endDate;

		private String startDate;

		private String caCertificateChainPem;

		private List<BindVpc> bindVpcs;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getSpec() {
			return this.spec;
		}

		public void setSpec(Long spec) {
			this.spec = spec;
		}

		public Long getKeyNum() {
			return this.keyNum;
		}

		public void setKeyNum(Long keyNum) {
			this.keyNum = keyNum;
		}

		public String getSecretNum() {
			return this.secretNum;
		}

		public void setSecretNum(String secretNum) {
			this.secretNum = secretNum;
		}

		public Long getVpcNum() {
			return this.vpcNum;
		}

		public void setVpcNum(Long vpcNum) {
			this.vpcNum = vpcNum;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getZoneIds() {
			return this.zoneIds;
		}

		public void setZoneIds(String zoneIds) {
			this.zoneIds = zoneIds;
		}

		public String getVswitchIds() {
			return this.vswitchIds;
		}

		public void setVswitchIds(String vswitchIds) {
			this.vswitchIds = vswitchIds;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getCaCertificateChainPem() {
			return this.caCertificateChainPem;
		}

		public void setCaCertificateChainPem(String caCertificateChainPem) {
			this.caCertificateChainPem = caCertificateChainPem;
		}

		public List<BindVpc> getBindVpcs() {
			return this.bindVpcs;
		}

		public void setBindVpcs(List<BindVpc> bindVpcs) {
			this.bindVpcs = bindVpcs;
		}

		public static class BindVpc {

			private String regionId;

			private String vpcId;

			private String vpcOwnerId;

			private String vSwitchId;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVpcOwnerId() {
				return this.vpcOwnerId;
			}

			public void setVpcOwnerId(String vpcOwnerId) {
				this.vpcOwnerId = vpcOwnerId;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}
		}
	}

	@Override
	public GetKmsInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetKmsInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
