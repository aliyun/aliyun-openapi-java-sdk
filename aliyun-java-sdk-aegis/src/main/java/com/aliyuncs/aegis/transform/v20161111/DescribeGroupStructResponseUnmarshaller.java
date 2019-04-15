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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeGroupStructResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupStructResponseUnmarshaller {

	public static DescribeGroupStructResponse unmarshall(DescribeGroupStructResponse describeGroupStructResponse, UnmarshallerContext context) {
		
		describeGroupStructResponse.setRequestId(context.stringValue("DescribeGroupStructResponse.RequestId"));
		describeGroupStructResponse.setGroupFather(context.integerValue("DescribeGroupStructResponse.GroupFather"));
		describeGroupStructResponse.setGroupId(context.longValue("DescribeGroupStructResponse.GroupId"));
		describeGroupStructResponse.setGroupName(context.stringValue("DescribeGroupStructResponse.GroupName"));
		describeGroupStructResponse.setGroupIndex(context.integerValue("DescribeGroupStructResponse.GroupIndex"));
		describeGroupStructResponse.setGroupFlag(context.integerValue("DescribeGroupStructResponse.GroupFlag"));
		describeGroupStructResponse.setGroupLevel(context.integerValue("DescribeGroupStructResponse.GroupLevel"));
		describeGroupStructResponse.setMachineNum(context.integerValue("DescribeGroupStructResponse.MachineNum"));

		List<String> groups = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeGroupStructResponse.Groups.Length"); i++) {
			groups.add(context.stringValue("DescribeGroupStructResponse.Groups["+ i +"]"));
		}
		describeGroupStructResponse.setGroups(groups);
	 
	 	return describeGroupStructResponse;
	}
}