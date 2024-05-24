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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLivePrivateLineAreasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLivePrivateLineAreasResponse extends AcsResponse {

	private String requestId;

	private List<LiveArea> liveAreasList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveArea> getLiveAreasList() {
		return this.liveAreasList;
	}

	public void setLiveAreasList(List<LiveArea> liveAreasList) {
		this.liveAreasList = liveAreasList;
	}

	public static class LiveArea {

		private String regionType;

		private List<Region> regions;

		public String getRegionType() {
			return this.regionType;
		}

		public void setRegionType(String regionType) {
			this.regionType = regionType;
		}

		public List<Region> getRegions() {
			return this.regions;
		}

		public void setRegions(List<Region> regions) {
			this.regions = regions;
		}

		public static class Region {

			private String localName;

			private String regionId;

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
		}
	}

	@Override
	public DescribeLivePrivateLineAreasResponse getInstance(UnmarshallerContext context) {
		return	DescribeLivePrivateLineAreasResponseUnmarshaller.unmarshall(this, context);
	}
}
