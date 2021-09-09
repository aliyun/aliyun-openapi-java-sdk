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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20201022.ListPayrollResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPayrollResponse extends AcsResponse {

	private String requestId;

	private List<PayrollListItem> payrollList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PayrollListItem> getPayrollList() {
		return this.payrollList;
	}

	public void setPayrollList(List<PayrollListItem> payrollList) {
		this.payrollList = payrollList;
	}

	public static class PayrollListItem {

		private String name;

		private String income;

		private String personHousingAccumulationFund;

		private Long id;

		private String personSocialInsurance;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIncome() {
			return this.income;
		}

		public void setIncome(String income) {
			this.income = income;
		}

		public String getPersonHousingAccumulationFund() {
			return this.personHousingAccumulationFund;
		}

		public void setPersonHousingAccumulationFund(String personHousingAccumulationFund) {
			this.personHousingAccumulationFund = personHousingAccumulationFund;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPersonSocialInsurance() {
			return this.personSocialInsurance;
		}

		public void setPersonSocialInsurance(String personSocialInsurance) {
			this.personSocialInsurance = personSocialInsurance;
		}
	}

	@Override
	public ListPayrollResponse getInstance(UnmarshallerContext context) {
		return	ListPayrollResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
