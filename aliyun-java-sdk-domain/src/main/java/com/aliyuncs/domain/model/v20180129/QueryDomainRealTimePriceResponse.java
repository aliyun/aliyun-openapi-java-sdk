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
import com.aliyuncs.domain.transform.v20180129.QueryDomainRealTimePriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainRealTimePriceResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private Boolean synchro;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private Module module;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Boolean getSynchro() {
		return this.synchro;
	}

	public void setSynchro(Boolean synchro) {
		this.synchro = synchro;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private List<DomainPricesItem> domainPrices;

		public List<DomainPricesItem> getDomainPrices() {
			return this.domainPrices;
		}

		public void setDomainPrices(List<DomainPricesItem> domainPrices) {
			this.domainPrices = domainPrices;
		}

		public static class DomainPricesItem {

			private String domainName;

			private String action;

			private Integer period;

			private Double price;

			private String currency;

			private Boolean premium;

			private Integer avail;

			private String reason;

			public String getDomainName() {
				return this.domainName;
			}

			public void setDomainName(String domainName) {
				this.domainName = domainName;
			}

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public Integer getPeriod() {
				return this.period;
			}

			public void setPeriod(Integer period) {
				this.period = period;
			}

			public Double getPrice() {
				return this.price;
			}

			public void setPrice(Double price) {
				this.price = price;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public Boolean getPremium() {
				return this.premium;
			}

			public void setPremium(Boolean premium) {
				this.premium = premium;
			}

			public Integer getAvail() {
				return this.avail;
			}

			public void setAvail(Integer avail) {
				this.avail = avail;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}
		}
	}

	@Override
	public QueryDomainRealTimePriceResponse getInstance(UnmarshallerContext context) {
		return	QueryDomainRealTimePriceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
