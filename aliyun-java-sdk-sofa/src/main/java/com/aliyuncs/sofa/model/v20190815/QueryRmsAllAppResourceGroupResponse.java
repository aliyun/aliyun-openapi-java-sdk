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
import com.aliyuncs.sofa.transform.v20190815.QueryRmsAllAppResourceGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsAllAppResourceGroupResponse extends AcsResponse {

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

			private List<AppsItem> apps;

			private List<DomainsItem> domains;

			public List<AppsItem> getApps() {
				return this.apps;
			}

			public void setApps(List<AppsItem> apps) {
				this.apps = apps;
			}

			public List<DomainsItem> getDomains() {
				return this.domains;
			}

			public void setDomains(List<DomainsItem> domains) {
				this.domains = domains;
			}

			public static class AppsItem {

				private String appId;

				private String chineseName;

				private String name;

				public String getAppId() {
					return this.appId;
				}

				public void setAppId(String appId) {
					this.appId = appId;
				}

				public String getChineseName() {
					return this.chineseName;
				}

				public void setChineseName(String chineseName) {
					this.chineseName = chineseName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class DomainsItem {

				private String id;

				private String name;

				private List<AppDatasItem> appDatas;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public List<AppDatasItem> getAppDatas() {
					return this.appDatas;
				}

				public void setAppDatas(List<AppDatasItem> appDatas) {
					this.appDatas = appDatas;
				}

				public static class AppDatasItem {

					private String appId;

					private String chineseName;

					private String name;

					public String getAppId() {
						return this.appId;
					}

					public void setAppId(String appId) {
						this.appId = appId;
					}

					public String getChineseName() {
						return this.chineseName;
					}

					public void setChineseName(String chineseName) {
						this.chineseName = chineseName;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}
				}
			}
		}
	}

	@Override
	public QueryRmsAllAppResourceGroupResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsAllAppResourceGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
