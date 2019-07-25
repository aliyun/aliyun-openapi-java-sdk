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
import com.aliyuncs.qualitycheck.transform.v20190115.SubmitAudioLabelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SubmitAudioLabelResponse extends AcsResponse {

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

		private String asrAccuracyRate;

		private Integer labelNum;

		private Boolean poc;

		public String getAsrAccuracyRate() {
			return this.asrAccuracyRate;
		}

		public void setAsrAccuracyRate(String asrAccuracyRate) {
			this.asrAccuracyRate = asrAccuracyRate;
		}

		public Integer getLabelNum() {
			return this.labelNum;
		}

		public void setLabelNum(Integer labelNum) {
			this.labelNum = labelNum;
		}

		public Boolean getPoc() {
			return this.poc;
		}

		public void setPoc(Boolean poc) {
			this.poc = poc;
		}
	}

	@Override
	public SubmitAudioLabelResponse getInstance(UnmarshallerContext context) {
		return	SubmitAudioLabelResponseUnmarshaller.unmarshall(this, context);
	}
}
