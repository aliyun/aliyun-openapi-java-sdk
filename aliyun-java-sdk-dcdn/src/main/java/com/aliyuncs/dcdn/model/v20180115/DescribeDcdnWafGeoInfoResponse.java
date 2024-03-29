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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnWafGeoInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnWafGeoInfoResponse extends AcsResponse {

	private String requestId;

	private List<GeoInfo> content;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GeoInfo> getContent() {
		return this.content;
	}

	public void setContent(List<GeoInfo> content) {
		this.content = content;
	}

	public static class GeoInfo {

		private String type;

		private List<ContinentsItem> continents;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<ContinentsItem> getContinents() {
			return this.continents;
		}

		public void setContinents(List<ContinentsItem> continents) {
			this.continents = continents;
		}

		public static class ContinentsItem {

			private String name;

			private List<RegionsItem> regions;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<RegionsItem> getRegions() {
				return this.regions;
			}

			public void setRegions(List<RegionsItem> regions) {
				this.regions = regions;
			}

			public static class RegionsItem {

				private String name;

				private String value;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public DescribeDcdnWafGeoInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnWafGeoInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
