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

package com.aliyuncs.ivision.model.v20190308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ivision.transform.v20190308.GetAlgorithmHistogramsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAlgorithmHistogramsResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private Integer failureCount;

		private Integer successCount;

		private List<HistogramsItem> histograms;

		public Integer getFailureCount() {
			return this.failureCount;
		}

		public void setFailureCount(Integer failureCount) {
			this.failureCount = failureCount;
		}

		public Integer getSuccessCount() {
			return this.successCount;
		}

		public void setSuccessCount(Integer successCount) {
			this.successCount = successCount;
		}

		public List<HistogramsItem> getHistograms() {
			return this.histograms;
		}

		public void setHistograms(List<HistogramsItem> histograms) {
			this.histograms = histograms;
		}

		public static class HistogramsItem {

			private String time;

			private Integer failureCount;

			private Integer successCount;

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}

			public Integer getFailureCount() {
				return this.failureCount;
			}

			public void setFailureCount(Integer failureCount) {
				this.failureCount = failureCount;
			}

			public Integer getSuccessCount() {
				return this.successCount;
			}

			public void setSuccessCount(Integer successCount) {
				this.successCount = successCount;
			}
		}
	}

	@Override
	public GetAlgorithmHistogramsResponse getInstance(UnmarshallerContext context) {
		return	GetAlgorithmHistogramsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
