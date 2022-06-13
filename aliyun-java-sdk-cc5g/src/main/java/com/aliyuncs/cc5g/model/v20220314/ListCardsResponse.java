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

package com.aliyuncs.cc5g.model.v20220314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cc5g.transform.v20220314.ListCardsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCardsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private String maxResults;

	private String totalCount;

	private List<Card> cards;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<Card> getCards() {
		return this.cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public static class Card {

		private String iccid;

		private String netType;

		private String aPN;

		private String iSP;

		private String ipAddress;

		private String imsi;

		private String imei;

		private Boolean lock;

		private String spec;

		private String status;

		private String description;

		private String name;

		private Long usageDataMonth;

		private String orderId;

		private String activatedTime;

		private String businessStatus;

		public String getIccid() {
			return this.iccid;
		}

		public void setIccid(String iccid) {
			this.iccid = iccid;
		}

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}

		public String getAPN() {
			return this.aPN;
		}

		public void setAPN(String aPN) {
			this.aPN = aPN;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getImsi() {
			return this.imsi;
		}

		public void setImsi(String imsi) {
			this.imsi = imsi;
		}

		public String getImei() {
			return this.imei;
		}

		public void setImei(String imei) {
			this.imei = imei;
		}

		public Boolean getLock() {
			return this.lock;
		}

		public void setLock(Boolean lock) {
			this.lock = lock;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getUsageDataMonth() {
			return this.usageDataMonth;
		}

		public void setUsageDataMonth(Long usageDataMonth) {
			this.usageDataMonth = usageDataMonth;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getActivatedTime() {
			return this.activatedTime;
		}

		public void setActivatedTime(String activatedTime) {
			this.activatedTime = activatedTime;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}
	}

	@Override
	public ListCardsResponse getInstance(UnmarshallerContext context) {
		return	ListCardsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
