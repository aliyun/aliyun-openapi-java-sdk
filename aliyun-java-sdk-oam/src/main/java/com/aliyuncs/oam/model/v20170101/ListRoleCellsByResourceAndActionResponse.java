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

package com.aliyuncs.oam.model.v20170101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oam.transform.v20170101.ListRoleCellsByResourceAndActionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRoleCellsByResourceAndActionResponse extends AcsResponse {

	private String code;

	private String message;

	private List<OamRoleCell> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<OamRoleCell> getData() {
		return this.data;
	}

	public void setData(List<OamRoleCell> data) {
		this.data = data;
	}

	public static class OamRoleCell {

		private String roleName;

		private String attribute;

		private String resource;

		private String roleCellId;

		private String grantOption;

		private String description;

		private String gmtModified;

		private List<String> actionList;

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getAttribute() {
			return this.attribute;
		}

		public void setAttribute(String attribute) {
			this.attribute = attribute;
		}

		public String getResource() {
			return this.resource;
		}

		public void setResource(String resource) {
			this.resource = resource;
		}

		public String getRoleCellId() {
			return this.roleCellId;
		}

		public void setRoleCellId(String roleCellId) {
			this.roleCellId = roleCellId;
		}

		public String getGrantOption() {
			return this.grantOption;
		}

		public void setGrantOption(String grantOption) {
			this.grantOption = grantOption;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public List<String> getActionList() {
			return this.actionList;
		}

		public void setActionList(List<String> actionList) {
			this.actionList = actionList;
		}
	}

	@Override
	public ListRoleCellsByResourceAndActionResponse getInstance(UnmarshallerContext context) {
		return	ListRoleCellsByResourceAndActionResponseUnmarshaller.unmarshall(this, context);
	}
}
