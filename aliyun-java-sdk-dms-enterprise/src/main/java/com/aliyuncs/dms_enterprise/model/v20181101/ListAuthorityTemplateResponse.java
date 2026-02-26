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
import com.aliyuncs.dms_enterprise.transform.v20181101.ListAuthorityTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAuthorityTemplateResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Long tid;

	private Long totalCount;

	private List<AuthorityTemplateView> authorityTemplateViewList;

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

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<AuthorityTemplateView> getAuthorityTemplateViewList() {
		return this.authorityTemplateViewList;
	}

	public void setAuthorityTemplateViewList(List<AuthorityTemplateView> authorityTemplateViewList) {
		this.authorityTemplateViewList = authorityTemplateViewList;
	}

	public static class AuthorityTemplateView {

		private Long templateId;

		private Long creatorId;

		private String name;

		private String description;

		private String createTime;

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public Long getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(Long creatorId) {
			this.creatorId = creatorId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public ListAuthorityTemplateResponse getInstance(UnmarshallerContext context) {
		return	ListAuthorityTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
