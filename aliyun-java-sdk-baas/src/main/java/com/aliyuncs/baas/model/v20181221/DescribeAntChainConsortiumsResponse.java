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

package com.aliyuncs.baas.model.v20181221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainConsortiumsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainConsortiumsResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<AntConsortiumsItem> antConsortiums;

		private Pagination pagination;

		public List<AntConsortiumsItem> getAntConsortiums() {
			return this.antConsortiums;
		}

		public void setAntConsortiums(List<AntConsortiumsItem> antConsortiums) {
			this.antConsortiums = antConsortiums;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class AntConsortiumsItem {

			private Long chainNum;

			private Long memberNum;

			private Long createTime;

			private String role;

			private String consortiumId;

			private String status;

			private String consortiumName;

			private String consortiumDescription;

			public Long getChainNum() {
				return this.chainNum;
			}

			public void setChainNum(Long chainNum) {
				this.chainNum = chainNum;
			}

			public Long getMemberNum() {
				return this.memberNum;
			}

			public void setMemberNum(Long memberNum) {
				this.memberNum = memberNum;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getConsortiumId() {
				return this.consortiumId;
			}

			public void setConsortiumId(String consortiumId) {
				this.consortiumId = consortiumId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getConsortiumName() {
				return this.consortiumName;
			}

			public void setConsortiumName(String consortiumName) {
				this.consortiumName = consortiumName;
			}

			public String getConsortiumDescription() {
				return this.consortiumDescription;
			}

			public void setConsortiumDescription(String consortiumDescription) {
				this.consortiumDescription = consortiumDescription;
			}
		}

		public static class Pagination {

			private Integer pageSize;

			private Integer pageNumber;

			private Integer totalCount;

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Integer getPageNumber() {
				return this.pageNumber;
			}

			public void setPageNumber(Integer pageNumber) {
				this.pageNumber = pageNumber;
			}

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public DescribeAntChainConsortiumsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntChainConsortiumsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
