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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.CreateGlobalSecurityIPGroupResponse;
import com.aliyuncs.dds.model.v20151201.CreateGlobalSecurityIPGroupResponse.GlobalSecurityIPGroupItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGlobalSecurityIPGroupResponseUnmarshaller {

	public static CreateGlobalSecurityIPGroupResponse unmarshall(CreateGlobalSecurityIPGroupResponse createGlobalSecurityIPGroupResponse, UnmarshallerContext _ctx) {
		
		createGlobalSecurityIPGroupResponse.setRequestId(_ctx.stringValue("CreateGlobalSecurityIPGroupResponse.RequestId"));

		List<GlobalSecurityIPGroupItem> globalSecurityIPGroup = new ArrayList<GlobalSecurityIPGroupItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup.Length"); i++) {
			GlobalSecurityIPGroupItem globalSecurityIPGroupItem = new GlobalSecurityIPGroupItem();
			globalSecurityIPGroupItem.setGlobalSecurityGroupId(_ctx.stringValue("CreateGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].GlobalSecurityGroupId"));
			globalSecurityIPGroupItem.setGlobalIgName(_ctx.stringValue("CreateGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].GlobalIgName"));
			globalSecurityIPGroupItem.setSecurityIPType(_ctx.stringValue("CreateGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].SecurityIPType"));
			globalSecurityIPGroupItem.setGIpList(_ctx.stringValue("CreateGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].GIpList"));
			globalSecurityIPGroupItem.setWhitelistNetType(_ctx.stringValue("CreateGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].WhitelistNetType"));
			globalSecurityIPGroupItem.setRegionId(_ctx.stringValue("CreateGlobalSecurityIPGroupResponse.GlobalSecurityIPGroup["+ i +"].RegionId"));

			globalSecurityIPGroup.add(globalSecurityIPGroupItem);
		}
		createGlobalSecurityIPGroupResponse.setGlobalSecurityIPGroup(globalSecurityIPGroup);
	 
	 	return createGlobalSecurityIPGroupResponse;
	}
}