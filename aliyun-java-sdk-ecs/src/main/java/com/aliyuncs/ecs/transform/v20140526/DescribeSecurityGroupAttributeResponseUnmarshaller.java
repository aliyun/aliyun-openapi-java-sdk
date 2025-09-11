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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeResponse.Permission;
import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeResponse.ReferencedInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeResponse.ReferencedInfo.ReferencedPrefixListInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityGroupAttributeResponseUnmarshaller {

	public static DescribeSecurityGroupAttributeResponse unmarshall(DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeResponse, UnmarshallerContext _ctx) {
		
		describeSecurityGroupAttributeResponse.setRequestId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.RequestId"));
		describeSecurityGroupAttributeResponse.setVpcId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.VpcId"));
		describeSecurityGroupAttributeResponse.setInnerAccessPolicy(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.InnerAccessPolicy"));
		describeSecurityGroupAttributeResponse.setDescription(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Description"));
		describeSecurityGroupAttributeResponse.setSecurityGroupId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.SecurityGroupId"));
		describeSecurityGroupAttributeResponse.setSecurityGroupName(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.SecurityGroupName"));
		describeSecurityGroupAttributeResponse.setRegionId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.RegionId"));
		describeSecurityGroupAttributeResponse.setNextToken(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.NextToken"));

		List<String> snapshotPolicyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityGroupAttributeResponse.SnapshotPolicyIds.Length"); i++) {
			snapshotPolicyIds.add(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.SnapshotPolicyIds["+ i +"]"));
		}
		describeSecurityGroupAttributeResponse.setSnapshotPolicyIds(snapshotPolicyIds);

		ReferencedInfo referencedInfo = new ReferencedInfo();

		List<ReferencedPrefixListInfo> referencedPrefixListInfos = new ArrayList<ReferencedPrefixListInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityGroupAttributeResponse.ReferencedInfo.ReferencedPrefixListInfos.Length"); i++) {
			ReferencedPrefixListInfo referencedPrefixListInfo = new ReferencedPrefixListInfo();
			referencedPrefixListInfo.setPrefixListId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.ReferencedInfo.ReferencedPrefixListInfos["+ i +"].PrefixListId"));
			referencedPrefixListInfo.setProductProvider(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.ReferencedInfo.ReferencedPrefixListInfos["+ i +"].ProductProvider"));

			referencedPrefixListInfos.add(referencedPrefixListInfo);
		}
		referencedInfo.setReferencedPrefixListInfos(referencedPrefixListInfos);
		describeSecurityGroupAttributeResponse.setReferencedInfo(referencedInfo);

		List<Permission> permissions = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityGroupAttributeResponse.Permissions.Length"); i++) {
			Permission permission = new Permission();
			permission.setSecurityGroupRuleId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SecurityGroupRuleId"));
			permission.setDirection(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Direction"));
			permission.setSourceGroupId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourceGroupId"));
			permission.setDestGroupOwnerAccount(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestGroupOwnerAccount"));
			permission.setDestPrefixListId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestPrefixListId"));
			permission.setDestPrefixListName(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestPrefixListName"));
			permission.setSourceCidrIp(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourceCidrIp"));
			permission.setIpv6DestCidrIp(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Ipv6DestCidrIp"));
			permission.setCreateTime(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].CreateTime"));
			permission.setIpv6SourceCidrIp(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Ipv6SourceCidrIp"));
			permission.setDestGroupId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestGroupId"));
			permission.setDestCidrIp(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestCidrIp"));
			permission.setIpProtocol(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].IpProtocol"));
			permission.setPriority(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Priority"));
			permission.setDestGroupName(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestGroupName"));
			permission.setNicType(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].NicType"));
			permission.setPolicy(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Policy"));
			permission.setDescription(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Description"));
			permission.setPortRange(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].PortRange"));
			permission.setSourcePrefixListName(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourcePrefixListName"));
			permission.setSourcePrefixListId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourcePrefixListId"));
			permission.setSourceGroupOwnerAccount(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourceGroupOwnerAccount"));
			permission.setSourceGroupName(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourceGroupName"));
			permission.setSourcePortRange(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourcePortRange"));
			permission.setPortRangeListId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].PortRangeListId"));
			permission.setPortRangeListName(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].PortRangeListName"));

			permissions.add(permission);
		}
		describeSecurityGroupAttributeResponse.setPermissions(permissions);
	 
	 	return describeSecurityGroupAttributeResponse;
	}
}