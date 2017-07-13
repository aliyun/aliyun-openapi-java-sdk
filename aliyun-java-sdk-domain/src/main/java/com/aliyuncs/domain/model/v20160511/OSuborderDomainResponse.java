/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.model.v20160511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20160511.OSuborderDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OSuborderDomainResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer pageSize;

	private List<Object> data;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Object> getData() {
		return this.data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

	public static class Object {

		private String commodityKey;

		private String commodityCode;

		private Long amount;

		private String settleTime;

		public String getCommodityKey() {
			return this.commodityKey;
		}

		public void setCommodityKey(String commodityKey) {
			this.commodityKey = commodityKey;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public Long getAmount() {
			return this.amount;
		}

		public void setAmount(Long amount) {
			this.amount = amount;
		}

		public String getSettleTime() {
			return this.settleTime;
		}

		public void setSettleTime(String settleTime) {
			this.settleTime = settleTime;
		}
	}

	@Override
	public OSuborderDomainResponse getInstance(UnmarshallerContext context) {
		return	OSuborderDomainResponseUnmarshaller.unmarshall(this, context);
	}
}
