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

import com.aliyuncs.polardb.model.v20170801.DeleteGlobalSecurityIPGroupResponse;
import com.aliyuncs.polardb.model.v20170801.DeleteGlobalSecurityIPGroupResponse.GlobalSecurityIPGroupItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGlobalSecurityIPGroupResponseUnmarshaller {

	public static DeleteGlobalSecurityIPGroupResponse unmarshall(DeleteGlobalSecurityIPGroupResponse deleteGlobalSecurityIPGroupResponse, UnmarshallerContext _ctx) {
		
		deleteGlobalSecurityIPGroupResponse.setRequestId(_ctx.stringValue("DeleteGlobalSecurityIPGroupResponse.RequestId"));

		List<GlobalSecurityIPGroupItem> globalSecurityIPGroup = new ArrayList<GlobalSecurityIPGroupItem>();
		for (int i = 0; i < _ctx.lengthValue("DeleteGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup.Length"); i++) {
			GlobalSecurityIPGroupItem globalSecurityIPGroupItem = new GlobalSecurityIPGroupItem();
			globalSecurityIPGroupItem.setGlobalSecurityGroupId(_ctx.stringValue("DeleteGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].GlobalSecurityGroupId"));
			globalSecurityIPGroupItem.setGlobalIgName(_ctx.stringValue("DeleteGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].GlobalIgName"));
			globalSecurityIPGroupItem.setSecurityIPType(_ctx.stringValue("DeleteGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].SecurityIPType"));
			globalSecurityIPGroupItem.setGIpList(_ctx.stringValue("DeleteGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].GIpList"));
			globalSecurityIPGroupItem.setWhitelistNetType(_ctx.stringValue("DeleteGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].WhitelistNetType"));
			globalSecurityIPGroupItem.setRegionId(_ctx.stringValue("DeleteGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].RegionId"));

			List<String> dBInstances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DeleteGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].DBInstances.Length"); j++) {
				dBInstances.add(_ctx.stringValue("DeleteGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].DBInstances["+ j +"]"));
			}
			globalSecurityIPGroupItem.setDBInstances(dBInstances);

			globalSecurityIPGroup.add(globalSecurityIPGroupItem);
		}
		deleteGlobalSecurityIPGroupResponse.setGlobalSecurityIPGroup(globalSecurityIPGroup);
	 
	 	return deleteGlobalSecurityIPGroupResponse;
	}
}