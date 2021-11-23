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
		queryBillResponse.setCode(_ctx.stringValue("QueryBillResponse.Code"));
		queryBillResponse.setMessage(_ctx.stringValue("QueryBillResponse.Message"));
		queryBillResponse.setSuccess(_ctx.booleanValue("QueryBillResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("QueryBillResponse.Data.PageNum"));
		data.setBillingCycle(_ctx.stringValue("QueryBillResponse.Data.BillingCycle"));
		data.setAccountID(_ctx.stringValue("QueryBillResponse.Data.AccountID"));
		data.setPageSize(_ctx.integerValue("QueryBillResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QueryBillResponse.Data.TotalCount"));
		data.setAccountName(_ctx.stringValue("QueryBillResponse.Data.AccountName"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setStatus(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].Status"));
			item.setRoundDownDiscount(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].RoundDownDiscount"));
			item.setItem(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].Item"));
			item.setCurrency(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].Currency"));
			item.setUsageStartTime(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].UsageStartTime"));
			item.setSubscriptionType(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setDeductedByCashCoupons(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setUsageEndTime(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].UsageEndTime"));
			item.setDeductedByCoupons(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setSubOrderId(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].SubOrderId"));
			item.setOutstandingAmount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setAfterTaxAmount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].AfterTaxAmount"));
			item.setPaymentTime(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].PaymentTime"));
			item.setPretaxAmountLocal(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].PretaxAmountLocal"));
			item.setTax(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].Tax"));
			item.setPipCode(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].PipCode"));
			item.setPaymentTransactionID(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].PaymentTransactionID"));
			item.setPretaxAmount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setCommodityCode(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].CommodityCode"));
			item.setProductName(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].ProductName"));
			item.setRecordID(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].RecordID"));
			item.setAdjustAmount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].AdjustAmount"));
			item.setProductDetail(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].ProductDetail"));
			item.setPaymentCurrency(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].PaymentCurrency"));
			item.setOwnerID(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setProductType(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].ProductType"));
			item.setInvoiceDiscount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setPaymentAmount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setPretaxGrossAmount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setCashAmount(_ctx.floatValue("QueryBillResponse.Data.Items["+ i +"].CashAmount"));
			item.setProductCode(_ctx.stringValue("QueryBillResponse.Data.Items["+ i +"].ProductCode"));

			items.add(item);
		}
		data.setItems(items);
		queryBillResponse.setData(data);
	 
	 	return queryBillResponse;
	}
}