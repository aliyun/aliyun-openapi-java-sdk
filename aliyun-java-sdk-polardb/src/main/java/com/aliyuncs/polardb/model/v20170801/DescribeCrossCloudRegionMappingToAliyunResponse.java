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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeCrossCloudRegionMappingToAliyunResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCrossCloudRegionMappingToAliyunResponse extends AcsResponse {

	private String requestId;

	private List<CrossCloudRegionMappingListItem> crossCloudRegionMappingList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CrossCloudRegionMappingListItem> getCrossCloudRegionMappingList() {
		return this.crossCloudRegionMappingList;
	}

	public void setCrossCloudRegionMappingList(List<CrossCloudRegionMappingListItem> crossCloudRegionMappingList) {
		this.crossCloudRegionMappingList = crossCloudRegionMappingList;
	}

	public static class CrossCloudRegionMappingListItem {

		private String cloudProvider;

		private String aliyunRegionId;

		private String crossCloudRegionId;

		public String getCloudProvider() {
			return this.cloudProvider;
		}

		public void setCloudProvider(String cloudProvider) {
			this.cloudProvider = cloudProvider;
		}

		public String getAliyunRegionId() {
			return this.aliyunRegionId;
		}

		public void setAliyunRegionId(String aliyunRegionId) {
			this.aliyunRegionId = aliyunRegionId;
		}

		public String getCrossCloudRegionId() {
			return this.crossCloudRegionId;
		}

		public void setCrossCloudRegionId(String crossCloudRegionId) {
			this.crossCloudRegionId = crossCloudRegionId;
		}
	}

	@Override
	public DescribeCrossCloudRegionMappingToAliyunResponse getInstance(UnmarshallerContext context) {
		return	DescribeCrossCloudRegionMappingToAliyunResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
