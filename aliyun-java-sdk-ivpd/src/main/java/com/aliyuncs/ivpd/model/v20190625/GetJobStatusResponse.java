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

package com.aliyuncs.ivpd.model.v20190625;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ivpd.transform.v20190625.GetJobStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJobStatusResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

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

		private String status;

		private String batchSize;

		private Boolean finish;

		private Float progress;

		private String message;

		private Boolean completed;

		private Integer timeToLive;

		private Long totalUsedTime;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBatchSize() {
			return this.batchSize;
		}

		public void setBatchSize(String batchSize) {
			this.batchSize = batchSize;
		}

		public Boolean getFinish() {
			return this.finish;
		}

		public void setFinish(Boolean finish) {
			this.finish = finish;
		}

		public Float getProgress() {
			return this.progress;
		}

		public void setProgress(Float progress) {
			this.progress = progress;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Boolean getCompleted() {
			return this.completed;
		}

		public void setCompleted(Boolean completed) {
			this.completed = completed;
		}

		public Integer getTimeToLive() {
			return this.timeToLive;
		}

		public void setTimeToLive(Integer timeToLive) {
			this.timeToLive = timeToLive;
		}

		public Long getTotalUsedTime() {
			return this.totalUsedTime;
		}

		public void setTotalUsedTime(Long totalUsedTime) {
			this.totalUsedTime = totalUsedTime;
		}
	}

	@Override
	public GetJobStatusResponse getInstance(UnmarshallerContext context) {
		return	GetJobStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
