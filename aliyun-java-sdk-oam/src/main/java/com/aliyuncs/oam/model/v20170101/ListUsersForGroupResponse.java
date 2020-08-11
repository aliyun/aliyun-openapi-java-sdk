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

package com.aliyuncs.oam.model.v20170101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oam.transform.v20170101.ListUsersForGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUsersForGroupResponse extends AcsResponse {

	private String code;

	private String message;

	private List<OamUser> data;

	private PageInfo pageInfo;

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

	public List<OamUser> getData() {
		return this.data;
	}

	public void setData(List<OamUser> data) {
		this.data = data;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class OamUser {

		private Long uid;

		private String loginId;

		private String customUserId;

		private String gmtModified;

		public Long getUid() {
			return this.uid;
		}

		public void setUid(Long uid) {
			this.uid = uid;
		}

		public String getLoginId() {
			return this.loginId;
		}

		public void setLoginId(String loginId) {
			this.loginId = loginId;
		}

		public String getCustomUserId() {
			return this.customUserId;
		}

		public void setCustomUserId(String customUserId) {
			this.customUserId = customUserId;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer total;

		private Integer totalPage;

		private String nextPageToken;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Integer totalPage) {
			this.totalPage = totalPage;
		}

		public String getNextPageToken() {
			return this.nextPageToken;
		}

		public void setNextPageToken(String nextPageToken) {
			this.nextPageToken = nextPageToken;
		}
	}

	@Override
	public ListUsersForGroupResponse getInstance(UnmarshallerContext context) {
		return	ListUsersForGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
