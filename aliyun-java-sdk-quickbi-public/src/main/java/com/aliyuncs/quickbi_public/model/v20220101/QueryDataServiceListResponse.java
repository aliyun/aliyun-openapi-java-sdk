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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.QueryDataServiceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDataServiceListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalNum;

		private Integer totalPages;

		private List<QueryDataServiceModel> data;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Integer totalNum) {
			this.totalNum = totalNum;
		}

		public Integer getTotalPages() {
			return this.totalPages;
		}

		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}

		public List<QueryDataServiceModel> getData() {
			return this.data;
		}

		public void setData(List<QueryDataServiceModel> data) {
			this.data = data;
		}

		public static class QueryDataServiceModel {

			private String creatorId;

			private String creatorName;

			private String cubeId;

			private String cubeName;

			private String desc;

			private String gmtCreate;

			private String gmtModified;

			private String modifierId;

			private String modifierName;

			private String name;

			private String ownerId;

			private String ownerName;

			private String sid;

			private String workspaceId;

			private String workspaceName;

			private Content content;

			public String getCreatorId() {
				return this.creatorId;
			}

			public void setCreatorId(String creatorId) {
				this.creatorId = creatorId;
			}

			public String getCreatorName() {
				return this.creatorName;
			}

			public void setCreatorName(String creatorName) {
				this.creatorName = creatorName;
			}

			public String getCubeId() {
				return this.cubeId;
			}

			public void setCubeId(String cubeId) {
				this.cubeId = cubeId;
			}

			public String getCubeName() {
				return this.cubeName;
			}

			public void setCubeName(String cubeName) {
				this.cubeName = cubeName;
			}

			public String getDesc() {
				return this.desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
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

			public String getModifierId() {
				return this.modifierId;
			}

			public void setModifierId(String modifierId) {
				this.modifierId = modifierId;
			}

			public String getModifierName() {
				return this.modifierName;
			}

			public void setModifierName(String modifierName) {
				this.modifierName = modifierName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getSid() {
				return this.sid;
			}

			public void setSid(String sid) {
				this.sid = sid;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getWorkspaceName() {
				return this.workspaceName;
			}

			public void setWorkspaceName(String workspaceName) {
				this.workspaceName = workspaceName;
			}

			public Content getContent() {
				return this.content;
			}

			public void setContent(Content content) {
				this.content = content;
			}

			public static class Content {

				private String cubeId;

				private String cubeName;

				private Boolean detail;

				private List<SelectFieldModel> returnFields;

				private Filter filter;

				public String getCubeId() {
					return this.cubeId;
				}

				public void setCubeId(String cubeId) {
					this.cubeId = cubeId;
				}

				public String getCubeName() {
					return this.cubeName;
				}

				public void setCubeName(String cubeName) {
					this.cubeName = cubeName;
				}

				public Boolean getDetail() {
					return this.detail;
				}

				public void setDetail(Boolean detail) {
					this.detail = detail;
				}

				public List<SelectFieldModel> getReturnFields() {
					return this.returnFields;
				}

				public void setReturnFields(List<SelectFieldModel> returnFields) {
					this.returnFields = returnFields;
				}

				public Filter getFilter() {
					return this.filter;
				}

				public void setFilter(Filter filter) {
					this.filter = filter;
				}

				public static class SelectFieldModel {

					private String aggregator;

					private String alias;

					private String desc;

					private String orderby;

					private Field field;

					public String getAggregator() {
						return this.aggregator;
					}

					public void setAggregator(String aggregator) {
						this.aggregator = aggregator;
					}

					public String getAlias() {
						return this.alias;
					}

					public void setAlias(String alias) {
						this.alias = alias;
					}

					public String getDesc() {
						return this.desc;
					}

					public void setDesc(String desc) {
						this.desc = desc;
					}

					public String getOrderby() {
						return this.orderby;
					}

					public void setOrderby(String orderby) {
						this.orderby = orderby;
					}

					public Field getField() {
						return this.field;
					}

					public void setField(Field field) {
						this.field = field;
					}

					public static class Field {

						private String caption;

						private String column;

						private String dataType;

						private String fid;

						private String granularity;

						private String name;

						private String type;

						public String getCaption() {
							return this.caption;
						}

						public void setCaption(String caption) {
							this.caption = caption;
						}

						public String getColumn() {
							return this.column;
						}

						public void setColumn(String column) {
							this.column = column;
						}

						public String getDataType() {
							return this.dataType;
						}

						public void setDataType(String dataType) {
							this.dataType = dataType;
						}

						public String getFid() {
							return this.fid;
						}

						public void setFid(String fid) {
							this.fid = fid;
						}

						public String getGranularity() {
							return this.granularity;
						}

						public void setGranularity(String granularity) {
							this.granularity = granularity;
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
					}
				}

				public static class Filter {

					private String logicalOperator;

					private String type;

					private List<Map<Object,Object>> filters;

					public String getLogicalOperator() {
						return this.logicalOperator;
					}

					public void setLogicalOperator(String logicalOperator) {
						this.logicalOperator = logicalOperator;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public List<Map<Object,Object>> getFilters() {
						return this.filters;
					}

					public void setFilters(List<Map<Object,Object>> filters) {
						this.filters = filters;
					}
				}
			}
		}
	}

	@Override
	public QueryDataServiceListResponse getInstance(UnmarshallerContext context) {
		return	QueryDataServiceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
