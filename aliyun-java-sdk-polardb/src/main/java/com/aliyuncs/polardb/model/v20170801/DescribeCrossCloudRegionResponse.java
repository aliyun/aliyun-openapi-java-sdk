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
import com.aliyuncs.polardb.transform.v20170801.DescribeCrossCloudRegionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCrossCloudRegionResponse extends AcsResponse {

	private String requestId;

	private List<CrossCloudRegionListItem> crossCloudRegionList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CrossCloudRegionListItem> getCrossCloudRegionList() {
		return this.crossCloudRegionList;
	}

	public void setCrossCloudRegionList(List<CrossCloudRegionListItem> crossCloudRegionList) {
		this.crossCloudRegionList = crossCloudRegionList;
	}

	public static class CrossCloudRegionListItem {

		private String projectId;

		private String crossCloudRegionId;

		private String crossCloudRegionName;

		private List<CrossCloudZoneListItem> crossCloudZoneList;

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getCrossCloudRegionId() {
			return this.crossCloudRegionId;
		}

		public void setCrossCloudRegionId(String crossCloudRegionId) {
			this.crossCloudRegionId = crossCloudRegionId;
		}

		public String getCrossCloudRegionName() {
			return this.crossCloudRegionName;
		}

		public void setCrossCloudRegionName(String crossCloudRegionName) {
			this.crossCloudRegionName = crossCloudRegionName;
		}

		public List<CrossCloudZoneListItem> getCrossCloudZoneList() {
			return this.crossCloudZoneList;
		}

		public void setCrossCloudZoneList(List<CrossCloudZoneListItem> crossCloudZoneList) {
			this.crossCloudZoneList = crossCloudZoneList;
		}

		public static class CrossCloudZoneListItem {

			private String crossCloudZoneId;

			private String crossCloudZoneName;

			public String getCrossCloudZoneId() {
				return this.crossCloudZoneId;
			}

			public void setCrossCloudZoneId(String crossCloudZoneId) {
				this.crossCloudZoneId = crossCloudZoneId;
			}

			public String getCrossCloudZoneName() {
				return this.crossCloudZoneName;
			}

			public void setCrossCloudZoneName(String crossCloudZoneName) {
				this.crossCloudZoneName = crossCloudZoneName;
			}
		}
	}

	@Override
	public DescribeCrossCloudRegionResponse getInstance(UnmarshallerContext context) {
		return	DescribeCrossCloudRegionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
