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

package com.aliyuncs.companyreg.transform.v20201022;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20201022.ListCashJournalResponse;
import com.aliyuncs.companyreg.model.v20201022.ListCashJournalResponse.CashJournalListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCashJournalResponseUnmarshaller {

	public static ListCashJournalResponse unmarshall(ListCashJournalResponse listCashJournalResponse, UnmarshallerContext _ctx) {
		
		listCashJournalResponse.setRequestId(_ctx.stringValue("ListCashJournalResponse.RequestId"));

		List<CashJournalListItem> cashJournalList = new ArrayList<CashJournalListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCashJournalResponse.CashJournalList.Length"); i++) {
			CashJournalListItem cashJournalListItem = new CashJournalListItem();
			cashJournalListItem.setBankName(_ctx.stringValue("ListCashJournalResponse.CashJournalList["+ i +"].BankName"));
			cashJournalListItem.setIncomeAmount(_ctx.stringValue("ListCashJournalResponse.CashJournalList["+ i +"].IncomeAmount"));
			cashJournalListItem.setExpendAmount(_ctx.stringValue("ListCashJournalResponse.CashJournalList["+ i +"].ExpendAmount"));

			cashJournalList.add(cashJournalListItem);
		}
		listCashJournalResponse.setCashJournalList(cashJournalList);
	 
	 	return listCashJournalResponse;
	}
}