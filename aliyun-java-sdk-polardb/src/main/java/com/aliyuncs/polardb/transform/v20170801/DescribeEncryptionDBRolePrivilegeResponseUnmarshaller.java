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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeEncryptionDBRolePrivilegeResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeEncryptionDBRolePrivilegeResponse.Data;
import com.aliyuncs.polardb.model.v20170801.DescribeEncryptionDBRolePrivilegeResponse.Data.RolePrivilegeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEncryptionDBRolePrivilegeResponseUnmarshaller {

	public static DescribeEncryptionDBRolePrivilegeResponse unmarshall(DescribeEncryptionDBRolePrivilegeResponse describeEncryptionDBRolePrivilegeResponse, UnmarshallerContext _ctx) {
		
		describeEncryptionDBRolePrivilegeResponse.setRequestId(_ctx.stringValue("DescribeEncryptionDBRolePrivilegeResponse.RequestId"));
		describeEncryptionDBRolePrivilegeResponse.setMessage(_ctx.stringValue("DescribeEncryptionDBRolePrivilegeResponse.Message"));
		describeEncryptionDBRolePrivilegeResponse.setSuccess(_ctx.booleanValue("DescribeEncryptionDBRolePrivilegeResponse.Success"));
		describeEncryptionDBRolePrivilegeResponse.setDBClusterId(_ctx.stringValue("DescribeEncryptionDBRolePrivilegeResponse.DBClusterId"));

		Data data = new Data();

		List<RolePrivilegeListItem> rolePrivilegeList = new ArrayList<RolePrivilegeListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEncryptionDBRolePrivilegeResponse.Data.RolePrivilegeList.Length"); i++) {
			RolePrivilegeListItem rolePrivilegeListItem = new RolePrivilegeListItem();
			rolePrivilegeListItem.setRolePrivilegeName(_ctx.stringValue("DescribeEncryptionDBRolePrivilegeResponse.Data.RolePrivilegeList["+ i +"].RolePrivilegeName"));
			rolePrivilegeListItem.setNegation(_ctx.stringValue("DescribeEncryptionDBRolePrivilegeResponse.Data.RolePrivilegeList["+ i +"].Negation"));
			rolePrivilegeListItem.setEncryption(_ctx.stringValue("DescribeEncryptionDBRolePrivilegeResponse.Data.RolePrivilegeList["+ i +"].Encryption"));
			rolePrivilegeListItem.setNotEncryption(_ctx.stringValue("DescribeEncryptionDBRolePrivilegeResponse.Data.RolePrivilegeList["+ i +"].NotEncryption"));

			rolePrivilegeList.add(rolePrivilegeListItem);
		}
		data.setRolePrivilegeList(rolePrivilegeList);
		describeEncryptionDBRolePrivilegeResponse.setData(data);
	 
	 	return describeEncryptionDBRolePrivilegeResponse;
	}
}