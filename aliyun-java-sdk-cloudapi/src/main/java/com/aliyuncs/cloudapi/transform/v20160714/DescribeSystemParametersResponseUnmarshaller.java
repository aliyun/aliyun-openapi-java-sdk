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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeSystemParametersResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeSystemParametersResponse.SystemParamItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSystemParametersResponseUnmarshaller {

	public static DescribeSystemParametersResponse unmarshall(DescribeSystemParametersResponse describeSystemParametersResponse, UnmarshallerContext _ctx) {
		
		describeSystemParametersResponse.setRequestId(_ctx.stringValue("DescribeSystemParametersResponse.RequestId"));

		List<SystemParamItem> systemParams = new ArrayList<SystemParamItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSystemParametersResponse.SystemParams.Length"); i++) {
			SystemParamItem systemParamItem = new SystemParamItem();
			systemParamItem.setParamName(_ctx.stringValue("DescribeSystemParametersResponse.SystemParams["+ i +"].ParamName"));
			systemParamItem.setParamType(_ctx.stringValue("DescribeSystemParametersResponse.SystemParams["+ i +"].ParamType"));
			systemParamItem.setDemoValue(_ctx.stringValue("DescribeSystemParametersResponse.SystemParams["+ i +"].DemoValue"));
			systemParamItem.setDescription(_ctx.stringValue("DescribeSystemParametersResponse.SystemParams["+ i +"].Description"));

			systemParams.add(systemParamItem);
		}
		describeSystemParametersResponse.setSystemParams(systemParams);
	 
	 	return describeSystemParametersResponse;
	}
}