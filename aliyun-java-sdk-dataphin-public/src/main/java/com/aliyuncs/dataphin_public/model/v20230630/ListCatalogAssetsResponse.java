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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListCatalogAssetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCatalogAssetsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private Data data;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private List<Asset> assetList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<Asset> getAssetList() {
			return this.assetList;
		}

		public void setAssetList(List<Asset> assetList) {
			this.assetList = assetList;
		}

		public static class Asset {

			private String guid;

			private String assetType;

			private Boolean isDeleted;

			private String assetName;

			private String assetDisplayName;

			private String assetFullName;

			private String maxSecurityLevel;

			private String assetDescription;

			private String assetFrom;

			private Long bizUnitId;

			private String bizUnitName;

			private Long projectId;

			private String projectName;

			private Long datasourceId;

			private String dataSourceName;

			private String subType;

			private String sumTableGuid;

			private String sumTableName;

			private String granularity;

			private String dataCellId;

			private String dataCellName;

			private Long apiId;

			private String apiGroupName;

			private String apiRequestMethod;

			private String apiCallMode;

			private String biCatalog;

			private Long chartCount;

			private List<Directorie> directories;

			private List<String> assetTags;

			public String getGuid() {
				return this.guid;
			}

			public void setGuid(String guid) {
				this.guid = guid;
			}

			public String getAssetType() {
				return this.assetType;
			}

			public void setAssetType(String assetType) {
				this.assetType = assetType;
			}

			public Boolean getIsDeleted() {
				return this.isDeleted;
			}

			public void setIsDeleted(Boolean isDeleted) {
				this.isDeleted = isDeleted;
			}

			public String getAssetName() {
				return this.assetName;
			}

			public void setAssetName(String assetName) {
				this.assetName = assetName;
			}

			public String getAssetDisplayName() {
				return this.assetDisplayName;
			}

			public void setAssetDisplayName(String assetDisplayName) {
				this.assetDisplayName = assetDisplayName;
			}

			public String getAssetFullName() {
				return this.assetFullName;
			}

			public void setAssetFullName(String assetFullName) {
				this.assetFullName = assetFullName;
			}

			public String getMaxSecurityLevel() {
				return this.maxSecurityLevel;
			}

			public void setMaxSecurityLevel(String maxSecurityLevel) {
				this.maxSecurityLevel = maxSecurityLevel;
			}

			public String getAssetDescription() {
				return this.assetDescription;
			}

			public void setAssetDescription(String assetDescription) {
				this.assetDescription = assetDescription;
			}

			public String getAssetFrom() {
				return this.assetFrom;
			}

			public void setAssetFrom(String assetFrom) {
				this.assetFrom = assetFrom;
			}

			public Long getBizUnitId() {
				return this.bizUnitId;
			}

			public void setBizUnitId(Long bizUnitId) {
				this.bizUnitId = bizUnitId;
			}

			public String getBizUnitName() {
				return this.bizUnitName;
			}

			public void setBizUnitName(String bizUnitName) {
				this.bizUnitName = bizUnitName;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public Long getDatasourceId() {
				return this.datasourceId;
			}

			public void setDatasourceId(Long datasourceId) {
				this.datasourceId = datasourceId;
			}

			public String getDataSourceName() {
				return this.dataSourceName;
			}

			public void setDataSourceName(String dataSourceName) {
				this.dataSourceName = dataSourceName;
			}

			public String getSubType() {
				return this.subType;
			}

			public void setSubType(String subType) {
				this.subType = subType;
			}

			public String getSumTableGuid() {
				return this.sumTableGuid;
			}

			public void setSumTableGuid(String sumTableGuid) {
				this.sumTableGuid = sumTableGuid;
			}

			public String getSumTableName() {
				return this.sumTableName;
			}

			public void setSumTableName(String sumTableName) {
				this.sumTableName = sumTableName;
			}

			public String getGranularity() {
				return this.granularity;
			}

			public void setGranularity(String granularity) {
				this.granularity = granularity;
			}

			public String getDataCellId() {
				return this.dataCellId;
			}

			public void setDataCellId(String dataCellId) {
				this.dataCellId = dataCellId;
			}

			public String getDataCellName() {
				return this.dataCellName;
			}

			public void setDataCellName(String dataCellName) {
				this.dataCellName = dataCellName;
			}

			public Long getApiId() {
				return this.apiId;
			}

			public void setApiId(Long apiId) {
				this.apiId = apiId;
			}

			public String getApiGroupName() {
				return this.apiGroupName;
			}

			public void setApiGroupName(String apiGroupName) {
				this.apiGroupName = apiGroupName;
			}

			public String getApiRequestMethod() {
				return this.apiRequestMethod;
			}

			public void setApiRequestMethod(String apiRequestMethod) {
				this.apiRequestMethod = apiRequestMethod;
			}

			public String getApiCallMode() {
				return this.apiCallMode;
			}

			public void setApiCallMode(String apiCallMode) {
				this.apiCallMode = apiCallMode;
			}

			public String getBiCatalog() {
				return this.biCatalog;
			}

			public void setBiCatalog(String biCatalog) {
				this.biCatalog = biCatalog;
			}

			public Long getChartCount() {
				return this.chartCount;
			}

			public void setChartCount(Long chartCount) {
				this.chartCount = chartCount;
			}

			public List<Directorie> getDirectories() {
				return this.directories;
			}

			public void setDirectories(List<Directorie> directories) {
				this.directories = directories;
			}

			public List<String> getAssetTags() {
				return this.assetTags;
			}

			public void setAssetTags(List<String> assetTags) {
				this.assetTags = assetTags;
			}

			public static class Directorie {

				private Long topicId;

				private String topicName;

				private Long directoryId;

				private String directoryName;

				public Long getTopicId() {
					return this.topicId;
				}

				public void setTopicId(Long topicId) {
					this.topicId = topicId;
				}

				public String getTopicName() {
					return this.topicName;
				}

				public void setTopicName(String topicName) {
					this.topicName = topicName;
				}

				public Long getDirectoryId() {
					return this.directoryId;
				}

				public void setDirectoryId(Long directoryId) {
					this.directoryId = directoryId;
				}

				public String getDirectoryName() {
					return this.directoryName;
				}

				public void setDirectoryName(String directoryName) {
					this.directoryName = directoryName;
				}
			}
		}
	}

	@Override
	public ListCatalogAssetsResponse getInstance(UnmarshallerContext context) {
		return	ListCatalogAssetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
