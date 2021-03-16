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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cccxspaceinner.model.v20191227.QueryManagedAgentGroupResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryManagedAgentGroupResponse.XspaceAgentGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryManagedAgentGroupResponseUnmarshaller {

	public static QueryManagedAgentGroupResponse unmarshall(QueryManagedAgentGroupResponse queryManagedAgentGroupResponse, UnmarshallerContext _ctx) {
		
		queryManagedAgentGroupResponse.setSuccess(_ctx.booleanValue("QueryManagedAgentGroupResponse.Success"));
		queryManagedAgentGroupResponse.setCode(_ctx.stringValue("QueryManagedAgentGroupResponse.Code"));
		queryManagedAgentGroupResponse.setMessage(_ctx.stringValue("QueryManagedAgentGroupResponse.Message"));

		List<XspaceAgentGroup> data = new ArrayList<XspaceAgentGroup>();
		for (int i = 0; i < _ctx.lengthValue("QueryManagedAgentGroupResponse.Data.Length"); i++) {
			XspaceAgentGroup xspaceAgentGroup = new XspaceAgentGroup();
			xspaceAgentGroup.setBuId(_ctx.longValue("QueryManagedAgentGroupResponse.Data["+ i +"].BuId"));
			xspaceAgentGroup.setDepartmentId(_ctx.longValue("QueryManagedAgentGroupResponse.Data["+ i +"].DepartmentId"));
			xspaceAgentGroup.setGroupId(_ctx.longValue("QueryManagedAgentGroupResponse.Data["+ i +"].GroupId"));
			xspaceAgentGroup.setGroupName(_ctx.stringValue("QueryManagedAgentGroupResponse.Data["+ i +"].GroupName"));
			xspaceAgentGroup.setShowName(_ctx.stringValue("QueryManagedAgentGroupResponse.Data["+ i +"].ShowName"));
			xspaceAgentGroup.setIsPublic(_ctx.booleanValue("QueryManagedAgentGroupResponse.Data["+ i +"].IsPublic"));
			xspaceAgentGroup.setStatus(_ctx.integerValue("QueryManagedAgentGroupResponse.Data["+ i +"].Status"));

			data.add(xspaceAgentGroup);
		}
		queryManagedAgentGroupResponse.setData(data);
	 
	 	return queryManagedAgentGroupResponse;
	}
}