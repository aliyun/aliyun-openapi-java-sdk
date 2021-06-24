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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanSummaryResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanSummaryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeChangePlanSummaryResponseUnmarshaller {

	public static OpsDescribeChangePlanSummaryResponse unmarshall(OpsDescribeChangePlanSummaryResponse opsDescribeChangePlanSummaryResponse, UnmarshallerContext _ctx) {
		
		opsDescribeChangePlanSummaryResponse.setRequestId(_ctx.stringValue("OpsDescribeChangePlanSummaryResponse.RequestId"));
		opsDescribeChangePlanSummaryResponse.setMessage(_ctx.stringValue("OpsDescribeChangePlanSummaryResponse.Message"));
		opsDescribeChangePlanSummaryResponse.setCode(_ctx.stringValue("OpsDescribeChangePlanSummaryResponse.Code"));
		opsDescribeChangePlanSummaryResponse.setSuccess(_ctx.stringValue("OpsDescribeChangePlanSummaryResponse.Success"));

		Data data = new Data();
		data.setPlanId(_ctx.stringValue("OpsDescribeChangePlanSummaryResponse.Data.PlanId"));

		List<String> planGroupProgresses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeChangePlanSummaryResponse.Data.PlanGroupProgresses.Length"); i++) {
			planGroupProgresses.add(_ctx.stringValue("OpsDescribeChangePlanSummaryResponse.Data.PlanGroupProgresses["+ i +"]"));
		}
		data.setPlanGroupProgresses(planGroupProgresses);
		opsDescribeChangePlanSummaryResponse.setData(data);
	 
	 	return opsDescribeChangePlanSummaryResponse;
	}
}