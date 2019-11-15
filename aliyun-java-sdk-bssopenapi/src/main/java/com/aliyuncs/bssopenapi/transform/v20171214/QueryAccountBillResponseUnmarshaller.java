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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryAccountBillResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryAccountBillResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryAccountBillResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccountBillResponseUnmarshaller {

	public static QueryAccountBillResponse unmarshall(QueryAccountBillResponse queryAccountBillResponse, UnmarshallerContext _ctx) {
		
		queryAccountBillResponse.setRequestId(_ctx.stringValue("QueryAccountBillResponse.RequestId"));
		queryAccountBillResponse.setSuccess(_ctx.booleanValue("QueryAccountBillResponse.Success"));
		queryAccountBillResponse.setCode(_ctx.stringValue("QueryAccountBillResponse.Code"));
		queryAccountBillResponse.setMessage(_ctx.stringValue("QueryAccountBillResponse.Message"));

		Data data = new Data();
		data.setBillingCycle(_ctx.stringValue("QueryAccountBillResponse.Data.BillingCycle"));
		data.setAccountID(_ctx.stringValue("QueryAccountBillResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("QueryAccountBillResponse.Data.AccountName"));
		data.setTotalCount(_ctx.integerValue("QueryAccountBillResponse.Data.TotalCount"));
		data.setPageNum(_ctx.integerValue("QueryAccountBillResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryAccountBillResponse.Data.PageSize"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryAccountBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setCostUnit(_ctx.stringValue("QueryAccountBillResponse.Data.Items["+ i +"].CostUnit"));
			item.setOwnerID(_ctx.stringValue("QueryAccountBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setPretaxGrossAmount(_ctx.floatValue("QueryAccountBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(_ctx.floatValue("QueryAccountBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setDeductedByCoupons(_ctx.floatValue("QueryAccountBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setPretaxAmount(_ctx.floatValue("QueryAccountBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setDeductedByCashCoupons(_ctx.floatValue("QueryAccountBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("QueryAccountBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setPaymentAmount(_ctx.floatValue("QueryAccountBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setOutstandingAmount(_ctx.floatValue("QueryAccountBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setCurrency(_ctx.stringValue("QueryAccountBillResponse.Data.Items["+ i +"].Currency"));
			item.setOwnerName(_ctx.stringValue("QueryAccountBillResponse.Data.Items["+ i +"].OwnerName"));
			item.setProductCode(_ctx.stringValue("QueryAccountBillResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductName(_ctx.stringValue("QueryAccountBillResponse.Data.Items["+ i +"].ProductName"));
			item.setSubscriptionType(_ctx.stringValue("QueryAccountBillResponse.Data.Items["+ i +"].SubscriptionType"));

			items.add(item);
		}
		data.setItems(items);
		queryAccountBillResponse.setData(data);
	 
	 	return queryAccountBillResponse;
	}
}