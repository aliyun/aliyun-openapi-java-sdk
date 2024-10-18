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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryIntlFixedPriceOrderListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryIntlFixedPriceOrderListResponse extends AcsResponse {

	private String requestId;

	private Module module;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private Integer totalItemNum;

		private Integer currentPageNum;

		private Integer pageSize;

		private Integer totalPageNum;

		private List<OrderList> data;

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

		public Integer getTotalPageNum() {
			return this.totalPageNum;
		}

		public void setTotalPageNum(Integer totalPageNum) {
			this.totalPageNum = totalPageNum;
		}

		public List<OrderList> getData() {
			return this.data;
		}

		public void setData(List<OrderList> data) {
			this.data = data;
		}

		public static class OrderList {

			private Integer orderType;

			private String bizId;

			private String userId;

			private Integer status;

			private Long price;

			private String domain;

			private Long createTime;

			private Long updateTime;

			public Integer getOrderType() {
				return this.orderType;
			}

			public void setOrderType(Integer orderType) {
				this.orderType = orderType;
			}

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Long getPrice() {
				return this.price;
			}

			public void setPrice(Long price) {
				this.price = price;
			}

			public String getDomain() {
				return this.domain;
			}

			public void setDomain(String domain) {
				this.domain = domain;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}
		}
	}

	@Override
	public QueryIntlFixedPriceOrderListResponse getInstance(UnmarshallerContext context) {
		return	QueryIntlFixedPriceOrderListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
