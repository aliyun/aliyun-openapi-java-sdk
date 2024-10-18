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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.CheckIntlFixPriceDomainStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckIntlFixPriceDomainStatusResponse extends AcsResponse {

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

		private String domain;

		private Long price;

		private String currency;

		private Long regDate;

		private Long deadDate;

		private Long endTime;

		private Boolean premium;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Long getPrice() {
			return this.price;
		}

		public void setPrice(Long price) {
			this.price = price;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public Long getRegDate() {
			return this.regDate;
		}

		public void setRegDate(Long regDate) {
			this.regDate = regDate;
		}

		public Long getDeadDate() {
			return this.deadDate;
		}

		public void setDeadDate(Long deadDate) {
			this.deadDate = deadDate;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Boolean getPremium() {
			return this.premium;
		}

		public void setPremium(Boolean premium) {
			this.premium = premium;
		}
	}

	@Override
	public CheckIntlFixPriceDomainStatusResponse getInstance(UnmarshallerContext context) {
		return	CheckIntlFixPriceDomainStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
