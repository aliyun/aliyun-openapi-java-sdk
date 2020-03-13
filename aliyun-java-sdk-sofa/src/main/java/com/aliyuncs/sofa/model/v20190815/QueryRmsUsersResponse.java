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
import com.aliyuncs.sofa.transform.v20190815.QueryRmsUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsUsersResponse extends AcsResponse {

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

		private List<EntitiesItem> entities;

		private List<EntitieTestsItem> entitieTests;

		private List<MetaItem> meta;

		public List<EntitiesItem> getEntities() {
			return this.entities;
		}

		public void setEntities(List<EntitiesItem> entities) {
			this.entities = entities;
		}

		public List<EntitieTestsItem> getEntitieTests() {
			return this.entitieTests;
		}

		public void setEntitieTests(List<EntitieTestsItem> entitieTests) {
			this.entitieTests = entitieTests;
		}

		public List<MetaItem> getMeta() {
			return this.meta;
		}

		public void setMeta(List<MetaItem> meta) {
			this.meta = meta;
		}

		public static class EntitiesItem {

			private String layer;

			private Entity entity;

			public String getLayer() {
				return this.layer;
			}

			public void setLayer(String layer) {
				this.layer = layer;
			}

			public Entity getEntity() {
				return this.entity;
			}

			public void setEntity(Entity entity) {
				this.entity = entity;
			}

			public static class Entity {

				private String id;

				private String loginName;

				private String msgType;

				private String nickName;

				private String realName;

				private String userNumber;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getMsgType() {
					return this.msgType;
				}

				public void setMsgType(String msgType) {
					this.msgType = msgType;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public String getUserNumber() {
					return this.userNumber;
				}

				public void setUserNumber(String userNumber) {
					this.userNumber = userNumber;
				}
			}
		}

		public static class EntitieTestsItem {

			private String id;

			private String loginName;

			private String msgType;

			private String nickName;

			private String realName;

			private String userNumber;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getLoginName() {
				return this.loginName;
			}

			public void setLoginName(String loginName) {
				this.loginName = loginName;
			}

			public String getMsgType() {
				return this.msgType;
			}

			public void setMsgType(String msgType) {
				this.msgType = msgType;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}

			public String getRealName() {
				return this.realName;
			}

			public void setRealName(String realName) {
				this.realName = realName;
			}

			public String getUserNumber() {
				return this.userNumber;
			}

			public void setUserNumber(String userNumber) {
				this.userNumber = userNumber;
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
	public QueryRmsUsersResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
