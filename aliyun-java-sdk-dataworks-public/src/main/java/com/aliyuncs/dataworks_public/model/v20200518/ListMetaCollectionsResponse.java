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
import com.aliyuncs.dataworks_public.transform.v20200518.ListMetaCollectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMetaCollectionsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nextToken;

		private List<CollectionListItem> collectionList;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public List<CollectionListItem> getCollectionList() {
			return this.collectionList;
		}

		public void setCollectionList(List<CollectionListItem> collectionList) {
			this.collectionList = collectionList;
		}

		public static class CollectionListItem {

			private String qualifiedName;

			private String collectionType;

			private String name;

			private String comment;

			private String ownerId;

			private String ownerName;

			private Long createTime;

			private Long updateTime;

			private Integer level;

			public String getQualifiedName() {
				return this.qualifiedName;
			}

			public void setQualifiedName(String qualifiedName) {
				this.qualifiedName = qualifiedName;
			}

			public String getCollectionType() {
				return this.collectionType;
			}

			public void setCollectionType(String collectionType) {
				this.collectionType = collectionType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public Integer getLevel() {
				return this.level;
			}

			public void setLevel(Integer level) {
				this.level = level;
			}
		}
	}

	@Override
	public ListMetaCollectionsResponse getInstance(UnmarshallerContext context) {
		return	ListMetaCollectionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
