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
		querySettleBillResponse.setCode(_ctx.stringValue("QuerySettleBillResponse.Code"));
		querySettleBillResponse.setMessage(_ctx.stringValue("QuerySettleBillResponse.Message"));
		querySettleBillResponse.setSuccess(_ctx.booleanValue("QuerySettleBillResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("QuerySettleBillResponse.Data.NextToken"));
		data.setBillingCycle(_ctx.stringValue("QuerySettleBillResponse.Data.BillingCycle"));
		data.setMaxResults(_ctx.integerValue("QuerySettleBillResponse.Data.MaxResults"));
		data.setAccountID(_ctx.stringValue("QuerySettleBillResponse.Data.AccountID"));
		data.setTotalCount(_ctx.integerValue("QuerySettleBillResponse.Data.TotalCount"));
		data.setAccountName(_ctx.stringValue("QuerySettleBillResponse.Data.AccountName"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QuerySettleBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setStatus(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].Status"));
			item.setRoundDownDiscount(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].RoundDownDiscount"));
			item.setItem(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].Item"));
			item.setCurrency(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].Currency"));
			item.setBillAccountName(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].BillAccountName"));
			item.setDeductedByCashCoupons(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setSubscriptionType(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setUsageStartTime(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].UsageStartTime"));
			item.setBizType(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].BizType"));
			item.setUsageEndTime(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].UsageEndTime"));
			item.setDeductedByCoupons(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setSubOrderId(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].SubOrderId"));
			item.setAfterTaxAmount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].AfterTaxAmount"));
			item.setOutstandingAmount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setPaymentTime(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].PaymentTime"));
			item.setTax(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].Tax"));
			item.setPretaxAmountLocal(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].PretaxAmountLocal"));
			item.setPipCode(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].PipCode"));
			item.setPaymentTransactionID(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].PaymentTransactionID"));
			item.setPretaxAmount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setCommodityCode(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].CommodityCode"));
			item.setProductName(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].ProductName"));
			item.setRecordID(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].RecordID"));
			item.setAdjustAmount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].AdjustAmount"));
			item.setProductDetail(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].ProductDetail"));
			item.setPaymentCurrency(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].PaymentCurrency"));
			item.setOwnerID(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setBillAccountID(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].BillAccountID"));
			item.setPaymentAmount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setInvoiceDiscount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setProductType(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].ProductType"));
			item.setPretaxGrossAmount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setCashAmount(_ctx.floatValue("QuerySettleBillResponse.Data.Items["+ i +"].CashAmount"));
			item.setProductCode(_ctx.stringValue("QuerySettleBillResponse.Data.Items["+ i +"].ProductCode"));

			items.add(item);
		}
		data.setItems(items);
		querySettleBillResponse.setData(data);
	 
	 	return querySettleBillResponse;
	}
}