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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeGtmRecoveryPlansResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmRecoveryPlansResponse.RecoveryPlan;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmRecoveryPlansResponseUnmarshaller {

	public static DescribeGtmRecoveryPlansResponse unmarshall(DescribeGtmRecoveryPlansResponse describeGtmRecoveryPlansResponse, UnmarshallerContext _ctx) {
		
		describeGtmRecoveryPlansResponse.setRequestId(_ctx.stringValue("DescribeGtmRecoveryPlansResponse.RequestId"));
		describeGtmRecoveryPlansResponse.setTotalItems(_ctx.integerValue("DescribeGtmRecoveryPlansResponse.TotalItems"));
		describeGtmRecoveryPlansResponse.setTotalPages(_ctx.integerValue("DescribeGtmRecoveryPlansResponse.TotalPages"));
		describeGtmRecoveryPlansResponse.setPageNumber(_ctx.integerValue("DescribeGtmRecoveryPlansResponse.PageNumber"));
		describeGtmRecoveryPlansResponse.setPageSize(_ctx.integerValue("DescribeGtmRecoveryPlansResponse.PageSize"));

		List<RecoveryPlan> recoveryPlans = new ArrayList<RecoveryPlan>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans.Length"); i++) {
			RecoveryPlan recoveryPlan = new RecoveryPlan();
			recoveryPlan.setRecoveryPlanId(_ctx.longValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans["+ i +"].RecoveryPlanId"));
			recoveryPlan.setName(_ctx.stringValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans["+ i +"].Name"));
			recoveryPlan.setRemark(_ctx.stringValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans["+ i +"].Remark"));
			recoveryPlan.setFaultAddrPoolNum(_ctx.integerValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans["+ i +"].FaultAddrPoolNum"));
			recoveryPlan.setLastExecuteTime(_ctx.stringValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans["+ i +"].LastExecuteTime"));
			recoveryPlan.setLastExecuteTimestamp(_ctx.longValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans["+ i +"].LastExecuteTimestamp"));
			recoveryPlan.setLastRollbackTime(_ctx.stringValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans["+ i +"].LastRollbackTime"));
			recoveryPlan.setLastRollbackTimestamp(_ctx.longValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans["+ i +"].LastRollbackTimestamp"));
			recoveryPlan.setCreateTime(_ctx.stringValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans["+ i +"].CreateTime"));
			recoveryPlan.setCreateTimestamp(_ctx.longValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans["+ i +"].CreateTimestamp"));
			recoveryPlan.setUpdateTime(_ctx.stringValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans["+ i +"].UpdateTime"));
			recoveryPlan.setUpdateTimestamp(_ctx.longValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans["+ i +"].UpdateTimestamp"));
			recoveryPlan.setStatus(_ctx.stringValue("DescribeGtmRecoveryPlansResponse.RecoveryPlans["+ i +"].Status"));

			recoveryPlans.add(recoveryPlan);
		}
		describeGtmRecoveryPlansResponse.setRecoveryPlans(recoveryPlans);
	 
	 	return describeGtmRecoveryPlansResponse;
	}
}