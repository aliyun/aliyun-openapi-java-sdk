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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceAmortizedCostByConsumePeriodResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceAmortizedCostByConsumePeriodResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAmortizedCostByConsumePeriodResponseUnmarshaller {

	public static DescribeInstanceAmortizedCostByConsumePeriodResponse unmarshall(DescribeInstanceAmortizedCostByConsumePeriodResponse describeInstanceAmortizedCostByConsumePeriodResponse, UnmarshallerContext _ctx) {
		
		describeInstanceAmortizedCostByConsumePeriodResponse.setRequestId(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.RequestId"));
		describeInstanceAmortizedCostByConsumePeriodResponse.setSuccess(_ctx.booleanValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Success"));
		describeInstanceAmortizedCostByConsumePeriodResponse.setCode(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Code"));
		describeInstanceAmortizedCostByConsumePeriodResponse.setMessage(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Message"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.NextToken"));
		data.setAccountID(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.AccountName"));
		data.setMaxResults(_ctx.integerValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.MaxResults"));
		data.setTotalCount(_ctx.integerValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setCostUnit(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CostUnit"));
			item.setCostUnitCode(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CostUnitCode"));
			item.setInstanceID(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].InstanceID"));
			item.setResourceGroup(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].ResourceGroup"));
			item.setTag(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].Tag"));
			item.setInternetIP(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].InternetIP"));
			item.setIntranetIP(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].IntranetIP"));
			item.setRegion(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].Region"));
			item.setZone(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].Zone"));
			item.setSplitAccountName(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].SplitAccountName"));
			item.setSplitProductDetail(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].SplitProductDetail"));
			item.setSplitItemID(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].SplitItemID"));
			item.setSplitItemName(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].SplitItemName"));
			item.setConsumePeriod(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].ConsumePeriod"));
			item.setAmortizationStatus(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].AmortizationStatus"));
			item.setAmortizationPeriod(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].AmortizationPeriod"));
			item.setBillAccountID(_ctx.longValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].BillAccountID"));
			item.setBillAccountName(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].BillAccountName"));
			item.setBillOwnerID(_ctx.longValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].BillOwnerID"));
			item.setBillOwnerName(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].BillOwnerName"));
			item.setProductCode(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductName(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetailCode(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].ProductDetailCode"));
			item.setProductDetail(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].ProductDetail"));
			item.setBizType(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].BizType"));
			item.setSubscriptionType(_ctx.stringValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setRoundDownDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RoundDownDiscount"));
			item.setPretaxAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setDeductedByCashCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setDeductedByPrepaidCard(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setExpenditureAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].ExpenditureAmount"));
			item.setPreviouslyAmortizedPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedPretaxGrossAmount"));
			item.setPreviouslyAmortizedInvoiceDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedInvoiceDiscount"));
			item.setPreviouslyAmortizedRoundDownDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedRoundDownDiscount"));
			item.setPreviouslyAmortizedPretaxAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedPretaxAmount"));
			item.setPreviouslyAmortizedDeductedByCashCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByCashCoupons"));
			item.setPreviouslyAmortizedDeductedByCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByCoupons"));
			item.setPreviouslyAmortizedDeductedByPrepaidCard(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByPrepaidCard"));
			item.setPreviouslyAmortizedExpenditureAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedExpenditureAmount"));
			item.setCurrentAmortizationPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationPretaxGrossAmount"));
			item.setCurrentAmortizationInvoiceDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationInvoiceDiscount"));
			item.setCurrentAmortizationRoundDownDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationRoundDownDiscount"));
			item.setCurrentAmortizationPretaxAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationPretaxAmount"));
			item.setCurrentAmortizationDeductedByCashCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByCashCoupons"));
			item.setCurrentAmortizationDeductedByCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByCoupons"));
			item.setCurrentAmortizationDeductedByPrepaidCard(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByPrepaidCard"));
			item.setCurrentAmortizationExpenditureAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationExpenditureAmount"));
			item.setRemainingAmortizationPretaxGrossAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationPretaxGrossAmount"));
			item.setRemainingAmortizationInvoiceDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationInvoiceDiscount"));
			item.setRemainingAmortizationRoundDownDiscount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationRoundDownDiscount"));
			item.setRemainingAmortizationPretaxAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationPretaxAmount"));
			item.setRemainingAmortizationDeductedByCashCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByCashCoupons"));
			item.setRemainingAmortizationDeductedByCoupons(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByCoupons"));
			item.setRemainingAmortizationDeductedByPrepaidCard(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByPrepaidCard"));
			item.setRemainingAmortizationExpenditureAmount(_ctx.doubleValue("DescribeInstanceAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationExpenditureAmount"));

			items.add(item);
		}
		data.setItems(items);
		describeInstanceAmortizedCostByConsumePeriodResponse.setData(data);
	 
	 	return describeInstanceAmortizedCostByConsumePeriodResponse;
	}
}