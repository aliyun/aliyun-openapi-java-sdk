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
import com.aliyuncs.sofa.transform.v20190815.GetAKSHelmChartReleaseResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAKSHelmChartReleaseResourceResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<ChartResourceStatusesItem> chartResourceStatuses;

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

	public List<ChartResourceStatusesItem> getChartResourceStatuses() {
		return this.chartResourceStatuses;
	}

	public void setChartResourceStatuses(List<ChartResourceStatusesItem> chartResourceStatuses) {
		this.chartResourceStatuses = chartResourceStatuses;
	}

	public static class ChartResourceStatusesItem {

		private String chartName;

		private String chartVersion;

		private List<ChartResourceItemsItem> chartResourceItems;

		public String getChartName() {
			return this.chartName;
		}

		public void setChartName(String chartName) {
			this.chartName = chartName;
		}

		public String getChartVersion() {
			return this.chartVersion;
		}

		public void setChartVersion(String chartVersion) {
			this.chartVersion = chartVersion;
		}

		public List<ChartResourceItemsItem> getChartResourceItems() {
			return this.chartResourceItems;
		}

		public void setChartResourceItems(List<ChartResourceItemsItem> chartResourceItems) {
			this.chartResourceItems = chartResourceItems;
		}

		public static class ChartResourceItemsItem {

			private String resourceType;

			private List<DataListItem> dataList;

			private List<String> columnList;

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public List<DataListItem> getDataList() {
				return this.dataList;
			}

			public void setDataList(List<DataListItem> dataList) {
				this.dataList = dataList;
			}

			public List<String> getColumnList() {
				return this.columnList;
			}

			public void setColumnList(List<String> columnList) {
				this.columnList = columnList;
			}

			public static class DataListItem {

				private List<String> data;

				public List<String> getData() {
					return this.data;
				}

				public void setData(List<String> data) {
					this.data = data;
				}
			}
		}
	}

	@Override
	public GetAKSHelmChartReleaseResourceResponse getInstance(UnmarshallerContext context) {
		return	GetAKSHelmChartReleaseResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
