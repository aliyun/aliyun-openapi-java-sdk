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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeDrdsComponentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsComponentsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<DrdsComponent> drdsComponents;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DrdsComponent> getDrdsComponents() {
		return this.drdsComponents;
	}

	public void setDrdsComponents(List<DrdsComponent> drdsComponents) {
		this.drdsComponents = drdsComponents;
	}

	public static class DrdsComponent {

		private String regionId;

		private String regionName;

		private List<DrdsAzoneInfo> drdsAzoneInfos;

		private List<DrdsSeries> drdsSeriesList;

		private List<String> mysqlVersions;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public List<DrdsAzoneInfo> getDrdsAzoneInfos() {
			return this.drdsAzoneInfos;
		}

		public void setDrdsAzoneInfos(List<DrdsAzoneInfo> drdsAzoneInfos) {
			this.drdsAzoneInfos = drdsAzoneInfos;
		}

		public List<DrdsSeries> getDrdsSeriesList() {
			return this.drdsSeriesList;
		}

		public void setDrdsSeriesList(List<DrdsSeries> drdsSeriesList) {
			this.drdsSeriesList = drdsSeriesList;
		}

		public List<String> getMysqlVersions() {
			return this.mysqlVersions;
		}

		public void setMysqlVersions(List<String> mysqlVersions) {
			this.mysqlVersions = mysqlVersions;
		}

		public static class DrdsAzoneInfo {

			private String zoneId;

			private String zoneName;

			private Boolean supportVpc;

			private Boolean supportClassic;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getZoneName() {
				return this.zoneName;
			}

			public void setZoneName(String zoneName) {
				this.zoneName = zoneName;
			}

			public Boolean getSupportVpc() {
				return this.supportVpc;
			}

			public void setSupportVpc(Boolean supportVpc) {
				this.supportVpc = supportVpc;
			}

			public Boolean getSupportClassic() {
				return this.supportClassic;
			}

			public void setSupportClassic(Boolean supportClassic) {
				this.supportClassic = supportClassic;
			}
		}

		public static class DrdsSeries {

			private String seriesName;

			private String series;

			private List<String> specs;

			public String getSeriesName() {
				return this.seriesName;
			}

			public void setSeriesName(String seriesName) {
				this.seriesName = seriesName;
			}

			public String getSeries() {
				return this.series;
			}

			public void setSeries(String series) {
				this.series = series;
			}

			public List<String> getSpecs() {
				return this.specs;
			}

			public void setSpecs(List<String> specs) {
				this.specs = specs;
			}
		}
	}

	@Override
	public DescribeDrdsComponentsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsComponentsResponseUnmarshaller.unmarshall(this, context);
	}
}
