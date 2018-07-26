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

package com.aliyuncs.teslastream.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.teslastream.transform.v20180115.BatchGetJobMetricInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchGetJobMetricInfoResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<Job> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public List<Job> getData() {
		return this.data;
	}

	public void setData(List<Job> data) {
		this.data = data;
	}

	public static class Job {

		private Integer delay;

		private Integer tpsOut;

		private Integer memRequest;

		private String jobUniqKey;

		private Float memUsed;

		private Float cpuUsed;

		private Integer cpuRequest;

		private String nickname;

		private Integer tpsIn;

		private String priority;

		public Integer getDelay() {
			return this.delay;
		}

		public void setDelay(Integer delay) {
			this.delay = delay;
		}

		public Integer getTpsOut() {
			return this.tpsOut;
		}

		public void setTpsOut(Integer tpsOut) {
			this.tpsOut = tpsOut;
		}

		public Integer getMemRequest() {
			return this.memRequest;
		}

		public void setMemRequest(Integer memRequest) {
			this.memRequest = memRequest;
		}

		public String getJobUniqKey() {
			return this.jobUniqKey;
		}

		public void setJobUniqKey(String jobUniqKey) {
			this.jobUniqKey = jobUniqKey;
		}

		public Float getMemUsed() {
			return this.memUsed;
		}

		public void setMemUsed(Float memUsed) {
			this.memUsed = memUsed;
		}

		public Float getCpuUsed() {
			return this.cpuUsed;
		}

		public void setCpuUsed(Float cpuUsed) {
			this.cpuUsed = cpuUsed;
		}

		public Integer getCpuRequest() {
			return this.cpuRequest;
		}

		public void setCpuRequest(Integer cpuRequest) {
			this.cpuRequest = cpuRequest;
		}

		public String getNickname() {
			return this.nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public Integer getTpsIn() {
			return this.tpsIn;
		}

		public void setTpsIn(Integer tpsIn) {
			this.tpsIn = tpsIn;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}
	}

	@Override
	public BatchGetJobMetricInfoResponse getInstance(UnmarshallerContext context) {
		return	BatchGetJobMetricInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
