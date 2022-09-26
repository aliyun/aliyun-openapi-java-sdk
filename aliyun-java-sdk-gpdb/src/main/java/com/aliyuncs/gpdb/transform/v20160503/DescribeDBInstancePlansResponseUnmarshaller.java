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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstancePlansResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstancePlansResponse.PlanList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancePlansResponseUnmarshaller {

	public static DescribeDBInstancePlansResponse unmarshall(DescribeDBInstancePlansResponse describeDBInstancePlansResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancePlansResponse.setRequestId(_ctx.stringValue("DescribeDBInstancePlansResponse.RequestId"));
		describeDBInstancePlansResponse.setStatus(_ctx.stringValue("DescribeDBInstancePlansResponse.Status"));
		describeDBInstancePlansResponse.setErrorMessage(_ctx.stringValue("DescribeDBInstancePlansResponse.ErrorMessage"));
		describeDBInstancePlansResponse.setTotalRecordCount(_ctx.integerValue("DescribeDBInstancePlansResponse.TotalRecordCount"));
		describeDBInstancePlansResponse.setPageRecordCount(_ctx.integerValue("DescribeDBInstancePlansResponse.PageRecordCount"));
		describeDBInstancePlansResponse.setPageNumber(_ctx.integerValue("DescribeDBInstancePlansResponse.PageNumber"));

		List<PlanList> items = new ArrayList<PlanList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancePlansResponse.Items.Length"); i++) {
			PlanList planList = new PlanList();
			planList.setPlanName(_ctx.stringValue("DescribeDBInstancePlansResponse.Items["+ i +"].PlanName"));
			planList.setPlanDesc(_ctx.stringValue("DescribeDBInstancePlansResponse.Items["+ i +"].PlanDesc"));
			planList.setPlanId(_ctx.stringValue("DescribeDBInstancePlansResponse.Items["+ i +"].PlanId"));
			planList.setPlanStatus(_ctx.stringValue("DescribeDBInstancePlansResponse.Items["+ i +"].PlanStatus"));
			planList.setPlanType(_ctx.stringValue("DescribeDBInstancePlansResponse.Items["+ i +"].PlanType"));
			planList.setPlanScheduleType(_ctx.stringValue("DescribeDBInstancePlansResponse.Items["+ i +"].PlanScheduleType"));
			planList.setPlanStartDate(_ctx.stringValue("DescribeDBInstancePlansResponse.Items["+ i +"].PlanStartDate"));
			planList.setPlanEndDate(_ctx.stringValue("DescribeDBInstancePlansResponse.Items["+ i +"].PlanEndDate"));
			planList.setPlanConfig(_ctx.stringValue("DescribeDBInstancePlansResponse.Items["+ i +"].PlanConfig"));
			planList.setDBInstanceId(_ctx.stringValue("DescribeDBInstancePlansResponse.Items["+ i +"].DBInstanceId"));

			items.add(planList);
		}
		describeDBInstancePlansResponse.setItems(items);
	 
	 	return describeDBInstancePlansResponse;
	}
}