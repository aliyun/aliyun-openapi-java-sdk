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
		querySplitItemBillResponse.setSuccess(_ctx.booleanValue("QuerySplitItemBillResponse.Success"));
		querySplitItemBillResponse.setCode(_ctx.stringValue("QuerySplitItemBillResponse.Code"));
		querySplitItemBillResponse.setMessage(_ctx.stringValue("QuerySplitItemBillResponse.Message"));

		Data data = new Data();
		data.setBillingCycle(_ctx.stringValue("QuerySplitItemBillResponse.Data.BillingCycle"));
		data.setAccountID(_ctx.stringValue("QuerySplitItemBillResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("QuerySplitItemBillResponse.Data.AccountName"));
		data.setTotalCount(_ctx.integerValue("QuerySplitItemBillResponse.Data.TotalCount"));
		data.setPageNum(_ctx.integerValue("QuerySplitItemBillResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QuerySplitItemBillResponse.Data.PageSize"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QuerySplitItemBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setInstanceID(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].InstanceID"));
			item.setBillingType(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].BillingType"));
			item.setCostUnit(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].CostUnit"));
			item.setProductCode(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductType(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ProductType"));
			item.setSubscriptionType(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setProductName(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetail(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ProductDetail"));
			item.setOwnerID(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setBillingItem(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].BillingItem"));
			item.setListPrice(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ListPrice"));
			item.setListPriceUnit(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ListPriceUnit"));
			item.setUsage(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].Usage"));
			item.setUsageUnit(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].UsageUnit"));
			item.setDeductedByResourcePackage(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].DeductedByResourcePackage"));
			item.setPretaxGrossAmount(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setDeductedByCoupons(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setPretaxAmount(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setDeductedByCashCoupons(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setPaymentAmount(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setOutstandingAmount(_ctx.floatValue("QuerySplitItemBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setCurrency(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].Currency"));
			item.setNickName(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].NickName"));
			item.setResourceGroup(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ResourceGroup"));
			item.setTag(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].Tag"));
			item.setInstanceConfig(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].InstanceConfig"));
			item.setInstanceSpec(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].InstanceSpec"));
			item.setInternetIP(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].InternetIP"));
			item.setIntranetIP(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].IntranetIP"));
			item.setRegion(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].Region"));
			item.setZone(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].Zone"));
			item.setItem(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].Item"));
			item.setServicePeriod(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].ServicePeriod"));
			item.setBillingDate(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].BillingDate"));
			item.setSplitItemID(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].SplitItemID"));
			item.setSplitItemName(_ctx.stringValue("QuerySplitItemBillResponse.Data.Items["+ i +"].SplitItemName"));

			items.add(item);
		}
		data.setItems(items);
		querySplitItemBillResponse.setData(data);
	 
	 	return querySplitItemBillResponse;
	}
}