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
import com.aliyuncs.dataphin_public.transform.v20230630.ListAssetDirectoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAssetDirectoriesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private Long topicId;

		private String topicName;

		private List<Directory> directoryList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getTopicId() {
			return this.topicId;
		}

		public void setTopicId(Long topicId) {
			this.topicId = topicId;
		}

		public String getTopicName() {
			return this.topicName;
		}

		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}

		public List<Directory> getDirectoryList() {
			return this.directoryList;
		}

		public void setDirectoryList(List<Directory> directoryList) {
			this.directoryList = directoryList;
		}

		public static class Directory {

			private Boolean hasChildren;

			private String modifyTime;

			private Long directoryId;

			private String directoryDescription;

			private Long parentDirectoryId;

			private Integer level;

			private String fullPath;

			private String directoryName;

			private List<Long> fullPathIds;

			private List<String> fullPathNames;

			private Modifier modifier;

			public Boolean getHasChildren() {
				return this.hasChildren;
			}

			public void setHasChildren(Boolean hasChildren) {
				this.hasChildren = hasChildren;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public Long getDirectoryId() {
				return this.directoryId;
			}

			public void setDirectoryId(Long directoryId) {
				this.directoryId = directoryId;
			}

			public String getDirectoryDescription() {
				return this.directoryDescription;
			}

			public void setDirectoryDescription(String directoryDescription) {
				this.directoryDescription = directoryDescription;
			}

			public Long getParentDirectoryId() {
				return this.parentDirectoryId;
			}

			public void setParentDirectoryId(Long parentDirectoryId) {
				this.parentDirectoryId = parentDirectoryId;
			}

			public Integer getLevel() {
				return this.level;
			}

			public void setLevel(Integer level) {
				this.level = level;
			}

			public String getFullPath() {
				return this.fullPath;
			}

			public void setFullPath(String fullPath) {
				this.fullPath = fullPath;
			}

			public String getDirectoryName() {
				return this.directoryName;
			}

			public void setDirectoryName(String directoryName) {
				this.directoryName = directoryName;
			}

			public List<Long> getFullPathIds() {
				return this.fullPathIds;
			}

			public void setFullPathIds(List<Long> fullPathIds) {
				this.fullPathIds = fullPathIds;
			}

			public List<String> getFullPathNames() {
				return this.fullPathNames;
			}

			public void setFullPathNames(List<String> fullPathNames) {
				this.fullPathNames = fullPathNames;
			}

			public Modifier getModifier() {
				return this.modifier;
			}

			public void setModifier(Modifier modifier) {
				this.modifier = modifier;
			}

			public static class Modifier {

				private String userName;

				private String userId;

				public String getUserName() {
					return this.userName;
				}

				public void setUserName(String userName) {
					this.userName = userName;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}
			}
		}
	}

	@Override
	public ListAssetDirectoriesResponse getInstance(UnmarshallerContext context) {
		return	ListAssetDirectoriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
