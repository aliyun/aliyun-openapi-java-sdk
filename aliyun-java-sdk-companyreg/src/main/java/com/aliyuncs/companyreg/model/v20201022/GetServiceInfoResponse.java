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

package com.aliyuncs.companyreg.model.v20201022;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20201022.GetServiceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceInfoResponse extends AcsResponse {

	private String requestId;

	private String openingPeriod;

	private String currentPeriod;

	private Long systemTime;

	private Boolean isClearedTrialData;

	private String name;

	private String openingBalanceStatus;

	private InvoiceCheckControlledInfo invoiceCheckControlledInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOpeningPeriod() {
		return this.openingPeriod;
	}

	public void setOpeningPeriod(String openingPeriod) {
		this.openingPeriod = openingPeriod;
	}

	public String getCurrentPeriod() {
		return this.currentPeriod;
	}

	public void setCurrentPeriod(String currentPeriod) {
		this.currentPeriod = currentPeriod;
	}

	public Long getSystemTime() {
		return this.systemTime;
	}

	public void setSystemTime(Long systemTime) {
		this.systemTime = systemTime;
	}

	public Boolean getIsClearedTrialData() {
		return this.isClearedTrialData;
	}

	public void setIsClearedTrialData(Boolean isClearedTrialData) {
		this.isClearedTrialData = isClearedTrialData;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOpeningBalanceStatus() {
		return this.openingBalanceStatus;
	}

	public void setOpeningBalanceStatus(String openingBalanceStatus) {
		this.openingBalanceStatus = openingBalanceStatus;
	}

	public InvoiceCheckControlledInfo getInvoiceCheckControlledInfo() {
		return this.invoiceCheckControlledInfo;
	}

	public void setInvoiceCheckControlledInfo(InvoiceCheckControlledInfo invoiceCheckControlledInfo) {
		this.invoiceCheckControlledInfo = invoiceCheckControlledInfo;
	}

	public static class InvoiceCheckControlledInfo {

		private Integer monthCheckCount;

		private Integer monthLimitCount;

		private Integer trialLimitCount;

		private Boolean isControlledByLimit;

		public Integer getMonthCheckCount() {
			return this.monthCheckCount;
		}

		public void setMonthCheckCount(Integer monthCheckCount) {
			this.monthCheckCount = monthCheckCount;
		}

		public Integer getMonthLimitCount() {
			return this.monthLimitCount;
		}

		public void setMonthLimitCount(Integer monthLimitCount) {
			this.monthLimitCount = monthLimitCount;
		}

		public Integer getTrialLimitCount() {
			return this.trialLimitCount;
		}

		public void setTrialLimitCount(Integer trialLimitCount) {
			this.trialLimitCount = trialLimitCount;
		}

		public Boolean getIsControlledByLimit() {
			return this.isControlledByLimit;
		}

		public void setIsControlledByLimit(Boolean isControlledByLimit) {
			this.isControlledByLimit = isControlledByLimit;
		}
	}

	@Override
	public GetServiceInfoResponse getInstance(UnmarshallerContext context) {
		return	GetServiceInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
