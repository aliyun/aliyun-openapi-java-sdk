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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceAmortizedCostByAmortizationPeriodResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAmortizedCostByAmortizationPeriodResponseUnmarshaller {

	public static DescribeInstanceAmortizedCostByAmortizationPeriodResponse unmarshall(DescribeInstanceAmortizedCostByAmortizationPeriodResponse describeInstanceAmortizedCostByAmortizationPeriodResponse, UnmarshallerContext _ctx) {
		
		describeInstanceAmortizedCostByAmortizationPeriodResponse.setRequestId(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.RequestId"));
		describeInstanceAmortizedCostByAmortizationPeriodResponse.setSuccess(_ctx.booleanValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Success"));
		describeInstanceAmortizedCostByAmortizationPeriodResponse.setCode(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Code"));
		describeInstanceAmortizedCostByAmortizationPeriodResponse.setMessage(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Message"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.NextToken"));
		data.setAccountID(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.AccountName"));
		data.setMaxResults(_ctx.integerValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.MaxResults"));
		data.setTotalCount(_ctx.integerValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.TotalCount"));
		data.setHostId(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.HostId"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setCostUnit(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CostUnit"));
			item.setCostUnitCode(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CostUnitCode"));
			item.setInstanceID(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].InstanceID"));
			item.setResourceGroup(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ResourceGroup"));
			item.setTag(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].Tag"));
			item.setInternetIP(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].InternetIP"));
			item.setIntranetIP(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].IntranetIP"));
			item.setRegion(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].Region"));
			item.setZone(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].Zone"));
			item.setSplitAccountName(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].SplitAccountName"));
			item.setSplitProductDetail(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].SplitProductDetail"));
			item.setSplitItemID(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].SplitItemID"));
			item.setSplitItemName(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].SplitItemName"));
			item.setConsumePeriod(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ConsumePeriod"));
			item.setAmortizationStatus(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].AmortizationStatus"));
			item.setAmortizationPeriod(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].AmortizationPeriod"));
			item.setBillAccountID(_ctx.longValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BillAccountID"));
			item.setBillAccountName(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BillAccountName"));
			item.setBillOwnerID(_ctx.longValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BillOwnerID"));
			item.setBillOwnerName(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BillOwnerName"));
			item.setProductCode(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductName(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetailCode(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ProductDetailCode"));
			item.setProductDetail(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ProductDetail"));
			item.setBizType(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BizType"));
			item.setSubscriptionType(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setRoundDownDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RoundDownDiscount"));
			item.setPretaxAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setDeductedByCashCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setDeductedByPrepaidCard(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setExpenditureAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ExpenditureAmount"));
			item.setPreviouslyAmortizedPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedPretaxGrossAmount"));
			item.setPreviouslyAmortizedInvoiceDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedInvoiceDiscount"));
			item.setPreviouslyAmortizedRoundDownDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedRoundDownDiscount"));
			item.setPreviouslyAmortizedPretaxAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedPretaxAmount"));
			item.setPreviouslyAmortizedDeductedByCashCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByCashCoupons"));
			item.setPreviouslyAmortizedDeductedByCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByCoupons"));
			item.setPreviouslyAmortizedDeductedByPrepaidCard(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByPrepaidCard"));
			item.setPreviouslyAmortizedExpenditureAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedExpenditureAmount"));
			item.setCurrentAmortizationPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationPretaxGrossAmount"));
			item.setCurrentAmortizationInvoiceDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationInvoiceDiscount"));
			item.setCurrentAmortizationRoundDownDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationRoundDownDiscount"));
			item.setCurrentAmortizationPretaxAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationPretaxAmount"));
			item.setCurrentAmortizationDeductedByCashCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByCashCoupons"));
			item.setCurrentAmortizationDeductedByCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByCoupons"));
			item.setCurrentAmortizationDeductedByPrepaidCard(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByPrepaidCard"));
			item.setCurrentAmortizationExpenditureAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationExpenditureAmount"));
			item.setRemainingAmortizationPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationPretaxGrossAmount"));
			item.setRemainingAmortizationInvoiceDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationInvoiceDiscount"));
			item.setRemainingAmortizationRoundDownDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationRoundDownDiscount"));
			item.setRemainingAmortizationPretaxAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationPretaxAmount"));
			item.setRemainingAmortizationDeductedByCashCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByCashCoupons"));
			item.setRemainingAmortizationDeductedByCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByCoupons"));
			item.setRemainingAmortizationDeductedByPrepaidCard(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByPrepaidCard"));
			item.setRemainingAmortizationExpenditureAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationExpenditureAmount"));

			items.add(item);
		}
		data.setItems(items);
		describeInstanceAmortizedCostByAmortizationPeriodResponse.setData(data);
	 
	 	return describeInstanceAmortizedCostByAmortizationPeriodResponse;
	}
}