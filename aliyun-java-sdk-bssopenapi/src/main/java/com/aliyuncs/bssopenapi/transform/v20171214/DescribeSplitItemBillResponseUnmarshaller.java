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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeSplitItemBillResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeSplitItemBillResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeSplitItemBillResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSplitItemBillResponseUnmarshaller {

	public static DescribeSplitItemBillResponse unmarshall(DescribeSplitItemBillResponse describeSplitItemBillResponse, UnmarshallerContext _ctx) {
		
		describeSplitItemBillResponse.setRequestId(_ctx.stringValue("DescribeSplitItemBillResponse.RequestId"));
		describeSplitItemBillResponse.setCode(_ctx.stringValue("DescribeSplitItemBillResponse.Code"));
		describeSplitItemBillResponse.setMessage(_ctx.stringValue("DescribeSplitItemBillResponse.Message"));
		describeSplitItemBillResponse.setSuccess(_ctx.booleanValue("DescribeSplitItemBillResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("DescribeSplitItemBillResponse.Data.NextToken"));
		data.setBillingCycle(_ctx.stringValue("DescribeSplitItemBillResponse.Data.BillingCycle"));
		data.setMaxResults(_ctx.integerValue("DescribeSplitItemBillResponse.Data.MaxResults"));
		data.setAccountID(_ctx.stringValue("DescribeSplitItemBillResponse.Data.AccountID"));
		data.setTotalCount(_ctx.integerValue("DescribeSplitItemBillResponse.Data.TotalCount"));
		data.setAccountName(_ctx.stringValue("DescribeSplitItemBillResponse.Data.AccountName"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSplitItemBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setSplitAccountID(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitAccountID"));
			item.setBillAccountName(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].BillAccountName"));
			item.setSubscriptionType(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setInstanceSpec(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].InstanceSpec"));
			item.setDeductedByCoupons(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setRegion(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].Region"));
			item.setOutstandingAmount(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setPipCode(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].PipCode"));
			item.setCommodityCode(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].CommodityCode"));
			item.setNickName(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].NickName"));
			item.setProductDetail(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ProductDetail"));
			item.setUsage(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].Usage"));
			item.setIntranetIP(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].IntranetIP"));
			item.setUsageUnit(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].UsageUnit"));
			item.setSplitCommodityCode(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitCommodityCode"));
			item.setBillAccountID(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].BillAccountID"));
			item.setProductType(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ProductType"));
			item.setDeductedByResourcePackage(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].DeductedByResourcePackage"));
			item.setPaymentAmount(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setSplitBillingCycle(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitBillingCycle"));
			item.setServicePeriod(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ServicePeriod"));
			item.setSplitItemName(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitItemName"));
			item.setListPrice(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ListPrice"));
			item.setZone(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].Zone"));
			item.setPretaxGrossAmount(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setCashAmount(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].CashAmount"));
			item.setInstanceConfig(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].InstanceConfig"));
			item.setBillingDate(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].BillingDate"));
			item.setInternetIP(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].InternetIP"));
			item.setItem(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].Item"));
			item.setSplitItemID(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitItemID"));
			item.setInstanceID(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].InstanceID"));
			item.setTag(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].Tag"));
			item.setCurrency(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].Currency"));
			item.setDeductedByCashCoupons(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setBizType(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].BizType"));
			item.setBillingItem(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].BillingItem"));
			item.setBillingItemCode(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].BillingItemCode"));
			item.setCostUnit(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].CostUnit"));
			item.setListPriceUnit(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ListPriceUnit"));
			item.setResourceGroup(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ResourceGroup"));
			item.setPretaxAmount(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setServicePeriodUnit(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ServicePeriodUnit"));
			item.setSplitBillingDate(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitBillingDate"));
			item.setProductName(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ProductName"));
			item.setSplitProductDetail(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitProductDetail"));
			item.setAdjustAmount(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].AdjustAmount"));
			item.setOwnerID(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setInvoiceDiscount(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setSplitAccountName(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitAccountName"));
			item.setBillingType(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].BillingType"));
			item.setProductCode(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ProductCode"));
			item.setItemName(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ItemName"));

			items.add(item);
		}
		data.setItems(items);
		describeSplitItemBillResponse.setData(data);
	 
	 	return describeSplitItemBillResponse;
	}
}