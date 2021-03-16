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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryScheduledTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryScheduledTasksResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<ScheduledTaskConfig> scheduledTaskConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<ScheduledTaskConfig> getScheduledTaskConfigs() {
		return this.scheduledTaskConfigs;
	}

	public void setScheduledTaskConfigs(List<ScheduledTaskConfig> scheduledTaskConfigs) {
		this.scheduledTaskConfigs = scheduledTaskConfigs;
	}

	public static class ScheduledTaskConfig {

		private Long id;

		private String name;

		private Integer size;

		private Integer concurrentHandleCount;

		private Integer taskPendingTimeout;

		private Integer taskExecuteTimeout;

		private ScheduleFactory scheduleFactory;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public Integer getConcurrentHandleCount() {
			return this.concurrentHandleCount;
		}

		public void setConcurrentHandleCount(Integer concurrentHandleCount) {
			this.concurrentHandleCount = concurrentHandleCount;
		}

		public Integer getTaskPendingTimeout() {
			return this.taskPendingTimeout;
		}

		public void setTaskPendingTimeout(Integer taskPendingTimeout) {
			this.taskPendingTimeout = taskPendingTimeout;
		}

		public Integer getTaskExecuteTimeout() {
			return this.taskExecuteTimeout;
		}

		public void setTaskExecuteTimeout(Integer taskExecuteTimeout) {
			this.taskExecuteTimeout = taskExecuteTimeout;
		}

		public ScheduleFactory getScheduleFactory() {
			return this.scheduleFactory;
		}

		public void setScheduleFactory(ScheduleFactory scheduleFactory) {
			this.scheduleFactory = scheduleFactory;
		}

		public static class ScheduleFactory {

			private String taskName;

			private Long maxSize;

			private Integer concurrentSize;

			private List<ScheduleConfig> scheduleConfigs;

			public String getTaskName() {
				return this.taskName;
			}

			public void setTaskName(String taskName) {
				this.taskName = taskName;
			}

			public Long getMaxSize() {
				return this.maxSize;
			}

			public void setMaxSize(Long maxSize) {
				this.maxSize = maxSize;
			}

			public Integer getConcurrentSize() {
				return this.concurrentSize;
			}

			public void setConcurrentSize(Integer concurrentSize) {
				this.concurrentSize = concurrentSize;
			}

			public List<ScheduleConfig> getScheduleConfigs() {
				return this.scheduleConfigs;
			}

			public void setScheduleConfigs(List<ScheduleConfig> scheduleConfigs) {
				this.scheduleConfigs = scheduleConfigs;
			}

			public static class ScheduleConfig {

				private String scheduleFactor;

				private Long maxSize;

				private Integer concurrentSize;

				public String getScheduleFactor() {
					return this.scheduleFactor;
				}

				public void setScheduleFactor(String scheduleFactor) {
					this.scheduleFactor = scheduleFactor;
				}

				public Long getMaxSize() {
					return this.maxSize;
				}

				public void setMaxSize(Long maxSize) {
					this.maxSize = maxSize;
				}

				public Integer getConcurrentSize() {
					return this.concurrentSize;
				}

				public void setConcurrentSize(Integer concurrentSize) {
					this.concurrentSize = concurrentSize;
				}
			}
		}
	}

	@Override
	public OpsQueryScheduledTasksResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryScheduledTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
