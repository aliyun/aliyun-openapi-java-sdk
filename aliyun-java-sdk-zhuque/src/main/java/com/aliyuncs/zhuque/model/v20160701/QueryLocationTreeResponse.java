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

package com.aliyuncs.zhuque.model.v20160701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.zhuque.transform.v20160701.QueryLocationTreeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLocationTreeResponse extends AcsResponse {

	private String requestId;

	private String customerId;

	private List<CloudInstanceItem> cloudInstanceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<CloudInstanceItem> getCloudInstanceList() {
		return this.cloudInstanceList;
	}

	public void setCloudInstanceList(List<CloudInstanceItem> cloudInstanceList) {
		this.cloudInstanceList = cloudInstanceList;
	}

	public static class CloudInstanceItem {

		private String cloudInsatnceId;

		private String displayName;

		private List<RegionItem> regionList;

		public String getCloudInsatnceId() {
			return this.cloudInsatnceId;
		}

		public void setCloudInsatnceId(String cloudInsatnceId) {
			this.cloudInsatnceId = cloudInsatnceId;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public List<RegionItem> getRegionList() {
			return this.regionList;
		}

		public void setRegionList(List<RegionItem> regionList) {
			this.regionList = regionList;
		}

		public static class RegionItem {

			private String regionId;

			private String displayName;

			private List<AZoneItem> aZoneList;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public List<AZoneItem> getAZoneList() {
				return this.aZoneList;
			}

			public void setAZoneList(List<AZoneItem> aZoneList) {
				this.aZoneList = aZoneList;
			}

			public static class AZoneItem {

				private String aZoneId;

				private String displayName;

				public String getAZoneId() {
					return this.aZoneId;
				}

				public void setAZoneId(String aZoneId) {
					this.aZoneId = aZoneId;
				}

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}
			}
		}
	}

	@Override
	public QueryLocationTreeResponse getInstance(UnmarshallerContext context) {
		return	QueryLocationTreeResponseUnmarshaller.unmarshall(this, context);
	}
}
