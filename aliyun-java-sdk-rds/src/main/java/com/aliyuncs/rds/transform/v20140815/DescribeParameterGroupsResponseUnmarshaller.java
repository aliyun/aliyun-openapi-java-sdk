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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeParameterGroupsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeParameterGroupsResponse.ParameterGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterGroupsResponseUnmarshaller {

	public static DescribeParameterGroupsResponse unmarshall(DescribeParameterGroupsResponse describeParameterGroupsResponse, UnmarshallerContext _ctx) {
		
		describeParameterGroupsResponse.setRequestId(_ctx.stringValue("DescribeParameterGroupsResponse.RequestId"));
		describeParameterGroupsResponse.setSignalForOptimizeParams(_ctx.booleanValue("DescribeParameterGroupsResponse.SignalForOptimizeParams"));

		List<ParameterGroup> parameterGroups = new ArrayList<ParameterGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParameterGroupsResponse.ParameterGroups.Length"); i++) {
			ParameterGroup parameterGroup = new ParameterGroup();
			parameterGroup.setUpdateTime(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].UpdateTime"));
			parameterGroup.setParameterGroupDesc(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterGroupDesc"));
			parameterGroup.setCreateTime(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].CreateTime"));
			parameterGroup.setForceRestart(_ctx.integerValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ForceRestart"));
			parameterGroup.setParameterGroupId(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterGroupId"));
			parameterGroup.setParameterGroupName(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterGroupName"));
			parameterGroup.setEngine(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].Engine"));
			parameterGroup.setParamCounts(_ctx.integerValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParamCounts"));
			parameterGroup.setEngineVersion(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].EngineVersion"));
			parameterGroup.setParameterGroupType(_ctx.integerValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterGroupType"));

			parameterGroups.add(parameterGroup);
		}
		describeParameterGroupsResponse.setParameterGroups(parameterGroups);
	 
	 	return describeParameterGroupsResponse;
	}
}