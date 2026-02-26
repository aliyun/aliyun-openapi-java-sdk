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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeImageLatestScanTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageLatestScanTaskResponse extends AcsResponse {

	private String requestId;

	private List<ImageScanTask> task;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImageScanTask> getTask() {
		return this.task;
	}

	public void setTask(List<ImageScanTask> task) {
		this.task = task;
	}

	public static class ImageScanTask {

		private String status;

		private String modified;

		private Long finishTime;

		private String create;

		private Integer finish;

		private Long aliUid;

		private String source;

		private Long startTime;

		private String taskType;

		private String name;

		private String taskId;

		private String target;

		private Long id;

		private String targetType;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getModified() {
			return this.modified;
		}

		public void setModified(String modified) {
			this.modified = modified;
		}

		public Long getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(Long finishTime) {
			this.finishTime = finishTime;
		}

		public String getCreate() {
			return this.create;
		}

		public void setCreate(String create) {
			this.create = create;
		}

		public Integer getFinish() {
			return this.finish;
		}

		public void setFinish(Integer finish) {
			this.finish = finish;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}
	}

	@Override
	public DescribeImageLatestScanTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageLatestScanTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
