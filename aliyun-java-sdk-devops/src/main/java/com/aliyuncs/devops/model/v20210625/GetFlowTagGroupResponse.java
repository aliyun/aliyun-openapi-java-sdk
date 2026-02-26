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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.GetFlowTagGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFlowTagGroupResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private FlowTagGroup flowTagGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public FlowTagGroup getFlowTagGroup() {
		return this.flowTagGroup;
	}

	public void setFlowTagGroup(FlowTagGroup flowTagGroup) {
		this.flowTagGroup = flowTagGroup;
	}

	public static class FlowTagGroup {

		private Long id;

		private String name;

		private String creatorAccountId;

		private String modiferAccountId;

		private List<FlowTag> flowTagList;

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

		public String getCreatorAccountId() {
			return this.creatorAccountId;
		}

		public void setCreatorAccountId(String creatorAccountId) {
			this.creatorAccountId = creatorAccountId;
		}

		public String getModiferAccountId() {
			return this.modiferAccountId;
		}

		public void setModiferAccountId(String modiferAccountId) {
			this.modiferAccountId = modiferAccountId;
		}

		public List<FlowTag> getFlowTagList() {
			return this.flowTagList;
		}

		public void setFlowTagList(List<FlowTag> flowTagList) {
			this.flowTagList = flowTagList;
		}

		public static class FlowTag {

			private Long id;

			private String name;

			private String color;

			private String creatorAccountId;

			private String modiferAccountId;

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

			public String getColor() {
				return this.color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public String getCreatorAccountId() {
				return this.creatorAccountId;
			}

			public void setCreatorAccountId(String creatorAccountId) {
				this.creatorAccountId = creatorAccountId;
			}

			public String getModiferAccountId() {
				return this.modiferAccountId;
			}

			public void setModiferAccountId(String modiferAccountId) {
				this.modiferAccountId = modiferAccountId;
			}
		}
	}

	@Override
	public GetFlowTagGroupResponse getInstance(UnmarshallerContext context) {
		return	GetFlowTagGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
