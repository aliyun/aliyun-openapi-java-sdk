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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.SaveAnnotationMissionSessionListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SaveAnnotationMissionSessionListResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean success;

		private String message;

		private List<String> messageList;

		private SaveAnnotationMissionSessionListRequest saveAnnotationMissionSessionListRequest;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public List<String> getMessageList() {
			return this.messageList;
		}

		public void setMessageList(List<String> messageList) {
			this.messageList = messageList;
		}

		public SaveAnnotationMissionSessionListRequest getSaveAnnotationMissionSessionListRequest() {
			return this.saveAnnotationMissionSessionListRequest;
		}

		public void setSaveAnnotationMissionSessionListRequest(SaveAnnotationMissionSessionListRequest saveAnnotationMissionSessionListRequest) {
			this.saveAnnotationMissionSessionListRequest = saveAnnotationMissionSessionListRequest;
		}

		public static class SaveAnnotationMissionSessionListRequest {

			private String annotationMissionSessionListJsonString;

			public String getAnnotationMissionSessionListJsonString() {
				return this.annotationMissionSessionListJsonString;
			}

			public void setAnnotationMissionSessionListJsonString(String annotationMissionSessionListJsonString) {
				this.annotationMissionSessionListJsonString = annotationMissionSessionListJsonString;
			}
		}
	}

	@Override
	public SaveAnnotationMissionSessionListResponse getInstance(UnmarshallerContext context) {
		return	SaveAnnotationMissionSessionListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
