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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeDBResourceGroupResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBResourceGroupResponse.PoolInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBResourceGroupResponseUnmarshaller {

	public static DescribeDBResourceGroupResponse unmarshall(DescribeDBResourceGroupResponse describeDBResourceGroupResponse, UnmarshallerContext _ctx) {
		
		describeDBResourceGroupResponse.setRequestId(_ctx.stringValue("DescribeDBResourceGroupResponse.RequestId"));

		List<PoolInfo> groupsInfo = new ArrayList<PoolInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBResourceGroupResponse.GroupsInfo.Length"); i++) {
			PoolInfo poolInfo = new PoolInfo();
			poolInfo.setGroupType(_ctx.stringValue("DescribeDBResourceGroupResponse.GroupsInfo["+ i +"].GroupType"));
			poolInfo.setUpdateTime(_ctx.stringValue("DescribeDBResourceGroupResponse.GroupsInfo["+ i +"].UpdateTime"));
			poolInfo.setGroupName(_ctx.stringValue("DescribeDBResourceGroupResponse.GroupsInfo["+ i +"].GroupName"));
			poolInfo.setCreateTime(_ctx.stringValue("DescribeDBResourceGroupResponse.GroupsInfo["+ i +"].CreateTime"));
			poolInfo.setGroupUsers(_ctx.stringValue("DescribeDBResourceGroupResponse.GroupsInfo["+ i +"].GroupUsers"));
			poolInfo.setNodeNum(_ctx.integerValue("DescribeDBResourceGroupResponse.GroupsInfo["+ i +"].NodeNum"));

			groupsInfo.add(poolInfo);
		}
		describeDBResourceGroupResponse.setGroupsInfo(groupsInfo);
	 
	 	return describeDBResourceGroupResponse;
	}
}