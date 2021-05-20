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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.DescribeMtsUserResourcePackageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMtsUserResourcePackageResponse extends AcsResponse {

	private String requestId;

	private List<ResourcePackageInfo> resourcePackageInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResourcePackageInfo> getResourcePackageInfos() {
		return this.resourcePackageInfos;
	}

	public void setResourcePackageInfos(List<ResourcePackageInfo> resourcePackageInfos) {
		this.resourcePackageInfos = resourcePackageInfos;
	}

	public static class ResourcePackageInfo {

		private String displayName;

		private String status;

		private String commodityCode;

		private String currCapacity;

		private String initCapacity;

		private String instanceId;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getCurrCapacity() {
			return this.currCapacity;
		}

		public void setCurrCapacity(String currCapacity) {
			this.currCapacity = currCapacity;
		}

		public String getInitCapacity() {
			return this.initCapacity;
		}

		public void setInitCapacity(String initCapacity) {
			this.initCapacity = initCapacity;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public DescribeMtsUserResourcePackageResponse getInstance(UnmarshallerContext context) {
		return	DescribeMtsUserResourcePackageResponseUnmarshaller.unmarshall(this, context);
	}
}
