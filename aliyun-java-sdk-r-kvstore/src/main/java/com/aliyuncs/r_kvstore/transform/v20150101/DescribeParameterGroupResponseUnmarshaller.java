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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeParameterGroupResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeParameterGroupResponse.ParameterGroup;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeParameterGroupResponse.ParameterGroup.ParamGroupDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterGroupResponseUnmarshaller {

	public static DescribeParameterGroupResponse unmarshall(DescribeParameterGroupResponse describeParameterGroupResponse, UnmarshallerContext _ctx) {
		
		describeParameterGroupResponse.setRequestId(_ctx.stringValue("DescribeParameterGroupResponse.RequestId"));

		ParameterGroup parameterGroup = new ParameterGroup();
		parameterGroup.setEngineVersion(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup.EngineVersion"));
		parameterGroup.setModified(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup.Modified"));
		parameterGroup.setParameterGroupName(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup.ParameterGroupName"));
		parameterGroup.setParameterGroupDesc(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup.ParameterGroupDesc"));
		parameterGroup.setEngine(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup.Engine"));
		parameterGroup.setParamGroupId(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup.ParamGroupId"));
		parameterGroup.setCreated(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup.Created"));
		parameterGroup.setCategory(_ctx.longValue("DescribeParameterGroupResponse.ParameterGroup.Category"));

		List<ParamGroupDetail> paramGroupsDetails = new ArrayList<ParamGroupDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParameterGroupResponse.ParameterGroup.ParamGroupsDetails.Length"); i++) {
			ParamGroupDetail paramGroupDetail = new ParamGroupDetail();
			paramGroupDetail.setParamName(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup.ParamGroupsDetails["+ i +"].ParamName"));
			paramGroupDetail.setParamValue(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup.ParamGroupsDetails["+ i +"].ParamValue"));

			paramGroupsDetails.add(paramGroupDetail);
		}
		parameterGroup.setParamGroupsDetails(paramGroupsDetails);
		describeParameterGroupResponse.setParameterGroup(parameterGroup);
	 
	 	return describeParameterGroupResponse;
	}
}