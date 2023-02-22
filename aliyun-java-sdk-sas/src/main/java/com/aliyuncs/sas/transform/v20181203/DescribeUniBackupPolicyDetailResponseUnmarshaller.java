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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeUniBackupPolicyDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO;
import com.aliyuncs.sas.model.v20181203.DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.FullPlan;
import com.aliyuncs.sas.model.v20181203.DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.IncPlan;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUniBackupPolicyDetailResponseUnmarshaller {

	public static DescribeUniBackupPolicyDetailResponse unmarshall(DescribeUniBackupPolicyDetailResponse describeUniBackupPolicyDetailResponse, UnmarshallerContext _ctx) {
		
		describeUniBackupPolicyDetailResponse.setRequestId(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.RequestId"));

		UniBackupPolicyDTO uniBackupPolicyDTO = new UniBackupPolicyDTO();
		uniBackupPolicyDTO.setPolicyStatus(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.PolicyStatus"));
		uniBackupPolicyDTO.setDatabaseType(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.DatabaseType"));
		uniBackupPolicyDTO.setUniBackUpCount(_ctx.integerValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.UniBackUpCount"));
		uniBackupPolicyDTO.setInstanceName(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.InstanceName"));
		uniBackupPolicyDTO.setRetention(_ctx.integerValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.Retention"));
		uniBackupPolicyDTO.setSpeedLimiter(_ctx.longValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.SpeedLimiter"));
		uniBackupPolicyDTO.setPolicyName(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.PolicyName"));
		uniBackupPolicyDTO.setInstanceId(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.InstanceId"));
		uniBackupPolicyDTO.setPolicyId(_ctx.longValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.PolicyId"));
		uniBackupPolicyDTO.setAgentStatus(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.AgentStatus"));
		uniBackupPolicyDTO.setAccountName(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.AccountName"));

		FullPlan fullPlan = new FullPlan();
		fullPlan.setStartTime(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.FullPlan.StartTime"));
		fullPlan.setPlanType(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.FullPlan.PlanType"));
		fullPlan.setInterval(_ctx.integerValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.FullPlan.Interval"));

		List<String> days = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.FullPlan.Days.Length"); i++) {
			days.add(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.FullPlan.Days["+ i +"]"));
		}
		fullPlan.setDays(days);
		uniBackupPolicyDTO.setFullPlan(fullPlan);

		IncPlan incPlan = new IncPlan();
		incPlan.setStartTime(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.IncPlan.StartTime"));
		incPlan.setPlanType(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.IncPlan.PlanType"));
		incPlan.setInterval(_ctx.integerValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.IncPlan.Interval"));

		List<String> days1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.IncPlan.Days.Length"); i++) {
			days1.add(_ctx.stringValue("DescribeUniBackupPolicyDetailResponse.UniBackupPolicyDTO.IncPlan.Days["+ i +"]"));
		}
		incPlan.setDays1(days1);
		uniBackupPolicyDTO.setIncPlan(incPlan);
		describeUniBackupPolicyDetailResponse.setUniBackupPolicyDTO(uniBackupPolicyDTO);
	 
	 	return describeUniBackupPolicyDetailResponse;
	}
}