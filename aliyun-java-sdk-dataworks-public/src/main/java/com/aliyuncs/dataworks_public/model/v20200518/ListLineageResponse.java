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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListLineageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLineageResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nextToken;

		private List<DataEntityListItem> dataEntityList;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public List<DataEntityListItem> getDataEntityList() {
			return this.dataEntityList;
		}

		public void setDataEntityList(List<DataEntityListItem> dataEntityList) {
			this.dataEntityList = dataEntityList;
		}

		public static class DataEntityListItem {

			private Object entity;

			private Long createTimestamp;

			private List<RelationListItem> relationList;

			public Object getEntity() {
				return this.entity;
			}

			public void setEntity(Object entity) {
				this.entity = entity;
			}

			public Long getCreateTimestamp() {
				return this.createTimestamp;
			}

			public void setCreateTimestamp(Long createTimestamp) {
				this.createTimestamp = createTimestamp;
			}

			public List<RelationListItem> getRelationList() {
				return this.relationList;
			}

			public void setRelationList(List<RelationListItem> relationList) {
				this.relationList = relationList;
			}

			public static class RelationListItem {

				private String guid;

				private String datasource;

				private String type;

				private String channel;

				public String getGuid() {
					return this.guid;
				}

				public void setGuid(String guid) {
					this.guid = guid;
				}

				public String getDatasource() {
					return this.datasource;
				}

				public void setDatasource(String datasource) {
					this.datasource = datasource;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getChannel() {
					return this.channel;
				}

				public void setChannel(String channel) {
					this.channel = channel;
				}
			}
		}
	}

	@Override
	public ListLineageResponse getInstance(UnmarshallerContext context) {
		return	ListLineageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
