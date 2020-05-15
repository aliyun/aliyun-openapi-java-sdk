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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeUsageBillResponse;
import com.aliyuncs.green.model.v20170823.DescribeUsageBillResponse.Bill;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUsageBillResponseUnmarshaller {

	public static DescribeUsageBillResponse unmarshall(DescribeUsageBillResponse describeUsageBillResponse, UnmarshallerContext _ctx) {
		
		describeUsageBillResponse.setRequestId(_ctx.stringValue("DescribeUsageBillResponse.RequestId"));
		describeUsageBillResponse.setTotalCount(_ctx.integerValue("DescribeUsageBillResponse.TotalCount"));
		describeUsageBillResponse.setPageSize(_ctx.integerValue("DescribeUsageBillResponse.PageSize"));
		describeUsageBillResponse.setCurrentPage(_ctx.integerValue("DescribeUsageBillResponse.CurrentPage"));

		List<Bill> billList = new ArrayList<Bill>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUsageBillResponse.BillList.Length"); i++) {
			Bill bill = new Bill();
			bill.setRegion(_ctx.stringValue("DescribeUsageBillResponse.BillList["+ i +"].Region"));
			bill.setScene(_ctx.stringValue("DescribeUsageBillResponse.BillList["+ i +"].Scene"));
			bill.setTotalCount(_ctx.longValue("DescribeUsageBillResponse.BillList["+ i +"].TotalCount"));
			bill.setConfirmCount(_ctx.longValue("DescribeUsageBillResponse.BillList["+ i +"].ConfirmCount"));
			bill.setReviewCount(_ctx.longValue("DescribeUsageBillResponse.BillList["+ i +"].ReviewCount"));
			bill.setFreeCount(_ctx.longValue("DescribeUsageBillResponse.BillList["+ i +"].FreeCount"));
			bill.setSubUid(_ctx.stringValue("DescribeUsageBillResponse.BillList["+ i +"].SubUid"));
			bill.setBizType(_ctx.stringValue("DescribeUsageBillResponse.BillList["+ i +"].BizType"));
			bill.setDay(_ctx.stringValue("DescribeUsageBillResponse.BillList["+ i +"].Day"));

			billList.add(bill);
		}
		describeUsageBillResponse.setBillList(billList);
	 
	 	return describeUsageBillResponse;
	}
}