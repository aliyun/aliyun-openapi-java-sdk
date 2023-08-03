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

package com.aliyuncs.rds_data.model.v20220330;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds_data.transform.v20220330.InsertResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InsertResponse extends AcsResponse {

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

		private Long numberOfRecordsUpdated;

		private Long autoIncrementKey;

		public Long getNumberOfRecordsUpdated() {
			return this.numberOfRecordsUpdated;
		}

		public void setNumberOfRecordsUpdated(Long numberOfRecordsUpdated) {
			this.numberOfRecordsUpdated = numberOfRecordsUpdated;
		}

		public Long getAutoIncrementKey() {
			return this.autoIncrementKey;
		}

		public void setAutoIncrementKey(Long autoIncrementKey) {
			this.autoIncrementKey = autoIncrementKey;
		}
	}

	@Override
	public InsertResponse getInstance(UnmarshallerContext context) {
		return	InsertResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
