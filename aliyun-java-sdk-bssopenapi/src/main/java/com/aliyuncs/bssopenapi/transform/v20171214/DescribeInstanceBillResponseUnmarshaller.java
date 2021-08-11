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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceBillResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceBillResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceBillResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceBillResponseUnmarshaller {

	public static DescribeInstanceBillResponse unmarshall(DescribeInstanceBillResponse describeInstanceBillResponse, UnmarshallerContext _ctx) {
		
		describeInstanceBillResponse.setRequestId(_ctx.stringValue("DescribeInstanceBillResponse.RequestId"));
		describeInstanceBillResponse.setSuccess(_ctx.booleanValue("DescribeInstanceBillResponse.Success"));
		describeInstanceBillResponse.setCode(_ctx.stringValue("DescribeInstanceBillResponse.Code"));
		describeInstanceBillResponse.setMessage(_ctx.stringValue("DescribeInstanceBillResponse.Message"));

		Data data = new Data();
		data.setBillingCycle(_ctx.stringValue("DescribeInstanceBillResponse.Data.BillingCycle"));
		data.setAccountID(_ctx.stringValue("DescribeInstanceBillResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("DescribeInstanceBillResponse.Data.AccountName"));
		data.setTotalCount(_ctx.integerValue("DescribeInstanceBillResponse.Data.TotalCount"));
		data.setNextToken(_ctx.stringValue("DescribeInstanceBillResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("DescribeInstanceBillResponse.Data.MaxResults"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceBillResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setInstanceID(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].InstanceID"));
			item.setBillingType(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].BillingType"));
			item.setCostUnit(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].CostUnit"));
			item.setProductCode(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductType(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].ProductType"));
			item.setSubscriptionType(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setProductName(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetail(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].ProductDetail"));
			item.setOwnerID(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].OwnerID"));
			item.setBillingItem(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].BillingItem"));
			item.setListPrice(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].ListPrice"));
			item.setListPriceUnit(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].ListPriceUnit"));
			item.setUsage(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].Usage"));
			item.setUsageUnit(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].UsageUnit"));
			item.setDeductedByResourcePackage(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].DeductedByResourcePackage"));
			item.setPretaxGrossAmount(_ctx.floatValue("DescribeInstanceBillResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(_ctx.floatValue("DescribeInstanceBillResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setDeductedByCoupons(_ctx.floatValue("DescribeInstanceBillResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setPretaxAmount(_ctx.floatValue("DescribeInstanceBillResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setDeductedByCashCoupons(_ctx.floatValue("DescribeInstanceBillResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByPrepaidCard(_ctx.floatValue("DescribeInstanceBillResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setPaymentAmount(_ctx.floatValue("DescribeInstanceBillResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setOutstandingAmount(_ctx.floatValue("DescribeInstanceBillResponse.Data.Items["+ i +"].OutstandingAmount"));
			item.setCurrency(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].Currency"));
			item.setNickName(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].NickName"));
			item.setResourceGroup(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].ResourceGroup"));
			item.setTag(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].Tag"));
			item.setInstanceConfig(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].InstanceConfig"));
			item.setInstanceSpec(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].InstanceSpec"));
			item.setInternetIP(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].InternetIP"));
			item.setIntranetIP(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].IntranetIP"));
			item.setRegion(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].Region"));
			item.setZone(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].Zone"));
			item.setItem(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].Item"));
			item.setServicePeriod(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].ServicePeriod"));
			item.setBillingDate(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].BillingDate"));
			item.setServicePeriodUnit(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].ServicePeriodUnit"));
			item.setPipCode(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].PipCode"));
			item.setCommodityCode(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].CommodityCode"));
			item.setBillAccountID(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].BillAccountID"));
			item.setBillAccountName(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].BillAccountName"));
			item.setBizType(_ctx.stringValue("DescribeInstanceBillResponse.Data.Items["+ i +"].BizType"));

			items.add(item);
		}
		data.setItems(items);
		describeInstanceBillResponse.setData(data);
	 
	 	return describeInstanceBillResponse;
	}
}