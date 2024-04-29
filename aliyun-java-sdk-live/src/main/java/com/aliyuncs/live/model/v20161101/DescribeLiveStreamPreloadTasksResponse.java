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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamPreloadTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamPreloadTasksResponse extends AcsResponse {

	private Integer pageNum;

	private Integer pageSize;

	private String requestId;

	private Integer totalNum;

	private Integer totalPage;

	private List<PreloadTask> preloadTasks;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public List<PreloadTask> getPreloadTasks() {
		return this.preloadTasks;
	}

	public void setPreloadTasks(List<PreloadTask> preloadTasks) {
		this.preloadTasks = preloadTasks;
	}

	public static class PreloadTask {

		private String area;

		private String createTime;

		private String description;

		private String domainName;

		private String playUrl;

		private String preloadedEndTime;

		private String preloadedStartTime;

		private String process;

		private String status;

		private String taskId;

		public String getArea() {
			return this.area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getPlayUrl() {
			return this.playUrl;
		}

		public void setPlayUrl(String playUrl) {
			this.playUrl = playUrl;
		}

		public String getPreloadedEndTime() {
			return this.preloadedEndTime;
		}

		public void setPreloadedEndTime(String preloadedEndTime) {
			this.preloadedEndTime = preloadedEndTime;
		}

		public String getPreloadedStartTime() {
			return this.preloadedStartTime;
		}

		public void setPreloadedStartTime(String preloadedStartTime) {
			this.preloadedStartTime = preloadedStartTime;
		}

		public String getProcess() {
			return this.process;
		}

		public void setProcess(String process) {
			this.process = process;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public DescribeLiveStreamPreloadTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamPreloadTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
