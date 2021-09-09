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

import com.aliyuncs.companyreg.model.v20201022.ListPayrollResponse;
import com.aliyuncs.companyreg.model.v20201022.ListPayrollResponse.PayrollListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPayrollResponseUnmarshaller {

	public static ListPayrollResponse unmarshall(ListPayrollResponse listPayrollResponse, UnmarshallerContext _ctx) {
		
		listPayrollResponse.setRequestId(_ctx.stringValue("ListPayrollResponse.RequestId"));

		List<PayrollListItem> payrollList = new ArrayList<PayrollListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPayrollResponse.PayrollList.Length"); i++) {
			PayrollListItem payrollListItem = new PayrollListItem();
			payrollListItem.setName(_ctx.stringValue("ListPayrollResponse.PayrollList["+ i +"].Name"));
			payrollListItem.setIncome(_ctx.stringValue("ListPayrollResponse.PayrollList["+ i +"].Income"));
			payrollListItem.setPersonHousingAccumulationFund(_ctx.stringValue("ListPayrollResponse.PayrollList["+ i +"].PersonHousingAccumulationFund"));
			payrollListItem.setId(_ctx.longValue("ListPayrollResponse.PayrollList["+ i +"].Id"));
			payrollListItem.setPersonSocialInsurance(_ctx.stringValue("ListPayrollResponse.PayrollList["+ i +"].PersonSocialInsurance"));

			payrollList.add(payrollListItem);
		}
		listPayrollResponse.setPayrollList(payrollList);
	 
	 	return listPayrollResponse;
	}
}