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
import com.aliyuncs.sas.transform.v20181203.DescribeUniRecoverableListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUniRecoverableListResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private String database;

	private Integer pageSize;

	private Integer totalCount;

	private Integer count;

	private List<RecoverableInfoItem> recoverableInfoList;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDatabase() {
		return this.database;
	}

	public void setDatabase(String database) {
		this.database = database;
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

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<RecoverableInfoItem> getRecoverableInfoList() {
		return this.recoverableInfoList;
	}

	public void setRecoverableInfoList(List<RecoverableInfoItem> recoverableInfoList) {
		this.recoverableInfoList = recoverableInfoList;
	}

	public static class RecoverableInfoItem {

		private Long lastTime;

		private Long resetTime;

		private String restoreInfo;

		private Long firstTime;

		private String name;

		private String resetScn;

		public Long getLastTime() {
			return this.lastTime;
		}

		public void setLastTime(Long lastTime) {
			this.lastTime = lastTime;
		}

		public Long getResetTime() {
			return this.resetTime;
		}

		public void setResetTime(Long resetTime) {
			this.resetTime = resetTime;
		}

		public String getRestoreInfo() {
			return this.restoreInfo;
		}

		public void setRestoreInfo(String restoreInfo) {
			this.restoreInfo = restoreInfo;
		}

		public Long getFirstTime() {
			return this.firstTime;
		}

		public void setFirstTime(Long firstTime) {
			this.firstTime = firstTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getResetScn() {
			return this.resetScn;
		}

		public void setResetScn(String resetScn) {
			this.resetScn = resetScn;
		}
	}

	@Override
	public DescribeUniRecoverableListResponse getInstance(UnmarshallerContext context) {
		return	DescribeUniRecoverableListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
