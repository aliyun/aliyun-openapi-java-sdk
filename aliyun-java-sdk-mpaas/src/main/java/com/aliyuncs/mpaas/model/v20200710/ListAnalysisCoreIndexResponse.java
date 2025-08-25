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

package com.aliyuncs.mpaas.model.v20200710;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20200710.ListAnalysisCoreIndexResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAnalysisCoreIndexResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private Boolean success;

	private ResultContent resultContent;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
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

	public ResultContent getResultContent() {
		return this.resultContent;
	}

	public void setResultContent(ResultContent resultContent) {
		this.resultContent = resultContent;
	}

	public static class ResultContent {

		private Boolean success;

		private String resultMsg;

		private Data data;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private String ignoreNum;

			private String ignoreRate;

			private String pushNum;

			private String arrivalRate;

			private String openNum;

			private String openRate;

			private String pushTotalNum;

			private String arrivalNum;

			public String getIgnoreNum() {
				return this.ignoreNum;
			}

			public void setIgnoreNum(String ignoreNum) {
				this.ignoreNum = ignoreNum;
			}

			public String getIgnoreRate() {
				return this.ignoreRate;
			}

			public void setIgnoreRate(String ignoreRate) {
				this.ignoreRate = ignoreRate;
			}

			public String getPushNum() {
				return this.pushNum;
			}

			public void setPushNum(String pushNum) {
				this.pushNum = pushNum;
			}

			public String getArrivalRate() {
				return this.arrivalRate;
			}

			public void setArrivalRate(String arrivalRate) {
				this.arrivalRate = arrivalRate;
			}

			public String getOpenNum() {
				return this.openNum;
			}

			public void setOpenNum(String openNum) {
				this.openNum = openNum;
			}

			public String getOpenRate() {
				return this.openRate;
			}

			public void setOpenRate(String openRate) {
				this.openRate = openRate;
			}

			public String getPushTotalNum() {
				return this.pushTotalNum;
			}

			public void setPushTotalNum(String pushTotalNum) {
				this.pushTotalNum = pushTotalNum;
			}

			public String getArrivalNum() {
				return this.arrivalNum;
			}

			public void setArrivalNum(String arrivalNum) {
				this.arrivalNum = arrivalNum;
			}
		}
	}

	@Override
	public ListAnalysisCoreIndexResponse getInstance(UnmarshallerContext context) {
		return	ListAnalysisCoreIndexResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
