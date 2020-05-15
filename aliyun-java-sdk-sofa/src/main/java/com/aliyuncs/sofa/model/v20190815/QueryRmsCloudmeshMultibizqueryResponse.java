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
import com.aliyuncs.sofa.transform.v20190815.QueryRmsCloudmeshMultibizqueryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsCloudmeshMultibizqueryResponse extends AcsResponse {

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

		private Data data;

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

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private String errorRateDetail;

			private String resTimeDetail;

			private String rpsDetail;

			private List<CpuItem> cpu;

			private List<ErrorRateItem> errorRate;

			private List<FlowInItem> flowIn;

			private List<FlowOutItem> flowOut;

			private List<MemoryItem> memory;

			private List<ResTimeItem> resTime;

			private List<RpsItem> rps;

			public String getErrorRateDetail() {
				return this.errorRateDetail;
			}

			public void setErrorRateDetail(String errorRateDetail) {
				this.errorRateDetail = errorRateDetail;
			}

			public String getResTimeDetail() {
				return this.resTimeDetail;
			}

			public void setResTimeDetail(String resTimeDetail) {
				this.resTimeDetail = resTimeDetail;
			}

			public String getRpsDetail() {
				return this.rpsDetail;
			}

			public void setRpsDetail(String rpsDetail) {
				this.rpsDetail = rpsDetail;
			}

			public List<CpuItem> getCpu() {
				return this.cpu;
			}

			public void setCpu(List<CpuItem> cpu) {
				this.cpu = cpu;
			}

			public List<ErrorRateItem> getErrorRate() {
				return this.errorRate;
			}

			public void setErrorRate(List<ErrorRateItem> errorRate) {
				this.errorRate = errorRate;
			}

			public List<FlowInItem> getFlowIn() {
				return this.flowIn;
			}

			public void setFlowIn(List<FlowInItem> flowIn) {
				this.flowIn = flowIn;
			}

			public List<FlowOutItem> getFlowOut() {
				return this.flowOut;
			}

			public void setFlowOut(List<FlowOutItem> flowOut) {
				this.flowOut = flowOut;
			}

			public List<MemoryItem> getMemory() {
				return this.memory;
			}

			public void setMemory(List<MemoryItem> memory) {
				this.memory = memory;
			}

			public List<ResTimeItem> getResTime() {
				return this.resTime;
			}

			public void setResTime(List<ResTimeItem> resTime) {
				this.resTime = resTime;
			}

			public List<RpsItem> getRps() {
				return this.rps;
			}

			public void setRps(List<RpsItem> rps) {
				this.rps = rps;
			}

			public static class CpuItem {

				private Long timestamp;

				private String value;

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class ErrorRateItem {

				private Long timestamp;

				private String value;

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class FlowInItem {

				private Long timestamp;

				private String value;

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class FlowOutItem {

				private Long timestamp;

				private String value;

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class MemoryItem {

				private Long timestamp;

				private String value;

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class ResTimeItem {

				private Long timestamp;

				private String value;

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class RpsItem {

				private Long timestamp;

				private String value;

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public QueryRmsCloudmeshMultibizqueryResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsCloudmeshMultibizqueryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
