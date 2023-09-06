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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseUnmarshaller {

	public static DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse unmarshall(DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse describeInstanceDeductAmortizedCostByAmortizationPeriodResponse, UnmarshallerContext _ctx) {
		
		describeInstanceDeductAmortizedCostByAmortizationPeriodResponse.setRequestId(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.RequestId"));
		describeInstanceDeductAmortizedCostByAmortizationPeriodResponse.setSuccess(_ctx.booleanValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Success"));
		describeInstanceDeductAmortizedCostByAmortizationPeriodResponse.setCode(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Code"));
		describeInstanceDeductAmortizedCostByAmortizationPeriodResponse.setMessage(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Message"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.NextToken"));
		data.setAccountID(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.AccountName"));
		data.setMaxResults(_ctx.integerValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.MaxResults"));
		data.setTotalCount(_ctx.integerValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setCostUnit(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CostUnit"));
			item.setCostUnitCode(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CostUnitCode"));
			item.setInstanceID(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].InstanceID"));
			item.setResourceGroup(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ResourceGroup"));
			item.setTag(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].Tag"));
			item.setInternetIP(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].InternetIP"));
			item.setIntranetIP(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].IntranetIP"));
			item.setRegion(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].Region"));
			item.setZone(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].Zone"));
			item.setSplitAccountName(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].SplitAccountName"));
			item.setSplitProductDetail(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].SplitProductDetail"));
			item.setSplitItemID(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].SplitItemID"));
			item.setSplitItemName(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].SplitItemName"));
			item.setConsumePeriod(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ConsumePeriod"));
			item.setAmortizationStatus(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].AmortizationStatus"));
			item.setAmortizationPeriod(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].AmortizationPeriod"));
			item.setAmortizationPeriodDay(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].AmortizationPeriodDay"));
			item.setBillAccountID(_ctx.longValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BillAccountID"));
			item.setBillAccountName(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BillAccountName"));
			item.setBillOwnerID(_ctx.longValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BillOwnerID"));
			item.setBillOwnerName(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BillOwnerName"));
			item.setProductCode(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductName(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetailCode(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ProductDetailCode"));
			item.setProductDetail(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ProductDetail"));
			item.setBizType(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BizType"));
			item.setSubscriptionType(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setInstanceConfig(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].InstanceConfig"));
			item.setReferFrOwnerID(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ReferFrOwnerID"));
			item.setReferFrInstanceID(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ReferFrInstanceID"));
			item.setReferFrProductDetailCode(_ctx.stringValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ReferFrProductDetailCode"));
			item.setPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setRoundDownDiscount(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RoundDownDiscount"));
			item.setPretaxAmount(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setDeductedByCoupons(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setCurrentAmortizationPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationPretaxGrossAmount"));
			item.setCurrentAmortizationInvoiceDiscount(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationInvoiceDiscount"));
			item.setCurrentAmortizationRoundDownDiscount(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationRoundDownDiscount"));
			item.setCurrentAmortizationPretaxAmount(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationPretaxAmount"));
			item.setCurrentAmortizationDeductedByCoupons(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByCoupons"));
			item.setUnusedAmortizationPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].UnusedAmortizationPretaxGrossAmount"));
			item.setUnusedAmortizationInvoiceDiscount(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].UnusedAmortizationInvoiceDiscount"));
			item.setUnusedAmortizationRoundDownDiscount(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].UnusedAmortizationRoundDownDiscount"));
			item.setUnusedAmortizationPretaxAmount(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].UnusedAmortizationPretaxAmount"));
			item.setUnusedAmortizationDeductedByCoupons(_ctx.doubleValue("DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].UnusedAmortizationDeductedByCoupons"));

			items.add(item);
		}
		data.setItems(items);
		describeInstanceDeductAmortizedCostByAmortizationPeriodResponse.setData(data);
	 
	 	return describeInstanceDeductAmortizedCostByAmortizationPeriodResponse;
	}
}