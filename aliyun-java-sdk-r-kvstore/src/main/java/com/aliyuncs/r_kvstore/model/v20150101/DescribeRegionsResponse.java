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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeRegionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRegionsResponse extends AcsResponse {

	private String requestId;

	private List<KVStoreRegion> regionIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<KVStoreRegion> getRegionIds() {
		return this.regionIds;
	}

	public void setRegionIds(List<KVStoreRegion> regionIds) {
		this.regionIds = regionIds;
	}

	public static class KVStoreRegion {

		private String regionId;

		private String zoneIds;

		private String localName;

		private String regionEndpoint;

		private List<String> zoneIdList;

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneIds() {
			return this.zoneIds;
		}

		public void setZoneIds(String zoneIds) {
			this.zoneIds = zoneIds;
		}

		public String getLocalName() {
			return this.localName;
		}

		public void setLocalName(String localName) {
			this.localName = localName;
		}

		public String getRegionEndpoint() {
			return this.regionEndpoint;
		}

		public void setRegionEndpoint(String regionEndpoint) {
			this.regionEndpoint = regionEndpoint;
		}

		public List<String> getZoneIdList() {
			return this.zoneIdList;
		}

		public void setZoneIdList(List<String> zoneIdList) {
			this.zoneIdList = zoneIdList;
		}
	}

	@Override
	public DescribeRegionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRegionsResponseUnmarshaller.unmarshall(this, context);
	}
}
