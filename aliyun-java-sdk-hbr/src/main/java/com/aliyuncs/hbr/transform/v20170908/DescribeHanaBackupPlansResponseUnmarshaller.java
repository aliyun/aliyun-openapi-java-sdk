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

import com.aliyuncs.hbr.model.v20170908.DescribeHanaBackupPlansResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeHanaBackupPlansResponse.HanaBackupPlan;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHanaBackupPlansResponseUnmarshaller {

	public static DescribeHanaBackupPlansResponse unmarshall(DescribeHanaBackupPlansResponse describeHanaBackupPlansResponse, UnmarshallerContext _ctx) {
		
		describeHanaBackupPlansResponse.setRequestId(_ctx.stringValue("DescribeHanaBackupPlansResponse.RequestId"));
		describeHanaBackupPlansResponse.setSuccess(_ctx.booleanValue("DescribeHanaBackupPlansResponse.Success"));
		describeHanaBackupPlansResponse.setCode(_ctx.stringValue("DescribeHanaBackupPlansResponse.Code"));
		describeHanaBackupPlansResponse.setMessage(_ctx.stringValue("DescribeHanaBackupPlansResponse.Message"));
		describeHanaBackupPlansResponse.setTotalCount(_ctx.longValue("DescribeHanaBackupPlansResponse.TotalCount"));
		describeHanaBackupPlansResponse.setPageSize(_ctx.integerValue("DescribeHanaBackupPlansResponse.PageSize"));
		describeHanaBackupPlansResponse.setPageNumber(_ctx.integerValue("DescribeHanaBackupPlansResponse.PageNumber"));

		List<HanaBackupPlan> hanaBackupPlans = new ArrayList<HanaBackupPlan>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHanaBackupPlansResponse.HanaBackupPlans.Length"); i++) {
			HanaBackupPlan hanaBackupPlan = new HanaBackupPlan();
			hanaBackupPlan.setPlanId(_ctx.stringValue("DescribeHanaBackupPlansResponse.HanaBackupPlans["+ i +"].PlanId"));
			hanaBackupPlan.setPlanName(_ctx.stringValue("DescribeHanaBackupPlansResponse.HanaBackupPlans["+ i +"].PlanName"));
			hanaBackupPlan.setBackupType(_ctx.stringValue("DescribeHanaBackupPlansResponse.HanaBackupPlans["+ i +"].BackupType"));
			hanaBackupPlan.setDatabaseName(_ctx.stringValue("DescribeHanaBackupPlansResponse.HanaBackupPlans["+ i +"].DatabaseName"));
			hanaBackupPlan.setBackupPrefix(_ctx.stringValue("DescribeHanaBackupPlansResponse.HanaBackupPlans["+ i +"].BackupPrefix"));
			hanaBackupPlan.setSchedule(_ctx.stringValue("DescribeHanaBackupPlansResponse.HanaBackupPlans["+ i +"].Schedule"));
			hanaBackupPlan.setDisabled(_ctx.booleanValue("DescribeHanaBackupPlansResponse.HanaBackupPlans["+ i +"].Disabled"));
			hanaBackupPlan.setVaultId(_ctx.stringValue("DescribeHanaBackupPlansResponse.HanaBackupPlans["+ i +"].VaultId"));
			hanaBackupPlan.setClusterId(_ctx.stringValue("DescribeHanaBackupPlansResponse.HanaBackupPlans["+ i +"].ClusterId"));

			hanaBackupPlans.add(hanaBackupPlan);
		}
		describeHanaBackupPlansResponse.setHanaBackupPlans(hanaBackupPlans);
	 
	 	return describeHanaBackupPlansResponse;
	}
}