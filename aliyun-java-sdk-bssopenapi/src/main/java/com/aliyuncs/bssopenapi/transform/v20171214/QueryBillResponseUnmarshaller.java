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

import com.aliyuncs.bssopenapi.model.v20171214.QueryBillResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryBillResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryBillResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBillResponseUnmarshaller {

	public static QueryBillResponse unmarshall(QueryBillResponse queryBillResponse, UnmarshallerContext context) {
		
		queryBillResponse.setRequestId(context.stringValue("QueryBillResponse.RequestId"));
		queryBillResponse.setSuccess(context.booleanValue("QueryBillResponse.Success"));
		queryBillResponse.setCode(context.stringValue("QueryBillResponse.Code"));
		queryBillResponse.setMessage(context.stringValue("QueryBillResponse.Message"));

		Data data = new Data();
		data.setBillingCycle(context.stringValue("QueryBillResponse.Data.BillingCycle"));
		data.setAccountID(context.stringValue("QueryBillResponse.Data.AccountID"));
		data.setAccountName(context.stringValue("QueryBillResponse.Data.AccountName"));
		data.setPageNum(context.integerValue("QueryBillResponse.Data.PageNum"));
		data.setPageSize(context.integerValue("QueryBillResponse.Data.PageSize"));
		data.setTotalCount(context.integerValue("QueryBillResponse.Data.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("QueryBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setRecordID(context.stringValue("QueryBillResponse.Data.Items["+ i +"].RecordID"));
			item.setItem(context.stringValue("QueryBillResponse.Data.Items["+ i +"].Item"));
			item.setOwnerID(context.stringValue("QueryBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setUsageStartTime(context.stringValue("QueryBillResponse.Data.Items["+ i +"].UsageStartTime"));
			item.setUsageEndTime(context.stringValue("QueryBillResponse.Data.Items["+ i +"].UsageEndTime"));
			item.setPaymentTime(context.stringValue("QueryBillResponse.Data.Items["+ i +"].PaymentTime"));
			item.setProductCode(context.stringValue("QueryBillResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductType(context.stringValue("QueryBillResponse.Data.Items["+ i +"].ProductType"));
			item.setSubscriptionType(context.stringValue("QueryBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setProductName(context.stringValue("QueryBillResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetail(context.stringValue("QueryBillResponse.Data.Items["+ i +"].ProductDetail"));
			item.setPretaxGrossAmount(context.floatValue("QueryBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setDeductedByCoupons(context.floatValue("QueryBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setInvoiceDiscount(context.floatValue("QueryBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setPretaxAmount(context.floatValue("QueryBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setCurrency(context.stringValue("QueryBillResponse.Data.Items["+ i +"].Currency"));
			item.setPretaxAmountLocal(context.floatValue("QueryBillResponse.Data.Items["+ i +"].PretaxAmountLocal"));
			item.setTax(context.floatValue("QueryBillResponse.Data.Items["+ i +"].Tax"));
			item.setPaymentAmount(context.floatValue("QueryBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setDeductedByCashCoupons(context.floatValue("QueryBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByPrepaidCard(context.floatValue("QueryBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setOutstandingAmount(context.floatValue("QueryBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setAfterTaxAmount(context.floatValue("QueryBillResponse.Data.Items["+ i +"].AfterTaxAmount"));
			item.setStatus(context.stringValue("QueryBillResponse.Data.Items["+ i +"].Status"));
			item.setPaymentCurrency(context.stringValue("QueryBillResponse.Data.Items["+ i +"].PaymentCurrency"));
			item.setPaymentTransactionID(context.stringValue("QueryBillResponse.Data.Items["+ i +"].PaymentTransactionID"));

			items.add(item);
		}
		data.setItems(items);
		queryBillResponse.setData(data);
	 
	 	return queryBillResponse;
	}
}