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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.ListWorkFlowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWorkFlowResponse extends AcsResponse {

	private String requestId;

	private List<WorkFlowInfo> workFlowInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<WorkFlowInfo> getWorkFlowInfoList() {
		return this.workFlowInfoList;
	}

	public void setWorkFlowInfoList(List<WorkFlowInfo> workFlowInfoList) {
		this.workFlowInfoList = workFlowInfoList;
	}

	public static class WorkFlowInfo {

		private String workFlowId;

		private String name;

		private String actionList;

		private String creationTime;

		private String modifyTime;

		public String getWorkFlowId() {
			return this.workFlowId;
		}

		public void setWorkFlowId(String workFlowId) {
			this.workFlowId = workFlowId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getActionList() {
			return this.actionList;
		}

		public void setActionList(String actionList) {
			this.actionList = actionList;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public ListWorkFlowResponse getInstance(UnmarshallerContext context) {
		return	ListWorkFlowResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
