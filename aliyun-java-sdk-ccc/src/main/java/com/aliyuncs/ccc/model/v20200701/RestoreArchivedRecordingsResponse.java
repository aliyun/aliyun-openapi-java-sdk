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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.RestoreArchivedRecordingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RestoreArchivedRecordingsResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<RecordingRestoreDetail> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public List<RecordingRestoreDetail> getData() {
		return this.data;
	}

	public void setData(List<RecordingRestoreDetail> data) {
		this.data = data;
	}

	public static class RecordingRestoreDetail {

		private String exists;

		private String contactId;

		private String status;

		private String storageType;

		public String getExists() {
			return this.exists;
		}

		public void setExists(String exists) {
			this.exists = exists;
		}

		public String getContactId() {
			return this.contactId;
		}

		public void setContactId(String contactId) {
			this.contactId = contactId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}
	}

	@Override
	public RestoreArchivedRecordingsResponse getInstance(UnmarshallerContext context) {
		return	RestoreArchivedRecordingsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
