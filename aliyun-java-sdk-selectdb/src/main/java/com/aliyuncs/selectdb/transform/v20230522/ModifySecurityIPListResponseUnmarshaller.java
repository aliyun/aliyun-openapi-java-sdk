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

package com.aliyuncs.selectdb.transform.v20230522;

import com.aliyuncs.selectdb.model.v20230522.ModifySecurityIPListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySecurityIPListResponseUnmarshaller {

	public static ModifySecurityIPListResponse unmarshall(ModifySecurityIPListResponse modifySecurityIPListResponse, UnmarshallerContext _ctx) {
		
		modifySecurityIPListResponse.setRequestId(_ctx.stringValue("ModifySecurityIPListResponse.RequestId"));
		modifySecurityIPListResponse.setGroupName(_ctx.stringValue("ModifySecurityIPListResponse.GroupName"));
		modifySecurityIPListResponse.setSecurityIPType(_ctx.stringValue("ModifySecurityIPListResponse.SecurityIPType"));
		modifySecurityIPListResponse.setGroupTag(_ctx.stringValue("ModifySecurityIPListResponse.GroupTag"));
		modifySecurityIPListResponse.setTaskId(_ctx.longValue("ModifySecurityIPListResponse.TaskId"));
		modifySecurityIPListResponse.setSecurityIPList(_ctx.stringValue("ModifySecurityIPListResponse.SecurityIPList"));
		modifySecurityIPListResponse.setWhitelistNetType(_ctx.stringValue("ModifySecurityIPListResponse.WhitelistNetType"));
		modifySecurityIPListResponse.setDBInstanceName(_ctx.stringValue("ModifySecurityIPListResponse.DBInstanceName"));
	 
	 	return modifySecurityIPListResponse;
	}
}