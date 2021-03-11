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

import com.aliyuncs.polardb.model.v20170801.DescribeParameterGroupResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeParameterGroupResponse.ParameterGroupItem;
import com.aliyuncs.polardb.model.v20170801.DescribeParameterGroupResponse.ParameterGroupItem.ParameterDetailItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterGroupResponseUnmarshaller {

	public static DescribeParameterGroupResponse unmarshall(DescribeParameterGroupResponse describeParameterGroupResponse, UnmarshallerContext _ctx) {
		
		describeParameterGroupResponse.setRequestId(_ctx.stringValue("DescribeParameterGroupResponse.RequestId"));

		List<ParameterGroupItem> parameterGroup = new ArrayList<ParameterGroupItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParameterGroupResponse.ParameterGroup.Length"); i++) {
			ParameterGroupItem parameterGroupItem = new ParameterGroupItem();
			parameterGroupItem.setDBVersion(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup["+ i +"].DBVersion"));
			parameterGroupItem.setParameterGroupId(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup["+ i +"].ParameterGroupId"));
			parameterGroupItem.setForceRestart(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup["+ i +"].ForceRestart"));
			parameterGroupItem.setParameterGroupName(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup["+ i +"].ParameterGroupName"));
			parameterGroupItem.setCreateTime(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup["+ i +"].CreateTime"));
			parameterGroupItem.setParameterGroupDesc(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup["+ i +"].ParameterGroupDesc"));
			parameterGroupItem.setParameterGroupType(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup["+ i +"].ParameterGroupType"));
			parameterGroupItem.setParameterCounts(_ctx.integerValue("DescribeParameterGroupResponse.ParameterGroup["+ i +"].ParameterCounts"));
			parameterGroupItem.setDBType(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup["+ i +"].DBType"));

			List<ParameterDetailItem> parameterDetail = new ArrayList<ParameterDetailItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeParameterGroupResponse.ParameterGroup["+ i +"].ParameterDetail.Length"); j++) {
				ParameterDetailItem parameterDetailItem = new ParameterDetailItem();
				parameterDetailItem.setParamValue(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup["+ i +"].ParameterDetail["+ j +"].ParamValue"));
				parameterDetailItem.setParamName(_ctx.stringValue("DescribeParameterGroupResponse.ParameterGroup["+ i +"].ParameterDetail["+ j +"].ParamName"));

				parameterDetail.add(parameterDetailItem);
			}
			parameterGroupItem.setParameterDetail(parameterDetail);

			parameterGroup.add(parameterGroupItem);
		}
		describeParameterGroupResponse.setParameterGroup(parameterGroup);
	 
	 	return describeParameterGroupResponse;
	}
}