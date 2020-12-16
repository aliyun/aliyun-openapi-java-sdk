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

package com.aliyuncs.companyreg.transform.v20190508;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20190508.ListBookkeepingSubjectBalancesResponse;
import com.aliyuncs.companyreg.model.v20190508.ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBookkeepingSubjectBalancesResponseUnmarshaller {

	public static ListBookkeepingSubjectBalancesResponse unmarshall(ListBookkeepingSubjectBalancesResponse listBookkeepingSubjectBalancesResponse, UnmarshallerContext _ctx) {
		
		listBookkeepingSubjectBalancesResponse.setRequestId(_ctx.stringValue("ListBookkeepingSubjectBalancesResponse.RequestId"));
		listBookkeepingSubjectBalancesResponse.setTotalCount(_ctx.integerValue("ListBookkeepingSubjectBalancesResponse.TotalCount"));
		listBookkeepingSubjectBalancesResponse.setPageSize(_ctx.integerValue("ListBookkeepingSubjectBalancesResponse.PageSize"));
		listBookkeepingSubjectBalancesResponse.setPageNumber(_ctx.integerValue("ListBookkeepingSubjectBalancesResponse.PageNumber"));
		listBookkeepingSubjectBalancesResponse.setSuccess(_ctx.booleanValue("ListBookkeepingSubjectBalancesResponse.Success"));
		listBookkeepingSubjectBalancesResponse.setErrorMsg(_ctx.stringValue("ListBookkeepingSubjectBalancesResponse.ErrorMsg"));

		List<BookkeepingSubjectBalancesItem> bookkeepingSubjectBalances = new ArrayList<BookkeepingSubjectBalancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances.Length"); i++) {
			BookkeepingSubjectBalancesItem bookkeepingSubjectBalancesItem = new BookkeepingSubjectBalancesItem();
			bookkeepingSubjectBalancesItem.setBizId(_ctx.stringValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].BizId"));
			bookkeepingSubjectBalancesItem.setParentBizId(_ctx.stringValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].ParentBizId"));
			bookkeepingSubjectBalancesItem.setParentSubjectCode(_ctx.stringValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].ParentSubjectCode"));
			bookkeepingSubjectBalancesItem.setSubjectCode(_ctx.stringValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].SubjectCode"));
			bookkeepingSubjectBalancesItem.setSubjectName(_ctx.stringValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].SubjectName"));
			bookkeepingSubjectBalancesItem.setStartDebitValue(_ctx.floatValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].StartDebitValue"));
			bookkeepingSubjectBalancesItem.setStartCreditValue(_ctx.floatValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].StartCreditValue"));
			bookkeepingSubjectBalancesItem.setCurrentDebitValue(_ctx.floatValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].CurrentDebitValue"));
			bookkeepingSubjectBalancesItem.setCurrentCreditValue(_ctx.floatValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].CurrentCreditValue"));
			bookkeepingSubjectBalancesItem.setEndDebitValue(_ctx.floatValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].EndDebitValue"));
			bookkeepingSubjectBalancesItem.setEndCreditValue(_ctx.floatValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].EndCreditValue"));
			bookkeepingSubjectBalancesItem.setYearDebitValue(_ctx.floatValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].YearDebitValue"));
			bookkeepingSubjectBalancesItem.setYearCreditValue(_ctx.floatValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].YearCreditValue"));
			bookkeepingSubjectBalancesItem.setSubjectLevel(_ctx.stringValue("ListBookkeepingSubjectBalancesResponse.BookkeepingSubjectBalances["+ i +"].SubjectLevel"));

			bookkeepingSubjectBalances.add(bookkeepingSubjectBalancesItem);
		}
		listBookkeepingSubjectBalancesResponse.setBookkeepingSubjectBalances(bookkeepingSubjectBalances);
	 
	 	return listBookkeepingSubjectBalancesResponse;
	}
}