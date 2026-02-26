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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeGroupStructResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupStructResponseUnmarshaller {

	public static DescribeGroupStructResponse unmarshall(DescribeGroupStructResponse describeGroupStructResponse, UnmarshallerContext _ctx) {
		
		describeGroupStructResponse.setRequestId(_ctx.stringValue("DescribeGroupStructResponse.RequestId"));
		describeGroupStructResponse.setGroupId(_ctx.longValue("DescribeGroupStructResponse.GroupId"));
		describeGroupStructResponse.setGroupName(_ctx.stringValue("DescribeGroupStructResponse.GroupName"));
		describeGroupStructResponse.setMachineNum(_ctx.integerValue("DescribeGroupStructResponse.MachineNum"));
		describeGroupStructResponse.setGroupIndex(_ctx.integerValue("DescribeGroupStructResponse.GroupIndex"));
		describeGroupStructResponse.setGroupFather(_ctx.integerValue("DescribeGroupStructResponse.GroupFather"));
		describeGroupStructResponse.setGroupLevel(_ctx.integerValue("DescribeGroupStructResponse.GroupLevel"));
		describeGroupStructResponse.setGroupFlag(_ctx.integerValue("DescribeGroupStructResponse.GroupFlag"));

		List<String> groups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupStructResponse.Groups.Length"); i++) {
			groups.add(_ctx.stringValue("DescribeGroupStructResponse.Groups["+ i +"]"));
		}
		describeGroupStructResponse.setGroups(groups);
	 
	 	return describeGroupStructResponse;
	}
}