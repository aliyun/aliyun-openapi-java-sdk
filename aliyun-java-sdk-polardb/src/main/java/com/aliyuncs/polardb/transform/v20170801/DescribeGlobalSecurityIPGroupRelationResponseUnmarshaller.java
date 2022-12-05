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

import com.aliyuncs.polardb.model.v20170801.DescribeGlobalSecurityIPGroupRelationResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalSecurityIPGroupRelationResponse.GlobalSecurityIPGroupRelItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGlobalSecurityIPGroupRelationResponseUnmarshaller {

	public static DescribeGlobalSecurityIPGroupRelationResponse unmarshall(DescribeGlobalSecurityIPGroupRelationResponse describeGlobalSecurityIPGroupRelationResponse, UnmarshallerContext _ctx) {
		
		describeGlobalSecurityIPGroupRelationResponse.setRequestId(_ctx.stringValue("DescribeGlobalSecurityIPGroupRelationResponse.RequestId"));
		describeGlobalSecurityIPGroupRelationResponse.setDBClusterId(_ctx.stringValue("DescribeGlobalSecurityIPGroupRelationResponse.DBClusterId"));

		List<GlobalSecurityIPGroupRelItem> globalSecurityIPGroupRel = new ArrayList<GlobalSecurityIPGroupRelItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGlobalSecurityIPGroupRelationResponse.GlobalSecurityIPGroupRel.Length"); i++) {
			GlobalSecurityIPGroupRelItem globalSecurityIPGroupRelItem = new GlobalSecurityIPGroupRelItem();
			globalSecurityIPGroupRelItem.setGlobalSecurityGroupId(_ctx.stringValue("DescribeGlobalSecurityIPGroupRelationResponse.GlobalSecurityIPGroupRel["+ i +"].GlobalSecurityGroupId"));
			globalSecurityIPGroupRelItem.setGIpList(_ctx.stringValue("DescribeGlobalSecurityIPGroupRelationResponse.GlobalSecurityIPGroupRel["+ i +"].GIpList"));
			globalSecurityIPGroupRelItem.setRegionId(_ctx.stringValue("DescribeGlobalSecurityIPGroupRelationResponse.GlobalSecurityIPGroupRel["+ i +"].RegionId"));
			globalSecurityIPGroupRelItem.setWhitelistNetType(_ctx.stringValue("DescribeGlobalSecurityIPGroupRelationResponse.GlobalSecurityIPGroupRel["+ i +"].WhitelistNetType"));
			globalSecurityIPGroupRelItem.setGlobalIgName(_ctx.stringValue("DescribeGlobalSecurityIPGroupRelationResponse.GlobalSecurityIPGroupRel["+ i +"].GlobalIgName"));

			globalSecurityIPGroupRel.add(globalSecurityIPGroupRelItem);
		}
		describeGlobalSecurityIPGroupRelationResponse.setGlobalSecurityIPGroupRel(globalSecurityIPGroupRel);
	 
	 	return describeGlobalSecurityIPGroupRelationResponse;
	}
}