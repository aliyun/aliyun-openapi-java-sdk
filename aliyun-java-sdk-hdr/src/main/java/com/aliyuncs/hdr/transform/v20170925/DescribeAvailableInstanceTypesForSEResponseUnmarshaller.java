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

package com.aliyuncs.hdr.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeAvailableInstanceTypesForSEResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableInstanceTypesForSEResponseUnmarshaller {

	public static DescribeAvailableInstanceTypesForSEResponse unmarshall(DescribeAvailableInstanceTypesForSEResponse describeAvailableInstanceTypesForSEResponse, UnmarshallerContext _ctx) {
		
		describeAvailableInstanceTypesForSEResponse.setRequestId(_ctx.stringValue("DescribeAvailableInstanceTypesForSEResponse.RequestId"));
		describeAvailableInstanceTypesForSEResponse.setSuccess(_ctx.booleanValue("DescribeAvailableInstanceTypesForSEResponse.Success"));
		describeAvailableInstanceTypesForSEResponse.setCode(_ctx.stringValue("DescribeAvailableInstanceTypesForSEResponse.Code"));
		describeAvailableInstanceTypesForSEResponse.setMessage(_ctx.stringValue("DescribeAvailableInstanceTypesForSEResponse.Message"));

		List<String> instanceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableInstanceTypesForSEResponse.InstanceTypes.Length"); i++) {
			instanceTypes.add(_ctx.stringValue("DescribeAvailableInstanceTypesForSEResponse.InstanceTypes["+ i +"]"));
		}
		describeAvailableInstanceTypesForSEResponse.setInstanceTypes(instanceTypes);
	 
	 	return describeAvailableInstanceTypesForSEResponse;
	}
}