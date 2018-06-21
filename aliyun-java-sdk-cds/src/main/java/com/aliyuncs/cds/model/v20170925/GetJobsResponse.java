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

package com.aliyuncs.cds.model.v20170925;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cds.transform.v20170925.GetJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJobsResponse extends AcsResponse {

	private String requestId;

	private List<Job> jobs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Job> getJobs() {
		return this.jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public static class Job {

		private String jobName;

		private Float successRate;

		private Integer totalBuilds;

		private LastFailedBuild lastFailedBuild;

		private LastSuccessfulBuild lastSuccessfulBuild;

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public Float getSuccessRate() {
			return this.successRate;
		}

		public void setSuccessRate(Float successRate) {
			this.successRate = successRate;
		}

		public Integer getTotalBuilds() {
			return this.totalBuilds;
		}

		public void setTotalBuilds(Integer totalBuilds) {
			this.totalBuilds = totalBuilds;
		}

		public LastFailedBuild getLastFailedBuild() {
			return this.lastFailedBuild;
		}

		public void setLastFailedBuild(LastFailedBuild lastFailedBuild) {
			this.lastFailedBuild = lastFailedBuild;
		}

		public LastSuccessfulBuild getLastSuccessfulBuild() {
			return this.lastSuccessfulBuild;
		}

		public void setLastSuccessfulBuild(LastSuccessfulBuild lastSuccessfulBuild) {
			this.lastSuccessfulBuild = lastSuccessfulBuild;
		}

		public static class LastFailedBuild {

			private String buildNumber;

			private Long duration;

			private Long startTime;

			private String log;

			private String buildEnv;

			public String getBuildNumber() {
				return this.buildNumber;
			}

			public void setBuildNumber(String buildNumber) {
				this.buildNumber = buildNumber;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getLog() {
				return this.log;
			}

			public void setLog(String log) {
				this.log = log;
			}

			public String getBuildEnv() {
				return this.buildEnv;
			}

			public void setBuildEnv(String buildEnv) {
				this.buildEnv = buildEnv;
			}
		}

		public static class LastSuccessfulBuild {

			private Integer buildNumber;

			private Integer duration;

			private Long startTime;

			private String log;

			private String buildEnv;

			public Integer getBuildNumber() {
				return this.buildNumber;
			}

			public void setBuildNumber(Integer buildNumber) {
				this.buildNumber = buildNumber;
			}

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getLog() {
				return this.log;
			}

			public void setLog(String log) {
				this.log = log;
			}

			public String getBuildEnv() {
				return this.buildEnv;
			}

			public void setBuildEnv(String buildEnv) {
				this.buildEnv = buildEnv;
			}
		}
	}

	@Override
	public GetJobsResponse getInstance(UnmarshallerContext context) {
		return	GetJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
