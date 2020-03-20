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

import com.aliyuncs.ros.model.v20190910.ListStackGroupsResponse;
import com.aliyuncs.ros.model.v20190910.ListStackGroupsResponse.StackGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStackGroupsResponseUnmarshaller {

	public static ListStackGroupsResponse unmarshall(ListStackGroupsResponse listStackGroupsResponse, UnmarshallerContext _ctx) {
		
		listStackGroupsResponse.setRequestId(_ctx.stringValue("ListStackGroupsResponse.RequestId"));
		listStackGroupsResponse.setPageNumber(_ctx.integerValue("ListStackGroupsResponse.PageNumber"));
		listStackGroupsResponse.setPageSize(_ctx.integerValue("ListStackGroupsResponse.PageSize"));
		listStackGroupsResponse.setTotalCount(_ctx.integerValue("ListStackGroupsResponse.TotalCount"));

		List<StackGroup> stackGroups = new ArrayList<StackGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListStackGroupsResponse.StackGroups.Length"); i++) {
			StackGroup stackGroup = new StackGroup();
			stackGroup.setStackGroupName(_ctx.stringValue("ListStackGroupsResponse.StackGroups["+ i +"].StackGroupName"));
			stackGroup.setStackGroupId(_ctx.stringValue("ListStackGroupsResponse.StackGroups["+ i +"].StackGroupId"));
			stackGroup.setStatus(_ctx.stringValue("ListStackGroupsResponse.StackGroups["+ i +"].Status"));
			stackGroup.setDescription(_ctx.stringValue("ListStackGroupsResponse.StackGroups["+ i +"].Description"));
			stackGroup.setDriftDetectionTime(_ctx.stringValue("ListStackGroupsResponse.StackGroups["+ i +"].DriftDetectionTime"));
			stackGroup.setStackGroupDriftStatus(_ctx.stringValue("ListStackGroupsResponse.StackGroups["+ i +"].StackGroupDriftStatus"));

			stackGroups.add(stackGroup);
		}
		listStackGroupsResponse.setStackGroups(stackGroups);
	 
	 	return listStackGroupsResponse;
	}
}