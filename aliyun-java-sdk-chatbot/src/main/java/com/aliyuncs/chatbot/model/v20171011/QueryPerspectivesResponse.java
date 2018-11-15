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

package com.aliyuncs.chatbot.model.v20171011;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.chatbot.transform.v20171011.QueryPerspectivesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPerspectivesResponse extends AcsResponse {

	private String requestId;

	private List<Perspective> perspectives;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Perspective> getPerspectives() {
		return this.perspectives;
	}

	public void setPerspectives(List<Perspective> perspectives) {
		this.perspectives = perspectives;
	}

	public static class Perspective {

		private String modifyUserName;

		private String modifyTime;

		private String createTime;

		private String selfDefine;

		private String perspectiveId;

		private String createUserName;

		private String perspectiveCode;

		private Integer status;

		private String name;

		public String getModifyUserName() {
			return this.modifyUserName;
		}

		public void setModifyUserName(String modifyUserName) {
			this.modifyUserName = modifyUserName;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getSelfDefine() {
			return this.selfDefine;
		}

		public void setSelfDefine(String selfDefine) {
			this.selfDefine = selfDefine;
		}

		public String getPerspectiveId() {
			return this.perspectiveId;
		}

		public void setPerspectiveId(String perspectiveId) {
			this.perspectiveId = perspectiveId;
		}

		public String getCreateUserName() {
			return this.createUserName;
		}

		public void setCreateUserName(String createUserName) {
			this.createUserName = createUserName;
		}

		public String getPerspectiveCode() {
			return this.perspectiveCode;
		}

		public void setPerspectiveCode(String perspectiveCode) {
			this.perspectiveCode = perspectiveCode;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public QueryPerspectivesResponse getInstance(UnmarshallerContext context) {
		return	QueryPerspectivesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
