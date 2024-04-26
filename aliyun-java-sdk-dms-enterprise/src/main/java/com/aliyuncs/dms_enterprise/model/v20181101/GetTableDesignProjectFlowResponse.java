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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetTableDesignProjectFlowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTableDesignProjectFlowResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private ProjectFlow projectFlow;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public ProjectFlow getProjectFlow() {
		return this.projectFlow;
	}

	public void setProjectFlow(ProjectFlow projectFlow) {
		this.projectFlow = projectFlow;
	}

	public static class ProjectFlow {

		private Integer currentPosition;

		private String ruleName;

		private String ruleComment;

		private List<FlowNodeArrayItem> flowNodeArray;

		public Integer getCurrentPosition() {
			return this.currentPosition;
		}

		public void setCurrentPosition(Integer currentPosition) {
			this.currentPosition = currentPosition;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getRuleComment() {
			return this.ruleComment;
		}

		public void setRuleComment(String ruleComment) {
			this.ruleComment = ruleComment;
		}

		public List<FlowNodeArrayItem> getFlowNodeArray() {
			return this.flowNodeArray;
		}

		public void setFlowNodeArray(List<FlowNodeArrayItem> flowNodeArray) {
			this.flowNodeArray = flowNodeArray;
		}

		public static class FlowNodeArrayItem {

			private String nodeRole;

			private String nodeTitle;

			private Integer position;

			private Boolean publishAnchor;

			private Boolean backToDesign;

			private Boolean canSkip;

			private List<String> publishStrategies;

			public String getNodeRole() {
				return this.nodeRole;
			}

			public void setNodeRole(String nodeRole) {
				this.nodeRole = nodeRole;
			}

			public String getNodeTitle() {
				return this.nodeTitle;
			}

			public void setNodeTitle(String nodeTitle) {
				this.nodeTitle = nodeTitle;
			}

			public Integer getPosition() {
				return this.position;
			}

			public void setPosition(Integer position) {
				this.position = position;
			}

			public Boolean getPublishAnchor() {
				return this.publishAnchor;
			}

			public void setPublishAnchor(Boolean publishAnchor) {
				this.publishAnchor = publishAnchor;
			}

			public Boolean getBackToDesign() {
				return this.backToDesign;
			}

			public void setBackToDesign(Boolean backToDesign) {
				this.backToDesign = backToDesign;
			}

			public Boolean getCanSkip() {
				return this.canSkip;
			}

			public void setCanSkip(Boolean canSkip) {
				this.canSkip = canSkip;
			}

			public List<String> getPublishStrategies() {
				return this.publishStrategies;
			}

			public void setPublishStrategies(List<String> publishStrategies) {
				this.publishStrategies = publishStrategies;
			}
		}
	}

	@Override
	public GetTableDesignProjectFlowResponse getInstance(UnmarshallerContext context) {
		return	GetTableDesignProjectFlowResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
