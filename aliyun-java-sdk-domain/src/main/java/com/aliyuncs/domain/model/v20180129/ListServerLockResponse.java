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

package com.aliyuncs.domain.model.v20180129;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.ListServerLockResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServerLockResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer totalPageNum;

	private Integer pageSize;

	private Boolean prePage;

	private Boolean nextPage;

	private List<QueryTransferInResponse> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

	public List<QueryTransferInResponse> getData() {
		return this.data;
	}

	public void setData(List<QueryTransferInResponse> data) {
		this.data = data;
	}

	public static class QueryTransferInResponse {

		private String gmtCreate;

		private String gmtModified;

		private String userId;

		private String domainName;

		private String domainInstanceId;

		private String lockProductId;

		private String startDate;

		private String expireDate;

		private String lockInstanceId;

		private String serverLockStatus;

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

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getDomainInstanceId() {
			return this.domainInstanceId;
		}

		public void setDomainInstanceId(String domainInstanceId) {
			this.domainInstanceId = domainInstanceId;
		}

		public String getLockProductId() {
			return this.lockProductId;
		}

		public void setLockProductId(String lockProductId) {
			this.lockProductId = lockProductId;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}

		public String getLockInstanceId() {
			return this.lockInstanceId;
		}

		public void setLockInstanceId(String lockInstanceId) {
			this.lockInstanceId = lockInstanceId;
		}

		public String getServerLockStatus() {
			return this.serverLockStatus;
		}

		public void setServerLockStatus(String serverLockStatus) {
			this.serverLockStatus = serverLockStatus;
		}
	}

	@Override
	public ListServerLockResponse getInstance(UnmarshallerContext context) {
		return	ListServerLockResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
