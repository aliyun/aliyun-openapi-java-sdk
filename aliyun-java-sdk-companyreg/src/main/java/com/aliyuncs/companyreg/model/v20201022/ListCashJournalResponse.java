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
import com.aliyuncs.companyreg.transform.v20201022.ListCashJournalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCashJournalResponse extends AcsResponse {

	private String requestId;

	private List<CashJournalListItem> cashJournalList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CashJournalListItem> getCashJournalList() {
		return this.cashJournalList;
	}

	public void setCashJournalList(List<CashJournalListItem> cashJournalList) {
		this.cashJournalList = cashJournalList;
	}

	public static class CashJournalListItem {

		private String bankName;

		private String incomeAmount;

		private String expendAmount;

		public String getBankName() {
			return this.bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		public String getIncomeAmount() {
			return this.incomeAmount;
		}

		public void setIncomeAmount(String incomeAmount) {
			this.incomeAmount = incomeAmount;
		}

		public String getExpendAmount() {
			return this.expendAmount;
		}

		public void setExpendAmount(String expendAmount) {
			this.expendAmount = expendAmount;
		}
	}

	@Override
	public ListCashJournalResponse getInstance(UnmarshallerContext context) {
		return	ListCashJournalResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
