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

package com.aliyuncs.paifeaturestore.model.v20230621;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paifeaturestore.transform.v20230621.ListDatasourceFeatureViewsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDatasourceFeatureViewsResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private List<DatasourceFeatureViews> featureViews;

	private TotalUsageStatistics totalUsageStatistics;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DatasourceFeatureViews> getFeatureViews() {
		return this.featureViews;
	}

	public void setFeatureViews(List<DatasourceFeatureViews> featureViews) {
		this.featureViews = featureViews;
	}

	public TotalUsageStatistics getTotalUsageStatistics() {
		return this.totalUsageStatistics;
	}

	public void setTotalUsageStatistics(TotalUsageStatistics totalUsageStatistics) {
		this.totalUsageStatistics = totalUsageStatistics;
	}

	public static class DatasourceFeatureViews {

		private String featureViewId;

		private String name;

		private String projectName;

		private String type;

		private String featureEntityName;

		private Integer tTL;

		private String config;

		private UsageStatistics usageStatistics;

		public String getFeatureViewId() {
			return this.featureViewId;
		}

		public void setFeatureViewId(String featureViewId) {
			this.featureViewId = featureViewId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFeatureEntityName() {
			return this.featureEntityName;
		}

		public void setFeatureEntityName(String featureEntityName) {
			this.featureEntityName = featureEntityName;
		}

		public Integer getTTL() {
			return this.tTL;
		}

		public void setTTL(Integer tTL) {
			this.tTL = tTL;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public UsageStatistics getUsageStatistics() {
			return this.usageStatistics;
		}

		public void setUsageStatistics(UsageStatistics usageStatistics) {
			this.usageStatistics = usageStatistics;
		}

		public static class UsageStatistics {

			private Long rowCount;

			private Double diskUsage;

			private Double memoryUsage;

			private List<ReadWriteCountItem> readWriteCount;

			public Long getRowCount() {
				return this.rowCount;
			}

			public void setRowCount(Long rowCount) {
				this.rowCount = rowCount;
			}

			public Double getDiskUsage() {
				return this.diskUsage;
			}

			public void setDiskUsage(Double diskUsage) {
				this.diskUsage = diskUsage;
			}

			public Double getMemoryUsage() {
				return this.memoryUsage;
			}

			public void setMemoryUsage(Double memoryUsage) {
				this.memoryUsage = memoryUsage;
			}

			public List<ReadWriteCountItem> getReadWriteCount() {
				return this.readWriteCount;
			}

			public void setReadWriteCount(List<ReadWriteCountItem> readWriteCount) {
				this.readWriteCount = readWriteCount;
			}

			public static class ReadWriteCountItem {

				private String date;

				private Long writeCount;

				private Long readCount;

				public String getDate() {
					return this.date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public Long getWriteCount() {
					return this.writeCount;
				}

				public void setWriteCount(Long writeCount) {
					this.writeCount = writeCount;
				}

				public Long getReadCount() {
					return this.readCount;
				}

				public void setReadCount(Long readCount) {
					this.readCount = readCount;
				}
			}
		}
	}

	public static class TotalUsageStatistics {

		private Double totalDiskUsage;

		private Double totalMemoryUsage;

		private List<TotalReadWriteCountItem> totalReadWriteCount;

		public Double getTotalDiskUsage() {
			return this.totalDiskUsage;
		}

		public void setTotalDiskUsage(Double totalDiskUsage) {
			this.totalDiskUsage = totalDiskUsage;
		}

		public Double getTotalMemoryUsage() {
			return this.totalMemoryUsage;
		}

		public void setTotalMemoryUsage(Double totalMemoryUsage) {
			this.totalMemoryUsage = totalMemoryUsage;
		}

		public List<TotalReadWriteCountItem> getTotalReadWriteCount() {
			return this.totalReadWriteCount;
		}

		public void setTotalReadWriteCount(List<TotalReadWriteCountItem> totalReadWriteCount) {
			this.totalReadWriteCount = totalReadWriteCount;
		}

		public static class TotalReadWriteCountItem {

			private String date;

			private Long totalWriteCount;

			private Long totalReadCount;

			public String getDate() {
				return this.date;
			}

			public void setDate(String date) {
				this.date = date;
			}

			public Long getTotalWriteCount() {
				return this.totalWriteCount;
			}

			public void setTotalWriteCount(Long totalWriteCount) {
				this.totalWriteCount = totalWriteCount;
			}

			public Long getTotalReadCount() {
				return this.totalReadCount;
			}

			public void setTotalReadCount(Long totalReadCount) {
				this.totalReadCount = totalReadCount;
			}
		}
	}

	@Override
	public ListDatasourceFeatureViewsResponse getInstance(UnmarshallerContext context) {
		return	ListDatasourceFeatureViewsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
