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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeLinktProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeLinktProjectResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long errorCode;

	private String errorMessage;

	private Long responseStatusCode;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean archive;

		private Boolean asPublic;

		private Long createdAt;

		private String creator;

		private Boolean deleted;

		private String description;

		private Long id;

		private String link;

		private String name;

		private String notice;

		private String parentProject;

		private String parentSign;

		private String sign;

		private String signPath;

		private Long updatedAt;

		private String url;

		private List<String> adminMembers;

		private List<String> customFieldList;

		private List<String> memberList;

		private List<String> statusList;

		private List<String> templateList;

		public Boolean getArchive() {
			return this.archive;
		}

		public void setArchive(Boolean archive) {
			this.archive = archive;
		}

		public Boolean getAsPublic() {
			return this.asPublic;
		}

		public void setAsPublic(Boolean asPublic) {
			this.asPublic = asPublic;
		}

		public Long getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(Long createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLink() {
			return this.link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNotice() {
			return this.notice;
		}

		public void setNotice(String notice) {
			this.notice = notice;
		}

		public String getParentProject() {
			return this.parentProject;
		}

		public void setParentProject(String parentProject) {
			this.parentProject = parentProject;
		}

		public String getParentSign() {
			return this.parentSign;
		}

		public void setParentSign(String parentSign) {
			this.parentSign = parentSign;
		}

		public String getSign() {
			return this.sign;
		}

		public void setSign(String sign) {
			this.sign = sign;
		}

		public String getSignPath() {
			return this.signPath;
		}

		public void setSignPath(String signPath) {
			this.signPath = signPath;
		}

		public Long getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(Long updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public List<String> getAdminMembers() {
			return this.adminMembers;
		}

		public void setAdminMembers(List<String> adminMembers) {
			this.adminMembers = adminMembers;
		}

		public List<String> getCustomFieldList() {
			return this.customFieldList;
		}

		public void setCustomFieldList(List<String> customFieldList) {
			this.customFieldList = customFieldList;
		}

		public List<String> getMemberList() {
			return this.memberList;
		}

		public void setMemberList(List<String> memberList) {
			this.memberList = memberList;
		}

		public List<String> getStatusList() {
			return this.statusList;
		}

		public void setStatusList(List<String> statusList) {
			this.statusList = statusList;
		}

		public List<String> getTemplateList() {
			return this.templateList;
		}

		public void setTemplateList(List<String> templateList) {
			this.templateList = templateList;
		}
	}

	@Override
	public QueryLinkeLinktProjectResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeLinktProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
