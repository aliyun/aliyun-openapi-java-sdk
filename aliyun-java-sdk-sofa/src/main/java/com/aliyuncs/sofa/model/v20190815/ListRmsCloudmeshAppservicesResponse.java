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
import com.aliyuncs.sofa.transform.v20190815.ListRmsCloudmeshAppservicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRmsCloudmeshAppservicesResponse extends AcsResponse {

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

		private Result result;

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

		public Result getResult() {
			return this.result;
		}

		public void setResult(Result result) {
			this.result = result;
		}

		public static class Result {

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

				private String appInstanceService;

				private String appInstanceServiceId;

				private String cluster;

				private String copiesNum;

				private String costTime;

				private String errorDetail;

				private String errorRate;

				private String flowIn;

				private String flowOut;

				private String namespace;

				private String reporter;

				private String rqs;

				private String timeNoSec;

				public String getAppInstanceService() {
					return this.appInstanceService;
				}

				public void setAppInstanceService(String appInstanceService) {
					this.appInstanceService = appInstanceService;
				}

				public String getAppInstanceServiceId() {
					return this.appInstanceServiceId;
				}

				public void setAppInstanceServiceId(String appInstanceServiceId) {
					this.appInstanceServiceId = appInstanceServiceId;
				}

				public String getCluster() {
					return this.cluster;
				}

				public void setCluster(String cluster) {
					this.cluster = cluster;
				}

				public String getCopiesNum() {
					return this.copiesNum;
				}

				public void setCopiesNum(String copiesNum) {
					this.copiesNum = copiesNum;
				}

				public String getCostTime() {
					return this.costTime;
				}

				public void setCostTime(String costTime) {
					this.costTime = costTime;
				}

				public String getErrorDetail() {
					return this.errorDetail;
				}

				public void setErrorDetail(String errorDetail) {
					this.errorDetail = errorDetail;
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

				public String getNamespace() {
					return this.namespace;
				}

				public void setNamespace(String namespace) {
					this.namespace = namespace;
				}

				public String getReporter() {
					return this.reporter;
				}

				public void setReporter(String reporter) {
					this.reporter = reporter;
				}

				public String getRqs() {
					return this.rqs;
				}

				public void setRqs(String rqs) {
					this.rqs = rqs;
				}

				public String getTimeNoSec() {
					return this.timeNoSec;
				}

				public void setTimeNoSec(String timeNoSec) {
					this.timeNoSec = timeNoSec;
				}
			}
		}
	}

	@Override
	public ListRmsCloudmeshAppservicesResponse getInstance(UnmarshallerContext context) {
		return	ListRmsCloudmeshAppservicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
