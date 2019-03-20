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

package com.aliyuncs.bss.model.v20140714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.bss.transform.v20140714.DescribeCashDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCashDetailResponse extends AcsResponse {

	private String requestId;

	private String balanceAmount;

	private String amountOwed;

	private String enableThresholdAlert;

	private Long miniAlertThreshold;

	private String frozenAmount;

	private String creditCardAmount;

	private String remmitanceAmount;

	private String creditLimit;

	private String availableCredit;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBalanceAmount() {
		return this.balanceAmount;
	}

	public void setBalanceAmount(String balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public String getAmountOwed() {
		return this.amountOwed;
	}

	public void setAmountOwed(String amountOwed) {
		this.amountOwed = amountOwed;
	}

	public String getEnableThresholdAlert() {
		return this.enableThresholdAlert;
	}

	public void setEnableThresholdAlert(String enableThresholdAlert) {
		this.enableThresholdAlert = enableThresholdAlert;
	}

	public Long getMiniAlertThreshold() {
		return this.miniAlertThreshold;
	}

	public void setMiniAlertThreshold(Long miniAlertThreshold) {
		this.miniAlertThreshold = miniAlertThreshold;
	}

	public String getFrozenAmount() {
		return this.frozenAmount;
	}

	public void setFrozenAmount(String frozenAmount) {
		this.frozenAmount = frozenAmount;
	}

	public String getCreditCardAmount() {
		return this.creditCardAmount;
	}

	public void setCreditCardAmount(String creditCardAmount) {
		this.creditCardAmount = creditCardAmount;
	}

	public String getRemmitanceAmount() {
		return this.remmitanceAmount;
	}

	public void setRemmitanceAmount(String remmitanceAmount) {
		this.remmitanceAmount = remmitanceAmount;
	}

	public String getCreditLimit() {
		return this.creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getAvailableCredit() {
		return this.availableCredit;
	}

	public void setAvailableCredit(String availableCredit) {
		this.availableCredit = availableCredit;
	}

	@Override
	public DescribeCashDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeCashDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
