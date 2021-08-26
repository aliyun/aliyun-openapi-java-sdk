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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribePostPaidDesktopBillsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribePostPaidDesktopBillsResponse.Bill;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePostPaidDesktopBillsResponseUnmarshaller {

	public static DescribePostPaidDesktopBillsResponse unmarshall(DescribePostPaidDesktopBillsResponse describePostPaidDesktopBillsResponse, UnmarshallerContext _ctx) {
		
		describePostPaidDesktopBillsResponse.setRequestId(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.RequestId"));
		describePostPaidDesktopBillsResponse.setPostPaidDesktopsCount(_ctx.integerValue("DescribePostPaidDesktopBillsResponse.PostPaidDesktopsCount"));
		describePostPaidDesktopBillsResponse.setPostPaidDesktopsTotalAmount(_ctx.floatValue("DescribePostPaidDesktopBillsResponse.PostPaidDesktopsTotalAmount"));
		describePostPaidDesktopBillsResponse.setPostPaidDesktopsBillsUrl(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.PostPaidDesktopsBillsUrl"));
		describePostPaidDesktopBillsResponse.setNextToken(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.NextToken"));

		List<Bill> bills = new ArrayList<Bill>();
		for (int i = 0; i < _ctx.lengthValue("DescribePostPaidDesktopBillsResponse.Bills.Length"); i++) {
			Bill bill = new Bill();
			bill.setBillId(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].BillId"));
			bill.setBillStartTime(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].BillStartTime"));
			bill.setBillEndTime(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].BillEndTime"));
			bill.setBillType(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].BillType"));
			bill.setProduct(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].Product"));
			bill.setProductDetail(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].ProductDetail"));
			bill.setConsumeTime(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].ConsumeTime"));
			bill.setConsumeType(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].ConsumeType"));
			bill.setResourceGroupId(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].ResourceGroupId"));
			bill.setResourceGroupName(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].ResourceGroupName"));
			bill.setInstanceId(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].InstanceId"));
			bill.setChargeItem(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].ChargeItem"));
			bill.setPrice(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].Price"));
			bill.setPriceUnit(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].PriceUnit"));
			bill.setUsage(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].Usage"));
			bill.setUsageUnit(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].UsageUnit"));
			bill.setOriginalPrice(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].OriginalPrice"));
			bill.setDiscountPrice(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].DiscountPrice"));
			bill.setPayment(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].Payment"));
			bill.setCashPayment(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].CashPayment"));
			bill.setGoldNote(_ctx.stringValue("DescribePostPaidDesktopBillsResponse.Bills["+ i +"].GoldNote"));

			bills.add(bill);
		}
		describePostPaidDesktopBillsResponse.setBills(bills);
	 
	 	return describePostPaidDesktopBillsResponse;
	}
}