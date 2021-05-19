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

import com.aliyuncs.cccxspaceinner.model.v20191227.QueryAgentGroupByBuIdResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryAgentGroupByBuIdResponse.XspaceAgentGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAgentGroupByBuIdResponseUnmarshaller {

	public static QueryAgentGroupByBuIdResponse unmarshall(QueryAgentGroupByBuIdResponse queryAgentGroupByBuIdResponse, UnmarshallerContext _ctx) {
		
		queryAgentGroupByBuIdResponse.setMessage(_ctx.stringValue("QueryAgentGroupByBuIdResponse.Message"));
		queryAgentGroupByBuIdResponse.setCode(_ctx.stringValue("QueryAgentGroupByBuIdResponse.Code"));
		queryAgentGroupByBuIdResponse.setSuccess(_ctx.booleanValue("QueryAgentGroupByBuIdResponse.Success"));

		List<XspaceAgentGroup> data = new ArrayList<XspaceAgentGroup>();
		for (int i = 0; i < _ctx.lengthValue("QueryAgentGroupByBuIdResponse.Data.Length"); i++) {
			XspaceAgentGroup xspaceAgentGroup = new XspaceAgentGroup();
			xspaceAgentGroup.setStatus(_ctx.integerValue("QueryAgentGroupByBuIdResponse.Data["+ i +"].Status"));
			xspaceAgentGroup.setBuId(_ctx.longValue("QueryAgentGroupByBuIdResponse.Data["+ i +"].BuId"));
			xspaceAgentGroup.setShowName(_ctx.stringValue("QueryAgentGroupByBuIdResponse.Data["+ i +"].ShowName"));
			xspaceAgentGroup.setDescription(_ctx.stringValue("QueryAgentGroupByBuIdResponse.Data["+ i +"].Description"));
			xspaceAgentGroup.setGroupId(_ctx.longValue("QueryAgentGroupByBuIdResponse.Data["+ i +"].GroupId"));
			xspaceAgentGroup.setGroupName(_ctx.stringValue("QueryAgentGroupByBuIdResponse.Data["+ i +"].GroupName"));
			xspaceAgentGroup.setDepartmentId(_ctx.longValue("QueryAgentGroupByBuIdResponse.Data["+ i +"].DepartmentId"));
			xspaceAgentGroup.setIsPublic(_ctx.booleanValue("QueryAgentGroupByBuIdResponse.Data["+ i +"].IsPublic"));

			data.add(xspaceAgentGroup);
		}
		queryAgentGroupByBuIdResponse.setData(data);
	 
	 	return queryAgentGroupByBuIdResponse;
	}
}