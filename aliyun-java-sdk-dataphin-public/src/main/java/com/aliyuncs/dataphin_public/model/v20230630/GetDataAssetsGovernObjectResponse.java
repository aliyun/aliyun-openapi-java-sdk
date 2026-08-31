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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetDataAssetsGovernObjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataAssetsGovernObjectResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private GovernObjectInfo governObjectInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public GovernObjectInfo getGovernObjectInfo() {
		return this.governObjectInfo;
	}

	public void setGovernObjectInfo(GovernObjectInfo governObjectInfo) {
		this.governObjectInfo = governObjectInfo;
	}

	public static class GovernObjectInfo {

		private String status;

		private Boolean isRectify;

		private Long rectifyId;

		private Long governObjectId;

		private String rectifyName;

		private String commitTime;

		private String rectifyUser;

		private Map<Object,Object> properties;

		private Long tenantId;

		private String submitType;

		private Long governItemId;

		private String rectifyStatus;

		private String rectifyUserName;

		private List<RelatedKnowledgeItem> relatedKnowledge;

		private List<Owner> owners;

		private Problem problem;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getIsRectify() {
			return this.isRectify;
		}

		public void setIsRectify(Boolean isRectify) {
			this.isRectify = isRectify;
		}

		public Long getRectifyId() {
			return this.rectifyId;
		}

		public void setRectifyId(Long rectifyId) {
			this.rectifyId = rectifyId;
		}

		public Long getGovernObjectId() {
			return this.governObjectId;
		}

		public void setGovernObjectId(Long governObjectId) {
			this.governObjectId = governObjectId;
		}

		public String getRectifyName() {
			return this.rectifyName;
		}

		public void setRectifyName(String rectifyName) {
			this.rectifyName = rectifyName;
		}

		public String getCommitTime() {
			return this.commitTime;
		}

		public void setCommitTime(String commitTime) {
			this.commitTime = commitTime;
		}

		public String getRectifyUser() {
			return this.rectifyUser;
		}

		public void setRectifyUser(String rectifyUser) {
			this.rectifyUser = rectifyUser;
		}

		public Map<Object,Object> getProperties() {
			return this.properties;
		}

		public void setProperties(Map<Object,Object> properties) {
			this.properties = properties;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getSubmitType() {
			return this.submitType;
		}

		public void setSubmitType(String submitType) {
			this.submitType = submitType;
		}

		public Long getGovernItemId() {
			return this.governItemId;
		}

		public void setGovernItemId(Long governItemId) {
			this.governItemId = governItemId;
		}

		public String getRectifyStatus() {
			return this.rectifyStatus;
		}

		public void setRectifyStatus(String rectifyStatus) {
			this.rectifyStatus = rectifyStatus;
		}

		public String getRectifyUserName() {
			return this.rectifyUserName;
		}

		public void setRectifyUserName(String rectifyUserName) {
			this.rectifyUserName = rectifyUserName;
		}

		public List<RelatedKnowledgeItem> getRelatedKnowledge() {
			return this.relatedKnowledge;
		}

		public void setRelatedKnowledge(List<RelatedKnowledgeItem> relatedKnowledge) {
			this.relatedKnowledge = relatedKnowledge;
		}

		public List<Owner> getOwners() {
			return this.owners;
		}

		public void setOwners(List<Owner> owners) {
			this.owners = owners;
		}

		public Problem getProblem() {
			return this.problem;
		}

		public void setProblem(Problem problem) {
			this.problem = problem;
		}

		public static class RelatedKnowledgeItem {

			private String desc;

			private String owner;

			private String ownerName;

			private String cause;

			private String title;

			private Long knowledgeId;

			private String solution;

			public String getDesc() {
				return this.desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getCause() {
				return this.cause;
			}

			public void setCause(String cause) {
				this.cause = cause;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public Long getKnowledgeId() {
				return this.knowledgeId;
			}

			public void setKnowledgeId(Long knowledgeId) {
				this.knowledgeId = knowledgeId;
			}

			public String getSolution() {
				return this.solution;
			}

			public void setSolution(String solution) {
				this.solution = solution;
			}
		}

		public static class Owner {

			private String userId;

			private String displayName;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}
		}

		public static class Problem {

			private String problemContactPhone;

			private String problemSubmitter;

			private String objectId;

			private String problemDesc;

			private String problemSubmitType;

			private String problemSubmitterUserName;

			private String problemContactOther;

			private String problemContactMail;

			private String parentObjectId;

			private List<String> problemTypes;

			public String getProblemContactPhone() {
				return this.problemContactPhone;
			}

			public void setProblemContactPhone(String problemContactPhone) {
				this.problemContactPhone = problemContactPhone;
			}

			public String getProblemSubmitter() {
				return this.problemSubmitter;
			}

			public void setProblemSubmitter(String problemSubmitter) {
				this.problemSubmitter = problemSubmitter;
			}

			public String getObjectId() {
				return this.objectId;
			}

			public void setObjectId(String objectId) {
				this.objectId = objectId;
			}

			public String getProblemDesc() {
				return this.problemDesc;
			}

			public void setProblemDesc(String problemDesc) {
				this.problemDesc = problemDesc;
			}

			public String getProblemSubmitType() {
				return this.problemSubmitType;
			}

			public void setProblemSubmitType(String problemSubmitType) {
				this.problemSubmitType = problemSubmitType;
			}

			public String getProblemSubmitterUserName() {
				return this.problemSubmitterUserName;
			}

			public void setProblemSubmitterUserName(String problemSubmitterUserName) {
				this.problemSubmitterUserName = problemSubmitterUserName;
			}

			public String getProblemContactOther() {
				return this.problemContactOther;
			}

			public void setProblemContactOther(String problemContactOther) {
				this.problemContactOther = problemContactOther;
			}

			public String getProblemContactMail() {
				return this.problemContactMail;
			}

			public void setProblemContactMail(String problemContactMail) {
				this.problemContactMail = problemContactMail;
			}

			public String getParentObjectId() {
				return this.parentObjectId;
			}

			public void setParentObjectId(String parentObjectId) {
				this.parentObjectId = parentObjectId;
			}

			public List<String> getProblemTypes() {
				return this.problemTypes;
			}

			public void setProblemTypes(List<String> problemTypes) {
				this.problemTypes = problemTypes;
			}
		}
	}

	@Override
	public GetDataAssetsGovernObjectResponse getInstance(UnmarshallerContext context) {
		return	GetDataAssetsGovernObjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
