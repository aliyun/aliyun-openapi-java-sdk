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

	public static QueryMonthlyBillResponse unmarshall(QueryMonthlyBillResponse queryMonthlyBillResponse, UnmarshallerContext _ctx) {
		
		queryMonthlyBillResponse.setRequestId(_ctx.stringValue("QueryMonthlyBillResponse.RequestId"));
		queryMonthlyBillResponse.setCode(_ctx.stringValue("QueryMonthlyBillResponse.Code"));
		queryMonthlyBillResponse.setMessage(_ctx.stringValue("QueryMonthlyBillResponse.Message"));
		queryMonthlyBillResponse.setSuccess(_ctx.booleanValue("QueryMonthlyBillResponse.Success"));

		Data data = new Data();
		data.setOutstandingAmount(_ctx.floatValue("QueryMonthlyBillResponse.Data.OutstandingAmount"));
		data.setBillingCycle(_ctx.stringValue("QueryMonthlyBillResponse.Data.BillingCycle"));
		data.setTotalOutstandingAmount(_ctx.floatValue("QueryMonthlyBillResponse.Data.TotalOutstandingAmount"));
		data.setNewInvoiceAmount(_ctx.floatValue("QueryMonthlyBillResponse.Data.NewInvoiceAmount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryMonthlyBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setPretaxAmount(_ctx.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setSolutionCode(_ctx.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].SolutionCode"));
			item.setItem(_ctx.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].Item"));
			item.setCurrency(_ctx.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].Currency"));
			item.setDeductedByCashCoupons(_ctx.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setSubscriptionType(_ctx.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setPaymentCurrency(_ctx.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].PaymentCurrency"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setDeductedByCoupons(_ctx.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setPaymentAmount(_ctx.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setInvoiceDiscount(_ctx.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setProductType(_ctx.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].ProductType"));
			item.setOutstandingAmount(_ctx.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setAfterTaxAmount(_ctx.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].AfterTaxAmount"));
			item.setPretaxGrossAmount(_ctx.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setSolutionName(_ctx.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].SolutionName"));
			item.setTax(_ctx.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].Tax"));
			item.setPretaxAmountLocal(_ctx.floatValue("QueryMonthlyBillResponse.Data.Items["+ i +"].PretaxAmountLocal"));
			item.setProductCode(_ctx.stringValue("QueryMonthlyBillResponse.Data.Items["+ i +"].ProductCode"));

			items.add(item);
		}
		data.setItems(items);
		queryMonthlyBillResponse.setData(data);
	 
	 	return queryMonthlyBillResponse;
	}
}