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

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private DatasetDTO datasetDTO;

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

	public DatasetDTO getDatasetDTO() {
		return this.datasetDTO;
	}

	public void setDatasetDTO(DatasetDTO datasetDTO) {
		this.datasetDTO = datasetDTO;
	}

	public static class DatasetDTO {

		private Long id;

		private Long projectId;

		private String projectName;

		private String name;

		private Long fileId;

		private String directory;

		private String dataCellId;

		private String dataCellName;

		private String type;

		private String storageType;

		private String metadataStorageType;

		private String scenario;

		private String contentType;

		private String creator;

		private String creatorName;

		private String gmtCreate;

		private String gmtModified;

		private String description;

		private Long tenantId;

		private String lockOwner;

		private String lockOwnerName;

		private List<Owner> ownerList;

		private List<DatasetVersionDTO> versionList;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getFileId() {
			return this.fileId;
		}

		public void setFileId(Long fileId) {
			this.fileId = fileId;
		}

		public String getDirectory() {
			return this.directory;
		}

		public void setDirectory(String directory) {
			this.directory = directory;
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

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getMetadataStorageType() {
			return this.metadataStorageType;
		}

		public void setMetadataStorageType(String metadataStorageType) {
			this.metadataStorageType = metadataStorageType;
		}

		public String getScenario() {
			return this.scenario;
		}

		public void setScenario(String scenario) {
			this.scenario = scenario;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getCreatorName() {
			return this.creatorName;
		}

		public void setCreatorName(String creatorName) {
			this.creatorName = creatorName;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getLockOwner() {
			return this.lockOwner;
		}

		public void setLockOwner(String lockOwner) {
			this.lockOwner = lockOwner;
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

			private String userId;

			private String userName;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}
		}

		public static class DatasetVersionDTO {

			private Long id;

			private Long datasetId;

			private String version;

			private String creator;

			private String gmtCreate;

			private String gmtModified;

			private DataVersionConfig dataVersionConfig;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getDatasetId() {
				return this.datasetId;
			}

			public void setDatasetId(Long datasetId) {
				this.datasetId = datasetId;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public DataVersionConfig getDataVersionConfig() {
				return this.dataVersionConfig;
			}

			public void setDataVersionConfig(DataVersionConfig dataVersionConfig) {
				this.dataVersionConfig = dataVersionConfig;
			}

			public static class DataVersionConfig {

				private String versionDescription;

				private FileStorageConfig fileStorageConfig;

				private MetadataStorageConfig metadataStorageConfig;

				private RealtimeMetaTableConfig realtimeMetaTableConfig;

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

				public MetadataStorageConfig getMetadataStorageConfig() {
					return this.metadataStorageConfig;
				}

				public void setMetadataStorageConfig(MetadataStorageConfig metadataStorageConfig) {
					this.metadataStorageConfig = metadataStorageConfig;
				}

				public RealtimeMetaTableConfig getRealtimeMetaTableConfig() {
					return this.realtimeMetaTableConfig;
				}

				public void setRealtimeMetaTableConfig(RealtimeMetaTableConfig realtimeMetaTableConfig) {
					this.realtimeMetaTableConfig = realtimeMetaTableConfig;
				}

				public static class FileStorageConfig {

					private String dataSourceId;

					private String dataSourceName;

					private String devPath;

					private String prodPath;

					private String mountPath;

					public String getDataSourceId() {
						return this.dataSourceId;
					}

					public void setDataSourceId(String dataSourceId) {
						this.dataSourceId = dataSourceId;
					}

					public String getDataSourceName() {
						return this.dataSourceName;
					}

					public void setDataSourceName(String dataSourceName) {
						this.dataSourceName = dataSourceName;
					}

					public String getDevPath() {
						return this.devPath;
					}

					public void setDevPath(String devPath) {
						this.devPath = devPath;
					}

					public String getProdPath() {
						return this.prodPath;
					}

					public void setProdPath(String prodPath) {
						this.prodPath = prodPath;
					}

					public String getMountPath() {
						return this.mountPath;
					}

					public void setMountPath(String mountPath) {
						this.mountPath = mountPath;
					}
				}

				public static class MetadataStorageConfig {

					private String metadataStorageMode;

					private String metadataStorageType;

					private String dataSourceId;

					private String dataSourceName;

					private String devSchema;

					private String prodSchema;

					private String tableName;

					private TableSchema tableSchema;

					public String getMetadataStorageMode() {
						return this.metadataStorageMode;
					}

					public void setMetadataStorageMode(String metadataStorageMode) {
						this.metadataStorageMode = metadataStorageMode;
					}

					public String getMetadataStorageType() {
						return this.metadataStorageType;
					}

					public void setMetadataStorageType(String metadataStorageType) {
						this.metadataStorageType = metadataStorageType;
					}

					public String getDataSourceId() {
						return this.dataSourceId;
					}

					public void setDataSourceId(String dataSourceId) {
						this.dataSourceId = dataSourceId;
					}

					public String getDataSourceName() {
						return this.dataSourceName;
					}

					public void setDataSourceName(String dataSourceName) {
						this.dataSourceName = dataSourceName;
					}

					public String getDevSchema() {
						return this.devSchema;
					}

					public void setDevSchema(String devSchema) {
						this.devSchema = devSchema;
					}

					public String getProdSchema() {
						return this.prodSchema;
					}

					public void setProdSchema(String prodSchema) {
						this.prodSchema = prodSchema;
					}

					public String getTableName() {
						return this.tableName;
					}

					public void setTableName(String tableName) {
						this.tableName = tableName;
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

							private String name;

							private String type;

							private String elementType;

							private Integer maxCapacity;

							private Boolean pk;

							private String comment;

							private Boolean url;

							private VectorIndexConfig vectorIndexConfig;

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

							public String getElementType() {
								return this.elementType;
							}

							public void setElementType(String elementType) {
								this.elementType = elementType;
							}

							public Integer getMaxCapacity() {
								return this.maxCapacity;
							}

							public void setMaxCapacity(Integer maxCapacity) {
								this.maxCapacity = maxCapacity;
							}

							public Boolean getPk() {
								return this.pk;
							}

							public void setPk(Boolean pk) {
								this.pk = pk;
							}

							public String getComment() {
								return this.comment;
							}

							public void setComment(String comment) {
								this.comment = comment;
							}

							public Boolean getUrl() {
								return this.url;
							}

							public void setUrl(Boolean url) {
								this.url = url;
							}

							public VectorIndexConfig getVectorIndexConfig() {
								return this.vectorIndexConfig;
							}

							public void setVectorIndexConfig(VectorIndexConfig vectorIndexConfig) {
								this.vectorIndexConfig = vectorIndexConfig;
							}

							public static class VectorIndexConfig {

								private String embeddingModel;

								private Long dimension;

								private String indexType;

								private String similarityType;

								private Map<Object,Object> indexParams;

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

								public String getIndexType() {
									return this.indexType;
								}

								public void setIndexType(String indexType) {
									this.indexType = indexType;
								}

								public String getSimilarityType() {
									return this.similarityType;
								}

								public void setSimilarityType(String similarityType) {
									this.similarityType = similarityType;
								}

								public Map<Object,Object> getIndexParams() {
									return this.indexParams;
								}

								public void setIndexParams(Map<Object,Object> indexParams) {
									this.indexParams = indexParams;
								}
							}
						}
					}
				}

				public static class RealtimeMetaTableConfig {

					private Long projectId;

					private String metaTableName;

					private String datasourceType;

					private TableSchema1 tableSchema1;

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

							private String name;

							private String type;

							private String elementType;

							private Integer maxCapacity;

							private Boolean pk;

							private String comment;

							private Boolean url;

							private VectorIndexConfig4 vectorIndexConfig4;

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

							public String getElementType() {
								return this.elementType;
							}

							public void setElementType(String elementType) {
								this.elementType = elementType;
							}

							public Integer getMaxCapacity() {
								return this.maxCapacity;
							}

							public void setMaxCapacity(Integer maxCapacity) {
								this.maxCapacity = maxCapacity;
							}

							public Boolean getPk() {
								return this.pk;
							}

							public void setPk(Boolean pk) {
								this.pk = pk;
							}

							public String getComment() {
								return this.comment;
							}

							public void setComment(String comment) {
								this.comment = comment;
							}

							public Boolean getUrl() {
								return this.url;
							}

							public void setUrl(Boolean url) {
								this.url = url;
							}

							public VectorIndexConfig4 getVectorIndexConfig4() {
								return this.vectorIndexConfig4;
							}

							public void setVectorIndexConfig4(VectorIndexConfig4 vectorIndexConfig4) {
								this.vectorIndexConfig4 = vectorIndexConfig4;
							}

							public static class VectorIndexConfig4 {

								private String embeddingModel;

								private Long dimension;

								private String indexType;

								private String similarityType;

								private Map<Object,Object> indexParams;

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

								public String getIndexType() {
									return this.indexType;
								}

								public void setIndexType(String indexType) {
									this.indexType = indexType;
								}

								public String getSimilarityType() {
									return this.similarityType;
								}

								public void setSimilarityType(String similarityType) {
									this.similarityType = similarityType;
								}

								public Map<Object,Object> getIndexParams() {
									return this.indexParams;
								}

								public void setIndexParams(Map<Object,Object> indexParams) {
									this.indexParams = indexParams;
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
