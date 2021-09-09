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

import com.aliyuncs.companyreg.model.v20201022.GetPeriodInfoResponse;
import com.aliyuncs.companyreg.model.v20201022.GetPeriodInfoResponse.BankSummaryInfo;
import com.aliyuncs.companyreg.model.v20201022.GetPeriodInfoResponse.BankSummaryInfo.Expend;
import com.aliyuncs.companyreg.model.v20201022.GetPeriodInfoResponse.BankSummaryInfo.Income;
import com.aliyuncs.companyreg.model.v20201022.GetPeriodInfoResponse.InvoiceInfo;
import com.aliyuncs.companyreg.model.v20201022.GetPeriodInfoResponse.InvoiceInfo.Fee;
import com.aliyuncs.companyreg.model.v20201022.GetPeriodInfoResponse.InvoiceInfo.InvoiceIncome;
import com.aliyuncs.companyreg.model.v20201022.GetPeriodInfoResponse.InvoiceInfo.InvoiceOut;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPeriodInfoResponseUnmarshaller {

	public static GetPeriodInfoResponse unmarshall(GetPeriodInfoResponse getPeriodInfoResponse, UnmarshallerContext _ctx) {
		
		getPeriodInfoResponse.setRequestId(_ctx.stringValue("GetPeriodInfoResponse.RequestId"));
		getPeriodInfoResponse.setEmployeeCount(_ctx.integerValue("GetPeriodInfoResponse.EmployeeCount"));

		List<Integer> taxSteps = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("GetPeriodInfoResponse.TaxSteps.Length"); i++) {
			taxSteps.add(_ctx.integerValue("GetPeriodInfoResponse.TaxSteps["+ i +"]"));
		}
		getPeriodInfoResponse.setTaxSteps(taxSteps);

		InvoiceInfo invoiceInfo = new InvoiceInfo();

		Fee fee = new Fee();
		fee.setAmount(_ctx.stringValue("GetPeriodInfoResponse.InvoiceInfo.Fee.Amount"));
		fee.setAmountWithTax(_ctx.stringValue("GetPeriodInfoResponse.InvoiceInfo.Fee.AmountWithTax"));
		fee.setCount(_ctx.integerValue("GetPeriodInfoResponse.InvoiceInfo.Fee.Count"));
		fee.setTaxAmount(_ctx.stringValue("GetPeriodInfoResponse.InvoiceInfo.Fee.TaxAmount"));
		invoiceInfo.setFee(fee);

		InvoiceIncome invoiceIncome = new InvoiceIncome();
		invoiceIncome.setAmount(_ctx.stringValue("GetPeriodInfoResponse.InvoiceInfo.InvoiceIncome.Amount"));
		invoiceIncome.setAmountWithTax(_ctx.stringValue("GetPeriodInfoResponse.InvoiceInfo.InvoiceIncome.AmountWithTax"));
		invoiceIncome.setCount(_ctx.integerValue("GetPeriodInfoResponse.InvoiceInfo.InvoiceIncome.Count"));
		invoiceIncome.setTaxAmount(_ctx.stringValue("GetPeriodInfoResponse.InvoiceInfo.InvoiceIncome.TaxAmount"));
		invoiceInfo.setInvoiceIncome(invoiceIncome);

		InvoiceOut invoiceOut = new InvoiceOut();
		invoiceOut.setAmount(_ctx.stringValue("GetPeriodInfoResponse.InvoiceInfo.InvoiceOut.Amount"));
		invoiceOut.setAmountWithTax(_ctx.stringValue("GetPeriodInfoResponse.InvoiceInfo.InvoiceOut.AmountWithTax"));
		invoiceOut.setCount(_ctx.integerValue("GetPeriodInfoResponse.InvoiceInfo.InvoiceOut.Count"));
		invoiceOut.setTaxAmount(_ctx.stringValue("GetPeriodInfoResponse.InvoiceInfo.InvoiceOut.TaxAmount"));
		invoiceInfo.setInvoiceOut(invoiceOut);
		getPeriodInfoResponse.setInvoiceInfo(invoiceInfo);

		BankSummaryInfo bankSummaryInfo = new BankSummaryInfo();

		Income income = new Income();
		income.setAmount(_ctx.stringValue("GetPeriodInfoResponse.BankSummaryInfo.Income.Amount"));
		income.setCount(_ctx.integerValue("GetPeriodInfoResponse.BankSummaryInfo.Income.Count"));
		bankSummaryInfo.setIncome(income);

		Expend expend = new Expend();
		expend.setAmount(_ctx.stringValue("GetPeriodInfoResponse.BankSummaryInfo.Expend.Amount"));
		expend.setCount(_ctx.integerValue("GetPeriodInfoResponse.BankSummaryInfo.Expend.Count"));
		bankSummaryInfo.setExpend(expend);
		getPeriodInfoResponse.setBankSummaryInfo(bankSummaryInfo);
	 
	 	return getPeriodInfoResponse;
	}
}