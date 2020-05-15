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
import com.aliyuncs.sofa.transform.v20190815.GetRmsRdsResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRmsRdsResourcesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Response response;

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

	public Response getResponse() {
		return this.response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public static class Response {

		private String errCode;

		private String errMsg;

		private String errResolution;

		private List<EntitiesItem> entities;

		private List<MetaItem> meta;

		public String getErrCode() {
			return this.errCode;
		}

		public void setErrCode(String errCode) {
			this.errCode = errCode;
		}

		public String getErrMsg() {
			return this.errMsg;
		}

		public void setErrMsg(String errMsg) {
			this.errMsg = errMsg;
		}

		public String getErrResolution() {
			return this.errResolution;
		}

		public void setErrResolution(String errResolution) {
			this.errResolution = errResolution;
		}

		public List<EntitiesItem> getEntities() {
			return this.entities;
		}

		public void setEntities(List<EntitiesItem> entities) {
			this.entities = entities;
		}

		public List<MetaItem> getMeta() {
			return this.meta;
		}

		public void setMeta(List<MetaItem> meta) {
			this.meta = meta;
		}

		public static class EntitiesItem {

			private Data data;

			public Data getData() {
				return this.data;
			}

			public void setData(Data data) {
				this.data = data;
			}

			public static class Data {

				private String alertState;

				private String created;

				private Long createdDateTime;

				private String databaseType;

				private String dbId;

				private String instanceType;

				private String resourceName;

				private String state;

				private List<String> itemTypeConfig;

				private List<String> itemTypeNoneConfig;

				public String getAlertState() {
					return this.alertState;
				}

				public void setAlertState(String alertState) {
					this.alertState = alertState;
				}

				public String getCreated() {
					return this.created;
				}

				public void setCreated(String created) {
					this.created = created;
				}

				public Long getCreatedDateTime() {
					return this.createdDateTime;
				}

				public void setCreatedDateTime(Long createdDateTime) {
					this.createdDateTime = createdDateTime;
				}

				public String getDatabaseType() {
					return this.databaseType;
				}

				public void setDatabaseType(String databaseType) {
					this.databaseType = databaseType;
				}

				public String getDbId() {
					return this.dbId;
				}

				public void setDbId(String dbId) {
					this.dbId = dbId;
				}

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}

				public String getResourceName() {
					return this.resourceName;
				}

				public void setResourceName(String resourceName) {
					this.resourceName = resourceName;
				}

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public List<String> getItemTypeConfig() {
					return this.itemTypeConfig;
				}

				public void setItemTypeConfig(List<String> itemTypeConfig) {
					this.itemTypeConfig = itemTypeConfig;
				}

				public List<String> getItemTypeNoneConfig() {
					return this.itemTypeNoneConfig;
				}

				public void setItemTypeNoneConfig(List<String> itemTypeNoneConfig) {
					this.itemTypeNoneConfig = itemTypeNoneConfig;
				}
			}
		}

		public static class MetaItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public GetRmsRdsResourcesResponse getInstance(UnmarshallerContext context) {
		return	GetRmsRdsResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
