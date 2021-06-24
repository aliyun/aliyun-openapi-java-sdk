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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstanceAclRulesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstanceAclRulesResponse.AclRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeInstanceAclRulesResponseUnmarshaller {

	public static OpsDescribeInstanceAclRulesResponse unmarshall(OpsDescribeInstanceAclRulesResponse opsDescribeInstanceAclRulesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeInstanceAclRulesResponse.setRequestId(_ctx.stringValue("OpsDescribeInstanceAclRulesResponse.RequestId"));
		opsDescribeInstanceAclRulesResponse.setTotalCount(_ctx.integerValue("OpsDescribeInstanceAclRulesResponse.TotalCount"));
		opsDescribeInstanceAclRulesResponse.setPageSize(_ctx.integerValue("OpsDescribeInstanceAclRulesResponse.PageSize"));
		opsDescribeInstanceAclRulesResponse.setPageNumber(_ctx.integerValue("OpsDescribeInstanceAclRulesResponse.PageNumber"));
		opsDescribeInstanceAclRulesResponse.setInstanceId(_ctx.stringValue("OpsDescribeInstanceAclRulesResponse.InstanceId"));

		List<AclRule> aclRules = new ArrayList<AclRule>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeInstanceAclRulesResponse.AclRules.Length"); i++) {
			AclRule aclRule = new AclRule();
			aclRule.setType(_ctx.stringValue("OpsDescribeInstanceAclRulesResponse.AclRules["+ i +"].Type"));
			aclRule.setDirection(_ctx.stringValue("OpsDescribeInstanceAclRulesResponse.AclRules["+ i +"].Direction"));
			aclRule.setPolicy(_ctx.stringValue("OpsDescribeInstanceAclRulesResponse.AclRules["+ i +"].Policy"));
			aclRule.setSourceCidrIp(_ctx.stringValue("OpsDescribeInstanceAclRulesResponse.AclRules["+ i +"].SourceCidrIp"));
			aclRule.setDestPortRange(_ctx.stringValue("OpsDescribeInstanceAclRulesResponse.AclRules["+ i +"].DestPortRange"));
			aclRule.setDestCidrIp(_ctx.stringValue("OpsDescribeInstanceAclRulesResponse.AclRules["+ i +"].DestCidrIp"));
			aclRule.setIpProtocol(_ctx.stringValue("OpsDescribeInstanceAclRulesResponse.AclRules["+ i +"].IpProtocol"));
			aclRule.setPriority(_ctx.stringValue("OpsDescribeInstanceAclRulesResponse.AclRules["+ i +"].Priority"));
			aclRule.setSourcePortRange(_ctx.stringValue("OpsDescribeInstanceAclRulesResponse.AclRules["+ i +"].SourcePortRange"));

			aclRules.add(aclRule);
		}
		opsDescribeInstanceAclRulesResponse.setAclRules(aclRules);
	 
	 	return opsDescribeInstanceAclRulesResponse;
	}
}