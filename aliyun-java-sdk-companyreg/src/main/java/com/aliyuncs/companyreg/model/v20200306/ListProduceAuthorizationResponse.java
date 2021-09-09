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

package com.aliyuncs.companyreg.model.v20200306;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20200306.ListProduceAuthorizationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProduceAuthorizationResponse extends AcsResponse {

	private Integer currentPageNum;

	private Integer pageSize;

	private String requestId;

	private Integer totalItemNum;

	private Integer totalPageNum;

	private Boolean success;

	private List<ProduceAuthorizations> data;

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ProduceAuthorizations> getData() {
		return this.data;
	}

	public void setData(List<ProduceAuthorizations> data) {
		this.data = data;
	}

	public static class ProduceAuthorizations {

		private String authorizedUserId;

		private String authorizedUserName;

		public String getAuthorizedUserId() {
			return this.authorizedUserId;
		}

		public void setAuthorizedUserId(String authorizedUserId) {
			this.authorizedUserId = authorizedUserId;
		}

		public String getAuthorizedUserName() {
			return this.authorizedUserName;
		}

		public void setAuthorizedUserName(String authorizedUserName) {
			this.authorizedUserName = authorizedUserName;
		}
	}

	@Override
	public ListProduceAuthorizationResponse getInstance(UnmarshallerContext context) {
		return	ListProduceAuthorizationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
