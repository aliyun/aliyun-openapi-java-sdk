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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetTransferInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTransferInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private Data data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long proposalId;

		private Long flowId;

		private String title;

		private String privilegeTransferMode;

		private String transferComment;

		private String transferStatus;

		private String gmtCreate;

		private String gmtModified;

		private List<PrivilegeTransferResultEntriesItem> privilegeTransferResultEntries;

		private Creator creator;

		private OldOwner oldOwner;

		private NewOwner newOwner;

		private LastModifier lastModifier;

		public Long getProposalId() {
			return this.proposalId;
		}

		public void setProposalId(Long proposalId) {
			this.proposalId = proposalId;
		}

		public Long getFlowId() {
			return this.flowId;
		}

		public void setFlowId(Long flowId) {
			this.flowId = flowId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getPrivilegeTransferMode() {
			return this.privilegeTransferMode;
		}

		public void setPrivilegeTransferMode(String privilegeTransferMode) {
			this.privilegeTransferMode = privilegeTransferMode;
		}

		public String getTransferComment() {
			return this.transferComment;
		}

		public void setTransferComment(String transferComment) {
			this.transferComment = transferComment;
		}

		public String getTransferStatus() {
			return this.transferStatus;
		}

		public void setTransferStatus(String transferStatus) {
			this.transferStatus = transferStatus;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public List<PrivilegeTransferResultEntriesItem> getPrivilegeTransferResultEntries() {
			return this.privilegeTransferResultEntries;
		}

		public void setPrivilegeTransferResultEntries(List<PrivilegeTransferResultEntriesItem> privilegeTransferResultEntries) {
			this.privilegeTransferResultEntries = privilegeTransferResultEntries;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public OldOwner getOldOwner() {
			return this.oldOwner;
		}

		public void setOldOwner(OldOwner oldOwner) {
			this.oldOwner = oldOwner;
		}

		public NewOwner getNewOwner() {
			return this.newOwner;
		}

		public void setNewOwner(NewOwner newOwner) {
			this.newOwner = newOwner;
		}

		public LastModifier getLastModifier() {
			return this.lastModifier;
		}

		public void setLastModifier(LastModifier lastModifier) {
			this.lastModifier = lastModifier;
		}

		public static class PrivilegeTransferResultEntriesItem {

			private String status;

			private String privilegeDisplayName;

			private String errMsg;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPrivilegeDisplayName() {
				return this.privilegeDisplayName;
			}

			public void setPrivilegeDisplayName(String privilegeDisplayName) {
				this.privilegeDisplayName = privilegeDisplayName;
			}

			public String getErrMsg() {
				return this.errMsg;
			}

			public void setErrMsg(String errMsg) {
				this.errMsg = errMsg;
			}
		}

		public static class Creator {

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

		public static class OldOwner {

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

		public static class NewOwner {

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

		public static class LastModifier {

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
	}

	@Override
	public GetTransferInfoResponse getInstance(UnmarshallerContext context) {
		return	GetTransferInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
