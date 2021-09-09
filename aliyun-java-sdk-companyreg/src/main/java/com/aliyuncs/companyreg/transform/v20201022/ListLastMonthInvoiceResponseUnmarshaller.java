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

import com.aliyuncs.companyreg.model.v20201022.ListLastMonthInvoiceResponse;
import com.aliyuncs.companyreg.model.v20201022.ListLastMonthInvoiceResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLastMonthInvoiceResponseUnmarshaller {

	public static ListLastMonthInvoiceResponse unmarshall(ListLastMonthInvoiceResponse listLastMonthInvoiceResponse, UnmarshallerContext _ctx) {
		
		listLastMonthInvoiceResponse.setRequestId(_ctx.stringValue("ListLastMonthInvoiceResponse.RequestId"));
		listLastMonthInvoiceResponse.setAmount(_ctx.stringValue("ListLastMonthInvoiceResponse.Amount"));
		listLastMonthInvoiceResponse.setCount(_ctx.integerValue("ListLastMonthInvoiceResponse.Count"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLastMonthInvoiceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAmount(_ctx.stringValue("ListLastMonthInvoiceResponse.Data["+ i +"].Amount"));
			dataItem.setDate(_ctx.stringValue("ListLastMonthInvoiceResponse.Data["+ i +"].Date"));
			dataItem.setId(_ctx.longValue("ListLastMonthInvoiceResponse.Data["+ i +"].Id"));
			dataItem.setIsSaveVoucher(_ctx.booleanValue("ListLastMonthInvoiceResponse.Data["+ i +"].IsSaveVoucher"));
			dataItem.setOrgName(_ctx.stringValue("ListLastMonthInvoiceResponse.Data["+ i +"].OrgName"));
			dataItem.setProductName(_ctx.stringValue("ListLastMonthInvoiceResponse.Data["+ i +"].ProductName"));
			dataItem.setTax(_ctx.stringValue("ListLastMonthInvoiceResponse.Data["+ i +"].Tax"));
			dataItem.setTaxAndAmount(_ctx.stringValue("ListLastMonthInvoiceResponse.Data["+ i +"].TaxAndAmount"));
			dataItem.setType(_ctx.stringValue("ListLastMonthInvoiceResponse.Data["+ i +"].Type"));
			dataItem.setUrl(_ctx.stringValue("ListLastMonthInvoiceResponse.Data["+ i +"].Url"));

			data.add(dataItem);
		}
		listLastMonthInvoiceResponse.setData(data);
	 
	 	return listLastMonthInvoiceResponse;
	}
}