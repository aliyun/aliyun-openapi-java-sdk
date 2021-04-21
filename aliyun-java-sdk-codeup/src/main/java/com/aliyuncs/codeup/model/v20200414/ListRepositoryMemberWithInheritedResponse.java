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

package com.aliyuncs.codeup.model.v20200414;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.codeup.transform.v20200414.ListRepositoryMemberWithInheritedResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRepositoryMemberWithInheritedResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private Boolean success;

	private String errorMessage;

	private List<ResultItem> result;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Integer accessLevel;

		private String externUserId;

		private Long id;

		private String state;

		private String avatarUrl;

		private String email;

		private String name;

		private String username;

		private Inherited inherited;

		public Integer getAccessLevel() {
			return this.accessLevel;
		}

		public void setAccessLevel(Integer accessLevel) {
			this.accessLevel = accessLevel;
		}

		public String getExternUserId() {
			return this.externUserId;
		}

		public void setExternUserId(String externUserId) {
			this.externUserId = externUserId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getAvatarUrl() {
			return this.avatarUrl;
		}

		public void setAvatarUrl(String avatarUrl) {
			this.avatarUrl = avatarUrl;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public Inherited getInherited() {
			return this.inherited;
		}

		public void setInherited(Inherited inherited) {
			this.inherited = inherited;
		}

		public static class Inherited {

			private Long id;

			private String name;

			private String path;

			private String nameWithNamespace;

			private String pathWithNamespace;

			private String type;

			private String visibilityLevel;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getNameWithNamespace() {
				return this.nameWithNamespace;
			}

			public void setNameWithNamespace(String nameWithNamespace) {
				this.nameWithNamespace = nameWithNamespace;
			}

			public String getPathWithNamespace() {
				return this.pathWithNamespace;
			}

			public void setPathWithNamespace(String pathWithNamespace) {
				this.pathWithNamespace = pathWithNamespace;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getVisibilityLevel() {
				return this.visibilityLevel;
			}

			public void setVisibilityLevel(String visibilityLevel) {
				this.visibilityLevel = visibilityLevel;
			}
		}
	}

	@Override
	public ListRepositoryMemberWithInheritedResponse getInstance(UnmarshallerContext context) {
		return	ListRepositoryMemberWithInheritedResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
