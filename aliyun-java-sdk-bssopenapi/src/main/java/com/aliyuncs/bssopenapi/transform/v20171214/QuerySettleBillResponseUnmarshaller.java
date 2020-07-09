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

import com.aliyuncs.bssopenapi.model.v20171214.QuerySettleBillResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySettleBillResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySettleBillResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySettleBillResponseUnmarshaller {

	public static QuerySettleBillResponse unmarshall(QuerySettleBillResponse querySettleBillResponse, UnmarshallerContext _ctx) {
		
		querySettleBillResponse.setRequestId(_ctx.stringValue("QuerySettleBillResponse.RequestId"));
		querySettleBillResponse.setSuccess(_ctx.booleanValue("QuerySettleBillResponse.Success"));
		querySettleBillResponse.setCode(_ctx.stringValue("QuerySettleBillResponse.Code"));
		querySettleBillResponse.setMessage(_ctx.stringValue("QuerySettleBillResponse.Message"));

		Data data = new Data();
		data.setBillingCycle(_ctx.stringValue("QuerySettleBillResponse.Data.BillingCycle"));
		data.setAccountID(_ctx.stringValue("QuerySettleBillResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("QuerySettleBillResponse.Data.AccountName"));
		data.setNextToken(_ctx.stringValue("QuerySettleBillResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("QuerySettleBillResponse.Data.MaxResults"));
		data.setTotalCount(_ctx.integerValue("QuerySettleBillResponse.Data.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QuerySettleBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setRecordID(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].RecordID"));
			item.setItem(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].Item"));
			item.setOwnerID(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setUsageStartTime(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].UsageStartTime"));
			item.setUsageEndTime(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].UsageEndTime"));
			item.setPaymentTime(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].PaymentTime"));
			item.setProductCode(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductType(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].ProductType"));
			item.setSubscriptionType(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setProductName(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetail(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].ProductDetail"));
			item.setPretaxGrossAmount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setDeductedByCoupons(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setInvoiceDiscount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setPretaxAmount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setCurrency(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].Currency"));
			item.setPretaxAmountLocal(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].PretaxAmountLocal"));
			item.setTax(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].Tax"));
			item.setPaymentAmount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setDeductedByCashCoupons(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setOutstandingAmount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setAfterTaxAmount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].AfterTaxAmount"));
			item.setStatus(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].Status"));
			item.setPaymentCurrency(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].PaymentCurrency"));
			item.setPaymentTransactionID(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].PaymentTransactionID"));
			item.setRoundDownDiscount(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].RoundDownDiscount"));
			item.setSubOrderId(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].SubOrderId"));

			items.add(item);
		}
		data.setItems(items);
		querySettleBillResponse.setData(data);
	 
	 	return querySettleBillResponse;
	}
}