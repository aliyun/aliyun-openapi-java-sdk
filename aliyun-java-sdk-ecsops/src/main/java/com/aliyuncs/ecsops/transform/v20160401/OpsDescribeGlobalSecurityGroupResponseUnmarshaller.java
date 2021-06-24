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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeGlobalSecurityGroupResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeGlobalSecurityGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeGlobalSecurityGroupResponseUnmarshaller {

	public static OpsDescribeGlobalSecurityGroupResponse unmarshall(OpsDescribeGlobalSecurityGroupResponse opsDescribeGlobalSecurityGroupResponse, UnmarshallerContext _ctx) {
		
		opsDescribeGlobalSecurityGroupResponse.setRequestId(_ctx.stringValue("OpsDescribeGlobalSecurityGroupResponse.RequestId"));

		Data data = new Data();
		data.setType(_ctx.stringValue("OpsDescribeGlobalSecurityGroupResponse.Data.Type"));
		data.setVpcId(_ctx.stringValue("OpsDescribeGlobalSecurityGroupResponse.Data.VpcId"));
		data.setSecurityGroupId(_ctx.stringValue("OpsDescribeGlobalSecurityGroupResponse.Data.SecurityGroupId"));
		data.setRegionNo(_ctx.stringValue("OpsDescribeGlobalSecurityGroupResponse.Data.RegionNo"));
		data.setDefaultGroup(_ctx.booleanValue("OpsDescribeGlobalSecurityGroupResponse.Data.DefaultGroup"));
		data.setAliUid(_ctx.longValue("OpsDescribeGlobalSecurityGroupResponse.Data.AliUid"));
		data.setEcsNum(_ctx.integerValue("OpsDescribeGlobalSecurityGroupResponse.Data.EcsNum"));
		data.setBid(_ctx.stringValue("OpsDescribeGlobalSecurityGroupResponse.Data.Bid"));
		data.setAuthed(_ctx.booleanValue("OpsDescribeGlobalSecurityGroupResponse.Data.Authed"));
		data.setModifiedTime(_ctx.stringValue("OpsDescribeGlobalSecurityGroupResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("OpsDescribeGlobalSecurityGroupResponse.Data.Description"));
		data.setSecurityGroupName(_ctx.stringValue("OpsDescribeGlobalSecurityGroupResponse.Data.SecurityGroupName"));
		data.setGroupType(_ctx.integerValue("OpsDescribeGlobalSecurityGroupResponse.Data.GroupType"));
		data.setCreatedTime(_ctx.stringValue("OpsDescribeGlobalSecurityGroupResponse.Data.CreatedTime"));
		data.setId(_ctx.longValue("OpsDescribeGlobalSecurityGroupResponse.Data.Id"));

		List<String> ecsInstanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeGlobalSecurityGroupResponse.Data.EcsInstanceIds.Length"); i++) {
			ecsInstanceIds.add(_ctx.stringValue("OpsDescribeGlobalSecurityGroupResponse.Data.EcsInstanceIds["+ i +"]"));
		}
		data.setEcsInstanceIds(ecsInstanceIds);
		opsDescribeGlobalSecurityGroupResponse.setData(data);
	 
	 	return opsDescribeGlobalSecurityGroupResponse;
	}
}