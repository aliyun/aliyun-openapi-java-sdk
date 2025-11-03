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
import com.aliyuncs.sophonsoar.transform.v20220728.DescribeSophonCommandsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSophonCommandsResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String name;

		private String displayName;

		private String commandEntity;

		private String commandTag;

		private String description;

		private String actionType;

		private String taskConfig;

		private List<ParamConfigItem> paramConfig;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getCommandEntity() {
			return this.commandEntity;
		}

		public void setCommandEntity(String commandEntity) {
			this.commandEntity = commandEntity;
		}

		public String getCommandTag() {
			return this.commandTag;
		}

		public void setCommandTag(String commandTag) {
			this.commandTag = commandTag;
		}

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

		public String getTaskConfig() {
			return this.taskConfig;
		}

		public void setTaskConfig(String taskConfig) {
			this.taskConfig = taskConfig;
		}

		public List<ParamConfigItem> getParamConfig() {
			return this.paramConfig;
		}

		public void setParamConfig(List<ParamConfigItem> paramConfig) {
			this.paramConfig = paramConfig;
		}

		public static class ParamConfigItem {

			private Boolean necessary;

			private String field;

			private String value;

			private String checkField;

			public Boolean getNecessary() {
				return this.necessary;
			}

			public void setNecessary(Boolean necessary) {
				this.necessary = necessary;
			}

			public String getField() {
				return this.field;
			}

			public void setField(String field) {
				this.field = field;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getCheckField() {
				return this.checkField;
			}

			public void setCheckField(String checkField) {
				this.checkField = checkField;
			}
		}
	}

	@Override
	public DescribeSophonCommandsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSophonCommandsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
