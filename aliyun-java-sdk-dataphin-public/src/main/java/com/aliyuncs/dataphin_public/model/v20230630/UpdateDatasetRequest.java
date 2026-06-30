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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateDatasetRequest extends RpcAcsRequest<UpdateDatasetResponse> {
	   

	private Long opTenantId;

	@SerializedName("updateCommand")
	private UpdateCommand updateCommand;

	private String projectId;
	public UpdateDatasetRequest() {
		super("dataphin-public", "2023-06-30", "UpdateDataset");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public UpdateCommand getUpdateCommand() {
		return this.updateCommand;
	}

	public void setUpdateCommand(UpdateCommand updateCommand) {
		this.updateCommand = updateCommand;	
		if (updateCommand != null) {
			putBodyParameter("UpdateCommand" , new Gson().toJson(updateCommand));
		}	
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public static class UpdateCommand {

		@SerializedName("Owner")
		private String owner;

		@SerializedName("MetadataStorageType")
		private String metadataStorageType;

		@SerializedName("Description")
		private String description;

		@SerializedName("VersionConfig")
		private VersionConfig versionConfig;

		@SerializedName("Type")
		private String type;

		@SerializedName("Version")
		private String version;

		@SerializedName("StorageType")
		private String storageType;

		@SerializedName("ContentType")
		private String contentType;

		@SerializedName("DataCellId")
		private String dataCellId;

		@SerializedName("Scenario")
		private String scenario;

		@SerializedName("Name")
		private String name;

		@SerializedName("Id")
		private Long id;

		@SerializedName("FileId")
		private String fileId;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getMetadataStorageType() {
			return this.metadataStorageType;
		}

		public void setMetadataStorageType(String metadataStorageType) {
			this.metadataStorageType = metadataStorageType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public VersionConfig getVersionConfig() {
			return this.versionConfig;
		}

		public void setVersionConfig(VersionConfig versionConfig) {
			this.versionConfig = versionConfig;
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

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public String getDataCellId() {
			return this.dataCellId;
		}

		public void setDataCellId(String dataCellId) {
			this.dataCellId = dataCellId;
		}

		public String getScenario() {
			return this.scenario;
		}

		public void setScenario(String scenario) {
			this.scenario = scenario;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public static class VersionConfig {

			@SerializedName("MetadataStorageConfig")
			private MetadataStorageConfig metadataStorageConfig;

			@SerializedName("RealtimeMetaTableConfig")
			private RealtimeMetaTableConfig realtimeMetaTableConfig;

			@SerializedName("FileStorageConfig")
			private FileStorageConfig fileStorageConfig;

			@SerializedName("VersionDescription")
			private String versionDescription;

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

			public FileStorageConfig getFileStorageConfig() {
				return this.fileStorageConfig;
			}

			public void setFileStorageConfig(FileStorageConfig fileStorageConfig) {
				this.fileStorageConfig = fileStorageConfig;
			}

			public String getVersionDescription() {
				return this.versionDescription;
			}

			public void setVersionDescription(String versionDescription) {
				this.versionDescription = versionDescription;
			}

			public static class MetadataStorageConfig {

				@SerializedName("MetadataStorageMode")
				private String metadataStorageMode;

				@SerializedName("TableSchema")
				private TableSchema tableSchema;

				@SerializedName("DevSchema")
				private String devSchema;

				@SerializedName("ProdSchema")
				private String prodSchema;

				@SerializedName("MetadataStorageType")
				private String metadataStorageType;

				@SerializedName("DataSourceId")
				private String dataSourceId;

				@SerializedName("DataSourceName")
				private String dataSourceName;

				@SerializedName("TableName")
				private String tableName;

				public String getMetadataStorageMode() {
					return this.metadataStorageMode;
				}

				public void setMetadataStorageMode(String metadataStorageMode) {
					this.metadataStorageMode = metadataStorageMode;
				}

				public TableSchema getTableSchema() {
					return this.tableSchema;
				}

				public void setTableSchema(TableSchema tableSchema) {
					this.tableSchema = tableSchema;
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

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public static class TableSchema {

					@SerializedName("Columns")
					private List<ColumnsItem> columns;

					public List<ColumnsItem> getColumns() {
						return this.columns;
					}

					public void setColumns(List<ColumnsItem> columns) {
						this.columns = columns;
					}

					public static class ColumnsItem {

						@SerializedName("MaxCapacity")
						private Integer maxCapacity;

						@SerializedName("VectorIndexConfig")
						private VectorIndexConfig vectorIndexConfig;

						@SerializedName("Name")
						private String name;

						@SerializedName("Comment")
						private String comment;

						@SerializedName("Pk")
						private Boolean pk;

						@SerializedName("Type")
						private String type;

						@SerializedName("Url")
						private Boolean url;

						@SerializedName("ElementType")
						private String elementType;

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

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}

						public String getComment() {
							return this.comment;
						}

						public void setComment(String comment) {
							this.comment = comment;
						}

						public Boolean getPk() {
							return this.pk;
						}

						public void setPk(Boolean pk) {
							this.pk = pk;
						}

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public Boolean getUrl() {
							return this.url;
						}

						public void setUrl(Boolean url) {
							this.url = url;
						}

						public String getElementType() {
							return this.elementType;
						}

						public void setElementType(String elementType) {
							this.elementType = elementType;
						}

						public static class VectorIndexConfig {

							@SerializedName("IndexType")
							private String indexType;

							@SerializedName("SimilarityType")
							private String similarityType;

							@SerializedName("EmbeddingModel")
							private String embeddingModel;

							@SerializedName("IndexParams")
							private Map<String,String> indexParams;

							@SerializedName("Dimension")
							private Long dimension;

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

							public String getEmbeddingModel() {
								return this.embeddingModel;
							}

							public void setEmbeddingModel(String embeddingModel) {
								this.embeddingModel = embeddingModel;
							}

							public Map<String,String> getIndexParams() {
								return this.indexParams;
							}

							public void setIndexParams(Map<String,String> indexParams) {
								this.indexParams = indexParams;
							}

							public Long getDimension() {
								return this.dimension;
							}

							public void setDimension(Long dimension) {
								this.dimension = dimension;
							}
						}
					}
				}
			}

			public static class RealtimeMetaTableConfig {

				@SerializedName("DatasourceType")
				private String datasourceType;

				@SerializedName("TableSchema")
				private TableSchema tableSchema;

				@SerializedName("ProjectId")
				private Long projectId;

				@SerializedName("MetaTableName")
				private String metaTableName;

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

				public static class TableSchema {

					@SerializedName("Columns")
					private List<ColumnsItem> columns;

					public List<ColumnsItem> getColumns() {
						return this.columns;
					}

					public void setColumns(List<ColumnsItem> columns) {
						this.columns = columns;
					}

					public static class ColumnsItem {

						@SerializedName("MaxCapacity")
						private Integer maxCapacity;

						@SerializedName("VectorIndexConfig")
						private VectorIndexConfig vectorIndexConfig;

						@SerializedName("Name")
						private String name;

						@SerializedName("Comment")
						private String comment;

						@SerializedName("Pk")
						private Boolean pk;

						@SerializedName("Type")
						private String type;

						@SerializedName("Url")
						private Boolean url;

						@SerializedName("ElementType")
						private String elementType;

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

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}

						public String getComment() {
							return this.comment;
						}

						public void setComment(String comment) {
							this.comment = comment;
						}

						public Boolean getPk() {
							return this.pk;
						}

						public void setPk(Boolean pk) {
							this.pk = pk;
						}

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public Boolean getUrl() {
							return this.url;
						}

						public void setUrl(Boolean url) {
							this.url = url;
						}

						public String getElementType() {
							return this.elementType;
						}

						public void setElementType(String elementType) {
							this.elementType = elementType;
						}

						public static class VectorIndexConfig {

							@SerializedName("IndexType")
							private String indexType;

							@SerializedName("SimilarityType")
							private String similarityType;

							@SerializedName("EmbeddingModel")
							private String embeddingModel;

							@SerializedName("IndexParams")
							private Map<String,String> indexParams;

							@SerializedName("Dimension")
							private Long dimension;

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

							public String getEmbeddingModel() {
								return this.embeddingModel;
							}

							public void setEmbeddingModel(String embeddingModel) {
								this.embeddingModel = embeddingModel;
							}

							public Map<String,String> getIndexParams() {
								return this.indexParams;
							}

							public void setIndexParams(Map<String,String> indexParams) {
								this.indexParams = indexParams;
							}

							public Long getDimension() {
								return this.dimension;
							}

							public void setDimension(Long dimension) {
								this.dimension = dimension;
							}
						}
					}
				}
			}

			public static class FileStorageConfig {

				@SerializedName("DevPath")
				private String devPath;

				@SerializedName("MountPath")
				private String mountPath;

				@SerializedName("ProdPath")
				private String prodPath;

				@SerializedName("DataSourceId")
				private String dataSourceId;

				@SerializedName("DataSourceName")
				private String dataSourceName;

				public String getDevPath() {
					return this.devPath;
				}

				public void setDevPath(String devPath) {
					this.devPath = devPath;
				}

				public String getMountPath() {
					return this.mountPath;
				}

				public void setMountPath(String mountPath) {
					this.mountPath = mountPath;
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

				public String getDataSourceName() {
					return this.dataSourceName;
				}

				public void setDataSourceName(String dataSourceName) {
					this.dataSourceName = dataSourceName;
				}
			}
		}
	}

	@Override
	public Class<UpdateDatasetResponse> getResponseClass() {
		return UpdateDatasetResponse.class;
	}

}
