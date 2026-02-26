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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeCloudDiskAvailableResourceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudDiskAvailableResourceInfoResponse extends AcsResponse {

	private String requestId;

	private List<SupportResource> supportResources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SupportResource> getSupportResources() {
		return this.supportResources;
	}

	public void setSupportResources(List<SupportResource> supportResources) {
		this.supportResources = supportResources;
	}

	public static class SupportResource {

		private String ensRegionId;

		private String ensRegionName;

		private Long diskMinSize;

		private Long diskMaxSize;

		private Long canBuyCount;

		private String category;

		private Long defaultDiskSize;

		private List<String> ability;

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getEnsRegionName() {
			return this.ensRegionName;
		}

		public void setEnsRegionName(String ensRegionName) {
			this.ensRegionName = ensRegionName;
		}

		public Long getDiskMinSize() {
			return this.diskMinSize;
		}

		public void setDiskMinSize(Long diskMinSize) {
			this.diskMinSize = diskMinSize;
		}

		public Long getDiskMaxSize() {
			return this.diskMaxSize;
		}

		public void setDiskMaxSize(Long diskMaxSize) {
			this.diskMaxSize = diskMaxSize;
		}

		public Long getCanBuyCount() {
			return this.canBuyCount;
		}

		public void setCanBuyCount(Long canBuyCount) {
			this.canBuyCount = canBuyCount;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Long getDefaultDiskSize() {
			return this.defaultDiskSize;
		}

		public void setDefaultDiskSize(Long defaultDiskSize) {
			this.defaultDiskSize = defaultDiskSize;
		}

		public List<String> getAbility() {
			return this.ability;
		}

		public void setAbility(List<String> ability) {
			this.ability = ability;
		}
	}

	@Override
	public DescribeCloudDiskAvailableResourceInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudDiskAvailableResourceInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
