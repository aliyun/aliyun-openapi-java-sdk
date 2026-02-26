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

import com.aliyuncs.polardb.model.v20170801.ModifyGlobalSecurityIPGroupNameResponse;
import com.aliyuncs.polardb.model.v20170801.ModifyGlobalSecurityIPGroupNameResponse.GlobalSecurityIPGroupItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyGlobalSecurityIPGroupNameResponseUnmarshaller {

	public static ModifyGlobalSecurityIPGroupNameResponse unmarshall(ModifyGlobalSecurityIPGroupNameResponse modifyGlobalSecurityIPGroupNameResponse, UnmarshallerContext _ctx) {
		
		modifyGlobalSecurityIPGroupNameResponse.setRequestId(_ctx.stringValue("ModifyGlobalSecurityIPGroupNameResponse.RequestId"));

		List<GlobalSecurityIPGroupItem> globalSecurityIPGroup = new ArrayList<GlobalSecurityIPGroupItem>();
		for (int i = 0; i < _ctx.lengthValue("ModifyGlobalSecurityIPGroupNameResponse.GlobalSecurityIPGroup.Length"); i++) {
			GlobalSecurityIPGroupItem globalSecurityIPGroupItem = new GlobalSecurityIPGroupItem();
			globalSecurityIPGroupItem.setGlobalSecurityGroupId(_ctx.stringValue("ModifyGlobalSecurityIPGroupNameResponse.GlobalSecurityIPGroup["+ i +"].GlobalSecurityGroupId"));
			globalSecurityIPGroupItem.setGlobalIgName(_ctx.stringValue("ModifyGlobalSecurityIPGroupNameResponse.GlobalSecurityIPGroup["+ i +"].GlobalIgName"));
			globalSecurityIPGroupItem.setSecurityIPType(_ctx.stringValue("ModifyGlobalSecurityIPGroupNameResponse.GlobalSecurityIPGroup["+ i +"].SecurityIPType"));
			globalSecurityIPGroupItem.setGIpList(_ctx.stringValue("ModifyGlobalSecurityIPGroupNameResponse.GlobalSecurityIPGroup["+ i +"].GIpList"));
			globalSecurityIPGroupItem.setWhitelistNetType(_ctx.stringValue("ModifyGlobalSecurityIPGroupNameResponse.GlobalSecurityIPGroup["+ i +"].WhitelistNetType"));
			globalSecurityIPGroupItem.setRegionId(_ctx.stringValue("ModifyGlobalSecurityIPGroupNameResponse.GlobalSecurityIPGroup["+ i +"].RegionId"));

			globalSecurityIPGroup.add(globalSecurityIPGroupItem);
		}
		modifyGlobalSecurityIPGroupNameResponse.setGlobalSecurityIPGroup(globalSecurityIPGroup);
	 
	 	return modifyGlobalSecurityIPGroupNameResponse;
	}
}