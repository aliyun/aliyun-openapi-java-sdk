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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTenantModesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceTenantModesResponseUnmarshaller {

	public static DescribeInstanceTenantModesResponse unmarshall(DescribeInstanceTenantModesResponse describeInstanceTenantModesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceTenantModesResponse.setRequestId(_ctx.stringValue("DescribeInstanceTenantModesResponse.RequestId"));

		List<String> instanceModes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTenantModesResponse.InstanceModes.Length"); i++) {
			instanceModes.add(_ctx.stringValue("DescribeInstanceTenantModesResponse.InstanceModes["+ i +"]"));
		}
		describeInstanceTenantModesResponse.setInstanceModes(instanceModes);
	 
	 	return describeInstanceTenantModesResponse;
	}
}