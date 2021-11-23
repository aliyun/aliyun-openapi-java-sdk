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

import com.aliyuncs.bssopenapi.model.v20171214.QuerySplitItemBillResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySplitItemBillResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySplitItemBillResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySplitItemBillResponseUnmarshaller {

	public static QuerySplitItemBillResponse unmarshall(QuerySplitItemBillResponse querySplitItemBillResponse, UnmarshallerContext _ctx) {
		
		querySplitItemBillResponse.setRequestId(_ctx.stringValue("QuerySplitItemBillResponse.RequestId"));
		querySplitItemBillResponse.setCode(_ctx.stringValue("QuerySplitItemBillResponse.Code"));
		querySplitItemBillResponse.setMessage(_ctx.stringValue("QuerySplitItemBillResponse.Message"));
		querySplitItemBillResponse.setSuccess(_ctx.booleanValue("QuerySplitItemBillResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("QuerySplitItemBillResponse.Data.PageNum"));
		data.setBillingCycle(_ctx.stringValue("QuerySplitItemBillResponse.Data.BillingCycle"));
		data.setAccountID(_ctx.stringValue("QuerySplitItemBillResponse.Data.AccountID"));
		data.setPageSize(_ctx.integerValue("QuerySplitItemBillResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QuerySplitItemBillResponse.Data.TotalCount"));
		data.setAccountName(_ctx.stringValue("QuerySplitItemBillResponse.Data.AccountName"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QuerySplitItemBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setSplitAccountID(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].SplitAccountID"));
			item.setSubscriptionType(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setInstanceSpec(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].InstanceSpec"));
			item.setDeductedByCoupons(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setRegion(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].Region"));
			item.setOutstandingAmount(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setPipCode(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].PipCode"));
			item.setCommodityCode(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].CommodityCode"));
			item.setNickName(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].NickName"));
			item.setProductDetail(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ProductDetail"));
			item.setUsage(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].Usage"));
			item.setIntranetIP(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].IntranetIP"));
			item.setUsageUnit(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].UsageUnit"));
			item.setSplitCommodityCode(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].SplitCommodityCode"));
			item.setProductType(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ProductType"));
			item.setDeductedByResourcePackage(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].DeductedByResourcePackage"));
			item.setPaymentAmount(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setSplitBillingCycle(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].SplitBillingCycle"));
			item.setServicePeriod(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ServicePeriod"));
			item.setSplitItemName(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].SplitItemName"));
			item.setListPrice(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ListPrice"));
			item.setZone(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].Zone"));
			item.setPretaxGrossAmount(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setCashAmount(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].CashAmount"));
			item.setInstanceConfig(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].InstanceConfig"));
			item.setBillingDate(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].BillingDate"));
			item.setInternetIP(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].InternetIP"));
			item.setItem(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].Item"));
			item.setSplitItemID(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].SplitItemID"));
			item.setInstanceID(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].InstanceID"));
			item.setTag(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].Tag"));
			item.setCurrency(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].Currency"));
			item.setDeductedByCashCoupons(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setBillingItem(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].BillingItem"));
			item.setCostUnit(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].CostUnit"));
			item.setListPriceUnit(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ListPriceUnit"));
			item.setResourceGroup(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ResourceGroup"));
			item.setPretaxAmount(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setServicePeriodUnit(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ServicePeriodUnit"));
			item.setProductName(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ProductName"));
			item.setSplitProductDetail(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].SplitProductDetail"));
			item.setAdjustAmount(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].AdjustAmount"));
			item.setOwnerID(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setInvoiceDiscount(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setSplitAccountName(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].SplitAccountName"));
			item.setBillingType(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].BillingType"));
			item.setProductCode(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ProductCode"));

			items.add(item);
		}
		data.setItems(items);
		querySplitItemBillResponse.setData(data);
	 
	 	return querySplitItemBillResponse;
	}
}