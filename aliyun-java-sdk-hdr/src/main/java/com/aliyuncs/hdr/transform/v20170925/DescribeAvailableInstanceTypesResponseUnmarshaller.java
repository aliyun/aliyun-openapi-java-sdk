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

import com.aliyuncs.hdr.model.v20170925.DescribeAvailableInstanceTypesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableInstanceTypesResponseUnmarshaller {

	public static DescribeAvailableInstanceTypesResponse unmarshall(DescribeAvailableInstanceTypesResponse describeAvailableInstanceTypesResponse, UnmarshallerContext _ctx) {
		
		describeAvailableInstanceTypesResponse.setRequestId(_ctx.stringValue("DescribeAvailableInstanceTypesResponse.RequestId"));
		describeAvailableInstanceTypesResponse.setSuccess(_ctx.booleanValue("DescribeAvailableInstanceTypesResponse.Success"));
		describeAvailableInstanceTypesResponse.setCode(_ctx.stringValue("DescribeAvailableInstanceTypesResponse.Code"));
		describeAvailableInstanceTypesResponse.setMessage(_ctx.stringValue("DescribeAvailableInstanceTypesResponse.Message"));
		describeAvailableInstanceTypesResponse.setTotalCount(_ctx.integerValue("DescribeAvailableInstanceTypesResponse.TotalCount"));
		describeAvailableInstanceTypesResponse.setPageNumber(_ctx.integerValue("DescribeAvailableInstanceTypesResponse.PageNumber"));
		describeAvailableInstanceTypesResponse.setPageSize(_ctx.integerValue("DescribeAvailableInstanceTypesResponse.PageSize"));

		List<String> instanceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableInstanceTypesResponse.InstanceTypes.Length"); i++) {
			instanceTypes.add(_ctx.stringValue("DescribeAvailableInstanceTypesResponse.InstanceTypes["+ i +"]"));
		}
		describeAvailableInstanceTypesResponse.setInstanceTypes(instanceTypes);
	 
	 	return describeAvailableInstanceTypesResponse;
	}
}