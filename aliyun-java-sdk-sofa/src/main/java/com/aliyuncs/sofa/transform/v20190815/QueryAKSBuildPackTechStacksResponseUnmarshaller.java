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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryAKSBuildPackTechStacksResponse;
import com.aliyuncs.sofa.model.v20190815.QueryAKSBuildPackTechStacksResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAKSBuildPackTechStacksResponseUnmarshaller {

	public static QueryAKSBuildPackTechStacksResponse unmarshall(QueryAKSBuildPackTechStacksResponse queryAKSBuildPackTechStacksResponse, UnmarshallerContext _ctx) {
		
		queryAKSBuildPackTechStacksResponse.setRequestId(_ctx.stringValue("QueryAKSBuildPackTechStacksResponse.RequestId"));
		queryAKSBuildPackTechStacksResponse.setResultCode(_ctx.stringValue("QueryAKSBuildPackTechStacksResponse.ResultCode"));
		queryAKSBuildPackTechStacksResponse.setResultMessage(_ctx.stringValue("QueryAKSBuildPackTechStacksResponse.ResultMessage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAKSBuildPackTechStacksResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setDescription(_ctx.stringValue("QueryAKSBuildPackTechStacksResponse.List["+ i +"].Description"));
			listItem.setIcon(_ctx.stringValue("QueryAKSBuildPackTechStacksResponse.List["+ i +"].Icon"));
			listItem.setId(_ctx.stringValue("QueryAKSBuildPackTechStacksResponse.List["+ i +"].Id"));
			listItem.setName(_ctx.stringValue("QueryAKSBuildPackTechStacksResponse.List["+ i +"].Name"));
			listItem.setOnline(_ctx.booleanValue("QueryAKSBuildPackTechStacksResponse.List["+ i +"].Online"));
			listItem.setOwner(_ctx.stringValue("QueryAKSBuildPackTechStacksResponse.List["+ i +"].Owner"));
			listItem.setRegionId(_ctx.stringValue("QueryAKSBuildPackTechStacksResponse.List["+ i +"].RegionId"));
			listItem.setScope(_ctx.stringValue("QueryAKSBuildPackTechStacksResponse.List["+ i +"].Scope"));
			listItem.setUtcCreated(_ctx.stringValue("QueryAKSBuildPackTechStacksResponse.List["+ i +"].UtcCreated"));
			listItem.setUtcModified(_ctx.stringValue("QueryAKSBuildPackTechStacksResponse.List["+ i +"].UtcModified"));

			list.add(listItem);
		}
		queryAKSBuildPackTechStacksResponse.setList(list);
	 
	 	return queryAKSBuildPackTechStacksResponse;
	}
}