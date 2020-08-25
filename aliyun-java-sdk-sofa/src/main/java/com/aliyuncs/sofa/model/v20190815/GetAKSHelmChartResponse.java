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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetAKSHelmChartResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAKSHelmChartResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private ChartPackage chartPackage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public ChartPackage getChartPackage() {
		return this.chartPackage;
	}

	public void setChartPackage(ChartPackage chartPackage) {
		this.chartPackage = chartPackage;
	}

	public static class ChartPackage {

		private String chartType;

		private String description;

		private String gmtCreated;

		private String gmtModified;

		private String name;

		private String operator;

		private String readme;

		private String regionId;

		private String version;

		private List<SubChartsItem> subCharts;

		private ChartMetaData chartMetaData;

		public String getChartType() {
			return this.chartType;
		}

		public void setChartType(String chartType) {
			this.chartType = chartType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getReadme() {
			return this.readme;
		}

		public void setReadme(String readme) {
			this.readme = readme;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public List<SubChartsItem> getSubCharts() {
			return this.subCharts;
		}

		public void setSubCharts(List<SubChartsItem> subCharts) {
			this.subCharts = subCharts;
		}

		public ChartMetaData getChartMetaData() {
			return this.chartMetaData;
		}

		public void setChartMetaData(ChartMetaData chartMetaData) {
			this.chartMetaData = chartMetaData;
		}

		public static class SubChartsItem {

			private String name;

			private String version;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}

		public static class ChartMetaData {

			private String apiVersion;

			private String appVersion;

			private String description;

			private String icon;

			private String name;

			private String type;

			private String version;

			public String getApiVersion() {
				return this.apiVersion;
			}

			public void setApiVersion(String apiVersion) {
				this.apiVersion = apiVersion;
			}

			public String getAppVersion() {
				return this.appVersion;
			}

			public void setAppVersion(String appVersion) {
				this.appVersion = appVersion;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getIcon() {
				return this.icon;
			}

			public void setIcon(String icon) {
				this.icon = icon;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}
	}

	@Override
	public GetAKSHelmChartResponse getInstance(UnmarshallerContext context) {
		return	GetAKSHelmChartResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
