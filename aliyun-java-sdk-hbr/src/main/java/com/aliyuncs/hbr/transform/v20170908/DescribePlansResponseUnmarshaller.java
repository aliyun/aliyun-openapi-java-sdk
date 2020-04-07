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

import com.aliyuncs.hbr.model.v20170908.DescribePlansResponse;
import com.aliyuncs.hbr.model.v20170908.DescribePlansResponse.Plan;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlansResponseUnmarshaller {

	public static DescribePlansResponse unmarshall(DescribePlansResponse describePlansResponse, UnmarshallerContext _ctx) {
		
		describePlansResponse.setRequestId(_ctx.stringValue("DescribePlansResponse.RequestId"));
		describePlansResponse.setSuccess(_ctx.booleanValue("DescribePlansResponse.Success"));
		describePlansResponse.setCode(_ctx.stringValue("DescribePlansResponse.Code"));
		describePlansResponse.setMessage(_ctx.stringValue("DescribePlansResponse.Message"));
		describePlansResponse.setTotalCount(_ctx.integerValue("DescribePlansResponse.TotalCount"));
		describePlansResponse.setPageSize(_ctx.integerValue("DescribePlansResponse.PageSize"));
		describePlansResponse.setPageNumber(_ctx.integerValue("DescribePlansResponse.PageNumber"));

		List<Plan> plans = new ArrayList<Plan>();
		for (int i = 0; i < _ctx.lengthValue("DescribePlansResponse.Plans.Length"); i++) {
			Plan plan = new Plan();
			plan.setCreatedTime(_ctx.longValue("DescribePlansResponse.Plans["+ i +"].CreatedTime"));
			plan.setUpdatedTime(_ctx.longValue("DescribePlansResponse.Plans["+ i +"].UpdatedTime"));
			plan.setPlanId(_ctx.stringValue("DescribePlansResponse.Plans["+ i +"].PlanId"));
			plan.setClientId(_ctx.stringValue("DescribePlansResponse.Plans["+ i +"].ClientId"));
			plan.setVaultId(_ctx.stringValue("DescribePlansResponse.Plans["+ i +"].VaultId"));
			plan.setPlanName(_ctx.stringValue("DescribePlansResponse.Plans["+ i +"].PlanName"));
			plan.setPlanStatus(_ctx.stringValue("DescribePlansResponse.Plans["+ i +"].PlanStatus"));
			plan.setSourceType(_ctx.stringValue("DescribePlansResponse.Plans["+ i +"].SourceType"));
			plan.setSource(_ctx.stringValue("DescribePlansResponse.Plans["+ i +"].Source"));
			plan.setRetention(_ctx.longValue("DescribePlansResponse.Plans["+ i +"].Retention"));
			plan.setScheduleType(_ctx.stringValue("DescribePlansResponse.Plans["+ i +"].ScheduleType"));
			plan.setFullPolicyId(_ctx.stringValue("DescribePlansResponse.Plans["+ i +"].FullPolicyId"));
			plan.setIncPolicyId(_ctx.stringValue("DescribePlansResponse.Plans["+ i +"].IncPolicyId"));
			plan.setDiffPolicyId(_ctx.stringValue("DescribePlansResponse.Plans["+ i +"].DiffPolicyId"));
			plan.setIsRemoved(_ctx.booleanValue("DescribePlansResponse.Plans["+ i +"].IsRemoved"));
			plan.setServerId(_ctx.stringValue("DescribePlansResponse.Plans["+ i +"].ServerId"));
			plan.setServerType(_ctx.stringValue("DescribePlansResponse.Plans["+ i +"].ServerType"));

			plans.add(plan);
		}
		describePlansResponse.setPlans(plans);
	 
	 	return describePlansResponse;
	}
}