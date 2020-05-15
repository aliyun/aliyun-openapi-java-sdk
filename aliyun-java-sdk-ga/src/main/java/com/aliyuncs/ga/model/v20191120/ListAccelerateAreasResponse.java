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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.ListAccelerateAreasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAccelerateAreasResponse extends AcsResponse {

	private String requestId;

	private List<AreasItem> areas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AreasItem> getAreas() {
		return this.areas;
	}

	public void setAreas(List<AreasItem> areas) {
		this.areas = areas;
	}

	public static class AreasItem {

		private String areaId;

		private String localName;

		private List<RegionListItem> regionList;

		public String getAreaId() {
			return this.areaId;
		}

		public void setAreaId(String areaId) {
			this.areaId = areaId;
		}

		public String getLocalName() {
			return this.localName;
		}

		public void setLocalName(String localName) {
			this.localName = localName;
		}

		public List<RegionListItem> getRegionList() {
			return this.regionList;
		}

		public void setRegionList(List<RegionListItem> regionList) {
			this.regionList = regionList;
		}

		public static class RegionListItem {

			private String regionId;

			private String localName;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getLocalName() {
				return this.localName;
			}

			public void setLocalName(String localName) {
				this.localName = localName;
			}
		}
	}

	@Override
	public ListAccelerateAreasResponse getInstance(UnmarshallerContext context) {
		return	ListAccelerateAreasResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
