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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetAuthorityTemplateItemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAuthorityTemplateItemResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<AuthorityTemplateItem> authorityTemplateItemList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

	public List<AuthorityTemplateItem> getAuthorityTemplateItemList() {
		return this.authorityTemplateItemList;
	}

	public void setAuthorityTemplateItemList(List<AuthorityTemplateItem> authorityTemplateItemList) {
		this.authorityTemplateItemList = authorityTemplateItemList;
	}

	public static class AuthorityTemplateItem {

		private Long itemId;

		private Long templateId;

		private Long modifierId;

		private String resourceType;

		private Long instanceId;

		private Long dbId;

		private String tableName;

		private String attribute;

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public Long getModifierId() {
			return this.modifierId;
		}

		public void setModifierId(Long modifierId) {
			this.modifierId = modifierId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public Long getDbId() {
			return this.dbId;
		}

		public void setDbId(Long dbId) {
			this.dbId = dbId;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getAttribute() {
			return this.attribute;
		}

		public void setAttribute(String attribute) {
			this.attribute = attribute;
		}
	}

	@Override
	public GetAuthorityTemplateItemResponse getInstance(UnmarshallerContext context) {
		return	GetAuthorityTemplateItemResponseUnmarshaller.unmarshall(this, context);
	}
}
