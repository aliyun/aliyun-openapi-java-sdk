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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.DescribeAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String id;

		private String description;

		private String status;

		private String type;

		private String clusterName;

		private Integer algoDeploymentId;

		private Integer created;

		private Boolean autoSwitch;

		private Integer progressPercent;

		private List<String> fetchFields;

		private Schema schema;

		private Quota quota;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Integer getAlgoDeploymentId() {
			return this.algoDeploymentId;
		}

		public void setAlgoDeploymentId(Integer algoDeploymentId) {
			this.algoDeploymentId = algoDeploymentId;
		}

		public Integer getCreated() {
			return this.created;
		}

		public void setCreated(Integer created) {
			this.created = created;
		}

		public Boolean getAutoSwitch() {
			return this.autoSwitch;
		}

		public void setAutoSwitch(Boolean autoSwitch) {
			this.autoSwitch = autoSwitch;
		}

		public Integer getProgressPercent() {
			return this.progressPercent;
		}

		public void setProgressPercent(Integer progressPercent) {
			this.progressPercent = progressPercent;
		}

		public List<String> getFetchFields() {
			return this.fetchFields;
		}

		public void setFetchFields(List<String> fetchFields) {
			this.fetchFields = fetchFields;
		}

		public Schema getSchema() {
			return this.schema;
		}

		public void setSchema(Schema schema) {
			this.schema = schema;
		}

		public Quota getQuota() {
			return this.quota;
		}

		public void setQuota(Quota quota) {
			this.quota = quota;
		}

		public static class Schema {

			private String pluginInfo;

			private List<String> routeField;

			private Tables tables;

			private Indexes indexes;

			public String getPluginInfo() {
				return this.pluginInfo;
			}

			public void setPluginInfo(String pluginInfo) {
				this.pluginInfo = pluginInfo;
			}

			public List<String> getRouteField() {
				return this.routeField;
			}

			public void setRouteField(List<String> routeField) {
				this.routeField = routeField;
			}

			public Tables getTables() {
				return this.tables;
			}

			public void setTables(Tables tables) {
				this.tables = tables;
			}

			public Indexes getIndexes() {
				return this.indexes;
			}

			public void setIndexes(Indexes indexes) {
				this.indexes = indexes;
			}

			public static class Tables {

				private Main main;

				public Main getMain() {
					return this.main;
				}

				public void setMain(Main main) {
					this.main = main;
				}

				public static class Main {

					private Boolean primaryTable;

					private String name;

					private Fields fields;

					public Boolean getPrimaryTable() {
						return this.primaryTable;
					}

					public void setPrimaryTable(Boolean primaryTable) {
						this.primaryTable = primaryTable;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Fields getFields() {
						return this.fields;
					}

					public void setFields(Fields fields) {
						this.fields = fields;
					}

					public static class Fields {

						private Id id;

						private Title title;

						private Buy buy;

						public Id getId() {
							return this.id;
						}

						public void setId(Id id) {
							this.id = id;
						}

						public Title getTitle() {
							return this.title;
						}

						public void setTitle(Title title) {
							this.title = title;
						}

						public Buy getBuy() {
							return this.buy;
						}

						public void setBuy(Buy buy) {
							this.buy = buy;
						}

						public static class Id {

							private List<String> fields1;

							public List<String> getFields1() {
								return this.fields1;
							}

							public void setFields1(List<String> fields1) {
								this.fields1 = fields1;
							}
						}

						public static class Title {

							private String type;

							private String name;

							private Boolean primaryKey;

							public String getType() {
								return this.type;
							}

							public void setType(String type) {
								this.type = type;
							}

							public String getName() {
								return this.name;
							}

							public void setName(String name) {
								this.name = name;
							}

							public Boolean getPrimaryKey() {
								return this.primaryKey;
							}

							public void setPrimaryKey(Boolean primaryKey) {
								this.primaryKey = primaryKey;
							}
						}

						public static class Buy {

							private String type;

							private String name;

							private Boolean primaryKey;

							public String getType() {
								return this.type;
							}

							public void setType(String type) {
								this.type = type;
							}

							public String getName() {
								return this.name;
							}

							public void setName(String name) {
								this.name = name;
							}

							public Boolean getPrimaryKey() {
								return this.primaryKey;
							}

							public void setPrimaryKey(Boolean primaryKey) {
								this.primaryKey = primaryKey;
							}
						}
					}
				}
			}

			public static class Indexes {

				private List<String> filterFields;

				private SearchFields searchFields;

				public List<String> getFilterFields() {
					return this.filterFields;
				}

				public void setFilterFields(List<String> filterFields) {
					this.filterFields = filterFields;
				}

				public SearchFields getSearchFields() {
					return this.searchFields;
				}

				public void setSearchFields(SearchFields searchFields) {
					this.searchFields = searchFields;
				}

				public static class SearchFields {

					private _Default _default;

					private Id2 id2;

					public _Default get_Default() {
						return this._default;
					}

					public void set_Default(_Default _default) {
						this._default = _default;
					}

					public Id2 getId2() {
						return this.id2;
					}

					public void setId2(Id2 id2) {
						this.id2 = id2;
					}

					public static class _Default {

						private String analyzer;

						private List<String> fields3;

						public String getAnalyzer() {
							return this.analyzer;
						}

						public void setAnalyzer(String analyzer) {
							this.analyzer = analyzer;
						}

						public List<String> getFields3() {
							return this.fields3;
						}

						public void setFields3(List<String> fields3) {
							this.fields3 = fields3;
						}
					}

					public static class Id2 {

						private List<String> fields4;

						public List<String> getFields4() {
							return this.fields4;
						}

						public void setFields4(List<String> fields4) {
							this.fields4 = fields4;
						}
					}
				}
			}
		}

		public static class Quota {

			private Integer docSize;

			private Integer computeResource;

			private Integer qps;

			private String spec;

			public Integer getDocSize() {
				return this.docSize;
			}

			public void setDocSize(Integer docSize) {
				this.docSize = docSize;
			}

			public Integer getComputeResource() {
				return this.computeResource;
			}

			public void setComputeResource(Integer computeResource) {
				this.computeResource = computeResource;
			}

			public Integer getQps() {
				return this.qps;
			}

			public void setQps(Integer qps) {
				this.qps = qps;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}
		}
	}

	@Override
	public DescribeAppResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
