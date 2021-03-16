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

import com.aliyuncs.ecsops.model.v20160401.OpsListPlanResourcesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListPlanResourcesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListPlanResourcesResponseUnmarshaller {

	public static OpsListPlanResourcesResponse unmarshall(OpsListPlanResourcesResponse opsListPlanResourcesResponse, UnmarshallerContext _ctx) {
		
		opsListPlanResourcesResponse.setRequestId(_ctx.stringValue("OpsListPlanResourcesResponse.RequestId"));
		opsListPlanResourcesResponse.setCode(_ctx.stringValue("OpsListPlanResourcesResponse.Code"));
		opsListPlanResourcesResponse.setMessage(_ctx.stringValue("OpsListPlanResourcesResponse.Message"));
		opsListPlanResourcesResponse.setSuccess(_ctx.stringValue("OpsListPlanResourcesResponse.Success"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("OpsListPlanResourcesResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("OpsListPlanResourcesResponse.Data.PageSize"));
		data.setTotalSize(_ctx.integerValue("OpsListPlanResourcesResponse.Data.TotalSize"));

		List<String> resources = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsListPlanResourcesResponse.Data.Resources.Length"); i++) {
			resources.add(_ctx.stringValue("OpsListPlanResourcesResponse.Data.Resources["+ i +"]"));
		}
		data.setResources(resources);
		opsListPlanResourcesResponse.setData(data);
	 
	 	return opsListPlanResourcesResponse;
	}
}