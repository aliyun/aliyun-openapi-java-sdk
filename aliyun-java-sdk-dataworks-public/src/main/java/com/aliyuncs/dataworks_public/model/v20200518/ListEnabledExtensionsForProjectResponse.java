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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListEnabledExtensionsForProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEnabledExtensionsForProjectResponse extends AcsResponse {

	private String requestId;

	private List<ExtensionsItem> extensions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ExtensionsItem> getExtensions() {
		return this.extensions;
	}

	public void setExtensions(List<ExtensionsItem> extensions) {
		this.extensions = extensions;
	}

	public static class ExtensionsItem {

		private String extensionCode;

		private String extensionName;

		private Long tenantId;

		private String createUser;

		private String modifyUser;

		private String extensionDesc;

		private String owner;

		private String parameterSetting;

		private Long gmtCreate;

		private Long gmtModified;

		public String getExtensionCode() {
			return this.extensionCode;
		}

		public void setExtensionCode(String extensionCode) {
			this.extensionCode = extensionCode;
		}

		public String getExtensionName() {
			return this.extensionName;
		}

		public void setExtensionName(String extensionName) {
			this.extensionName = extensionName;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getCreateUser() {
			return this.createUser;
		}

		public void setCreateUser(String createUser) {
			this.createUser = createUser;
		}

		public String getModifyUser() {
			return this.modifyUser;
		}

		public void setModifyUser(String modifyUser) {
			this.modifyUser = modifyUser;
		}

		public String getExtensionDesc() {
			return this.extensionDesc;
		}

		public void setExtensionDesc(String extensionDesc) {
			this.extensionDesc = extensionDesc;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getParameterSetting() {
			return this.parameterSetting;
		}

		public void setParameterSetting(String parameterSetting) {
			this.parameterSetting = parameterSetting;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public ListEnabledExtensionsForProjectResponse getInstance(UnmarshallerContext context) {
		return	ListEnabledExtensionsForProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
