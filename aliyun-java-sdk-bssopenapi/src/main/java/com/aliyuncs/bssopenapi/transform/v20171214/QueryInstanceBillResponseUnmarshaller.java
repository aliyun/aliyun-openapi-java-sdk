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

	public static QueryInstanceBillResponse unmarshall(QueryInstanceBillResponse queryInstanceBillResponse, UnmarshallerContext context) {
		
		queryInstanceBillResponse.setRequestId(context.stringValue("QueryInstanceBillResponse.RequestId"));
		queryInstanceBillResponse.setSuccess(context.booleanValue("QueryInstanceBillResponse.Success"));
		queryInstanceBillResponse.setCode(context.stringValue("QueryInstanceBillResponse.Code"));
		queryInstanceBillResponse.setMessage(context.stringValue("QueryInstanceBillResponse.Message"));

		Data data = new Data();
		data.setBillingCycle(context.stringValue("QueryInstanceBillResponse.Data.BillingCycle"));
		data.setAccountID(context.stringValue("QueryInstanceBillResponse.Data.AccountID"));
		data.setAccountName(context.stringValue("QueryInstanceBillResponse.Data.AccountName"));
		data.setTotalCount(context.integerValue("QueryInstanceBillResponse.Data.TotalCount"));
		data.setPageNum(context.integerValue("QueryInstanceBillResponse.Data.PageNum"));
		data.setPageSize(context.integerValue("QueryInstanceBillResponse.Data.PageSize"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("QueryInstanceBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setInstanceID(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].InstanceID"));
			item.setNickName(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].NickName"));
			item.setServicePeriod(context.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].ServicePeriod"));
			item.setBillingType(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].BillingType"));
			item.setInstanceConfig(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].InstanceConfig"));
			item.setInstanceSpec(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].InstanceSpec"));
			item.setCostUnit(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].CostUnit"));
			item.setProductCode(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductType(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ProductType"));
			item.setSubscriptionType(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setProductName(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetail(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ProductDetail"));
			item.setTag(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].Tag"));
			item.setResourceGroup(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ResourceGroup"));
			item.setOwnerID(context.longValue("QueryInstanceBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setRegion(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].Region"));
			item.setBillingItem(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].BillingItem"));
			item.setListPrice(context.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].ListPrice"));
			item.setListPriceUnit(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].ListPriceUnit"));
			item.setUsage(context.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].Usage"));
			item.setUsageUnit(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].UsageUnit"));
			item.setDeductedByResourcePackage(context.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].DeductedByResourcePackage"));
			item.setPretaxGrossAmount(context.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(context.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setDeductedByCoupons(context.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setPretaxAmount(context.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setDeductedByCashCoupons(context.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByPrepaidCard(context.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setPaymentAmount(context.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setOutstandingAmount(context.floatValue("QueryInstanceBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setCurrency(context.stringValue("QueryInstanceBillResponse.Data.Items["+ i +"].Currency"));

			items.add(item);
		}
		data.setItems(items);
		queryInstanceBillResponse.setData(data);
	 
	 	return queryInstanceBillResponse;
	}
}