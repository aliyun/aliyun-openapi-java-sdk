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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivilegesByLoginNameResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivilegesByLoginNameResponse.PrivilegeInfo;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivilegesByLoginNameResponse.PrivilegeInfo.Privilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivilegesByLoginNameResponseUnmarshaller {

	public static ListPrivilegesByLoginNameResponse unmarshall(ListPrivilegesByLoginNameResponse listPrivilegesByLoginNameResponse, UnmarshallerContext context) {
		
		listPrivilegesByLoginNameResponse.setRequestId(context.stringValue("ListPrivilegesByLoginNameResponse.RequestId"));
		listPrivilegesByLoginNameResponse.setSuccess(context.booleanValue("ListPrivilegesByLoginNameResponse.Success"));
		listPrivilegesByLoginNameResponse.setCode(context.stringValue("ListPrivilegesByLoginNameResponse.Code"));
		listPrivilegesByLoginNameResponse.setMessage(context.stringValue("ListPrivilegesByLoginNameResponse.Message"));
		listPrivilegesByLoginNameResponse.setHttpStatusCode(context.integerValue("ListPrivilegesByLoginNameResponse.HttpStatusCode"));

		List<PrivilegeInfo> privilegeInfos = new ArrayList<PrivilegeInfo>();
		for (int i = 0; i < context.lengthValue("ListPrivilegesByLoginNameResponse.PrivilegeInfos.Length"); i++) {
			PrivilegeInfo privilegeInfo = new PrivilegeInfo();
			privilegeInfo.setRamId(context.longValue("ListPrivilegesByLoginNameResponse.PrivilegeInfos["+ i +"].RamId"));
			privilegeInfo.setInstance(context.stringValue("ListPrivilegesByLoginNameResponse.PrivilegeInfos["+ i +"].Instance"));
			privilegeInfo.setInstanceName(context.stringValue("ListPrivilegesByLoginNameResponse.PrivilegeInfos["+ i +"].InstanceName"));
			privilegeInfo.setUserId(context.stringValue("ListPrivilegesByLoginNameResponse.PrivilegeInfos["+ i +"].UserId"));
			privilegeInfo.setLoginName(context.stringValue("ListPrivilegesByLoginNameResponse.PrivilegeInfos["+ i +"].LoginName"));

			List<Privilege> privileges = new ArrayList<Privilege>();
			for (int j = 0; j < context.lengthValue("ListPrivilegesByLoginNameResponse.PrivilegeInfos["+ i +"].Privileges.Length"); j++) {
				Privilege privilege = new Privilege();
				privilege.setPrivilegeId(context.stringValue("ListPrivilegesByLoginNameResponse.PrivilegeInfos["+ i +"].Privileges["+ j +"].PrivilegeId"));
				privilege.setPrivilegeName(context.stringValue("ListPrivilegesByLoginNameResponse.PrivilegeInfos["+ i +"].Privileges["+ j +"].PrivilegeName"));
				privilege.setPrivilegeDescription(context.stringValue("ListPrivilegesByLoginNameResponse.PrivilegeInfos["+ i +"].Privileges["+ j +"].PrivilegeDescription"));

				privileges.add(privilege);
			}
			privilegeInfo.setPrivileges(privileges);

			privilegeInfos.add(privilegeInfo);
		}
		listPrivilegesByLoginNameResponse.setPrivilegeInfos(privilegeInfos);
	 
	 	return listPrivilegesByLoginNameResponse;
	}
}