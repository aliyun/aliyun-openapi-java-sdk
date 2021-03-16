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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanDetailResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeChangePlanDetailResponseUnmarshaller {

	public static OpsDescribeChangePlanDetailResponse unmarshall(OpsDescribeChangePlanDetailResponse opsDescribeChangePlanDetailResponse, UnmarshallerContext _ctx) {
		
		opsDescribeChangePlanDetailResponse.setRequestId(_ctx.stringValue("OpsDescribeChangePlanDetailResponse.RequestId"));
		opsDescribeChangePlanDetailResponse.setCode(_ctx.stringValue("OpsDescribeChangePlanDetailResponse.Code"));
		opsDescribeChangePlanDetailResponse.setMessage(_ctx.stringValue("OpsDescribeChangePlanDetailResponse.Message"));
		opsDescribeChangePlanDetailResponse.setSuccess(_ctx.stringValue("OpsDescribeChangePlanDetailResponse.Success"));

		Data data = new Data();
		data.setPlanId(_ctx.stringValue("OpsDescribeChangePlanDetailResponse.Data.PlanId"));
		data.setBatchNo(_ctx.integerValue("OpsDescribeChangePlanDetailResponse.Data.BatchNo"));
		data.setTotalSize(_ctx.integerValue("OpsDescribeChangePlanDetailResponse.Data.TotalSize"));
		data.setLastBatch(_ctx.booleanValue("OpsDescribeChangePlanDetailResponse.Data.LastBatch"));

		List<String> resources = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeChangePlanDetailResponse.Data.Resources.Length"); i++) {
			resources.add(_ctx.stringValue("OpsDescribeChangePlanDetailResponse.Data.Resources["+ i +"]"));
		}
		data.setResources(resources);
		opsDescribeChangePlanDetailResponse.setData(data);
	 
	 	return opsDescribeChangePlanDetailResponse;
	}
}