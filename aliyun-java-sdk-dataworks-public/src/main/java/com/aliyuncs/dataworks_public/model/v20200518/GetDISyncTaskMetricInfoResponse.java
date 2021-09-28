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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetDISyncTaskMetricInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDISyncTaskMetricInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private MetricInfo metricInfo;

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

	public MetricInfo getMetricInfo() {
		return this.metricInfo;
	}

	public void setMetricInfo(MetricInfo metricInfo) {
		this.metricInfo = metricInfo;
	}

	public static class MetricInfo {

		private String message;

		private Long sumReaderRecords;

		private Long sumWriterRecords;

		private Long lastTaskDelay;

		private Long insertReaderRecords;

		private Long updateReaderRecords;

		private Long deleteReaderRecords;

		private Long insertWriterRecords;

		private Long updateWriterRecords;

		private Long deleteWriterRecords;

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Long getSumReaderRecords() {
			return this.sumReaderRecords;
		}

		public void setSumReaderRecords(Long sumReaderRecords) {
			this.sumReaderRecords = sumReaderRecords;
		}

		public Long getSumWriterRecords() {
			return this.sumWriterRecords;
		}

		public void setSumWriterRecords(Long sumWriterRecords) {
			this.sumWriterRecords = sumWriterRecords;
		}

		public Long getLastTaskDelay() {
			return this.lastTaskDelay;
		}

		public void setLastTaskDelay(Long lastTaskDelay) {
			this.lastTaskDelay = lastTaskDelay;
		}

		public Long getInsertReaderRecords() {
			return this.insertReaderRecords;
		}

		public void setInsertReaderRecords(Long insertReaderRecords) {
			this.insertReaderRecords = insertReaderRecords;
		}

		public Long getUpdateReaderRecords() {
			return this.updateReaderRecords;
		}

		public void setUpdateReaderRecords(Long updateReaderRecords) {
			this.updateReaderRecords = updateReaderRecords;
		}

		public Long getDeleteReaderRecords() {
			return this.deleteReaderRecords;
		}

		public void setDeleteReaderRecords(Long deleteReaderRecords) {
			this.deleteReaderRecords = deleteReaderRecords;
		}

		public Long getInsertWriterRecords() {
			return this.insertWriterRecords;
		}

		public void setInsertWriterRecords(Long insertWriterRecords) {
			this.insertWriterRecords = insertWriterRecords;
		}

		public Long getUpdateWriterRecords() {
			return this.updateWriterRecords;
		}

		public void setUpdateWriterRecords(Long updateWriterRecords) {
			this.updateWriterRecords = updateWriterRecords;
		}

		public Long getDeleteWriterRecords() {
			return this.deleteWriterRecords;
		}

		public void setDeleteWriterRecords(Long deleteWriterRecords) {
			this.deleteWriterRecords = deleteWriterRecords;
		}
	}

	@Override
	public GetDISyncTaskMetricInfoResponse getInstance(UnmarshallerContext context) {
		return	GetDISyncTaskMetricInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
