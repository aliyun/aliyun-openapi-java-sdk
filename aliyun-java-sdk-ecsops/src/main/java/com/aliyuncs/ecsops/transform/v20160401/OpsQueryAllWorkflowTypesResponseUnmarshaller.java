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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryAllWorkflowTypesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryAllWorkflowTypesResponseUnmarshaller {

	public static OpsQueryAllWorkflowTypesResponse unmarshall(OpsQueryAllWorkflowTypesResponse opsQueryAllWorkflowTypesResponse, UnmarshallerContext _ctx) {
		

		List<String> workflowTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryAllWorkflowTypesResponse.WorkflowTypes.Length"); i++) {
			workflowTypes.add(_ctx.stringValue("OpsQueryAllWorkflowTypesResponse.WorkflowTypes["+ i +"]"));
		}
		opsQueryAllWorkflowTypesResponse.setWorkflowTypes(workflowTypes);
	 
	 	return opsQueryAllWorkflowTypesResponse;
	}
}