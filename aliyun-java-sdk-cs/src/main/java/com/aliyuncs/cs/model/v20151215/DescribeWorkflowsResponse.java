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

package com.aliyuncs.cs.model.v20151215;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribeWorkflowsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWorkflowsResponse extends AcsResponse {

	private List<Job> jobs;

	public List<Job> getJobs() {
		return this.jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public static class Job {

		private String cluster_id;

		private String job_name;

		private String create_time;

		public String getCluster_id() {
			return this.cluster_id;
		}

		public void setCluster_id(String cluster_id) {
			this.cluster_id = cluster_id;
		}

		public String getJob_name() {
			return this.job_name;
		}

		public void setJob_name(String job_name) {
			this.job_name = job_name;
		}

		public String getCreate_time() {
			return this.create_time;
		}

		public void setCreate_time(String create_time) {
			this.create_time = create_time;
		}
	}

	@Override
	public DescribeWorkflowsResponse getInstance(UnmarshallerContext context) {
		return	DescribeWorkflowsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
