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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeTieringJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTieringJobsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<TieringJob> tieringJobs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<TieringJob> getTieringJobs() {
		return this.tieringJobs;
	}

	public void setTieringJobs(List<TieringJob> tieringJobs) {
		this.tieringJobs = tieringJobs;
	}

	public static class TieringJob {

		private String name;

		private String volume;

		private String path;

		private Boolean recursive;

		private String type;

		private String policy;

		private Integer weekday;

		private Integer hour;

		private Boolean enabled;

		private String status;

		private Long lastUpdateTime;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVolume() {
			return this.volume;
		}

		public void setVolume(String volume) {
			this.volume = volume;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public Boolean getRecursive() {
			return this.recursive;
		}

		public void setRecursive(Boolean recursive) {
			this.recursive = recursive;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public Integer getWeekday() {
			return this.weekday;
		}

		public void setWeekday(Integer weekday) {
			this.weekday = weekday;
		}

		public Integer getHour() {
			return this.hour;
		}

		public void setHour(Integer hour) {
			this.hour = hour;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getLastUpdateTime() {
			return this.lastUpdateTime;
		}

		public void setLastUpdateTime(Long lastUpdateTime) {
			this.lastUpdateTime = lastUpdateTime;
		}
	}

	@Override
	public DescribeTieringJobsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTieringJobsResponseUnmarshaller.unmarshall(this, context);
	}
}
