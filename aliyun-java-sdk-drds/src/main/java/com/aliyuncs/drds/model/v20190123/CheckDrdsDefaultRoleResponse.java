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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.CheckDrdsDefaultRoleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckDrdsDefaultRoleResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<RoleAuth> roleAuths;

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

	public List<RoleAuth> getRoleAuths() {
		return this.roleAuths;
	}

	public void setRoleAuths(List<RoleAuth> roleAuths) {
		this.roleAuths = roleAuths;
	}

	public static class RoleAuth {

		private String title;

		private String content;

		private Boolean hasAuthorized;

		private String link;

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Boolean getHasAuthorized() {
			return this.hasAuthorized;
		}

		public void setHasAuthorized(Boolean hasAuthorized) {
			this.hasAuthorized = hasAuthorized;
		}

		public String getLink() {
			return this.link;
		}

		public void setLink(String link) {
			this.link = link;
		}
	}

	@Override
	public CheckDrdsDefaultRoleResponse getInstance(UnmarshallerContext context) {
		return	CheckDrdsDefaultRoleResponseUnmarshaller.unmarshall(this, context);
	}
}
