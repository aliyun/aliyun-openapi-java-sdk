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

import com.aliyuncs.rds.model.v20140815.DescribeParameterGroupResponse;
import com.aliyuncs.rds.model.v20140815.DescribeParameterGroupResponse.ParameterGroup;
import com.aliyuncs.rds.model.v20140815.DescribeParameterGroupResponse.ParameterGroup.ParameterDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterGroupResponseUnmarshaller {

	public static DescribeParameterGroupResponse unmarshall(DescribeParameterGroupResponse describeParameterGroupResponse, UnmarshallerContext _ctx) {
		
		describeParameterGroupResponse.setRequestId(_ctx.stringValue("DescribeParameterGroupResponse.RequestId"));

		List<ParameterGroup> paramGroup = new ArrayList<ParameterGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParameterGroupResponse.ParamGroup.Length"); i++) {
			ParameterGroup parameterGroup = new ParameterGroup();
			parameterGroup.setParameterGroupType(_ctx.integerValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParameterGroupType"));
			parameterGroup.setParameterGroupName(_ctx.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParameterGroupName"));
			parameterGroup.setParamCounts(_ctx.integerValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParamCounts"));
			parameterGroup.setParameterGroupDesc(_ctx.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParameterGroupDesc"));
			parameterGroup.setForceRestart(_ctx.integerValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ForceRestart"));
			parameterGroup.setEngine(_ctx.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].Engine"));
			parameterGroup.setEngineVersion(_ctx.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].EngineVersion"));
			parameterGroup.setParameterGroupId(_ctx.integerValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParameterGroupId"));
			parameterGroup.setCreateTime(_ctx.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].CreateTime"));
			parameterGroup.setUpdateTime(_ctx.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].UpdateTime"));

			List<ParameterDetail> paramDetail = new ArrayList<ParameterDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParamDetail.Length"); j++) {
				ParameterDetail parameterDetail = new ParameterDetail();
				parameterDetail.setParamName(_ctx.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParamDetail["+ j +"].ParamName"));
				parameterDetail.setParamValue(_ctx.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParamDetail["+ j +"].ParamValue"));

				paramDetail.add(parameterDetail);
			}
			parameterGroup.setParamDetail(paramDetail);

			paramGroup.add(parameterGroup);
		}
		describeParameterGroupResponse.setParamGroup(paramGroup);
	 
	 	return describeParameterGroupResponse;
	}
}