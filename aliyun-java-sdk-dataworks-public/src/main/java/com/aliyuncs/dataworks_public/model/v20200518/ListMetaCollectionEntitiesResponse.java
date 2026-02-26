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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListMetaCollectionEntitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMetaCollectionEntitiesResponse extends AcsResponse {

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

		private List<EntityListItem> entityList;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public List<EntityListItem> getEntityList() {
			return this.entityList;
		}

		public void setEntityList(List<EntityListItem> entityList) {
			this.entityList = entityList;
		}

		public static class EntityListItem {

			private String qualifiedName;

			private Long tenantId;

			private Map<Object,Object> entityContent;

			public String getQualifiedName() {
				return this.qualifiedName;
			}

			public void setQualifiedName(String qualifiedName) {
				this.qualifiedName = qualifiedName;
			}

			public Long getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(Long tenantId) {
				this.tenantId = tenantId;
			}

			public Map<Object,Object> getEntityContent() {
				return this.entityContent;
			}

			public void setEntityContent(Map<Object,Object> entityContent) {
				this.entityContent = entityContent;
			}
		}
	}

	@Override
	public ListMetaCollectionEntitiesResponse getInstance(UnmarshallerContext context) {
		return	ListMetaCollectionEntitiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
