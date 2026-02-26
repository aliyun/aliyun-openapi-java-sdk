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
import com.aliyuncs.domain.transform.v20180129.CheckDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckDomainResponse extends AcsResponse {

	private String requestId;

	private String avail;

	private Long price;

	private String domainName;

	private String premium;

	private Boolean dynamicCheck;

	private String reason;

	private List<PriceInfo> staticPriceInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAvail() {
		return this.avail;
	}

	public void setAvail(String avail) {
		this.avail = avail;
	}

	public Long getPrice() {
		return this.price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getPremium() {
		return this.premium;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}

	public Boolean getDynamicCheck() {
		return this.dynamicCheck;
	}

	public void setDynamicCheck(Boolean dynamicCheck) {
		this.dynamicCheck = dynamicCheck;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public List<PriceInfo> getStaticPriceInfo() {
		return this.staticPriceInfo;
	}

	public void setStaticPriceInfo(List<PriceInfo> staticPriceInfo) {
		this.staticPriceInfo = staticPriceInfo;
	}

	public static class PriceInfo {

		private String action;

		private Double money;

		private Long period;

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Double getMoney() {
			return this.money;
		}

		public void setMoney(Double money) {
			this.money = money;
		}

		public Long getPeriod() {
			return this.period;
		}

		public void setPeriod(Long period) {
			this.period = period;
		}
	}

	@Override
	public CheckDomainResponse getInstance(UnmarshallerContext context) {
		return	CheckDomainResponseUnmarshaller.unmarshall(this, context);
	}
}
