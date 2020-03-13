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
import com.aliyuncs.sofa.transform.v20190815.QueryRmsCloudmeshSidecarlistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsCloudmeshSidecarlistResponse extends AcsResponse {

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

		private String errMsg;

		private Boolean success;

		private Entity entity;

		public String getErrMsg() {
			return this.errMsg;
		}

		public void setErrMsg(String errMsg) {
			this.errMsg = errMsg;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public Entity getEntity() {
			return this.entity;
		}

		public void setEntity(Entity entity) {
			this.entity = entity;
		}

		public static class Entity {

			private Long currentPage;

			private Long pageSize;

			private Long totalSize;

			private List<DataItem> data;

			public Long getCurrentPage() {
				return this.currentPage;
			}

			public void setCurrentPage(Long currentPage) {
				this.currentPage = currentPage;
			}

			public Long getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Long pageSize) {
				this.pageSize = pageSize;
			}

			public Long getTotalSize() {
				return this.totalSize;
			}

			public void setTotalSize(Long totalSize) {
				this.totalSize = totalSize;
			}

			public List<DataItem> getData() {
				return this.data;
			}

			public void setData(List<DataItem> data) {
				this.data = data;
			}

			public static class DataItem {

				private String agreement;

				private String appService;

				private String appServiceId;

				private String copiesNum;

				private String cpu;

				private String errorRate;

				private String flowIn;

				private String flowOut;

				private String men;

				private String podName;

				private String responseTime;

				private String rqs;

				private String sidecarVersion;

				public String getAgreement() {
					return this.agreement;
				}

				public void setAgreement(String agreement) {
					this.agreement = agreement;
				}

				public String getAppService() {
					return this.appService;
				}

				public void setAppService(String appService) {
					this.appService = appService;
				}

				public String getAppServiceId() {
					return this.appServiceId;
				}

				public void setAppServiceId(String appServiceId) {
					this.appServiceId = appServiceId;
				}

				public String getCopiesNum() {
					return this.copiesNum;
				}

				public void setCopiesNum(String copiesNum) {
					this.copiesNum = copiesNum;
				}

				public String getCpu() {
					return this.cpu;
				}

				public void setCpu(String cpu) {
					this.cpu = cpu;
				}

				public String getErrorRate() {
					return this.errorRate;
				}

				public void setErrorRate(String errorRate) {
					this.errorRate = errorRate;
				}

				public String getFlowIn() {
					return this.flowIn;
				}

				public void setFlowIn(String flowIn) {
					this.flowIn = flowIn;
				}

				public String getFlowOut() {
					return this.flowOut;
				}

				public void setFlowOut(String flowOut) {
					this.flowOut = flowOut;
				}

				public String getMen() {
					return this.men;
				}

				public void setMen(String men) {
					this.men = men;
				}

				public String getPodName() {
					return this.podName;
				}

				public void setPodName(String podName) {
					this.podName = podName;
				}

				public String getResponseTime() {
					return this.responseTime;
				}

				public void setResponseTime(String responseTime) {
					this.responseTime = responseTime;
				}

				public String getRqs() {
					return this.rqs;
				}

				public void setRqs(String rqs) {
					this.rqs = rqs;
				}

				public String getSidecarVersion() {
					return this.sidecarVersion;
				}

				public void setSidecarVersion(String sidecarVersion) {
					this.sidecarVersion = sidecarVersion;
				}
			}
		}
	}

	@Override
	public QueryRmsCloudmeshSidecarlistResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsCloudmeshSidecarlistResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
