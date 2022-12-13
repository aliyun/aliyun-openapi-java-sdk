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
import com.aliyuncs.cs.transform.v20151215.DescribeClusterTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterTasksResponse extends AcsResponse {

	private String requestId;

	private List<Task> tasks;

	private Page_info page_info;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Page_info getPage_info() {
		return this.page_info;
	}

	public void setPage_info(Page_info page_info) {
		this.page_info = page_info;
	}

	public static class Task {

		private String task_id;

		private String task_type;

		private String state;

		private String created;

		private String updated;

		private Error error;

		public String getTask_id() {
			return this.task_id;
		}

		public void setTask_id(String task_id) {
			this.task_id = task_id;
		}

		public String getTask_type() {
			return this.task_type;
		}

		public void setTask_type(String task_type) {
			this.task_type = task_type;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public Error getError() {
			return this.error;
		}

		public void setError(Error error) {
			this.error = error;
		}

		public static class Error {

			private String message;

			private String code;

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}
		}
	}

	public static class Page_info {

		private Long page_size;

		private Long page_number;

		private Long total_count;

		public Long getPage_size() {
			return this.page_size;
		}

		public void setPage_size(Long page_size) {
			this.page_size = page_size;
		}

		public Long getPage_number() {
			return this.page_number;
		}

		public void setPage_number(Long page_number) {
			this.page_number = page_number;
		}

		public Long getTotal_count() {
			return this.total_count;
		}

		public void setTotal_count(Long total_count) {
			this.total_count = total_count;
		}
	}

	@Override
	public DescribeClusterTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
