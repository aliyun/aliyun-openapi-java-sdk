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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds_data.transform.v20220330.InsertListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InsertListResponse extends AcsResponse {

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

		private List<Long> autoIncrementKeys;

		public Long getNumberOfRecordsUpdated() {
			return this.numberOfRecordsUpdated;
		}

		public void setNumberOfRecordsUpdated(Long numberOfRecordsUpdated) {
			this.numberOfRecordsUpdated = numberOfRecordsUpdated;
		}

		public List<Long> getAutoIncrementKeys() {
			return this.autoIncrementKeys;
		}

		public void setAutoIncrementKeys(List<Long> autoIncrementKeys) {
			this.autoIncrementKeys = autoIncrementKeys;
		}
	}

	@Override
	public InsertListResponse getInstance(UnmarshallerContext context) {
		return	InsertListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
