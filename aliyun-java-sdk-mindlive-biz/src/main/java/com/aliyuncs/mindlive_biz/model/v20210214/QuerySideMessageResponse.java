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

package com.aliyuncs.mindlive_biz.model.v20210214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mindlive_biz.transform.v20210214.QuerySideMessageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySideMessageResponse extends AcsResponse {

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private Data data;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long endTime;

		private Long startTime;

		private List<SideMessageDTO> messages;

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

		public List<SideMessageDTO> getMessages() {
			return this.messages;
		}

		public void setMessages(List<SideMessageDTO> messages) {
			this.messages = messages;
		}

		public static class SideMessageDTO {

			private String uuid;

			private Long timeStamp;

			private Boolean success;

			private String content;

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}

			public Long getTimeStamp() {
				return this.timeStamp;
			}

			public void setTimeStamp(Long timeStamp) {
				this.timeStamp = timeStamp;
			}

			public Boolean getSuccess() {
				return this.success;
			}

			public void setSuccess(Boolean success) {
				this.success = success;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
	}

	@Override
	public QuerySideMessageResponse getInstance(UnmarshallerContext context) {
		return	QuerySideMessageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
