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

package com.aliyuncs.unimkt.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.QueryAppTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAppTasksResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private Boolean success;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer count;

		private List<ListItem> list;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private Integer status;

			private String timeSchema;

			private Long quota;

			private String contentIds;

			private Long chargeCost;

			private Long proxyUserId;

			private Integer openScene;

			private Integer priority;

			private String accountNo;

			private Integer allContentStatus;

			private Long quotaDay;

			private String endTime;

			private String startTime;

			private Long brandUserId;

			private String priceType;

			private String name;

			private Long balanceDay;

			private Integer popularizePosition;

			private Long id;

			private Long balance;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getTimeSchema() {
				return this.timeSchema;
			}

			public void setTimeSchema(String timeSchema) {
				this.timeSchema = timeSchema;
			}

			public Long getQuota() {
				return this.quota;
			}

			public void setQuota(Long quota) {
				this.quota = quota;
			}

			public String getContentIds() {
				return this.contentIds;
			}

			public void setContentIds(String contentIds) {
				this.contentIds = contentIds;
			}

			public Long getChargeCost() {
				return this.chargeCost;
			}

			public void setChargeCost(Long chargeCost) {
				this.chargeCost = chargeCost;
			}

			public Long getProxyUserId() {
				return this.proxyUserId;
			}

			public void setProxyUserId(Long proxyUserId) {
				this.proxyUserId = proxyUserId;
			}

			public Integer getOpenScene() {
				return this.openScene;
			}

			public void setOpenScene(Integer openScene) {
				this.openScene = openScene;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public String getAccountNo() {
				return this.accountNo;
			}

			public void setAccountNo(String accountNo) {
				this.accountNo = accountNo;
			}

			public Integer getAllContentStatus() {
				return this.allContentStatus;
			}

			public void setAllContentStatus(Integer allContentStatus) {
				this.allContentStatus = allContentStatus;
			}

			public Long getQuotaDay() {
				return this.quotaDay;
			}

			public void setQuotaDay(Long quotaDay) {
				this.quotaDay = quotaDay;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public Long getBrandUserId() {
				return this.brandUserId;
			}

			public void setBrandUserId(Long brandUserId) {
				this.brandUserId = brandUserId;
			}

			public String getPriceType() {
				return this.priceType;
			}

			public void setPriceType(String priceType) {
				this.priceType = priceType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getBalanceDay() {
				return this.balanceDay;
			}

			public void setBalanceDay(Long balanceDay) {
				this.balanceDay = balanceDay;
			}

			public Integer getPopularizePosition() {
				return this.popularizePosition;
			}

			public void setPopularizePosition(Integer popularizePosition) {
				this.popularizePosition = popularizePosition;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getBalance() {
				return this.balance;
			}

			public void setBalance(Long balance) {
				this.balance = balance;
			}
		}
	}

	@Override
	public QueryAppTasksResponse getInstance(UnmarshallerContext context) {
		return	QueryAppTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
