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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.QueryMediaWorkflowListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMediaWorkflowListResponse extends AcsResponse {

	private String requestId;

	private List<MediaWorkflow> mediaWorkflowList;

	private List<String> nonExistMediaWorkflowIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MediaWorkflow> getMediaWorkflowList() {
		return this.mediaWorkflowList;
	}

	public void setMediaWorkflowList(List<MediaWorkflow> mediaWorkflowList) {
		this.mediaWorkflowList = mediaWorkflowList;
	}

	public List<String> getNonExistMediaWorkflowIds() {
		return this.nonExistMediaWorkflowIds;
	}

	public void setNonExistMediaWorkflowIds(List<String> nonExistMediaWorkflowIds) {
		this.nonExistMediaWorkflowIds = nonExistMediaWorkflowIds;
	}

	public static class MediaWorkflow {

		private String creationTime;

		private String mediaWorkflowId;

		private String state;

		private String triggerMode;

		private String name;

		private String topology;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getMediaWorkflowId() {
			return this.mediaWorkflowId;
		}

		public void setMediaWorkflowId(String mediaWorkflowId) {
			this.mediaWorkflowId = mediaWorkflowId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getTriggerMode() {
			return this.triggerMode;
		}

		public void setTriggerMode(String triggerMode) {
			this.triggerMode = triggerMode;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTopology() {
			return this.topology;
		}

		public void setTopology(String topology) {
			this.topology = topology;
		}
	}

	@Override
	public QueryMediaWorkflowListResponse getInstance(UnmarshallerContext context) {
		return	QueryMediaWorkflowListResponseUnmarshaller.unmarshall(this, context);
	}
}
