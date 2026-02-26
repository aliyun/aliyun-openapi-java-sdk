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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.GetWorkitemCommentListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWorkitemCommentListResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private String success;

	private List<Result> commentList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<Result> getCommentList() {
		return this.commentList;
	}

	public void setCommentList(List<Result> commentList) {
		this.commentList = commentList;
	}

	public static class Result {

		private Long id;

		private String content;

		private String targetType;

		private String targetIdentifier;

		private Long parentId;

		private Long createTime;

		private Long modifiedTime;

		private Boolean isTop;

		private Long topTime;

		private String formatType;

		private User user;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getTargetIdentifier() {
			return this.targetIdentifier;
		}

		public void setTargetIdentifier(String targetIdentifier) {
			this.targetIdentifier = targetIdentifier;
		}

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(Long modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public Boolean getIsTop() {
			return this.isTop;
		}

		public void setIsTop(Boolean isTop) {
			this.isTop = isTop;
		}

		public Long getTopTime() {
			return this.topTime;
		}

		public void setTopTime(Long topTime) {
			this.topTime = topTime;
		}

		public String getFormatType() {
			return this.formatType;
		}

		public void setFormatType(String formatType) {
			this.formatType = formatType;
		}

		public User getUser() {
			return this.user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public static class User {

			private String account;

			private String identifier;

			private String realName;

			private String nickName;

			private String avatar;

			public String getAccount() {
				return this.account;
			}

			public void setAccount(String account) {
				this.account = account;
			}

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public String getRealName() {
				return this.realName;
			}

			public void setRealName(String realName) {
				this.realName = realName;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}

			public String getAvatar() {
				return this.avatar;
			}

			public void setAvatar(String avatar) {
				this.avatar = avatar;
			}
		}
	}

	@Override
	public GetWorkitemCommentListResponse getInstance(UnmarshallerContext context) {
		return	GetWorkitemCommentListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
