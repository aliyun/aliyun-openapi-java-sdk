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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeParametersResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeParametersResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParametersResponseUnmarshaller {

	public static DescribeParametersResponse unmarshall(DescribeParametersResponse describeParametersResponse, UnmarshallerContext _ctx) {
		
		describeParametersResponse.setRequestId(_ctx.stringValue("DescribeParametersResponse.RequestId"));

		List<Data> parameters = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersResponse.Parameters.Length"); i++) {
			Data data = new Data();
			data.setDescription(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].Description"));
			data.setValueType(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].ValueType"));
			data.setCurrentValue(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].CurrentValue"));
			data.setNeedReboot(_ctx.booleanValue("DescribeParametersResponse.Parameters["+ i +"].NeedReboot"));
			data.setName(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].Name"));
			data.setDefaultValue(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].DefaultValue"));
			data.setReadonly(_ctx.booleanValue("DescribeParametersResponse.Parameters["+ i +"].Readonly"));
			data.setUnit(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].Unit"));

			List<String> rejectedValue = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeParametersResponse.Parameters["+ i +"].RejectedValue.Length"); j++) {
				rejectedValue.add(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].RejectedValue["+ j +"]"));
			}
			data.setRejectedValue(rejectedValue);

			List<String> acceptableValue = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeParametersResponse.Parameters["+ i +"].AcceptableValue.Length"); j++) {
				acceptableValue.add(_ctx.stringValue("DescribeParametersResponse.Parameters["+ i +"].AcceptableValue["+ j +"]"));
			}
			data.setAcceptableValue(acceptableValue);

			parameters.add(data);
		}
		describeParametersResponse.setParameters(parameters);
	 
	 	return describeParametersResponse;
	}
}