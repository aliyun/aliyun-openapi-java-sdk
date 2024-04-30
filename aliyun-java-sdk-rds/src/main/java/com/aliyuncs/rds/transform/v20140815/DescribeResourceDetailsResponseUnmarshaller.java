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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeResourceDetailsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeResourceDetailsResponse.RdsEcsSecurityGroupRelItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceDetailsResponseUnmarshaller {

	public static DescribeResourceDetailsResponse unmarshall(DescribeResourceDetailsResponse describeResourceDetailsResponse, UnmarshallerContext _ctx) {
		
		describeResourceDetailsResponse.setRequestId(_ctx.stringValue("DescribeResourceDetailsResponse.RequestId"));
		describeResourceDetailsResponse.setRegion(_ctx.stringValue("DescribeResourceDetailsResponse.Region"));
		describeResourceDetailsResponse.setInstanceStorageType(_ctx.stringValue("DescribeResourceDetailsResponse.InstanceStorageType"));
		describeResourceDetailsResponse.setDbInstanceStorage(_ctx.longValue("DescribeResourceDetailsResponse.DbInstanceStorage"));
		describeResourceDetailsResponse.setDiskUsed(_ctx.longValue("DescribeResourceDetailsResponse.DiskUsed"));
		describeResourceDetailsResponse.setBackupSize(_ctx.longValue("DescribeResourceDetailsResponse.BackupSize"));
		describeResourceDetailsResponse.setVpcId(_ctx.stringValue("DescribeResourceDetailsResponse.VpcId"));
		describeResourceDetailsResponse.setVSwitchId(_ctx.stringValue("DescribeResourceDetailsResponse.VSwitchId"));
		describeResourceDetailsResponse.setSecurityIPList(_ctx.stringValue("DescribeResourceDetailsResponse.SecurityIPList"));
		describeResourceDetailsResponse.setDbProxyInstanceName(_ctx.stringValue("DescribeResourceDetailsResponse.DbProxyInstanceName"));
		describeResourceDetailsResponse.setResourceGroupId(_ctx.stringValue("DescribeResourceDetailsResponse.ResourceGroupId"));
		describeResourceDetailsResponse.setBackupLogSize(_ctx.longValue("DescribeResourceDetailsResponse.BackupLogSize"));
		describeResourceDetailsResponse.setBackupDataSize(_ctx.longValue("DescribeResourceDetailsResponse.BackupDataSize"));

		List<RdsEcsSecurityGroupRelItem> rdsEcsSecurityGroupRel = new ArrayList<RdsEcsSecurityGroupRelItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceDetailsResponse.RdsEcsSecurityGroupRel.Length"); i++) {
			RdsEcsSecurityGroupRelItem rdsEcsSecurityGroupRelItem = new RdsEcsSecurityGroupRelItem();
			rdsEcsSecurityGroupRelItem.setSecurityGroupName(_ctx.stringValue("DescribeResourceDetailsResponse.RdsEcsSecurityGroupRel["+ i +"].SecurityGroupName"));

			rdsEcsSecurityGroupRel.add(rdsEcsSecurityGroupRelItem);
		}
		describeResourceDetailsResponse.setRdsEcsSecurityGroupRel(rdsEcsSecurityGroupRel);
	 
	 	return describeResourceDetailsResponse;
	}
}