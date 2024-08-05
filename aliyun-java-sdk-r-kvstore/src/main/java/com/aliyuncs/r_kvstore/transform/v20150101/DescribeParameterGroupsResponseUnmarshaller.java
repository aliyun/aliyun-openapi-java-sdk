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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeParameterGroupsResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeParameterGroupsResponse.ParameterGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterGroupsResponseUnmarshaller {

	public static DescribeParameterGroupsResponse unmarshall(DescribeParameterGroupsResponse describeParameterGroupsResponse, UnmarshallerContext _ctx) {
		
		describeParameterGroupsResponse.setRequestId(_ctx.stringValue("DescribeParameterGroupsResponse.RequestId"));

		List<ParameterGroup> parameterGroups = new ArrayList<ParameterGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParameterGroupsResponse.ParameterGroups.Length"); i++) {
			ParameterGroup parameterGroup = new ParameterGroup();
			parameterGroup.setEngineVersion(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].EngineVersion"));
			parameterGroup.setModified(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].Modified"));
			parameterGroup.setParameterGroupName(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterGroupName"));
			parameterGroup.setParameterGroupDesc(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterGroupDesc"));
			parameterGroup.setEngine(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].Engine"));
			parameterGroup.setParamGroupId(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParamGroupId"));
			parameterGroup.setCreated(_ctx.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].Created"));
			parameterGroup.setCategory(_ctx.longValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].Category"));

			parameterGroups.add(parameterGroup);
		}
		describeParameterGroupsResponse.setParameterGroups(parameterGroups);
	 
	 	return describeParameterGroupsResponse;
	}
}