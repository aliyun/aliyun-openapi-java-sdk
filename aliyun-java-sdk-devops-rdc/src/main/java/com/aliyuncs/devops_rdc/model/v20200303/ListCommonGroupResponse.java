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

package com.aliyuncs.devops_rdc.model.v20200303;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops_rdc.transform.v20200303.ListCommonGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCommonGroupResponse extends AcsResponse {

	private String errorMsg;

	private String requestId;

	private Boolean successful;

	private String errorCode;

	private List<CommonGroup> object;

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccessful() {
		return this.successful;
	}

	public void setSuccessful(Boolean successful) {
		this.successful = successful;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<CommonGroup> getObject() {
		return this.object;
	}

	public void setObject(List<CommonGroup> object) {
		this.object = object;
	}

	public static class CommonGroup {

		private Integer resourceCount;

		private String smartGroupId;

		private Integer pos;

		private String projectId;

		private Boolean isRoot;

		private String pinyin;

		private String creatorId;

		private String name;

		private String id;

		public Integer getResourceCount() {
			return this.resourceCount;
		}

		public void setResourceCount(Integer resourceCount) {
			this.resourceCount = resourceCount;
		}

		public String getSmartGroupId() {
			return this.smartGroupId;
		}

		public void setSmartGroupId(String smartGroupId) {
			this.smartGroupId = smartGroupId;
		}

		public Integer getPos() {
			return this.pos;
		}

		public void setPos(Integer pos) {
			this.pos = pos;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public Boolean getIsRoot() {
			return this.isRoot;
		}

		public void setIsRoot(Boolean isRoot) {
			this.isRoot = isRoot;
		}

		public String getPinyin() {
			return this.pinyin;
		}

		public void setPinyin(String pinyin) {
			this.pinyin = pinyin;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public ListCommonGroupResponse getInstance(UnmarshallerContext context) {
		return	ListCommonGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
