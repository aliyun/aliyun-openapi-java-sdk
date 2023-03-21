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

package com.aliyuncs.eventbridge.model.v20200401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eventbridge.transform.v20200401.PutTargetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PutTargetsResponse extends AcsResponse {

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

		private Integer errorEntriesCount;

		private List<ErrorEntriesItem> errorEntries;

		public Integer getErrorEntriesCount() {
			return this.errorEntriesCount;
		}

		public void setErrorEntriesCount(Integer errorEntriesCount) {
			this.errorEntriesCount = errorEntriesCount;
		}

		public List<ErrorEntriesItem> getErrorEntries() {
			return this.errorEntries;
		}

		public void setErrorEntries(List<ErrorEntriesItem> errorEntries) {
			this.errorEntries = errorEntries;
		}

		public static class ErrorEntriesItem {

			private String errorMessage;

			private String errorCode;

			private String entryId;

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getEntryId() {
				return this.entryId;
			}

			public void setEntryId(String entryId) {
				this.entryId = entryId;
			}
		}
	}

	@Override
	public PutTargetsResponse getInstance(UnmarshallerContext context) {
		return	PutTargetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
