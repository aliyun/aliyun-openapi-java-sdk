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
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse extends AcsResponse {

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

		private String antChainId;

		private String authorizationType;

		private String qRCodeType;

		private List<AuthorizedUserListItem> authorizedUserList;

		private Pagination pagination;

		public String getAntChainId() {
			return this.antChainId;
		}

		public void setAntChainId(String antChainId) {
			this.antChainId = antChainId;
		}

		public String getAuthorizationType() {
			return this.authorizationType;
		}

		public void setAuthorizationType(String authorizationType) {
			this.authorizationType = authorizationType;
		}

		public String getQRCodeType() {
			return this.qRCodeType;
		}

		public void setQRCodeType(String qRCodeType) {
			this.qRCodeType = qRCodeType;
		}

		public List<AuthorizedUserListItem> getAuthorizedUserList() {
			return this.authorizedUserList;
		}

		public void setAuthorizedUserList(List<AuthorizedUserListItem> authorizedUserList) {
			this.authorizedUserList = authorizedUserList;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class AuthorizedUserListItem {

			private String gmtAuthorized;

			private String phone;

			public String getGmtAuthorized() {
				return this.gmtAuthorized;
			}

			public void setGmtAuthorized(String gmtAuthorized) {
				this.gmtAuthorized = gmtAuthorized;
			}

			public String getPhone() {
				return this.phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}
		}

		public static class Pagination {

			private Integer pageNumber;

			private Integer pageSize;

			private Integer totalCount;

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

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
