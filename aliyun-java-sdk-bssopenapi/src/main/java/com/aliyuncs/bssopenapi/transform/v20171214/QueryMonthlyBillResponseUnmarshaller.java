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

import com.aliyuncs.bssopenapi.model.v20171214.QueryMonthlyBillResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryMonthlyBillResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryMonthlyBillResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMonthlyBillResponseUnmarshaller {

	public static QueryMonthlyBillResponse unmarshall(QueryMonthlyBillResponse queryMonthlyBillResponse, UnmarshallerContext context) {
		
		queryMonthlyBillResponse.setRequestId(context.stringValue("QueryMonthlyBillResponse.RequestId"));
		queryMonthlyBillResponse.setSuccess(context.booleanValue("QueryMonthlyBillResponse.Success"));
		queryMonthlyBillResponse.setCode(context.stringValue("QueryMonthlyBillResponse.Code"));
		queryMonthlyBillResponse.setMessage(context.stringValue("QueryMonthlyBillResponse.Message"));

		Data data = new Data();
		data.setOutstandingAmount(context.floatValue("QueryMonthlyBillResponse.Data.OutstandingAmount"));
		data.setTotalOutstandingAmount(context.floatValue("QueryMonthlyBillResponse.Data.TotalOutstandingAmount"));
		data.setNewInvoiceAmount(context.floatValue("QueryMonthlyBillResponse.Data.NewInvoiceAmount"));
		data.setBillingCycle(context.stringValue("QueryMonthlyBillResponse.Data.BillingCycle"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("QueryMonthlyBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setItem(context.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].Item"));
			item.setProductCode(context.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductType(context.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].ProductType"));
			item.setSubscriptionType(context.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setSolutionCode(context.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].SolutionCode"));
			item.setSolutionName(context.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].SolutionName"));
			item.setPretaxGrossAmount(context.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(context.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setDeductedByCoupons(context.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setPretaxAmount(context.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setCurrency(context.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].Currency"));
			item.setPretaxAmountLocal(context.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].PretaxAmountLocal"));
			item.setTax(context.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].Tax"));
			item.setAfterTaxAmount(context.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].AfterTaxAmount"));
			item.setOutstandingAmount(context.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setDeductedByCashCoupons(context.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByPrepaidCard(context.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setPaymentAmount(context.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setPaymentCurrency(context.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].PaymentCurrency"));

			items.add(item);
		}
		data.setItems(items);
		queryMonthlyBillResponse.setData(data);
	 
	 	return queryMonthlyBillResponse;
	}
}