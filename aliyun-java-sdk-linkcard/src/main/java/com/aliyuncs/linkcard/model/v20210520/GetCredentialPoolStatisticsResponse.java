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

package com.aliyuncs.linkcard.model.v20210520;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkcard.transform.v20210520.GetCredentialPoolStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCredentialPoolStatisticsResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

		private String poolUsed;

		private String credentialNO;

		private String poolOutUsed;

		private String poolGrandTotalUsed;

		private String credentialType;

		private Long cardTotalNum;

		private String poolGrandTotal;

		private Long cardActiveNum;

		private String effectiveTotalFlow;

		private String effectiveAvailableFlow;

		private String poolAvaiable;

		private Long monthFeatureFee;

		private String credentialInstanceId;

		private Long smsUsed;

		private Long monthUsedAmount;

		public String getPoolUsed() {
			return this.poolUsed;
		}

		public void setPoolUsed(String poolUsed) {
			this.poolUsed = poolUsed;
		}

		public String getCredentialNO() {
			return this.credentialNO;
		}

		public void setCredentialNO(String credentialNO) {
			this.credentialNO = credentialNO;
		}

		public String getPoolOutUsed() {
			return this.poolOutUsed;
		}

		public void setPoolOutUsed(String poolOutUsed) {
			this.poolOutUsed = poolOutUsed;
		}

		public String getPoolGrandTotalUsed() {
			return this.poolGrandTotalUsed;
		}

		public void setPoolGrandTotalUsed(String poolGrandTotalUsed) {
			this.poolGrandTotalUsed = poolGrandTotalUsed;
		}

		public String getCredentialType() {
			return this.credentialType;
		}

		public void setCredentialType(String credentialType) {
			this.credentialType = credentialType;
		}

		public Long getCardTotalNum() {
			return this.cardTotalNum;
		}

		public void setCardTotalNum(Long cardTotalNum) {
			this.cardTotalNum = cardTotalNum;
		}

		public String getPoolGrandTotal() {
			return this.poolGrandTotal;
		}

		public void setPoolGrandTotal(String poolGrandTotal) {
			this.poolGrandTotal = poolGrandTotal;
		}

		public Long getCardActiveNum() {
			return this.cardActiveNum;
		}

		public void setCardActiveNum(Long cardActiveNum) {
			this.cardActiveNum = cardActiveNum;
		}

		public String getEffectiveTotalFlow() {
			return this.effectiveTotalFlow;
		}

		public void setEffectiveTotalFlow(String effectiveTotalFlow) {
			this.effectiveTotalFlow = effectiveTotalFlow;
		}

		public String getEffectiveAvailableFlow() {
			return this.effectiveAvailableFlow;
		}

		public void setEffectiveAvailableFlow(String effectiveAvailableFlow) {
			this.effectiveAvailableFlow = effectiveAvailableFlow;
		}

		public String getPoolAvaiable() {
			return this.poolAvaiable;
		}

		public void setPoolAvaiable(String poolAvaiable) {
			this.poolAvaiable = poolAvaiable;
		}

		public Long getMonthFeatureFee() {
			return this.monthFeatureFee;
		}

		public void setMonthFeatureFee(Long monthFeatureFee) {
			this.monthFeatureFee = monthFeatureFee;
		}

		public String getCredentialInstanceId() {
			return this.credentialInstanceId;
		}

		public void setCredentialInstanceId(String credentialInstanceId) {
			this.credentialInstanceId = credentialInstanceId;
		}

		public Long getSmsUsed() {
			return this.smsUsed;
		}

		public void setSmsUsed(Long smsUsed) {
			this.smsUsed = smsUsed;
		}

		public Long getMonthUsedAmount() {
			return this.monthUsedAmount;
		}

		public void setMonthUsedAmount(Long monthUsedAmount) {
			this.monthUsedAmount = monthUsedAmount;
		}
	}

	@Override
	public GetCredentialPoolStatisticsResponse getInstance(UnmarshallerContext context) {
		return	GetCredentialPoolStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
