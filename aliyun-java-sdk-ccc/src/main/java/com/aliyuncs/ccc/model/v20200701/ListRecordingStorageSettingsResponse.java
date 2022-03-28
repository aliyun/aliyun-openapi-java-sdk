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
import com.aliyuncs.ccc.transform.v20200701.ListRecordingStorageSettingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRecordingStorageSettingsResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<RecordingStorageSetting> data;

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

	public List<RecordingStorageSetting> getData() {
		return this.data;
	}

	public void setData(List<RecordingStorageSetting> data) {
		this.data = data;
	}

	public static class RecordingStorageSetting {

		private String instanceId;

		private String instanceName;

		private Integer maxStorageSize;

		private Integer maxStorageTtl;

		private String customOssBucket;

		private Boolean mkvRecordEnabled;

		private String mixedRecordFormat;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Integer getMaxStorageSize() {
			return this.maxStorageSize;
		}

		public void setMaxStorageSize(Integer maxStorageSize) {
			this.maxStorageSize = maxStorageSize;
		}

		public Integer getMaxStorageTtl() {
			return this.maxStorageTtl;
		}

		public void setMaxStorageTtl(Integer maxStorageTtl) {
			this.maxStorageTtl = maxStorageTtl;
		}

		public String getCustomOssBucket() {
			return this.customOssBucket;
		}

		public void setCustomOssBucket(String customOssBucket) {
			this.customOssBucket = customOssBucket;
		}

		public Boolean getMkvRecordEnabled() {
			return this.mkvRecordEnabled;
		}

		public void setMkvRecordEnabled(Boolean mkvRecordEnabled) {
			this.mkvRecordEnabled = mkvRecordEnabled;
		}

		public String getMixedRecordFormat() {
			return this.mixedRecordFormat;
		}

		public void setMixedRecordFormat(String mixedRecordFormat) {
			this.mixedRecordFormat = mixedRecordFormat;
		}
	}

	@Override
	public ListRecordingStorageSettingsResponse getInstance(UnmarshallerContext context) {
		return	ListRecordingStorageSettingsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
