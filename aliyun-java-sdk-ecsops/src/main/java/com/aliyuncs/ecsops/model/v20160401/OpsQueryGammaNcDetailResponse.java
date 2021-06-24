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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryGammaNcDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryGammaNcDetailResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String userGroupQuota;

		private List<GammaNcListItem> gammaNcList;

		public String getUserGroupQuota() {
			return this.userGroupQuota;
		}

		public void setUserGroupQuota(String userGroupQuota) {
			this.userGroupQuota = userGroupQuota;
		}

		public List<GammaNcListItem> getGammaNcList() {
			return this.gammaNcList;
		}

		public void setGammaNcList(List<GammaNcListItem> gammaNcList) {
			this.gammaNcList = gammaNcList;
		}

		public static class GammaNcListItem {

			private String aliUid;

			private String azName;

			private String clusterAlias;

			private String clusterGrayCreateBy;

			private String clusterGrayCreateTime;

			private String grayBizType;

			private String ncGrayCreateBy;

			private String ncGrayCreateTime;

			private String ncIp;

			private String regionName;

			private String userGroup;

			private String zoneId;

			private String ncQuotaOnCluster;

			public String getAliUid() {
				return this.aliUid;
			}

			public void setAliUid(String aliUid) {
				this.aliUid = aliUid;
			}

			public String getAzName() {
				return this.azName;
			}

			public void setAzName(String azName) {
				this.azName = azName;
			}

			public String getClusterAlias() {
				return this.clusterAlias;
			}

			public void setClusterAlias(String clusterAlias) {
				this.clusterAlias = clusterAlias;
			}

			public String getClusterGrayCreateBy() {
				return this.clusterGrayCreateBy;
			}

			public void setClusterGrayCreateBy(String clusterGrayCreateBy) {
				this.clusterGrayCreateBy = clusterGrayCreateBy;
			}

			public String getClusterGrayCreateTime() {
				return this.clusterGrayCreateTime;
			}

			public void setClusterGrayCreateTime(String clusterGrayCreateTime) {
				this.clusterGrayCreateTime = clusterGrayCreateTime;
			}

			public String getGrayBizType() {
				return this.grayBizType;
			}

			public void setGrayBizType(String grayBizType) {
				this.grayBizType = grayBizType;
			}

			public String getNcGrayCreateBy() {
				return this.ncGrayCreateBy;
			}

			public void setNcGrayCreateBy(String ncGrayCreateBy) {
				this.ncGrayCreateBy = ncGrayCreateBy;
			}

			public String getNcGrayCreateTime() {
				return this.ncGrayCreateTime;
			}

			public void setNcGrayCreateTime(String ncGrayCreateTime) {
				this.ncGrayCreateTime = ncGrayCreateTime;
			}

			public String getNcIp() {
				return this.ncIp;
			}

			public void setNcIp(String ncIp) {
				this.ncIp = ncIp;
			}

			public String getRegionName() {
				return this.regionName;
			}

			public void setRegionName(String regionName) {
				this.regionName = regionName;
			}

			public String getUserGroup() {
				return this.userGroup;
			}

			public void setUserGroup(String userGroup) {
				this.userGroup = userGroup;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getNcQuotaOnCluster() {
				return this.ncQuotaOnCluster;
			}

			public void setNcQuotaOnCluster(String ncQuotaOnCluster) {
				this.ncQuotaOnCluster = ncQuotaOnCluster;
			}
		}
	}

	@Override
	public OpsQueryGammaNcDetailResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryGammaNcDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
