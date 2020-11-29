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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeParametersResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeParametersResponse.ParametersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParametersResponseUnmarshaller {

	public static DescribeParametersResponse unmarshall(DescribeParametersResponse describeParametersResponse, UnmarshallerContext _ctx) {
		
		describeParametersResponse.setRequestId(_ctx.stringValue("DescribeParametersResponse.RequestId"));

		List<ParametersItem> parameters = new ArrayList<ParametersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersResponse.Parameters.Length"); i++) {
			ParametersItem parametersItem = new ParametersItem();
			parametersItem.setParameterName(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].ParameterName"));
			parametersItem.setParameterValue(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].ParameterValue"));
			parametersItem.setCurrentValue(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].CurrentValue"));
			parametersItem.setParameterDescription(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].ParameterDescription"));
			parametersItem.setForceRestartInstance(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].ForceRestartInstance"));
			parametersItem.setIsChangeableConfig(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].IsChangeableConfig"));
			parametersItem.setOptionalRange(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].OptionalRange"));

			parameters.add(parametersItem);
		}
		describeParametersResponse.setParameters(parameters);
	 
	 	return describeParametersResponse;
	}
}