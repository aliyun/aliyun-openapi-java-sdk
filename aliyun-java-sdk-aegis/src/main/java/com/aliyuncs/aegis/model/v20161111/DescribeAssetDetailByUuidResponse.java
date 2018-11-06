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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeAssetDetailByUuidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAssetDetailByUuidResponse extends AcsResponse {

	private String requestId;

	private AssetDetail assetDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AssetDetail getAssetDetail() {
		return this.assetDetail;
	}

	public void setAssetDetail(AssetDetail assetDetail) {
		this.assetDetail = assetDetail;
	}

	public static class AssetDetail {

		private String internetIp;

		private String intranetIp;

		private Integer instanceName;

		private Integer instanceId;

		private String ip;

		private String uuid;

		private String assetType;

		private String os;

		private String clientStatus;

		private String region;

		private String regionName;

		private String tag;

		private String groupTrace;

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

		public Integer getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(Integer instanceName) {
			this.instanceName = instanceName;
		}

		public Integer getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Integer instanceId) {
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

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getGroupTrace() {
			return this.groupTrace;
		}

		public void setGroupTrace(String groupTrace) {
			this.groupTrace = groupTrace;
		}
	}

	@Override
	public DescribeAssetDetailByUuidResponse getInstance(UnmarshallerContext context) {
		return	DescribeAssetDetailByUuidResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
