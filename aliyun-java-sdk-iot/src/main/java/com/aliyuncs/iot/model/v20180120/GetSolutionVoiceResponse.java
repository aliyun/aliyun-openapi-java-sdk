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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.GetSolutionVoiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSolutionVoiceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Items> speechModelVoiceVOList;

		public List<Items> getSpeechModelVoiceVOList() {
			return this.speechModelVoiceVOList;
		}

		public void setSpeechModelVoiceVOList(List<Items> speechModelVoiceVOList) {
			this.speechModelVoiceVOList = speechModelVoiceVOList;
		}

		public static class Items {

			private String value;

			private String label;

			private String children;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getChildren() {
				return this.children;
			}

			public void setChildren(String children) {
				this.children = children;
			}
		}
	}

	@Override
	public GetSolutionVoiceResponse getInstance(UnmarshallerContext context) {
		return	GetSolutionVoiceResponseUnmarshaller.unmarshall(this, context);
	}
}
