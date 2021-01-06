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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeAssetDetailByUuidsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAssetDetailByUuidsResponse extends AcsResponse {

	private String requestId;

	private List<Asset> assetList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Asset> getAssetList() {
		return this.assetList;
	}

	public void setAssetList(List<Asset> assetList) {
		this.assetList = assetList;
	}

	public static class Asset {

		private String internetIp;

		private String intranetIp;

		private String instanceName;

		private String instanceId;

		private String ip;

		private String uuid;

		private String assetType;

		private String os;

		private String clientStatus;

		private String regionId;

		private String region;

		private String regionName;

		private String vpcInstanceId;

		private String osName;

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getAssetType() {
			return this.assetType;
		}

		public void setAssetType(String assetType) {
			this.assetType = assetType;
		}

		public String getOs() {
			return this.os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public String getClientStatus() {
			return this.clientStatus;
		}

		public void setClientStatus(String clientStatus) {
			this.clientStatus = clientStatus;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getVpcInstanceId() {
			return this.vpcInstanceId;
		}

		public void setVpcInstanceId(String vpcInstanceId) {
			this.vpcInstanceId = vpcInstanceId;
		}

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}
	}

	@Override
	public DescribeAssetDetailByUuidsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAssetDetailByUuidsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
