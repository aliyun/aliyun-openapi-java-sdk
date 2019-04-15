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

import com.aliyuncs.ecsinc.model.v20160314.DescribeGroupHighRiskStatResponse;
import com.aliyuncs.ecsinc.model.v20160314.DescribeGroupHighRiskStatResponse.AclStatSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupHighRiskStatResponseUnmarshaller {

	public static DescribeGroupHighRiskStatResponse unmarshall(DescribeGroupHighRiskStatResponse describeGroupHighRiskStatResponse, UnmarshallerContext context) {
		
		describeGroupHighRiskStatResponse.setRequestId(context.stringValue("DescribeGroupHighRiskStatResponse.RequestId"));
		describeGroupHighRiskStatResponse.setTotalCount(context.integerValue("DescribeGroupHighRiskStatResponse.TotalCount"));
		describeGroupHighRiskStatResponse.setPageNumber(context.integerValue("DescribeGroupHighRiskStatResponse.PageNumber"));
		describeGroupHighRiskStatResponse.setPageSize(context.integerValue("DescribeGroupHighRiskStatResponse.PageSize"));

		List<AclStatSet> aclStatSets = new ArrayList<AclStatSet>();
		for (int i = 0; i < context.lengthValue("DescribeGroupHighRiskStatResponse.AclStatSets.Length"); i++) {
			AclStatSet aclStatSet = new AclStatSet();
			aclStatSet.setWarnAclCount(context.longValue("DescribeGroupHighRiskStatResponse.AclStatSets["+ i +"].WarnAclCount"));
			aclStatSet.setAlertAclCount(context.longValue("DescribeGroupHighRiskStatResponse.AclStatSets["+ i +"].AlertAclCount"));
			aclStatSet.setVmCount(context.longValue("DescribeGroupHighRiskStatResponse.AclStatSets["+ i +"].VmCount"));
			aclStatSet.setSecurityGroupId(context.stringValue("DescribeGroupHighRiskStatResponse.AclStatSets["+ i +"].SecurityGroupId"));
			aclStatSet.setDescription(context.stringValue("DescribeGroupHighRiskStatResponse.AclStatSets["+ i +"].Description"));
			aclStatSet.setRegionId(context.stringValue("DescribeGroupHighRiskStatResponse.AclStatSets["+ i +"].RegionId"));

			aclStatSets.add(aclStatSet);
		}
		describeGroupHighRiskStatResponse.setAclStatSets(aclStatSets);
	 
	 	return describeGroupHighRiskStatResponse;
	}
}