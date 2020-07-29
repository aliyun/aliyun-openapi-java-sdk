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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.ListStackOperationRisksResponse;
import com.aliyuncs.ros.model.v20190910.ListStackOperationRisksResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStackOperationRisksResponseUnmarshaller {

	public static ListStackOperationRisksResponse unmarshall(ListStackOperationRisksResponse listStackOperationRisksResponse, UnmarshallerContext _ctx) {
		
		listStackOperationRisksResponse.setRequestId(_ctx.stringValue("ListStackOperationRisksResponse.RequestId"));

		List<Resource> riskResources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("ListStackOperationRisksResponse.RiskResources.Length"); i++) {
			Resource resource = new Resource();
			resource.setLogicalResourceId(_ctx.stringValue("ListStackOperationRisksResponse.RiskResources["+ i +"].LogicalResourceId"));
			resource.setPhysicalResourceId(_ctx.stringValue("ListStackOperationRisksResponse.RiskResources["+ i +"].PhysicalResourceId"));
			resource.setResourceType(_ctx.stringValue("ListStackOperationRisksResponse.RiskResources["+ i +"].ResourceType"));
			resource.setReason(_ctx.stringValue("ListStackOperationRisksResponse.RiskResources["+ i +"].Reason"));
			resource.setRiskType(_ctx.stringValue("ListStackOperationRisksResponse.RiskResources["+ i +"].RiskType"));
			resource.setCode(_ctx.stringValue("ListStackOperationRisksResponse.RiskResources["+ i +"].Code"));
			resource.setMessage(_ctx.stringValue("ListStackOperationRisksResponse.RiskResources["+ i +"].Message"));
			resource.setRequestId(_ctx.stringValue("ListStackOperationRisksResponse.RiskResources["+ i +"].RequestId"));

			riskResources.add(resource);
		}
		listStackOperationRisksResponse.setRiskResources(riskResources);
	 
	 	return listStackOperationRisksResponse;
	}
}