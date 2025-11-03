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

package com.aliyuncs.sophonsoar.model.v20220728;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.DescribeExecutePlaybooksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExecutePlaybooksResponse extends AcsResponse {

	private String requestId;

	private List<Data> playbookMetrics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getPlaybookMetrics() {
		return this.playbookMetrics;
	}

	public void setPlaybookMetrics(List<Data> playbookMetrics) {
		this.playbookMetrics = playbookMetrics;
	}

	public static class Data {

		private String description;

		private String actionType;

		private String displayName;

		private String uuid;

		private String taskConfig;

		private String paramConfig;

		private String commandEntity;

		private String paramType;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getActionType() {
			return this.actionType;
		}

		public void setActionType(String actionType) {
			this.actionType = actionType;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getTaskConfig() {
			return this.taskConfig;
		}

		public void setTaskConfig(String taskConfig) {
			this.taskConfig = taskConfig;
		}

		public String getParamConfig() {
			return this.paramConfig;
		}

		public void setParamConfig(String paramConfig) {
			this.paramConfig = paramConfig;
		}

		public String getCommandEntity() {
			return this.commandEntity;
		}

		public void setCommandEntity(String commandEntity) {
			this.commandEntity = commandEntity;
		}

		public String getParamType() {
			return this.paramType;
		}

		public void setParamType(String paramType) {
			this.paramType = paramType;
		}
	}

	@Override
	public DescribeExecutePlaybooksResponse getInstance(UnmarshallerContext context) {
		return	DescribeExecutePlaybooksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
