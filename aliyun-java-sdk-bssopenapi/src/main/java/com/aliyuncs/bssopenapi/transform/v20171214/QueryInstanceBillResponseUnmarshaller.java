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

import com.aliyuncs.bssopenapi.model.v20171214.QueryInstanceBillResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryInstanceBillResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryInstanceBillResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInstanceBillResponseUnmarshaller {

	public static QueryInstanceBillResponse unmarshall(QueryInstanceBillResponse queryInstanceBillResponse, UnmarshallerContext _ctx) {
		
		queryInstanceBillResponse.setRequestId(_ctx.stringValue("QueryInstanceBillResponse.RequestId"));
		queryInstanceBillResponse.setCode(_ctx.stringValue("QueryInstanceBillResponse.Code"));
		queryInstanceBillResponse.setMessage(_ctx.stringValue("QueryInstanceBillResponse.Message"));
		queryInstanceBillResponse.setSuccess(_ctx.booleanValue("QueryInstanceBillResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("QueryInstanceBillResponse.Data.PageNum"));
		data.setBillingCycle(_ctx.stringValue("QueryInstanceBillResponse.Data.BillingCycle"));
		data.setAccountID(_ctx.stringValue("QueryInstanceBillResponse.Data.AccountID"));
		data.setPageSize(_ctx.integerValue("QueryInstanceBillResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QueryInstanceBillResponse.Data.TotalCount"));
		data.setAccountName(_ctx.stringValue("QueryInstanceBillResponse.Data.AccountName"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryInstanceBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setBillingDate(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].BillingDate"));
			item.setInstanceConfig(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].InstanceConfig"));
			item.setInternetIP(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].InternetIP"));
			item.setItem(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].Item"));
			item.setTag(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].Tag"));
			item.setInstanceID(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].InstanceID"));
			item.setCurrency(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].Currency"));
			item.setDeductedByCashCoupons(_ctx.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setSubscriptionType(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setInstanceSpec(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].InstanceSpec"));
			item.setDeductedByCoupons(_ctx.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setBillingItem(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].BillingItem"));
			item.setRegion(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].Region"));
			item.setOutstandingAmount(_ctx.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setCostUnit(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].CostUnit"));
			item.setListPriceUnit(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ListPriceUnit"));
			item.setResourceGroup(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ResourceGroup"));
			item.setPipCode(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].PipCode"));
			item.setServicePeriodUnit(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ServicePeriodUnit"));
			item.setPretaxAmount(_ctx.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setCommodityCode(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].CommodityCode"));
			item.setProductName(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ProductName"));
			item.setAdjustAmount(_ctx.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].AdjustAmount"));
			item.setNickName(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].NickName"));
			item.setProductDetail(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ProductDetail"));
			item.setUsage(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].Usage"));
			item.setIntranetIP(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].IntranetIP"));
			item.setOwnerID(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setUsageUnit(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].UsageUnit"));
			item.setPaymentAmount(_ctx.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setInvoiceDiscount(_ctx.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setDeductedByResourcePackage(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].DeductedByResourcePackage"));
			item.setProductType(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ProductType"));
			item.setServicePeriod(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ServicePeriod"));
			item.setZone(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].Zone"));
			item.setListPrice(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ListPrice"));
			item.setPretaxGrossAmount(_ctx.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setCashAmount(_ctx.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].CashAmount"));
			item.setProductCode(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ProductCode"));
			item.setBillingType(_ctx.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].BillingType"));

			items.add(item);
		}
		data.setItems(items);
		queryInstanceBillResponse.setData(data);
	 
	 	return queryInstanceBillResponse;
	}
}