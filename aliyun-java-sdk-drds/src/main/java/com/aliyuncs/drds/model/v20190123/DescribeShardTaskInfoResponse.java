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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeShardTaskInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeShardTaskInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String sourceTableName;

		private String targetTableName;

		private String status;

		private String stage;

		private String progress;

		private String expired;

		private Full full;

		private FullCheck fullCheck;

		private FullRevise fullRevise;

		private Review review;

		private Increment increment;

		public String getSourceTableName() {
			return this.sourceTableName;
		}

		public void setSourceTableName(String sourceTableName) {
			this.sourceTableName = sourceTableName;
		}

		public String getTargetTableName() {
			return this.targetTableName;
		}

		public void setTargetTableName(String targetTableName) {
			this.targetTableName = targetTableName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStage() {
			return this.stage;
		}

		public void setStage(String stage) {
			this.stage = stage;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getExpired() {
			return this.expired;
		}

		public void setExpired(String expired) {
			this.expired = expired;
		}

		public Full getFull() {
			return this.full;
		}

		public void setFull(Full full) {
			this.full = full;
		}

		public FullCheck getFullCheck() {
			return this.fullCheck;
		}

		public void setFullCheck(FullCheck fullCheck) {
			this.fullCheck = fullCheck;
		}

		public FullRevise getFullRevise() {
			return this.fullRevise;
		}

		public void setFullRevise(FullRevise fullRevise) {
			this.fullRevise = fullRevise;
		}

		public Review getReview() {
			return this.review;
		}

		public void setReview(Review review) {
			this.review = review;
		}

		public Increment getIncrement() {
			return this.increment;
		}

		public void setIncrement(Increment increment) {
			this.increment = increment;
		}

		public static class Full {

			private Integer expired;

			private Integer progress;

			private Integer total;

			private Integer tps;

			private String startTime;

			public Integer getExpired() {
				return this.expired;
			}

			public void setExpired(Integer expired) {
				this.expired = expired;
			}

			public Integer getProgress() {
				return this.progress;
			}

			public void setProgress(Integer progress) {
				this.progress = progress;
			}

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}

			public Integer getTps() {
				return this.tps;
			}

			public void setTps(Integer tps) {
				this.tps = tps;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}
		}

		public static class FullCheck {

			private Integer expired;

			private Integer progress;

			private Integer total;

			private Integer tps;

			private String startTime;

			public Integer getExpired() {
				return this.expired;
			}

			public void setExpired(Integer expired) {
				this.expired = expired;
			}

			public Integer getProgress() {
				return this.progress;
			}

			public void setProgress(Integer progress) {
				this.progress = progress;
			}

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}

			public Integer getTps() {
				return this.tps;
			}

			public void setTps(Integer tps) {
				this.tps = tps;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}
		}

		public static class FullRevise {

			private Integer expired;

			private Integer progress;

			private Integer total;

			private Integer tps;

			private String startTime;

			public Integer getExpired() {
				return this.expired;
			}

			public void setExpired(Integer expired) {
				this.expired = expired;
			}

			public Integer getProgress() {
				return this.progress;
			}

			public void setProgress(Integer progress) {
				this.progress = progress;
			}

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}

			public Integer getTps() {
				return this.tps;
			}

			public void setTps(Integer tps) {
				this.tps = tps;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}
		}

		public static class Review {

			private Integer expired;

			private Integer progress;

			private Integer total;

			private Integer tps;

			private String startTime;

			public Integer getExpired() {
				return this.expired;
			}

			public void setExpired(Integer expired) {
				this.expired = expired;
			}

			public Integer getProgress() {
				return this.progress;
			}

			public void setProgress(Integer progress) {
				this.progress = progress;
			}

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}

			public Integer getTps() {
				return this.tps;
			}

			public void setTps(Integer tps) {
				this.tps = tps;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}
		}

		public static class Increment {

			private Integer delay;

			private Integer tps;

			private String startTime;

			public Integer getDelay() {
				return this.delay;
			}

			public void setDelay(Integer delay) {
				this.delay = delay;
			}

			public Integer getTps() {
				return this.tps;
			}

			public void setTps(Integer tps) {
				this.tps = tps;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}
		}
	}

	@Override
	public DescribeShardTaskInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeShardTaskInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
