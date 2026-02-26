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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseUnmarshaller {

	public static DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse unmarshall(DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse describeInstanceAmortizedCostByAmortizationPeriodDateResponse, UnmarshallerContext _ctx) {
		
		describeInstanceAmortizedCostByAmortizationPeriodDateResponse.setRequestId(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.RequestId"));
		describeInstanceAmortizedCostByAmortizationPeriodDateResponse.setSuccess(_ctx.booleanValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Success"));
		describeInstanceAmortizedCostByAmortizationPeriodDateResponse.setCode(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Code"));
		describeInstanceAmortizedCostByAmortizationPeriodDateResponse.setMessage(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Message"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.NextToken"));
		data.setAccountID(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.AccountName"));
		data.setMaxResults(_ctx.integerValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.MaxResults"));
		data.setTotalCount(_ctx.integerValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.TotalCount"));
		data.setHostId(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.HostId"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setCostUnit(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].CostUnit"));
			item.setCostUnitCode(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].CostUnitCode"));
			item.setInstanceID(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].InstanceID"));
			item.setResourceGroup(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].ResourceGroup"));
			item.setTag(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].Tag"));
			item.setInternetIP(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].InternetIP"));
			item.setIntranetIP(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].IntranetIP"));
			item.setRegion(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].Region"));
			item.setZone(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].Zone"));
			item.setSplitAccountName(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].SplitAccountName"));
			item.setSplitProductDetail(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].SplitProductDetail"));
			item.setSplitItemID(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].SplitItemID"));
			item.setSplitItemName(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].SplitItemName"));
			item.setConsumePeriod(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].ConsumePeriod"));
			item.setConsumePeriodDay(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].ConsumePeriodDay"));
			item.setAmortizationStatus(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].AmortizationStatus"));
			item.setAmortizationPeriod(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].AmortizationPeriod"));
			item.setAmortizationPeriodDay(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].AmortizationPeriodDay"));
			item.setBillAccountID(_ctx.longValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].BillAccountID"));
			item.setBillAccountName(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].BillAccountName"));
			item.setBillOwnerID(_ctx.longValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].BillOwnerID"));
			item.setBillOwnerName(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].BillOwnerName"));
			item.setProductCode(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductName(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetailCode(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].ProductDetailCode"));
			item.setProductDetail(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].ProductDetail"));
			item.setBizType(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].BizType"));
			item.setSubscriptionType(_ctx.stringValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setRoundDownDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].RoundDownDiscount"));
			item.setPretaxAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setDeductedByCashCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setDeductedByPrepaidCard(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setExpenditureAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].ExpenditureAmount"));
			item.setPreviouslyAmortizedPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].PreviouslyAmortizedPretaxGrossAmount"));
			item.setPreviouslyAmortizedInvoiceDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].PreviouslyAmortizedInvoiceDiscount"));
			item.setPreviouslyAmortizedRoundDownDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].PreviouslyAmortizedRoundDownDiscount"));
			item.setPreviouslyAmortizedPretaxAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].PreviouslyAmortizedPretaxAmount"));
			item.setPreviouslyAmortizedDeductedByCashCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByCashCoupons"));
			item.setPreviouslyAmortizedDeductedByCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByCoupons"));
			item.setPreviouslyAmortizedDeductedByPrepaidCard(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByPrepaidCard"));
			item.setPreviouslyAmortizedExpenditureAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].PreviouslyAmortizedExpenditureAmount"));
			item.setCurrentAmortizationPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].CurrentAmortizationPretaxGrossAmount"));
			item.setCurrentAmortizationInvoiceDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].CurrentAmortizationInvoiceDiscount"));
			item.setCurrentAmortizationRoundDownDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].CurrentAmortizationRoundDownDiscount"));
			item.setCurrentAmortizationPretaxAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].CurrentAmortizationPretaxAmount"));
			item.setCurrentAmortizationDeductedByCashCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByCashCoupons"));
			item.setCurrentAmortizationDeductedByCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByCoupons"));
			item.setCurrentAmortizationDeductedByPrepaidCard(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByPrepaidCard"));
			item.setCurrentAmortizationExpenditureAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].CurrentAmortizationExpenditureAmount"));
			item.setRemainingAmortizationPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].RemainingAmortizationPretaxGrossAmount"));
			item.setRemainingAmortizationInvoiceDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].RemainingAmortizationInvoiceDiscount"));
			item.setRemainingAmortizationRoundDownDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].RemainingAmortizationRoundDownDiscount"));
			item.setRemainingAmortizationPretaxAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].RemainingAmortizationPretaxAmount"));
			item.setRemainingAmortizationDeductedByCashCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByCashCoupons"));
			item.setRemainingAmortizationDeductedByCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByCoupons"));
			item.setRemainingAmortizationDeductedByPrepaidCard(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByPrepaidCard"));
			item.setRemainingAmortizationExpenditureAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.Data.Items["+ i +"].RemainingAmortizationExpenditureAmount"));

			items.add(item);
		}
		data.setItems(items);
		describeInstanceAmortizedCostByAmortizationPeriodDateResponse.setData(data);
	 
	 	return describeInstanceAmortizedCostByAmortizationPeriodDateResponse;
	}
}