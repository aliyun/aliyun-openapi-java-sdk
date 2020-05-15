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

package com.aliyuncs.cassandra.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cassandra.model.v20190101.DescribeParametersResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeParametersResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParametersResponseUnmarshaller {

	public static DescribeParametersResponse unmarshall(DescribeParametersResponse describeParametersResponse, UnmarshallerContext _ctx) {
		
		describeParametersResponse.setRequestId(_ctx.stringValue("DescribeParametersResponse.RequestId"));
		describeParametersResponse.setPageNumber(_ctx.integerValue("DescribeParametersResponse.PageNumber"));
		describeParametersResponse.setPageSize(_ctx.integerValue("DescribeParametersResponse.PageSize"));
		describeParametersResponse.setTotalCount(_ctx.longValue("DescribeParametersResponse.TotalCount"));

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setName(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].Name"));
			parameter.setValue(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].Value"));
			parameter.setDefaultValue(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].DefaultValue"));
			parameter.setDataType(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].DataType"));
			parameter.setAllowedValues(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].AllowedValues"));
			parameter.setDescription(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].Description"));

			parameters.add(parameter);
		}
		describeParametersResponse.setParameters(parameters);
	 
	 	return describeParametersResponse;
	}
}