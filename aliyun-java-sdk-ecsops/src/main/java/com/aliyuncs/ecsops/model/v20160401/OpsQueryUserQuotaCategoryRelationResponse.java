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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryUserQuotaCategoryRelationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryUserQuotaCategoryRelationResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String nextToken;

	private List<CategoryRelation> categoryRelations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<CategoryRelation> getCategoryRelations() {
		return this.categoryRelations;
	}

	public void setCategoryRelations(List<CategoryRelation> categoryRelations) {
		this.categoryRelations = categoryRelations;
	}

	public static class CategoryRelation {

		private Long id;

		private String gmtCreateStr;

		private String gmtModifiedStr;

		private Long uid;

		private Integer uidType;

		private Integer categoryType;

		private String categoryName;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreateStr() {
			return this.gmtCreateStr;
		}

		public void setGmtCreateStr(String gmtCreateStr) {
			this.gmtCreateStr = gmtCreateStr;
		}

		public String getGmtModifiedStr() {
			return this.gmtModifiedStr;
		}

		public void setGmtModifiedStr(String gmtModifiedStr) {
			this.gmtModifiedStr = gmtModifiedStr;
		}

		public Long getUid() {
			return this.uid;
		}

		public void setUid(Long uid) {
			this.uid = uid;
		}

		public Integer getUidType() {
			return this.uidType;
		}

		public void setUidType(Integer uidType) {
			this.uidType = uidType;
		}

		public Integer getCategoryType() {
			return this.categoryType;
		}

		public void setCategoryType(Integer categoryType) {
			this.categoryType = categoryType;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
	}

	@Override
	public OpsQueryUserQuotaCategoryRelationResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryUserQuotaCategoryRelationResponseUnmarshaller.unmarshall(this, context);
	}
}
