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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeVmMigrationPlansResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeVmMigrationPlansResponse.Plan;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVmMigrationPlansResponseUnmarshaller {

	public static DescribeVmMigrationPlansResponse unmarshall(DescribeVmMigrationPlansResponse describeVmMigrationPlansResponse, UnmarshallerContext _ctx) {
		
		describeVmMigrationPlansResponse.setRequestId(_ctx.stringValue("DescribeVmMigrationPlansResponse.RequestId"));
		describeVmMigrationPlansResponse.setSuccess(_ctx.booleanValue("DescribeVmMigrationPlansResponse.Success"));
		describeVmMigrationPlansResponse.setCode(_ctx.stringValue("DescribeVmMigrationPlansResponse.Code"));
		describeVmMigrationPlansResponse.setMessage(_ctx.stringValue("DescribeVmMigrationPlansResponse.Message"));
		describeVmMigrationPlansResponse.setTotalCount(_ctx.integerValue("DescribeVmMigrationPlansResponse.TotalCount"));
		describeVmMigrationPlansResponse.setPageNumber(_ctx.integerValue("DescribeVmMigrationPlansResponse.PageNumber"));
		describeVmMigrationPlansResponse.setPageSize(_ctx.integerValue("DescribeVmMigrationPlansResponse.PageSize"));

		List<Plan> plans = new ArrayList<Plan>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVmMigrationPlansResponse.Plans.Length"); i++) {
			Plan plan = new Plan();
			plan.setPlanId(_ctx.stringValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].PlanId"));
			plan.setVaultId(_ctx.stringValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].VaultId"));
			plan.setPlanName(_ctx.stringValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].PlanName"));
			plan.setPlanStatus(_ctx.stringValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].PlanStatus"));
			plan.setVmCount(_ctx.integerValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].VmCount"));
			plan.setVmFinished(_ctx.integerValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].VmFinished"));
			plan.setVmFailed(_ctx.integerValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].VmFailed"));
			plan.setDelay(_ctx.longValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].Delay"));
			plan.setCreatedTime(_ctx.longValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].CreatedTime"));
			plan.setUpdatedTime(_ctx.longValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].UpdatedTime"));
			plan.setIncrementalSyncSchedule(_ctx.stringValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].IncrementalSyncSchedule"));
			plan.setMode(_ctx.stringValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].Mode"));
			plan.setVmIncSync(_ctx.integerValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].VmIncSync"));
			plan.setStartTime(_ctx.longValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].StartTime"));
			plan.setVmCancelled(_ctx.integerValue("DescribeVmMigrationPlansResponse.Plans["+ i +"].VmCancelled"));

			plans.add(plan);
		}
		describeVmMigrationPlansResponse.setPlans(plans);
	 
	 	return describeVmMigrationPlansResponse;
	}
}