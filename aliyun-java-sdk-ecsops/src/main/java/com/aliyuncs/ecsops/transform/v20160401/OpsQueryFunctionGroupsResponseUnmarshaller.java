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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryFunctionGroupsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryFunctionGroupsResponse.FunctionGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryFunctionGroupsResponseUnmarshaller {

	public static OpsQueryFunctionGroupsResponse unmarshall(OpsQueryFunctionGroupsResponse opsQueryFunctionGroupsResponse, UnmarshallerContext _ctx) {
		
		opsQueryFunctionGroupsResponse.setRequestId(_ctx.stringValue("OpsQueryFunctionGroupsResponse.RequestId"));

		List<FunctionGroup> functionGroups = new ArrayList<FunctionGroup>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryFunctionGroupsResponse.FunctionGroups.Length"); i++) {
			FunctionGroup functionGroup = new FunctionGroup();
			functionGroup.setId(_ctx.longValue("OpsQueryFunctionGroupsResponse.FunctionGroups["+ i +"].Id"));
			functionGroup.setGroupId(_ctx.stringValue("OpsQueryFunctionGroupsResponse.FunctionGroups["+ i +"].GroupId"));
			functionGroup.setGroupName(_ctx.stringValue("OpsQueryFunctionGroupsResponse.FunctionGroups["+ i +"].GroupName"));
			functionGroup.setGroupCategory(_ctx.stringValue("OpsQueryFunctionGroupsResponse.FunctionGroups["+ i +"].GroupCategory"));
			functionGroup.setPriority(_ctx.integerValue("OpsQueryFunctionGroupsResponse.FunctionGroups["+ i +"].Priority"));
			functionGroup.setParentGroupId(_ctx.stringValue("OpsQueryFunctionGroupsResponse.FunctionGroups["+ i +"].ParentGroupId"));

			functionGroups.add(functionGroup);
		}
		opsQueryFunctionGroupsResponse.setFunctionGroups(functionGroups);
	 
	 	return opsQueryFunctionGroupsResponse;
	}
}