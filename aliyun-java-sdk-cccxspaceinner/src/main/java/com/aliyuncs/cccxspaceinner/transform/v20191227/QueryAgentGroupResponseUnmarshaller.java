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

import com.aliyuncs.cccxspaceinner.model.v20191227.QueryAgentGroupResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryAgentGroupResponse.XspaceAgentGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAgentGroupResponseUnmarshaller {

	public static QueryAgentGroupResponse unmarshall(QueryAgentGroupResponse queryAgentGroupResponse, UnmarshallerContext _ctx) {
		
		queryAgentGroupResponse.setSuccess(_ctx.booleanValue("QueryAgentGroupResponse.Success"));
		queryAgentGroupResponse.setCode(_ctx.stringValue("QueryAgentGroupResponse.Code"));
		queryAgentGroupResponse.setMessage(_ctx.stringValue("QueryAgentGroupResponse.Message"));

		List<XspaceAgentGroup> data = new ArrayList<XspaceAgentGroup>();
		for (int i = 0; i < _ctx.lengthValue("QueryAgentGroupResponse.Data.Length"); i++) {
			XspaceAgentGroup xspaceAgentGroup = new XspaceAgentGroup();
			xspaceAgentGroup.setBuId(_ctx.longValue("QueryAgentGroupResponse.Data["+ i +"].BuId"));
			xspaceAgentGroup.setDepartmentId(_ctx.longValue("QueryAgentGroupResponse.Data["+ i +"].DepartmentId"));
			xspaceAgentGroup.setGroupId(_ctx.longValue("QueryAgentGroupResponse.Data["+ i +"].GroupId"));

			data.add(xspaceAgentGroup);
		}
		queryAgentGroupResponse.setData(data);
	 
	 	return queryAgentGroupResponse;
	}
}