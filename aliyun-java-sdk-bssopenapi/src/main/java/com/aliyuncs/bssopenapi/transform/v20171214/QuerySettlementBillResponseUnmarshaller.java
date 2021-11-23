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

import com.aliyuncs.bssopenapi.model.v20171214.QuerySettlementBillResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySettlementBillResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySettlementBillResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySettlementBillResponseUnmarshaller {

	public static QuerySettlementBillResponse unmarshall(QuerySettlementBillResponse querySettlementBillResponse, UnmarshallerContext _ctx) {
		
		querySettlementBillResponse.setRequestId(_ctx.stringValue("QuerySettlementBillResponse.RequestId"));
		querySettlementBillResponse.setCode(_ctx.stringValue("QuerySettlementBillResponse.Code"));
		querySettlementBillResponse.setMessage(_ctx.stringValue("QuerySettlementBillResponse.Message"));
		querySettlementBillResponse.setSuccess(_ctx.booleanValue("QuerySettlementBillResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("QuerySettlementBillResponse.Data.PageNum"));
		data.setBillingCycle(_ctx.stringValue("QuerySettlementBillResponse.Data.BillingCycle"));
		data.setPageSize(_ctx.integerValue("QuerySettlementBillResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QuerySettlementBillResponse.Data.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QuerySettlementBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setStatus(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Status"));
			item.setInvoiceNo(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].InvoiceNo"));
			item.setBillID(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].BillID"));
			item.setCreateTime(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].CreateTime"));
			item.setItem(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Item"));
			item.setSeller(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Seller"));
			item.setCurrency(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Currency"));
			item.setChargeDiscount(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].ChargeDiscount"));
			item.setDeductedByCashCoupons(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setConfig(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Config"));
			item.setSubscriptionType(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setUsageStartTime(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].UsageStartTime"));
			item.setUsageEndTime(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].UsageEndTime"));
			item.setDeductedByCoupons(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setRegion(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Region"));
			item.setOutstandingAmount(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setAfterTaxAmount(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].AfterTaxAmount"));
			item.setPaymentTime(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].PaymentTime"));
			item.setSolutionID(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].SolutionID"));
			item.setOrderType(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].OrderType"));
			item.setClearedTime(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].ClearedTime"));
			item.setQuantity(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Quantity"));
			item.setTax(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].Tax"));
			item.setPretaxAmountLocal(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].PretaxAmountLocal"));
			item.setPretaxAmount(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setLinkedCustomerOrderID(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].LinkedCustomerOrderID"));
			item.setAccountDiscount(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].AccountDiscount"));
			item.setRecordID(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].RecordID"));
			item.setPayerAccount(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].PayerAccount"));
			item.setPromotion(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Promotion"));
			item.setOriginalOrderID(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].OriginalOrderID"));
			item.setPreviousBillingCycleBalance(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].PreviousBillingCycleBalance"));
			item.setMybankPaymentAmount(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].MybankPaymentAmount"));
			item.setPaymentCurrency(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].PaymentCurrency"));
			item.setOrderID(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].OrderID"));
			item.setOwnerID(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setPaymentAmount(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setProductType(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].ProductType"));
			item.setPretaxGrossAmount(_ctx.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setSuborderID(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].SuborderID"));
			item.setSolutionName(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].SolutionName"));
			item.setProductCode(_ctx.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].ProductCode"));

			items.add(item);
		}
		data.setItems(items);
		querySettlementBillResponse.setData(data);
	 
	 	return querySettlementBillResponse;
	}
}