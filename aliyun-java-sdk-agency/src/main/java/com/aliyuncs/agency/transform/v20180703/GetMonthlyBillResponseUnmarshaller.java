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

package com.aliyuncs.agency.transform.v20180703;

import com.aliyuncs.agency.model.v20180703.GetMonthlyBillResponse;
import com.aliyuncs.agency.model.v20180703.GetMonthlyBillResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMonthlyBillResponseUnmarshaller {

	public static GetMonthlyBillResponse unmarshall(GetMonthlyBillResponse getMonthlyBillResponse, UnmarshallerContext _ctx) {
		
		getMonthlyBillResponse.setCode(_ctx.stringValue("GetMonthlyBillResponse.Code"));
		getMonthlyBillResponse.setMessage(_ctx.stringValue("GetMonthlyBillResponse.Message"));
		getMonthlyBillResponse.setSuccess(_ctx.booleanValue("GetMonthlyBillResponse.Success"));

		Data data = new Data();
		data.setRefundInvoiceLink(_ctx.stringValue("GetMonthlyBillResponse.Data.RefundInvoiceLink"));
		data.setBillType(_ctx.stringValue("GetMonthlyBillResponse.Data.BillType"));
		data.setInvoiceLink(_ctx.stringValue("GetMonthlyBillResponse.Data.InvoiceLink"));
		data.setBillLinkCSV(_ctx.stringValue("GetMonthlyBillResponse.Data.BillLinkCSV"));
		data.setRefundInvoiceFlag(_ctx.booleanValue("GetMonthlyBillResponse.Data.RefundInvoiceFlag"));
		data.setSpendingTime(_ctx.stringValue("GetMonthlyBillResponse.Data.SpendingTime"));
		data.setBillOwner(_ctx.stringValue("GetMonthlyBillResponse.Data.BillOwner"));
		data.setBillLinkXLSX(_ctx.stringValue("GetMonthlyBillResponse.Data.BillLinkXLSX"));
		getMonthlyBillResponse.setData(data);
	 
	 	return getMonthlyBillResponse;
	}
}