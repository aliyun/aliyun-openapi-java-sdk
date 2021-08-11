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
		describeSplitItemBillResponse.setSuccess(_ctx.booleanValue("DescribeSplitItemBillResponse.Success"));
		describeSplitItemBillResponse.setCode(_ctx.stringValue("DescribeSplitItemBillResponse.Code"));
		describeSplitItemBillResponse.setMessage(_ctx.stringValue("DescribeSplitItemBillResponse.Message"));

		Data data = new Data();
		data.setBillingCycle(_ctx.stringValue("DescribeSplitItemBillResponse.Data.BillingCycle"));
		data.setAccountID(_ctx.stringValue("DescribeSplitItemBillResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("DescribeSplitItemBillResponse.Data.AccountName"));
		data.setTotalCount(_ctx.integerValue("DescribeSplitItemBillResponse.Data.TotalCount"));
		data.setNextToken(_ctx.stringValue("DescribeSplitItemBillResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("DescribeSplitItemBillResponse.Data.MaxResults"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSplitItemBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setInstanceID(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].InstanceID"));
			item.setBillingType(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].BillingType"));
			item.setCostUnit(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].CostUnit"));
			item.setProductCode(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductType(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ProductType"));
			item.setSubscriptionType(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setProductName(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetail(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ProductDetail"));
			item.setOwnerID(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setBillingItem(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].BillingItem"));
			item.setListPrice(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ListPrice"));
			item.setListPriceUnit(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ListPriceUnit"));
			item.setUsage(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].Usage"));
			item.setUsageUnit(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].UsageUnit"));
			item.setDeductedByResourcePackage(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].DeductedByResourcePackage"));
			item.setPretaxGrossAmount(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setDeductedByCoupons(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setPretaxAmount(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setDeductedByCashCoupons(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setPaymentAmount(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setOutstandingAmount(_ctx.floatValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setCurrency(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].Currency"));
			item.setNickName(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].NickName"));
			item.setResourceGroup(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ResourceGroup"));
			item.setTag(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].Tag"));
			item.setInstanceConfig(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].InstanceConfig"));
			item.setInstanceSpec(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].InstanceSpec"));
			item.setInternetIP(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].InternetIP"));
			item.setIntranetIP(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].IntranetIP"));
			item.setRegion(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].Region"));
			item.setZone(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].Zone"));
			item.setItem(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].Item"));
			item.setServicePeriod(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ServicePeriod"));
			item.setBillingDate(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].BillingDate"));
			item.setSplitItemID(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitItemID"));
			item.setSplitItemName(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitItemName"));
			item.setPipCode(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].PipCode"));
			item.setCommodityCode(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].CommodityCode"));
			item.setServicePeriodUnit(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].ServicePeriodUnit"));
			item.setSplitCommodityCode(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitCommodityCode"));
			item.setSplitProductDetail(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitProductDetail"));
			item.setSplitAccountID(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitAccountID"));
			item.setSplitAccountName(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitAccountName"));
			item.setSplitBillingCycle(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitBillingCycle"));
			item.setSplitBillingDate(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].SplitBillingDate"));
			item.setBizType(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].BizType"));
			item.setBillAccountID(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].BillAccountID"));
			item.setBillAccountName(_ctx.stringValue("DescribeSplitItemBillResponse.Data.Items["+ i +"].BillAccountName"));

			items.add(item);
		}
		data.setItems(items);
		describeSplitItemBillResponse.setData(data);
	 
	 	return describeSplitItemBillResponse;
	}
}