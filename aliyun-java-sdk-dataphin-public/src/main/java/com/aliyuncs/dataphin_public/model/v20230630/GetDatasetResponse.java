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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetDatasetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDatasetResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private DatasetDTO datasetDTO;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public DatasetDTO getDatasetDTO() {
		return this.datasetDTO;
	}

	public void setDatasetDTO(DatasetDTO datasetDTO) {
		this.datasetDTO = datasetDTO;
	}

	public static class DatasetDTO {

		private String storageType;

		private String description;

		private String dataCellName;

		private String contentType;

		private String projectName;

		private Long projectId;

		private String gmtModified;

		private String metadataStorageType;

		private String creator;

		private String lockOwner;

		private String dataCellId;

		private String name;

		private String scenario;

		private String type;

		private String gmtCreate;

		private Long tenantId;

		private Long fileId;

		private Long id;

		private String creatorName;

		private String directory;

		private String lockOwnerName;

		private List<Owner> ownerList;

		private List<DatasetVersionDTO> versionList;

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDataCellName() {
			return this.dataCellName;
		}

		public void setDataCellName(String dataCellName) {
			this.dataCellName = dataCellName;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getMetadataStorageType() {
			return this.metadataStorageType;
		}

		public void setMetadataStorageType(String metadataStorageType) {
			this.metadataStorageType = metadataStorageType;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getLockOwner() {
			return this.lockOwner;
		}

		public void setLockOwner(String lockOwner) {
			this.lockOwner = lockOwner;
		}

		public String getDataCellId() {
			return this.dataCellId;
		}

		public void setDataCellId(String dataCellId) {
			this.dataCellId = dataCellId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getScenario() {
			return this.scenario;
		}

		public void setScenario(String scenario) {
			this.scenario = scenario;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public Long getFileId() {
			return this.fileId;
		}

		public void setFileId(Long fileId) {
			this.fileId = fileId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCreatorName() {
			return this.creatorName;
		}

		public void setCreatorName(String creatorName) {
			this.creatorName = creatorName;
		}

		public String getDirectory() {
			return this.directory;
		}

		public void setDirectory(String directory) {
			this.directory = directory;
		}

		public String getLockOwnerName() {
			return this.lockOwnerName;
		}

		public void setLockOwnerName(String lockOwnerName) {
			this.lockOwnerName = lockOwnerName;
		}

		public List<Owner> getOwnerList() {
			return this.ownerList;
		}

		public void setOwnerList(List<Owner> ownerList) {
			this.ownerList = ownerList;
		}

		public List<DatasetVersionDTO> getVersionList() {
			return this.versionList;
		}

		public void setVersionList(List<DatasetVersionDTO> versionList) {
			this.versionList = versionList;
		}

		public static class Owner {

			private String userName;

			private String userId;

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}

		public static class DatasetVersionDTO {

			private String gmtCreate;

			private String version;

			private String gmtModified;

			private Long id;

			private String creator;

			private Long datasetId;

			private ApiInfo apiInfo;

			private DataVersionConfig dataVersionConfig;

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public Long getDatasetId() {
				return this.datasetId;
			}

			public void setDatasetId(Long datasetId) {
				this.datasetId = datasetId;
			}

			public ApiInfo getApiInfo() {
				return this.apiInfo;
			}

			public void setApiInfo(ApiInfo apiInfo) {
				this.apiInfo = apiInfo;
			}

			public DataVersionConfig getDataVersionConfig() {
				return this.dataVersionConfig;
			}

			public void setDataVersionConfig(DataVersionConfig dataVersionConfig) {
				this.dataVersionConfig = dataVersionConfig;
			}

			public static class ApiInfo {

				private Integer osApiGroup;

				private Long apiNo;

				private String osApiGroupName;

				private Integer requestMethod;

				private Integer timeout;

				private Integer osProject;

				private Integer protocol;

				private Integer executeMode;

				private Integer execTimeout;

				private String osProjectName;

				private List<ApiResponseParamDTO> responseParamList;

				private List<ApiRequestParamDTO> requestParamList;

				public Integer getOsApiGroup() {
					return this.osApiGroup;
				}

				public void setOsApiGroup(Integer osApiGroup) {
					this.osApiGroup = osApiGroup;
				}

				public Long getApiNo() {
					return this.apiNo;
				}

				public void setApiNo(Long apiNo) {
					this.apiNo = apiNo;
				}

				public String getOsApiGroupName() {
					return this.osApiGroupName;
				}

				public void setOsApiGroupName(String osApiGroupName) {
					this.osApiGroupName = osApiGroupName;
				}

				public Integer getRequestMethod() {
					return this.requestMethod;
				}

				public void setRequestMethod(Integer requestMethod) {
					this.requestMethod = requestMethod;
				}

				public Integer getTimeout() {
					return this.timeout;
				}

				public void setTimeout(Integer timeout) {
					this.timeout = timeout;
				}

				public Integer getOsProject() {
					return this.osProject;
				}

				public void setOsProject(Integer osProject) {
					this.osProject = osProject;
				}

				public Integer getBizProtocol() {
					return this.protocol;
				}

				public void setBizProtocol(Integer protocol) {
					this.protocol = protocol;
				}

				public Integer getExecuteMode() {
					return this.executeMode;
				}

				public void setExecuteMode(Integer executeMode) {
					this.executeMode = executeMode;
				}

				public Integer getExecTimeout() {
					return this.execTimeout;
				}

				public void setExecTimeout(Integer execTimeout) {
					this.execTimeout = execTimeout;
				}

				public String getOsProjectName() {
					return this.osProjectName;
				}

				public void setOsProjectName(String osProjectName) {
					this.osProjectName = osProjectName;
				}

				public List<ApiResponseParamDTO> getResponseParamList() {
					return this.responseParamList;
				}

				public void setResponseParamList(List<ApiResponseParamDTO> responseParamList) {
					this.responseParamList = responseParamList;
				}

				public List<ApiRequestParamDTO> getRequestParamList() {
					return this.requestParamList;
				}

				public void setRequestParamList(List<ApiRequestParamDTO> requestParamList) {
					this.requestParamList = requestParamList;
				}

				public static class ApiResponseParamDTO {

					private String seqNum;

					private String mappingColumn;

					private String sample;

					private String dateFormat;

					private String descr;

					private String paramName;

					private String paramType;

					private Boolean isUrl;

					private String originalColumn;

					public String getSeqNum() {
						return this.seqNum;
					}

					public void setSeqNum(String seqNum) {
						this.seqNum = seqNum;
					}

					public String getMappingColumn() {
						return this.mappingColumn;
					}

					public void setMappingColumn(String mappingColumn) {
						this.mappingColumn = mappingColumn;
					}

					public String getSample() {
						return this.sample;
					}

					public void setSample(String sample) {
						this.sample = sample;
					}

					public String getDateFormat() {
						return this.dateFormat;
					}

					public void setDateFormat(String dateFormat) {
						this.dateFormat = dateFormat;
					}

					public String getDescr() {
						return this.descr;
					}

					public void setDescr(String descr) {
						this.descr = descr;
					}

					public String getParamName() {
						return this.paramName;
					}

					public void setParamName(String paramName) {
						this.paramName = paramName;
					}

					public String getParamType() {
						return this.paramType;
					}

					public void setParamType(String paramType) {
						this.paramType = paramType;
					}

					public Boolean getIsUrl() {
						return this.isUrl;
					}

					public void setIsUrl(Boolean isUrl) {
						this.isUrl = isUrl;
					}

					public String getOriginalColumn() {
						return this.originalColumn;
					}

					public void setOriginalColumn(String originalColumn) {
						this.originalColumn = originalColumn;
					}
				}

				public static class ApiRequestParamDTO {

					private String operator;

					private Integer seqNum;

					private Boolean optional;

					private String mappingColumn;

					private String sample;

					private String descr;

					private Boolean must;

					private String paramType;

					private String originalColumn;

					private String defaultValue;

					private String dateFormat;

					private String paramName;

					private Boolean isUrl;

					public String getOperator() {
						return this.operator;
					}

					public void setOperator(String operator) {
						this.operator = operator;
					}

					public Integer getSeqNum() {
						return this.seqNum;
					}

					public void setSeqNum(Integer seqNum) {
						this.seqNum = seqNum;
					}

					public Boolean getOptional() {
						return this.optional;
					}

					public void setOptional(Boolean optional) {
						this.optional = optional;
					}

					public String getMappingColumn() {
						return this.mappingColumn;
					}

					public void setMappingColumn(String mappingColumn) {
						this.mappingColumn = mappingColumn;
					}

					public String getSample() {
						return this.sample;
					}

					public void setSample(String sample) {
						this.sample = sample;
					}

					public String getDescr() {
						return this.descr;
					}

					public void setDescr(String descr) {
						this.descr = descr;
					}

					public Boolean getMust() {
						return this.must;
					}

					public void setMust(Boolean must) {
						this.must = must;
					}

					public String getParamType() {
						return this.paramType;
					}

					public void setParamType(String paramType) {
						this.paramType = paramType;
					}

					public String getOriginalColumn() {
						return this.originalColumn;
					}

					public void setOriginalColumn(String originalColumn) {
						this.originalColumn = originalColumn;
					}

					public String getDefaultValue() {
						return this.defaultValue;
					}

					public void setDefaultValue(String defaultValue) {
						this.defaultValue = defaultValue;
					}

					public String getDateFormat() {
						return this.dateFormat;
					}

					public void setDateFormat(String dateFormat) {
						this.dateFormat = dateFormat;
					}

					public String getParamName() {
						return this.paramName;
					}

					public void setParamName(String paramName) {
						this.paramName = paramName;
					}

					public Boolean getIsUrl() {
						return this.isUrl;
					}

					public void setIsUrl(Boolean isUrl) {
						this.isUrl = isUrl;
					}
				}
			}

			public static class DataVersionConfig {

				private String versionDescription;

				private FileStorageConfig fileStorageConfig;

				private RealtimeMetaTableConfig realtimeMetaTableConfig;

				private MetadataStorageConfig metadataStorageConfig;

				public String getVersionDescription() {
					return this.versionDescription;
				}

				public void setVersionDescription(String versionDescription) {
					this.versionDescription = versionDescription;
				}

				public FileStorageConfig getFileStorageConfig() {
					return this.fileStorageConfig;
				}

				public void setFileStorageConfig(FileStorageConfig fileStorageConfig) {
					this.fileStorageConfig = fileStorageConfig;
				}

				public RealtimeMetaTableConfig getRealtimeMetaTableConfig() {
					return this.realtimeMetaTableConfig;
				}

				public void setRealtimeMetaTableConfig(RealtimeMetaTableConfig realtimeMetaTableConfig) {
					this.realtimeMetaTableConfig = realtimeMetaTableConfig;
				}

				public MetadataStorageConfig getMetadataStorageConfig() {
					return this.metadataStorageConfig;
				}

				public void setMetadataStorageConfig(MetadataStorageConfig metadataStorageConfig) {
					this.metadataStorageConfig = metadataStorageConfig;
				}

				public static class FileStorageConfig {

					private String mountPath;

					private String dataSourceName;

					private String prodPath;

					private String dataSourceId;

					private String devPath;

					public String getMountPath() {
						return this.mountPath;
					}

					public void setMountPath(String mountPath) {
						this.mountPath = mountPath;
					}

					public String getDataSourceName() {
						return this.dataSourceName;
					}

					public void setDataSourceName(String dataSourceName) {
						this.dataSourceName = dataSourceName;
					}

					public String getProdPath() {
						return this.prodPath;
					}

					public void setProdPath(String prodPath) {
						this.prodPath = prodPath;
					}

					public String getDataSourceId() {
						return this.dataSourceId;
					}

					public void setDataSourceId(String dataSourceId) {
						this.dataSourceId = dataSourceId;
					}

					public String getDevPath() {
						return this.devPath;
					}

					public void setDevPath(String devPath) {
						this.devPath = devPath;
					}
				}

				public static class RealtimeMetaTableConfig {

					private Long projectId;

					private String metaTableName;

					private String datasourceType;

					private TableSchema tableSchema;

					public Long getProjectId() {
						return this.projectId;
					}

					public void setProjectId(Long projectId) {
						this.projectId = projectId;
					}

					public String getMetaTableName() {
						return this.metaTableName;
					}

					public void setMetaTableName(String metaTableName) {
						this.metaTableName = metaTableName;
					}

					public String getDatasourceType() {
						return this.datasourceType;
					}

					public void setDatasourceType(String datasourceType) {
						this.datasourceType = datasourceType;
					}

					public TableSchema getTableSchema() {
						return this.tableSchema;
					}

					public void setTableSchema(TableSchema tableSchema) {
						this.tableSchema = tableSchema;
					}

					public static class TableSchema {

						private List<ColumnSchemaDTO> columns;

						public List<ColumnSchemaDTO> getColumns() {
							return this.columns;
						}

						public void setColumns(List<ColumnSchemaDTO> columns) {
							this.columns = columns;
						}

						public static class ColumnSchemaDTO {

							private String comment;

							private String type;

							private String elementType;

							private Boolean pk;

							private Boolean url;

							private String name;

							private Integer maxCapacity;

							private VectorIndexConfig vectorIndexConfig;

							public String getComment() {
								return this.comment;
							}

							public void setComment(String comment) {
								this.comment = comment;
							}

							public String getType() {
								return this.type;
							}

							public void setType(String type) {
								this.type = type;
							}

							public String getElementType() {
								return this.elementType;
							}

							public void setElementType(String elementType) {
								this.elementType = elementType;
							}

							public Boolean getPk() {
								return this.pk;
							}

							public void setPk(Boolean pk) {
								this.pk = pk;
							}

							public Boolean getUrl() {
								return this.url;
							}

							public void setUrl(Boolean url) {
								this.url = url;
							}

							public String getName() {
								return this.name;
							}

							public void setName(String name) {
								this.name = name;
							}

							public Integer getMaxCapacity() {
								return this.maxCapacity;
							}

							public void setMaxCapacity(Integer maxCapacity) {
								this.maxCapacity = maxCapacity;
							}

							public VectorIndexConfig getVectorIndexConfig() {
								return this.vectorIndexConfig;
							}

							public void setVectorIndexConfig(VectorIndexConfig vectorIndexConfig) {
								this.vectorIndexConfig = vectorIndexConfig;
							}

							public static class VectorIndexConfig {

								private String similarityType;

								private String embeddingModel;

								private Long dimension;

								private Map<Object,Object> indexParams;

								private String indexType;

								public String getSimilarityType() {
									return this.similarityType;
								}

								public void setSimilarityType(String similarityType) {
									this.similarityType = similarityType;
								}

								public String getEmbeddingModel() {
									return this.embeddingModel;
								}

								public void setEmbeddingModel(String embeddingModel) {
									this.embeddingModel = embeddingModel;
								}

								public Long getDimension() {
									return this.dimension;
								}

								public void setDimension(Long dimension) {
									this.dimension = dimension;
								}

								public Map<Object,Object> getIndexParams() {
									return this.indexParams;
								}

								public void setIndexParams(Map<Object,Object> indexParams) {
									this.indexParams = indexParams;
								}

								public String getIndexType() {
									return this.indexType;
								}

								public void setIndexType(String indexType) {
									this.indexType = indexType;
								}
							}
						}
					}
				}

				public static class MetadataStorageConfig {

					private String tableName;

					private String metadataStorageMode;

					private String dataSourceName;

					private String metadataStorageType;

					private String prodSchema;

					private String dataSourceId;

					private String devSchema;

					private TableSchema1 tableSchema1;

					public String getTableName() {
						return this.tableName;
					}

					public void setTableName(String tableName) {
						this.tableName = tableName;
					}

					public String getMetadataStorageMode() {
						return this.metadataStorageMode;
					}

					public void setMetadataStorageMode(String metadataStorageMode) {
						this.metadataStorageMode = metadataStorageMode;
					}

					public String getDataSourceName() {
						return this.dataSourceName;
					}

					public void setDataSourceName(String dataSourceName) {
						this.dataSourceName = dataSourceName;
					}

					public String getMetadataStorageType() {
						return this.metadataStorageType;
					}

					public void setMetadataStorageType(String metadataStorageType) {
						this.metadataStorageType = metadataStorageType;
					}

					public String getProdSchema() {
						return this.prodSchema;
					}

					public void setProdSchema(String prodSchema) {
						this.prodSchema = prodSchema;
					}

					public String getDataSourceId() {
						return this.dataSourceId;
					}

					public void setDataSourceId(String dataSourceId) {
						this.dataSourceId = dataSourceId;
					}

					public String getDevSchema() {
						return this.devSchema;
					}

					public void setDevSchema(String devSchema) {
						this.devSchema = devSchema;
					}

					public TableSchema1 getTableSchema1() {
						return this.tableSchema1;
					}

					public void setTableSchema1(TableSchema1 tableSchema1) {
						this.tableSchema1 = tableSchema1;
					}

					public static class TableSchema1 {

						private List<ColumnSchemaDTO3> columns2;

						public List<ColumnSchemaDTO3> getColumns2() {
							return this.columns2;
						}

						public void setColumns2(List<ColumnSchemaDTO3> columns2) {
							this.columns2 = columns2;
						}

						public static class ColumnSchemaDTO3 {

							private String comment;

							private String type;

							private String elementType;

							private Boolean pk;

							private Boolean url;

							private String name;

							private Integer maxCapacity;

							private VectorIndexConfig4 vectorIndexConfig4;

							public String getComment() {
								return this.comment;
							}

							public void setComment(String comment) {
								this.comment = comment;
							}

							public String getType() {
								return this.type;
							}

							public void setType(String type) {
								this.type = type;
							}

							public String getElementType() {
								return this.elementType;
							}

							public void setElementType(String elementType) {
								this.elementType = elementType;
							}

							public Boolean getPk() {
								return this.pk;
							}

							public void setPk(Boolean pk) {
								this.pk = pk;
							}

							public Boolean getUrl() {
								return this.url;
							}

							public void setUrl(Boolean url) {
								this.url = url;
							}

							public String getName() {
								return this.name;
							}

							public void setName(String name) {
								this.name = name;
							}

							public Integer getMaxCapacity() {
								return this.maxCapacity;
							}

							public void setMaxCapacity(Integer maxCapacity) {
								this.maxCapacity = maxCapacity;
							}

							public VectorIndexConfig4 getVectorIndexConfig4() {
								return this.vectorIndexConfig4;
							}

							public void setVectorIndexConfig4(VectorIndexConfig4 vectorIndexConfig4) {
								this.vectorIndexConfig4 = vectorIndexConfig4;
							}

							public static class VectorIndexConfig4 {

								private String similarityType;

								private String embeddingModel;

								private Long dimension;

								private Map<Object,Object> indexParams;

								private String indexType;

								public String getSimilarityType() {
									return this.similarityType;
								}

								public void setSimilarityType(String similarityType) {
									this.similarityType = similarityType;
								}

								public String getEmbeddingModel() {
									return this.embeddingModel;
								}

								public void setEmbeddingModel(String embeddingModel) {
									this.embeddingModel = embeddingModel;
								}

								public Long getDimension() {
									return this.dimension;
								}

								public void setDimension(Long dimension) {
									this.dimension = dimension;
								}

								public Map<Object,Object> getIndexParams() {
									return this.indexParams;
								}

								public void setIndexParams(Map<Object,Object> indexParams) {
									this.indexParams = indexParams;
								}

								public String getIndexType() {
									return this.indexType;
								}

								public void setIndexType(String indexType) {
									this.indexType = indexType;
								}
							}
						}
					}
				}
			}
		}
	}

	@Override
	public GetDatasetResponse getInstance(UnmarshallerContext context) {
		return	GetDatasetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
