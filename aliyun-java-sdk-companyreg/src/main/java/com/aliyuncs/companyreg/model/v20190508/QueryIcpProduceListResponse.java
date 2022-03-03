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

package com.aliyuncs.companyreg.model.v20190508;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20190508.QueryIcpProduceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryIcpProduceListResponse extends AcsResponse {

	private Long currentPageNum;

	private Long totalPageNum;

	private Long pageSize;

	private Long totalItemNum;

	private String requestId;

	private List<Trademark> data;

	public Long getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Long currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Long getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Long totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Long totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Trademark> getData() {
		return this.data;
	}

	public void setData(List<Trademark> data) {
		this.data = data;
	}

	public static class Trademark {

		private String bizId;

		private String mobile;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
	}

	@Override
	public QueryIcpProduceListResponse getInstance(UnmarshallerContext context) {
		return	QueryIcpProduceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
