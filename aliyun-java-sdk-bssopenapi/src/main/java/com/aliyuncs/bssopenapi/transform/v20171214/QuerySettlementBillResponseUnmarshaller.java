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

	public static QuerySettlementBillResponse unmarshall(QuerySettlementBillResponse querySettlementBillResponse, UnmarshallerContext context) {
		
		querySettlementBillResponse.setRequestId(context.stringValue("QuerySettlementBillResponse.RequestId"));
		querySettlementBillResponse.setSuccess(context.booleanValue("QuerySettlementBillResponse.Success"));
		querySettlementBillResponse.setCode(context.stringValue("QuerySettlementBillResponse.Code"));
		querySettlementBillResponse.setMessage(context.stringValue("QuerySettlementBillResponse.Message"));

		Data data = new Data();
		data.setPageNum(context.integerValue("QuerySettlementBillResponse.Data.PageNum"));
		data.setPageSize(context.integerValue("QuerySettlementBillResponse.Data.PageSize"));
		data.setTotalCount(context.integerValue("QuerySettlementBillResponse.Data.TotalCount"));
		data.setBillingCycle(context.stringValue("QuerySettlementBillResponse.Data.BillingCycle"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("QuerySettlementBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setRecordID(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].RecordID"));
			item.setItem(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Item"));
			item.setPayerAccount(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].PayerAccount"));
			item.setOwnerID(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setCreateTime(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].CreateTime"));
			item.setUsageStartTime(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].UsageStartTime"));
			item.setUsageEndTime(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].UsageEndTime"));
			item.setSuborderID(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].SuborderID"));
			item.setOrderID(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].OrderID"));
			item.setOrderType(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].OrderType"));
			item.setLinkedCustomerOrderID(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].LinkedCustomerOrderID"));
			item.setOriginalOrderID(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].OriginalOrderID"));
			item.setPaymentTime(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].PaymentTime"));
			item.setSolutionID(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].SolutionID"));
			item.setSolutionName(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].SolutionName"));
			item.setBillID(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].BillID"));
			item.setProductCode(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductType(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].ProductType"));
			item.setSubscriptionType(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setRegion(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Region"));
			item.setConfig(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Config"));
			item.setQuantity(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Quantity"));
			item.setPretaxGrossAmount(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setChargeDiscount(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].ChargeDiscount"));
			item.setDeductedByCoupons(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setAccountDiscount(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].AccountDiscount"));
			item.setPromotion(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Promotion"));
			item.setPretaxAmount(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setCurrency(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Currency"));
			item.setPretaxAmountLocal(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].PretaxAmountLocal"));
			item.setPreviousBillingCycleBalance(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].PreviousBillingCycleBalance"));
			item.setTax(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].Tax"));
			item.setAfterTaxAmount(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].AfterTaxAmount"));
			item.setStatus(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Status"));
			item.setClearedTime(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].ClearedTime"));
			item.setOutstandingAmount(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setDeductedByCashCoupons(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByPrepaidCard(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setMybankPaymentAmount(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].MybankPaymentAmount"));
			item.setPaymentAmount(context.floatValue("QuerySettlementBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setPaymentCurrency(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].PaymentCurrency"));
			item.setSeller(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].Seller"));
			item.setInvoiceNo(context.stringValue("QuerySettlementBillResponse.Data.Items["+ i +"].InvoiceNo"));

			items.add(item);
		}
		data.setItems(items);
		querySettlementBillResponse.setData(data);
	 
	 	return querySettlementBillResponse;
	}
}