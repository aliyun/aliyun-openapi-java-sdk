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

	public static QueryBillOverviewResponse unmarshall(QueryBillOverviewResponse queryBillOverviewResponse, UnmarshallerContext context) {
		
		queryBillOverviewResponse.setRequestId(context.stringValue("QueryBillOverviewResponse.RequestId"));
		queryBillOverviewResponse.setSuccess(context.booleanValue("QueryBillOverviewResponse.Success"));
		queryBillOverviewResponse.setCode(context.stringValue("QueryBillOverviewResponse.Code"));
		queryBillOverviewResponse.setMessage(context.stringValue("QueryBillOverviewResponse.Message"));

		Data data = new Data();
		data.setBillingCycle(context.stringValue("QueryBillOverviewResponse.Data.BillingCycle"));
		data.setAccountID(context.stringValue("QueryBillOverviewResponse.Data.AccountID"));
		data.setAccountName(context.stringValue("QueryBillOverviewResponse.Data.AccountName"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("QueryBillOverviewResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setItem(context.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].Item"));
			item.setProductCode(context.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductType(context.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].ProductType"));
			item.setSubscriptionType(context.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setProductName(context.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetail(context.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].ProductDetail"));
			item.setPretaxGrossAmount(context.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(context.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setDeductedByCoupons(context.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setPretaxAmount(context.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setCurrency(context.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].Currency"));
			item.setPaymentAmount(context.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setOutstandingAmount(context.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setDeductedByCashCoupons(context.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByPrepaidCard(context.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setPretaxAmountLocal(context.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].PretaxAmountLocal"));
			item.setTax(context.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].Tax"));
			item.setAfterTaxAmount(context.floatValue("QueryBillOverviewResponse.Data.Items["+ i +"].AfterTaxAmount"));
			item.setPaymentCurrency(context.stringValue("QueryBillOverviewResponse.Data.Items["+ i +"].PaymentCurrency"));

			items.add(item);
		}
		data.setItems(items);
		queryBillOverviewResponse.setData(data);
	 
	 	return queryBillOverviewResponse;
	}
}