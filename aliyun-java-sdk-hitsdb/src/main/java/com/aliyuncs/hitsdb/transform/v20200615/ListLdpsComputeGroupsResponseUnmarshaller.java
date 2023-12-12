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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.ListLdpsComputeGroupsResponse;
import com.aliyuncs.hitsdb.model.v20200615.ListLdpsComputeGroupsResponse.ComputeGroup;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLdpsComputeGroupsResponseUnmarshaller {

	public static ListLdpsComputeGroupsResponse unmarshall(ListLdpsComputeGroupsResponse listLdpsComputeGroupsResponse, UnmarshallerContext _ctx) {
		
		listLdpsComputeGroupsResponse.setRequestId(_ctx.stringValue("ListLdpsComputeGroupsResponse.RequestId"));

		List<ComputeGroup> groupList = new ArrayList<ComputeGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListLdpsComputeGroupsResponse.GroupList.Length"); i++) {
			ComputeGroup computeGroup = new ComputeGroup();
			computeGroup.setGroupName(_ctx.stringValue("ListLdpsComputeGroupsResponse.GroupList["+ i +"].GroupName"));
			computeGroup.setProperties(_ctx.mapValue("ListLdpsComputeGroupsResponse.GroupList["+ i +"].Properties"));

			groupList.add(computeGroup);
		}
		listLdpsComputeGroupsResponse.setGroupList(groupList);
	 
	 	return listLdpsComputeGroupsResponse;
	}
}