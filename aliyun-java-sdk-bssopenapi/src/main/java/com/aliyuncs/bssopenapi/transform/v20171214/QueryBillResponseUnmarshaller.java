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

	public static QueryBillResponse unmarshall(QueryBillResponse queryBillResponse, UnmarshallerContext _ctx) {
		
		queryBillResponse.setRequestId(_ctx.stringValue("QueryBillResponse.RequestId"));
		queryBillResponse.setSuccess(_ctx.booleanValue("QueryBillResponse.Success"));
		queryBillResponse.setCode(_ctx.stringValue("QueryBillResponse.Code"));
		queryBillResponse.setMessage(_ctx.stringValue("QueryBillResponse.Message"));

		Data data = new Data();
		data.setBillingCycle(_ctx.stringValue("QueryBillResponse.Data.BillingCycle"));
		data.setAccountID(_ctx.stringValue("QueryBillResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("QueryBillResponse.Data.AccountName"));
		data.setPageNum(_ctx.integerValue("QueryBillResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryBillResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QueryBillResponse.Data.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setRecordID(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].RecordID"));
			item.setItem(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].Item"));
			item.setOwnerID(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setUsageStartTime(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].UsageStartTime"));
			item.setUsageEndTime(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].UsageEndTime"));
			item.setPaymentTime(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].PaymentTime"));
			item.setProductCode(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductType(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].ProductType"));
			item.setSubscriptionType(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setProductName(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetail(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].ProductDetail"));
			item.setPretaxGrossAmount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setDeductedByCoupons(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setInvoiceDiscount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setPretaxAmount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setCurrency(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].Currency"));
			item.setPretaxAmountLocal(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].PretaxAmountLocal"));
			item.setTax(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].Tax"));
			item.setPaymentAmount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setDeductedByCashCoupons(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setOutstandingAmount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setAfterTaxAmount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].AfterTaxAmount"));
			item.setStatus(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].Status"));
			item.setPaymentCurrency(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].PaymentCurrency"));
			item.setPaymentTransactionID(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].PaymentTransactionID"));
			item.setRoundDownDiscount(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].RoundDownDiscount"));
			item.setSubOrderId(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].SubOrderId"));
			item.setPipCode(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].PipCode"));
			item.setCommodityCode(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].CommodityCode"));

			items.add(item);
		}
		data.setItems(items);
		queryBillResponse.setData(data);
	 
	 	return queryBillResponse;
	}
}