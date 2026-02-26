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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeProductAmortizedCostByConsumePeriodResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeProductAmortizedCostByConsumePeriodResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeProductAmortizedCostByConsumePeriodResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProductAmortizedCostByConsumePeriodResponseUnmarshaller {

	public static DescribeProductAmortizedCostByConsumePeriodResponse unmarshall(DescribeProductAmortizedCostByConsumePeriodResponse describeProductAmortizedCostByConsumePeriodResponse, UnmarshallerContext _ctx) {
		
		describeProductAmortizedCostByConsumePeriodResponse.setRequestId(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.RequestId"));
		describeProductAmortizedCostByConsumePeriodResponse.setSuccess(_ctx.booleanValue("DescribeProductAmortizedCostByConsumePeriodResponse.Success"));
		describeProductAmortizedCostByConsumePeriodResponse.setCode(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Code"));
		describeProductAmortizedCostByConsumePeriodResponse.setMessage(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Message"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.NextToken"));
		data.setAccountID(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.AccountName"));
		data.setMaxResults(_ctx.integerValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.MaxResults"));
		data.setTotalCount(_ctx.integerValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setConsumePeriod(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].ConsumePeriod"));
			item.setAmortizationStatus(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].AmortizationStatus"));
			item.setAmortizationPeriod(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].AmortizationPeriod"));
			item.setBillAccountID(_ctx.longValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].BillAccountID"));
			item.setBillAccountName(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].BillAccountName"));
			item.setBillOwnerID(_ctx.longValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].BillOwnerID"));
			item.setBillOwnerName(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].BillOwnerName"));
			item.setProductCode(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductName(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].ProductName"));
			item.setProductDetailCode(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].ProductDetailCode"));
			item.setProductDetail(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].ProductDetail"));
			item.setBizType(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].BizType"));
			item.setSubscriptionType(_ctx.stringValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setPretaxGrossAmount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setInvoiceDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].InvoiceDiscount"));
			item.setRoundDownDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RoundDownDiscount"));
			item.setPretaxAmount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setDeductedByCashCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].DeductedByCashCoupons"));
			item.setDeductedByCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].DeductedByCoupons"));
			item.setDeductedByPrepaidCard(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].DeductedByPrepaidCard"));
			item.setExpenditureAmount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].ExpenditureAmount"));
			item.setPreviouslyAmortizedPretaxGrossAmount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedPretaxGrossAmount"));
			item.setPreviouslyAmortizedInvoiceDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedInvoiceDiscount"));
			item.setPreviouslyAmortizedRoundDownDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedRoundDownDiscount"));
			item.setPreviouslyAmortizedPretaxAmount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedPretaxAmount"));
			item.setPreviouslyAmortizedDeductedByCashCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByCashCoupons"));
			item.setPreviouslyAmortizedDeductedByCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByCoupons"));
			item.setPreviouslyAmortizedDeductedByPrepaidCard(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedDeductedByPrepaidCard"));
			item.setPreviouslyAmortizedExpenditureAmount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].PreviouslyAmortizedExpenditureAmount"));
			item.setCurrentAmortizationPretaxGrossAmount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationPretaxGrossAmount"));
			item.setCurrentAmortizationInvoiceDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationInvoiceDiscount"));
			item.setCurrentAmortizationRoundDownDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationRoundDownDiscount"));
			item.setCurrentAmortizationPretaxAmount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationPretaxAmount"));
			item.setCurrentAmortizationDeductedByCashCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByCashCoupons"));
			item.setCurrentAmortizationDeductedByCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByCoupons"));
			item.setCurrentAmortizationDeductedByPrepaidCard(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationDeductedByPrepaidCard"));
			item.setCurrentAmortizationExpenditureAmount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].CurrentAmortizationExpenditureAmount"));
			item.setRemainingAmortizationPretaxGrossAmount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationPretaxGrossAmount"));
			item.setRemainingAmortizationInvoiceDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationInvoiceDiscount"));
			item.setRemainingAmortizationRoundDownDiscount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationRoundDownDiscount"));
			item.setRemainingAmortizationPretaxAmount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationPretaxAmount"));
			item.setRemainingAmortizationDeductedByCashCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByCashCoupons"));
			item.setRemainingAmortizationDeductedByCoupons(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByCoupons"));
			item.setRemainingAmortizationDeductedByPrepaidCard(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationDeductedByPrepaidCard"));
			item.setRemainingAmortizationExpenditureAmount(_ctx.doubleValue("DescribeProductAmortizedCostByConsumePeriodResponse.Data.Items["+ i +"].RemainingAmortizationExpenditureAmount"));

			items.add(item);
		}
		data.setItems(items);
		describeProductAmortizedCostByConsumePeriodResponse.setData(data);
	 
	 	return describeProductAmortizedCostByConsumePeriodResponse;
	}
}