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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetAsyncErrorRequestStatByCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAsyncErrorRequestStatByCodeResponse extends AcsResponse {

	private Long code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean fail;

		private Boolean isFinish;

		private String resultId;

		private String state;

		private Long timestamp;

		private Boolean complete;

		private List<Stat> result;

		public Boolean getFail() {
			return this.fail;
		}

		public void setFail(Boolean fail) {
			this.fail = fail;
		}

		public Boolean getIsFinish() {
			return this.isFinish;
		}

		public void setIsFinish(Boolean isFinish) {
			this.isFinish = isFinish;
		}

		public String getResultId() {
			return this.resultId;
		}

		public void setResultId(String resultId) {
			this.resultId = resultId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public Boolean getComplete() {
			return this.complete;
		}

		public void setComplete(Boolean complete) {
			this.complete = complete;
		}

		public List<Stat> getResult() {
			return this.result;
		}

		public void setResult(List<Stat> result) {
			this.result = result;
		}

		public static class Stat {

			private String instanceId;

			private String errorCode;

			private Integer count;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}
		}
	}

	@Override
	public GetAsyncErrorRequestStatByCodeResponse getInstance(UnmarshallerContext context) {
		return	GetAsyncErrorRequestStatByCodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
