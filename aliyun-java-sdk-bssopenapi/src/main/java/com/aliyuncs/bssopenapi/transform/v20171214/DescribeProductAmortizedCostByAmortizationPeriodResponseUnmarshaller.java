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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeProductAmortizedCostByAmortizationPeriodResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeProductAmortizedCostByAmortizationPeriodResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProductAmortizedCostByAmortizationPeriodResponseUnmarshaller {

	public static DescribeProductAmortizedCostByAmortizationPeriodResponse unmarshall(DescribeProductAmortizedCostByAmortizationPeriodResponse describeProductAmortizedCostByAmortizationPeriodResponse, UnmarshallerContext _ctx) {
		
		describeProductAmortizedCostByAmortizationPeriodResponse.setRequestId(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.RequestId"));
		describeProductAmortizedCostByAmortizationPeriodResponse.setSuccess(_ctx.booleanValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Success"));
		describeProductAmortizedCostByAmortizationPeriodResponse.setCode(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Code"));
		describeProductAmortizedCostByAmortizationPeriodResponse.setMessage(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Message"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.NextToken"));
		data.setAccountID(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.AccountName"));
		data.setMaxResults(_ctx.integerValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.MaxResults"));
		data.setTotalCount(_ctx.integerValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.TotalCount"));
		data.setHostId(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.HostId"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setConsumePeriod(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ConsumePeriod"));
			item.setAmortizationStatus(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].AmortizationStatus"));
			item.setAmortizationPeriod(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].AmortizationPeriod"));
			item.setBillAccountID(_ctx.longValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BillAccountID"));
			item.setBillAccountName(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BillAccountName"));
			item.setBillOwnerID(_ctx.longValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BillOwnerID"));
			item.setBillOwnerName(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BillOwnerName"));
			item.setProductCode(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductName(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetailCode(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ProductDetailCode"));
			item.setProductDetail(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ProductDetail"));
			item.setBizType(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].BizType"));
			item.setSubscriptionType(_ctx.stringValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setPretaxGrossAmount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setRoundDownDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RoundDownDiscount"));
			item.setPretaxAmount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setDeductedByCashCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setDeductedByPrepaidCard(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setExpenditureAmount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].ExpenditureAmount"));
			item.setPreviouslyAmortizedPretaxGrossAmount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedPretaxGrossAmount"));
			item.setPreviouslyAmortizedInvoiceDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedInvoiceDiscount"));
			item.setPreviouslyAmortizedRoundDownDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedRoundDownDiscount"));
			item.setPreviouslyAmortizedPretaxAmount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedPretaxAmount"));
			item.setPreviouslyAmortizedDeductedByCashCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByCashCoupons"));
			item.setPreviouslyAmortizedDeductedByCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByCoupons"));
			item.setPreviouslyAmortizedDeductedByPrepaidCard(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByPrepaidCard"));
			item.setPreviouslyAmortizedExpenditureAmount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedExpenditureAmount"));
			item.setCurrentAmortizationPretaxGrossAmount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationPretaxGrossAmount"));
			item.setCurrentAmortizationInvoiceDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationInvoiceDiscount"));
			item.setCurrentAmortizationRoundDownDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationRoundDownDiscount"));
			item.setCurrentAmortizationPretaxAmount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationPretaxAmount"));
			item.setCurrentAmortizationDeductedByCashCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByCashCoupons"));
			item.setCurrentAmortizationDeductedByCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByCoupons"));
			item.setCurrentAmortizationDeductedByPrepaidCard(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByPrepaidCard"));
			item.setCurrentAmortizationExpenditureAmount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].CurrentAmortizationExpenditureAmount"));
			item.setRemainingAmortizationPretaxGrossAmount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationPretaxGrossAmount"));
			item.setRemainingAmortizationInvoiceDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationInvoiceDiscount"));
			item.setRemainingAmortizationRoundDownDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationRoundDownDiscount"));
			item.setRemainingAmortizationPretaxAmount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationPretaxAmount"));
			item.setRemainingAmortizationDeductedByCashCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByCashCoupons"));
			item.setRemainingAmortizationDeductedByCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByCoupons"));
			item.setRemainingAmortizationDeductedByPrepaidCard(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByPrepaidCard"));
			item.setRemainingAmortizationExpenditureAmount(_ctx.doubleValue("DescribeProductAmortizedCostByAmortizationPeriodResponse.Data.Items["+ i +"].RemainingAmortizationExpenditureAmount"));

			items.add(item);
		}
		data.setItems(items);
		describeProductAmortizedCostByAmortizationPeriodResponse.setData(data);
	 
	 	return describeProductAmortizedCostByAmortizationPeriodResponse;
	}
}