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
import com.aliyuncs.ga.transform.v20191120.ListAvailableBusiRegionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAvailableBusiRegionsResponse extends AcsResponse {

	private String requestId;

	private List<RegionsItem> regions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RegionsItem> getRegions() {
		return this.regions;
	}

	public void setRegions(List<RegionsItem> regions) {
		this.regions = regions;
	}

	public static class RegionsItem {

		private String localName;

		private String regionId;

		private Boolean pop;

		private Boolean chinaMainland;

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

		public Boolean getPop() {
			return this.pop;
		}

		public void setPop(Boolean pop) {
			this.pop = pop;
		}

		public Boolean getChinaMainland() {
			return this.chinaMainland;
		}

		public void setChinaMainland(Boolean chinaMainland) {
			this.chinaMainland = chinaMainland;
		}
	}

	@Override
	public ListAvailableBusiRegionsResponse getInstance(UnmarshallerContext context) {
		return	ListAvailableBusiRegionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
