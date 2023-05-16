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

import com.aliyuncs.agency.model.v20180703.GetMonthBillListResponse;
import com.aliyuncs.agency.model.v20180703.GetMonthBillListResponse.BigBillJson;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMonthBillListResponseUnmarshaller {

	public static GetMonthBillListResponse unmarshall(GetMonthBillListResponse getMonthBillListResponse, UnmarshallerContext _ctx) {
		
		getMonthBillListResponse.setCode(_ctx.stringValue("GetMonthBillListResponse.Code"));
		getMonthBillListResponse.setMessage(_ctx.stringValue("GetMonthBillListResponse.Message"));
		getMonthBillListResponse.setSuccess(_ctx.booleanValue("GetMonthBillListResponse.Success"));

		BigBillJson bigBillJson = new BigBillJson();
		bigBillJson.setUserType(_ctx.stringValue("GetMonthBillListResponse.BigBillJson.UserType"));
		bigBillJson.setRefundInvoiceLink(_ctx.stringValue("GetMonthBillListResponse.BigBillJson.RefundInvoiceLink"));
		bigBillJson.setProductType(_ctx.stringValue("GetMonthBillListResponse.BigBillJson.ProductType"));
		bigBillJson.setBillType(_ctx.stringValue("GetMonthBillListResponse.BigBillJson.BillType"));
		bigBillJson.setInvoiceLink(_ctx.stringValue("GetMonthBillListResponse.BigBillJson.InvoiceLink"));
		bigBillJson.setBillLinkCSV(_ctx.stringValue("GetMonthBillListResponse.BigBillJson.BillLinkCSV"));
		bigBillJson.setRefundInvoiceFlag(_ctx.booleanValue("GetMonthBillListResponse.BigBillJson.RefundInvoiceFlag"));
		bigBillJson.setBillTime(_ctx.stringValue("GetMonthBillListResponse.BigBillJson.BillTime"));
		bigBillJson.setBillLinkXLSX(_ctx.stringValue("GetMonthBillListResponse.BigBillJson.BillLinkXLSX"));
		getMonthBillListResponse.setBigBillJson(bigBillJson);
	 
	 	return getMonthBillListResponse;
	}
}