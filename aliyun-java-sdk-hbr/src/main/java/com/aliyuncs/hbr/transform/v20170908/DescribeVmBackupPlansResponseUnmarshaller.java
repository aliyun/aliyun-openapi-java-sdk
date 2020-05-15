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

import com.aliyuncs.hbr.model.v20170908.DescribeVmBackupPlansResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeVmBackupPlansResponse.Plan;
import com.aliyuncs.hbr.model.v20170908.DescribeVmBackupPlansResponse.Plan.VmInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVmBackupPlansResponseUnmarshaller {

	public static DescribeVmBackupPlansResponse unmarshall(DescribeVmBackupPlansResponse describeVmBackupPlansResponse, UnmarshallerContext _ctx) {
		
		describeVmBackupPlansResponse.setRequestId(_ctx.stringValue("DescribeVmBackupPlansResponse.RequestId"));
		describeVmBackupPlansResponse.setSuccess(_ctx.booleanValue("DescribeVmBackupPlansResponse.Success"));
		describeVmBackupPlansResponse.setCode(_ctx.stringValue("DescribeVmBackupPlansResponse.Code"));
		describeVmBackupPlansResponse.setMessage(_ctx.stringValue("DescribeVmBackupPlansResponse.Message"));
		describeVmBackupPlansResponse.setTotalCount(_ctx.integerValue("DescribeVmBackupPlansResponse.TotalCount"));
		describeVmBackupPlansResponse.setPageNumber(_ctx.integerValue("DescribeVmBackupPlansResponse.PageNumber"));
		describeVmBackupPlansResponse.setPageSize(_ctx.integerValue("DescribeVmBackupPlansResponse.PageSize"));

		List<Plan> plans = new ArrayList<Plan>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVmBackupPlansResponse.Plans.Length"); i++) {
			Plan plan = new Plan();
			plan.setPlanId(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].PlanId"));
			plan.setPlanName(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].PlanName"));
			plan.setPlanStatus(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].PlanStatus"));
			plan.setServerType(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].ServerType"));
			plan.setRetention(_ctx.longValue("DescribeVmBackupPlansResponse.Plans["+ i +"].Retention"));
			plan.setFullSchedule(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].FullSchedule"));
			plan.setIncSchedule(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].IncSchedule"));
			plan.setDiffSchedule(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].DiffSchedule"));
			plan.setUpdatedTime(_ctx.longValue("DescribeVmBackupPlansResponse.Plans["+ i +"].UpdatedTime"));
			plan.setCreatedTime(_ctx.longValue("DescribeVmBackupPlansResponse.Plans["+ i +"].CreatedTime"));

			List<VmInfo> vmInfos = new ArrayList<VmInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVmBackupPlansResponse.Plans["+ i +"].VmInfos.Length"); j++) {
				VmInfo vmInfo = new VmInfo();
				vmInfo.setVmId(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].VmInfos["+ j +"].VmId"));
				vmInfo.setVmName(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].VmInfos["+ j +"].VmName"));
				vmInfo.setExtra(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].VmInfos["+ j +"].Extra"));
				vmInfo.setHypervisorId(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].VmInfos["+ j +"].HypervisorId"));
				vmInfo.setVmInfo(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].VmInfos["+ j +"].VmInfo"));
				vmInfo.setClientId(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].VmInfos["+ j +"].ClientId"));
				vmInfo.setForceSilentSnapshot(_ctx.booleanValue("DescribeVmBackupPlansResponse.Plans["+ i +"].VmInfos["+ j +"].ForceSilentSnapshot"));
				vmInfo.setHypervisorType(_ctx.stringValue("DescribeVmBackupPlansResponse.Plans["+ i +"].VmInfos["+ j +"].HypervisorType"));
				vmInfo.setUseHotAdd(_ctx.booleanValue("DescribeVmBackupPlansResponse.Plans["+ i +"].VmInfos["+ j +"].UseHotAdd"));

				vmInfos.add(vmInfo);
			}
			plan.setVmInfos(vmInfos);

			plans.add(plan);
		}
		describeVmBackupPlansResponse.setPlans(plans);
	 
	 	return describeVmBackupPlansResponse;
	}
}