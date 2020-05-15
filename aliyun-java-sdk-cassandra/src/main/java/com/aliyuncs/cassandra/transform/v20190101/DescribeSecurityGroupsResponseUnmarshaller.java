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

import com.aliyuncs.cassandra.model.v20190101.DescribeSecurityGroupsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityGroupsResponseUnmarshaller {

	public static DescribeSecurityGroupsResponse unmarshall(DescribeSecurityGroupsResponse describeSecurityGroupsResponse, UnmarshallerContext _ctx) {
		
		describeSecurityGroupsResponse.setRequestId(_ctx.stringValue("DescribeSecurityGroupsResponse.RequestId"));

		List<String> securityGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityGroupsResponse.SecurityGroupIds.Length"); i++) {
			securityGroupIds.add(_ctx.stringValue("DescribeSecurityGroupsResponse.SecurityGroupIds["+ i +"]"));
		}
		describeSecurityGroupsResponse.setSecurityGroupIds(securityGroupIds);
	 
	 	return describeSecurityGroupsResponse;
	}
}