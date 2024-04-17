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

package com.aliyuncs.domain.model.v20180208;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180208.QueryBidRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBidRecordsResponse extends AcsResponse {

	private Integer currentPageNum;

	private Integer totalPageNum;

	private Integer pageSize;

	private String requestId;

	private Integer totalItemNum;

	private List<BidRecord> data;

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

	public List<BidRecord> getData() {
		return this.data;
	}

	public void setData(List<BidRecord> data) {
		this.data = data;
	}

	public static class BidRecord {

		private String bidder;

		private Long bidTime;

		private Float bid;

		private String currency;

		private String domainName;

		public String getBidder() {
			return this.bidder;
		}

		public void setBidder(String bidder) {
			this.bidder = bidder;
		}

		public Long getBidTime() {
			return this.bidTime;
		}

		public void setBidTime(Long bidTime) {
			this.bidTime = bidTime;
		}

		public Float getBid() {
			return this.bid;
		}

		public void setBid(Float bid) {
			this.bid = bid;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}
	}

	@Override
	public QueryBidRecordsResponse getInstance(UnmarshallerContext context) {
		return	QueryBidRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
