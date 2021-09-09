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

import com.aliyuncs.companyreg.model.v20201022.GetLastMonthInvoiceCountResponse;
import com.aliyuncs.companyreg.model.v20201022.GetLastMonthInvoiceCountResponse.InvoiceIncome;
import com.aliyuncs.companyreg.model.v20201022.GetLastMonthInvoiceCountResponse.InvoiceOut;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLastMonthInvoiceCountResponseUnmarshaller {

	public static GetLastMonthInvoiceCountResponse unmarshall(GetLastMonthInvoiceCountResponse getLastMonthInvoiceCountResponse, UnmarshallerContext _ctx) {
		
		getLastMonthInvoiceCountResponse.setRequestId(_ctx.stringValue("GetLastMonthInvoiceCountResponse.RequestId"));

		InvoiceIncome invoiceIncome = new InvoiceIncome();
		invoiceIncome.setAmount(_ctx.stringValue("GetLastMonthInvoiceCountResponse.InvoiceIncome.Amount"));
		invoiceIncome.setAmountWithTax(_ctx.stringValue("GetLastMonthInvoiceCountResponse.InvoiceIncome.AmountWithTax"));
		invoiceIncome.setCount(_ctx.integerValue("GetLastMonthInvoiceCountResponse.InvoiceIncome.Count"));
		invoiceIncome.setTaxAmount(_ctx.stringValue("GetLastMonthInvoiceCountResponse.InvoiceIncome.TaxAmount"));
		getLastMonthInvoiceCountResponse.setInvoiceIncome(invoiceIncome);

		InvoiceOut invoiceOut = new InvoiceOut();
		invoiceOut.setAmount(_ctx.stringValue("GetLastMonthInvoiceCountResponse.InvoiceOut.Amount"));
		invoiceOut.setAmountWithTax(_ctx.stringValue("GetLastMonthInvoiceCountResponse.InvoiceOut.AmountWithTax"));
		invoiceOut.setCount(_ctx.integerValue("GetLastMonthInvoiceCountResponse.InvoiceOut.Count"));
		invoiceOut.setTaxAmount(_ctx.stringValue("GetLastMonthInvoiceCountResponse.InvoiceOut.TaxAmount"));
		getLastMonthInvoiceCountResponse.setInvoiceOut(invoiceOut);
	 
	 	return getLastMonthInvoiceCountResponse;
	}
}