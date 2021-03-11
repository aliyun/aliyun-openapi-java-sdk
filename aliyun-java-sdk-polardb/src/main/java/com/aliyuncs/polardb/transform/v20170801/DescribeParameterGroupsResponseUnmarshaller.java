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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeParameterGroupsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeParameterGroupsResponse.ParameterGroupsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterGroupsResponseUnmarshaller {

	public static DescribeParameterGroupsResponse unmarshall(DescribeParameterGroupsResponse describeParameterGroupsResponse, UnmarshallerContext _ctx) {
		
		describeParameterGroupsResponse.setRequestId(_ctx.stringValue("DescribeParameterGroupsResponse.RequestId"));

		List<ParameterGroupsItem> parameterGroups = new ArrayList<ParameterGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParameterGroupsResponse.ParameterGroups.Length"); i++) {
			ParameterGroupsItem parameterGroupsItem = new ParameterGroupsItem();
			parameterGroupsItem.setDBVersion(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].DBVersion"));
			parameterGroupsItem.setParameterGroupId(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterGroupId"));
			parameterGroupsItem.setDigitalId(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].DigitalId"));
			parameterGroupsItem.setForceRestart(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ForceRestart"));
			parameterGroupsItem.setParameterGroupName(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterGroupName"));
			parameterGroupsItem.setCreateTime(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].CreateTime"));
			parameterGroupsItem.setParameterGroupDesc(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterGroupDesc"));
			parameterGroupsItem.setParameterGroupType(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterGroupType"));
			parameterGroupsItem.setParameterCounts(_ctx.longValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterCounts"));
			parameterGroupsItem.setDBType(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].DBType"));

			parameterGroups.add(parameterGroupsItem);
		}
		describeParameterGroupsResponse.setParameterGroups(parameterGroups);
	 
	 	return describeParameterGroupsResponse;
	}
}