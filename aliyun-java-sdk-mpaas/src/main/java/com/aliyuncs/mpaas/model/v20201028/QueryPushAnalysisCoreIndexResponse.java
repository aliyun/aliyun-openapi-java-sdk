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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20201028.QueryPushAnalysisCoreIndexResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPushAnalysisCoreIndexResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private ResultContent resultContent;

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

	public ResultContent getResultContent() {
		return this.resultContent;
	}

	public void setResultContent(ResultContent resultContent) {
		this.resultContent = resultContent;
	}

	public static class ResultContent {

		private Data data;

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private Float arrivalNum;

			private Float arrivalRate;

			private Float ignoreNum;

			private Float ignoreRate;

			private Float openNum;

			private Float openRate;

			private Float pushNum;

			private Float pushTotalNum;

			public Float getArrivalNum() {
				return this.arrivalNum;
			}

			public void setArrivalNum(Float arrivalNum) {
				this.arrivalNum = arrivalNum;
			}

			public Float getArrivalRate() {
				return this.arrivalRate;
			}

			public void setArrivalRate(Float arrivalRate) {
				this.arrivalRate = arrivalRate;
			}

			public Float getIgnoreNum() {
				return this.ignoreNum;
			}

			public void setIgnoreNum(Float ignoreNum) {
				this.ignoreNum = ignoreNum;
			}

			public Float getIgnoreRate() {
				return this.ignoreRate;
			}

			public void setIgnoreRate(Float ignoreRate) {
				this.ignoreRate = ignoreRate;
			}

			public Float getOpenNum() {
				return this.openNum;
			}

			public void setOpenNum(Float openNum) {
				this.openNum = openNum;
			}

			public Float getOpenRate() {
				return this.openRate;
			}

			public void setOpenRate(Float openRate) {
				this.openRate = openRate;
			}

			public Float getPushNum() {
				return this.pushNum;
			}

			public void setPushNum(Float pushNum) {
				this.pushNum = pushNum;
			}

			public Float getPushTotalNum() {
				return this.pushTotalNum;
			}

			public void setPushTotalNum(Float pushTotalNum) {
				this.pushTotalNum = pushTotalNum;
			}
		}
	}

	@Override
	public QueryPushAnalysisCoreIndexResponse getInstance(UnmarshallerContext context) {
		return	QueryPushAnalysisCoreIndexResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
