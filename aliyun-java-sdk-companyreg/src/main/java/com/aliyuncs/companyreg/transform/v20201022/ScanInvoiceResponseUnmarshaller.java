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

import com.aliyuncs.companyreg.model.v20201022.ScanInvoiceResponse;
import com.aliyuncs.companyreg.model.v20201022.ScanInvoiceResponse.Invoice;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScanInvoiceResponseUnmarshaller {

	public static ScanInvoiceResponse unmarshall(ScanInvoiceResponse scanInvoiceResponse, UnmarshallerContext _ctx) {
		
		scanInvoiceResponse.setRequestId(_ctx.stringValue("ScanInvoiceResponse.RequestId"));
		scanInvoiceResponse.setCode(_ctx.stringValue("ScanInvoiceResponse.Code"));
		scanInvoiceResponse.setIsFee(_ctx.booleanValue("ScanInvoiceResponse.IsFee"));
		scanInvoiceResponse.setSuccess(_ctx.booleanValue("ScanInvoiceResponse.Success"));

		Invoice invoice = new Invoice();
		invoice.setId(_ctx.longValue("ScanInvoiceResponse.Invoice.Id"));
		invoice.setBaseTotalAmountWithoutTax(_ctx.stringValue("ScanInvoiceResponse.Invoice.BaseTotalAmountWithoutTax"));
		invoice.setInvoiceNo(_ctx.stringValue("ScanInvoiceResponse.Invoice.InvoiceNo"));
		scanInvoiceResponse.setInvoice(invoice);
	 
	 	return scanInvoiceResponse;
	}
}