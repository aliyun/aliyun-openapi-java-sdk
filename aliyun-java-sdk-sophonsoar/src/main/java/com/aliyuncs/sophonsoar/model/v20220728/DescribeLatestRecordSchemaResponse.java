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
import com.aliyuncs.sophonsoar.transform.v20220728.DescribeLatestRecordSchemaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLatestRecordSchemaResponse extends AcsResponse {

	private String requestId;

	private PlaybookNodeSchema playbookNodeSchema;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PlaybookNodeSchema getPlaybookNodeSchema() {
		return this.playbookNodeSchema;
	}

	public void setPlaybookNodeSchema(PlaybookNodeSchema playbookNodeSchema) {
		this.playbookNodeSchema = playbookNodeSchema;
	}

	public static class PlaybookNodeSchema {

		private Boolean isFinished;

		private List<NodeSchemaItem> nodeSchema;

		public Boolean getIsFinished() {
			return this.isFinished;
		}

		public void setIsFinished(Boolean isFinished) {
			this.isFinished = isFinished;
		}

		public List<NodeSchemaItem> getNodeSchema() {
			return this.nodeSchema;
		}

		public void setNodeSchema(List<NodeSchemaItem> nodeSchema) {
			this.nodeSchema = nodeSchema;
		}

		public static class NodeSchemaItem {

			private String nodeName;

			private String componentName;

			private String actionName;

			private List<String> outputFields;

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getComponentName() {
				return this.componentName;
			}

			public void setComponentName(String componentName) {
				this.componentName = componentName;
			}

			public String getActionName() {
				return this.actionName;
			}

			public void setActionName(String actionName) {
				this.actionName = actionName;
			}

			public List<String> getOutputFields() {
				return this.outputFields;
			}

			public void setOutputFields(List<String> outputFields) {
				this.outputFields = outputFields;
			}
		}
	}

	@Override
	public DescribeLatestRecordSchemaResponse getInstance(UnmarshallerContext context) {
		return	DescribeLatestRecordSchemaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
