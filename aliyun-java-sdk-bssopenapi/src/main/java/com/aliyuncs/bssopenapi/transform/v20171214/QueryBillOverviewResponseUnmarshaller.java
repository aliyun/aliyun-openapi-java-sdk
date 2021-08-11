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

import com.aliyuncs.bssopenapi.model.v20171214.QueryBillOverviewResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryBillOverviewResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryBillOverviewResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBillOverviewResponseUnmarshaller {

	public static QueryBillOverviewResponse unmarshall(QueryBillOverviewResponse queryBillOverviewResponse, UnmarshallerContext _ctx) {
		
		queryBillOverviewResponse.setRequestId(_ctx.stringValue("QueryBillOverviewResponse.RequestId"));
		queryBillOverviewResponse.setSuccess(_ctx.booleanValue("QueryBillOverviewResponse.Success"));
		queryBillOverviewResponse.setCode(_ctx.stringValue("QueryBillOverviewResponse.Code"));
		queryBillOverviewResponse.setMessage(_ctx.stringValue("QueryBillOverviewResponse.Message"));

		Data data = new Data();
		data.setBillingCycle(_ctx.stringValue("QueryBillOverviewResponse.Data.BillingCycle"));
		data.setAccountID(_ctx.stringValue("QueryBillOverviewResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("QueryBillOverviewResponse.Data.AccountName"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryBillOverviewResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setItem(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].Item"));
			item.setProductCode(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductType(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].ProductType"));
			item.setSubscriptionType(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setProductName(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetail(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].ProductDetail"));
			item.setPretaxGrossAmount(_ctx.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(_ctx.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setDeductedByCoupons(_ctx.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setPretaxAmount(_ctx.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setCurrency(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].Currency"));
			item.setPaymentAmount(_ctx.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setOutstandingAmount(_ctx.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setDeductedByCashCoupons(_ctx.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setPretaxAmountLocal(_ctx.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].PretaxAmountLocal"));
			item.setTax(_ctx.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].Tax"));
			item.setAfterTaxAmount(_ctx.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].AfterTaxAmount"));
			item.setPaymentCurrency(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].PaymentCurrency"));
			item.setRoundDownDiscount(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].RoundDownDiscount"));
			item.setPipCode(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].PipCode"));
			item.setCommodityCode(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].CommodityCode"));
			item.setBillAccountID(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].BillAccountID"));
			item.setBillAccountName(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].BillAccountName"));
			item.setBizType(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].BizType"));
			item.setOwnerID(_ctx.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].OwnerID"));

			items.add(item);
		}
		data.setItems(items);
		queryBillOverviewResponse.setData(data);
	 
	 	return queryBillOverviewResponse;
	}
}