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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeAccesskeyLeakListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccesskeyLeakListResponse extends AcsResponse {

	private String requestId;

	private Long gmtLast;

	private Integer akLeakCount;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<AccessKeyLeak> accessKeyLeakList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getGmtLast() {
		return this.gmtLast;
	}

	public void setGmtLast(Long gmtLast) {
		this.gmtLast = gmtLast;
	}

	public Integer getAkLeakCount() {
		return this.akLeakCount;
	}

	public void setAkLeakCount(Integer akLeakCount) {
		this.akLeakCount = akLeakCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AccessKeyLeak> getAccessKeyLeakList() {
		return this.accessKeyLeakList;
	}

	public void setAccessKeyLeakList(List<AccessKeyLeak> accessKeyLeakList) {
		this.accessKeyLeakList = accessKeyLeakList;
	}

	public static class AccessKeyLeak {

		private Long id;

		private Long gmtModified;

		private String asset;

		private String type;

		private String accesskeyId;

		private String status;

		private String aliUserName;

		private String dealType;

		private String dealTime;

		private String userType;

		private String url;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getAsset() {
			return this.asset;
		}

		public void setAsset(String asset) {
			this.asset = asset;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAccesskeyId() {
			return this.accesskeyId;
		}

		public void setAccesskeyId(String accesskeyId) {
			this.accesskeyId = accesskeyId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAliUserName() {
			return this.aliUserName;
		}

		public void setAliUserName(String aliUserName) {
			this.aliUserName = aliUserName;
		}

		public String getDealType() {
			return this.dealType;
		}

		public void setDealType(String dealType) {
			this.dealType = dealType;
		}

		public String getDealTime() {
			return this.dealTime;
		}

		public void setDealTime(String dealTime) {
			this.dealTime = dealTime;
		}

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	@Override
	public DescribeAccesskeyLeakListResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccesskeyLeakListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
