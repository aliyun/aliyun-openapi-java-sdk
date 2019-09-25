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

package com.aliyuncs.qualitycheck.model.v20190115;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ExchangeAudioResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExchangeAudioResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String audioName;

		private Boolean isCovertContext;

		private Boolean isOnlyFile;

		private Long setId;

		private String taskAsrResqusetId;

		public String getAudioName() {
			return this.audioName;
		}

		public void setAudioName(String audioName) {
			this.audioName = audioName;
		}

		public Boolean getIsCovertContext() {
			return this.isCovertContext;
		}

		public void setIsCovertContext(Boolean isCovertContext) {
			this.isCovertContext = isCovertContext;
		}

		public Boolean getIsOnlyFile() {
			return this.isOnlyFile;
		}

		public void setIsOnlyFile(Boolean isOnlyFile) {
			this.isOnlyFile = isOnlyFile;
		}

		public Long getSetId() {
			return this.setId;
		}

		public void setSetId(Long setId) {
			this.setId = setId;
		}

		public String getTaskAsrResqusetId() {
			return this.taskAsrResqusetId;
		}

		public void setTaskAsrResqusetId(String taskAsrResqusetId) {
			this.taskAsrResqusetId = taskAsrResqusetId;
		}
	}

	@Override
	public ExchangeAudioResponse getInstance(UnmarshallerContext context) {
		return	ExchangeAudioResponseUnmarshaller.unmarshall(this, context);
	}
}
