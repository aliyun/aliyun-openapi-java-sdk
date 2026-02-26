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
import com.aliyuncs.ga.transform.v20191120.ListAvailableAccelerateAreasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAvailableAccelerateAreasResponse extends AcsResponse {

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

		private String localName;

		private String areaId;

		private List<RegionListItem> regionList;

		public String getLocalName() {
			return this.localName;
		}

		public void setLocalName(String localName) {
			this.localName = localName;
		}

		public String getAreaId() {
			return this.areaId;
		}

		public void setAreaId(String areaId) {
			this.areaId = areaId;
		}

		public List<RegionListItem> getRegionList() {
			return this.regionList;
		}

		public void setRegionList(List<RegionListItem> regionList) {
			this.regionList = regionList;
		}

		public static class RegionListItem {

			private String localName;

			private String regionId;

			private Boolean chinaMainland;

			private Boolean supportIpv6;

			private List<String> ispTypeList;

			public String getLocalName() {
				return this.localName;
			}

			public void setLocalName(String localName) {
				this.localName = localName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Boolean getChinaMainland() {
				return this.chinaMainland;
			}

			public void setChinaMainland(Boolean chinaMainland) {
				this.chinaMainland = chinaMainland;
			}

			public Boolean getSupportIpv6() {
				return this.supportIpv6;
			}

			public void setSupportIpv6(Boolean supportIpv6) {
				this.supportIpv6 = supportIpv6;
			}

			public List<String> getIspTypeList() {
				return this.ispTypeList;
			}

			public void setIspTypeList(List<String> ispTypeList) {
				this.ispTypeList = ispTypeList;
			}
		}
	}

	@Override
	public ListAvailableAccelerateAreasResponse getInstance(UnmarshallerContext context) {
		return	ListAvailableAccelerateAreasResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
