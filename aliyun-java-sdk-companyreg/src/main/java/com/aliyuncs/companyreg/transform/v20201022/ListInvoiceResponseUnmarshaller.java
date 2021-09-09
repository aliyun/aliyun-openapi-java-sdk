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

import com.aliyuncs.companyreg.model.v20201022.ListInvoiceResponse;
import com.aliyuncs.companyreg.model.v20201022.ListInvoiceResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInvoiceResponseUnmarshaller {

	public static ListInvoiceResponse unmarshall(ListInvoiceResponse listInvoiceResponse, UnmarshallerContext _ctx) {
		
		listInvoiceResponse.setRequestId(_ctx.stringValue("ListInvoiceResponse.RequestId"));
		listInvoiceResponse.setAmount(_ctx.stringValue("ListInvoiceResponse.Amount"));
		listInvoiceResponse.setCount(_ctx.integerValue("ListInvoiceResponse.Count"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInvoiceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAmount(_ctx.stringValue("ListInvoiceResponse.Data["+ i +"].Amount"));
			dataItem.setDate(_ctx.stringValue("ListInvoiceResponse.Data["+ i +"].Date"));
			dataItem.setId(_ctx.longValue("ListInvoiceResponse.Data["+ i +"].Id"));
			dataItem.setInvoiceNo(_ctx.stringValue("ListInvoiceResponse.Data["+ i +"].InvoiceNo"));
			dataItem.setIsSaveVoucher(_ctx.booleanValue("ListInvoiceResponse.Data["+ i +"].IsSaveVoucher"));
			dataItem.setOrgName(_ctx.stringValue("ListInvoiceResponse.Data["+ i +"].OrgName"));
			dataItem.setProductName(_ctx.stringValue("ListInvoiceResponse.Data["+ i +"].ProductName"));
			dataItem.setTax(_ctx.stringValue("ListInvoiceResponse.Data["+ i +"].Tax"));
			dataItem.setTaxAndAmount(_ctx.stringValue("ListInvoiceResponse.Data["+ i +"].TaxAndAmount"));
			dataItem.setType(_ctx.stringValue("ListInvoiceResponse.Data["+ i +"].Type"));
			dataItem.setUrl(_ctx.stringValue("ListInvoiceResponse.Data["+ i +"].Url"));
			dataItem.setUse(_ctx.booleanValue("ListInvoiceResponse.Data["+ i +"].Use"));

			data.add(dataItem);
		}
		listInvoiceResponse.setData(data);
	 
	 	return listInvoiceResponse;
	}
}