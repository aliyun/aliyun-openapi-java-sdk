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
import com.aliyuncs.mpaas.transform.v20201028.QueryPushAnalysisTaskDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPushAnalysisTaskDetailResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

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

			private Long endTime;

			private Long startTime;

			private Float pushNum;

			private Float pushSuccessNum;

			private String duration;

			private Long taskId;

			private Float pushArrivalNum;

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Float getPushNum() {
				return this.pushNum;
			}

			public void setPushNum(Float pushNum) {
				this.pushNum = pushNum;
			}

			public Float getPushSuccessNum() {
				return this.pushSuccessNum;
			}

			public void setPushSuccessNum(Float pushSuccessNum) {
				this.pushSuccessNum = pushSuccessNum;
			}

			public String getDuration() {
				return this.duration;
			}

			public void setDuration(String duration) {
				this.duration = duration;
			}

			public Long getTaskId() {
				return this.taskId;
			}

			public void setTaskId(Long taskId) {
				this.taskId = taskId;
			}

			public Float getPushArrivalNum() {
				return this.pushArrivalNum;
			}

			public void setPushArrivalNum(Float pushArrivalNum) {
				this.pushArrivalNum = pushArrivalNum;
			}
		}
	}

	@Override
	public QueryPushAnalysisTaskDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryPushAnalysisTaskDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
