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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeIpAclRulesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeIpAclRulesResponse.AclRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeIpAclRulesResponseUnmarshaller {

	public static OpsDescribeIpAclRulesResponse unmarshall(OpsDescribeIpAclRulesResponse opsDescribeIpAclRulesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeIpAclRulesResponse.setRequestId(_ctx.stringValue("OpsDescribeIpAclRulesResponse.RequestId"));
		opsDescribeIpAclRulesResponse.setTargetIp(_ctx.stringValue("OpsDescribeIpAclRulesResponse.TargetIp"));
		opsDescribeIpAclRulesResponse.setPageNumber(_ctx.integerValue("OpsDescribeIpAclRulesResponse.PageNumber"));
		opsDescribeIpAclRulesResponse.setPageSize(_ctx.integerValue("OpsDescribeIpAclRulesResponse.PageSize"));
		opsDescribeIpAclRulesResponse.setTotalCount(_ctx.integerValue("OpsDescribeIpAclRulesResponse.TotalCount"));

		List<AclRule> aclRules = new ArrayList<AclRule>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeIpAclRulesResponse.AclRules.Length"); i++) {
			AclRule aclRule = new AclRule();
			aclRule.setIpProtocol(_ctx.stringValue("OpsDescribeIpAclRulesResponse.AclRules["+ i +"].IpProtocol"));
			aclRule.setSourceCidrIp(_ctx.stringValue("OpsDescribeIpAclRulesResponse.AclRules["+ i +"].SourceCidrIp"));
			aclRule.setDestCidrIp(_ctx.stringValue("OpsDescribeIpAclRulesResponse.AclRules["+ i +"].DestCidrIp"));
			aclRule.setSourcePortRange(_ctx.stringValue("OpsDescribeIpAclRulesResponse.AclRules["+ i +"].SourcePortRange"));
			aclRule.setDestPortRange(_ctx.stringValue("OpsDescribeIpAclRulesResponse.AclRules["+ i +"].DestPortRange"));
			aclRule.setPolicy(_ctx.stringValue("OpsDescribeIpAclRulesResponse.AclRules["+ i +"].Policy"));
			aclRule.setPriority(_ctx.stringValue("OpsDescribeIpAclRulesResponse.AclRules["+ i +"].Priority"));
			aclRule.setDirection(_ctx.stringValue("OpsDescribeIpAclRulesResponse.AclRules["+ i +"].Direction"));

			aclRules.add(aclRule);
		}
		opsDescribeIpAclRulesResponse.setAclRules(aclRules);
	 
	 	return opsDescribeIpAclRulesResponse;
	}
}