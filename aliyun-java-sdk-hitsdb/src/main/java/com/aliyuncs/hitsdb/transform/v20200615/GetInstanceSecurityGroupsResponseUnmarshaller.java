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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.GetInstanceSecurityGroupsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceSecurityGroupsResponseUnmarshaller {

	public static GetInstanceSecurityGroupsResponse unmarshall(GetInstanceSecurityGroupsResponse getInstanceSecurityGroupsResponse, UnmarshallerContext _ctx) {
		
		getInstanceSecurityGroupsResponse.setRequestId(_ctx.stringValue("GetInstanceSecurityGroupsResponse.RequestId"));
		getInstanceSecurityGroupsResponse.setInstanceId(_ctx.stringValue("GetInstanceSecurityGroupsResponse.InstanceId"));

		List<String> securityGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceSecurityGroupsResponse.SecurityGroups.Length"); i++) {
			securityGroups.add(_ctx.stringValue("GetInstanceSecurityGroupsResponse.SecurityGroups["+ i +"]"));
		}
		getInstanceSecurityGroupsResponse.setSecurityGroups(securityGroups);
	 
	 	return getInstanceSecurityGroupsResponse;
	}
}