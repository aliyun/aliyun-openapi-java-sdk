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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.DescribeGroupHighRiskAclResponse;
import com.aliyuncs.ecsinc.model.v20160314.DescribeGroupHighRiskAclResponse.AclSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupHighRiskAclResponseUnmarshaller {

	public static DescribeGroupHighRiskAclResponse unmarshall(DescribeGroupHighRiskAclResponse describeGroupHighRiskAclResponse, UnmarshallerContext context) {
		
		describeGroupHighRiskAclResponse.setRequestId(context.stringValue("DescribeGroupHighRiskAclResponse.RequestId"));
		describeGroupHighRiskAclResponse.setTotalCount(context.integerValue("DescribeGroupHighRiskAclResponse.TotalCount"));
		describeGroupHighRiskAclResponse.setPageNumber(context.integerValue("DescribeGroupHighRiskAclResponse.PageNumber"));
		describeGroupHighRiskAclResponse.setPageSize(context.integerValue("DescribeGroupHighRiskAclResponse.PageSize"));

		List<AclSet> aclSets = new ArrayList<AclSet>();
		for (int i = 0; i < context.lengthValue("DescribeGroupHighRiskAclResponse.AclSets.Length"); i++) {
			AclSet aclSet = new AclSet();
			aclSet.setId(context.longValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].Id"));
			aclSet.setSrcGroupId(context.stringValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].SrcGroupId"));
			aclSet.setDstGroupId(context.stringValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].DstGroupId"));
			aclSet.setSrcIpRange(context.stringValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].SrcIpRange"));
			aclSet.setProtocol(context.stringValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].Protocol"));
			aclSet.setSrcPortRange(context.stringValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].SrcPortRange"));
			aclSet.setDstPortRange(context.stringValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].DstPortRange"));
			aclSet.setCreateTime(context.stringValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].CreateTime"));
			aclSet.setModifiedTime(context.stringValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].ModifiedTime"));
			aclSet.setPolicy(context.stringValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].Policy"));
			aclSet.setType(context.longValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].Type"));
			aclSet.setPriority(context.longValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].Priority"));
			aclSet.setDstIpRange(context.stringValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].DstIpRange"));
			aclSet.setNic(context.longValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].Nic"));
			aclSet.setAlarmLevel(context.longValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].AlarmLevel"));
			aclSet.setSecurityGroupId(context.stringValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].SecurityGroupId"));
			aclSet.setDescription(context.stringValue("DescribeGroupHighRiskAclResponse.AclSets["+ i +"].Description"));

			aclSets.add(aclSet);
		}
		describeGroupHighRiskAclResponse.setAclSets(aclSets);
	 
	 	return describeGroupHighRiskAclResponse;
	}
}