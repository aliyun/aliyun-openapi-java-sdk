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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceWhitelistResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceWhitelistResponse.ResourceWhitelist;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceWhitelistResponse.ResourceWhitelist.ModuleRule;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceWhitelistResponse.ResourceWhitelist.ResourceProperty;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceWhitelistResponse.ResourceWhitelist.Whitelist;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceWhitelistResponse.ResourceWhitelist.Whitelist.ResourceProperty1;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeResourceWhitelistResponseUnmarshaller {

	public static OpsDescribeResourceWhitelistResponse unmarshall(OpsDescribeResourceWhitelistResponse opsDescribeResourceWhitelistResponse, UnmarshallerContext _ctx) {
		
		opsDescribeResourceWhitelistResponse.setRequestId(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.RequestId"));

		List<ResourceWhitelist> resourceWhitelists = new ArrayList<ResourceWhitelist>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists.Length"); i++) {
			ResourceWhitelist resourceWhitelist = new ResourceWhitelist();
			resourceWhitelist.setProduct(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Product"));
			resourceWhitelist.setModule(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Module"));

			List<ResourceProperty> propertyLists = new ArrayList<ResourceProperty>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].PropertyLists.Length"); j++) {
				ResourceProperty resourceProperty = new ResourceProperty();
				resourceProperty.setName(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].PropertyLists["+ j +"].Name"));
				resourceProperty.setValue(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].PropertyLists["+ j +"].Value"));

				propertyLists.add(resourceProperty);
			}
			resourceWhitelist.setPropertyLists(propertyLists);

			List<Whitelist> whitelists = new ArrayList<Whitelist>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Whitelists.Length"); j++) {
				Whitelist whitelist = new Whitelist();
				whitelist.setGroupId(_ctx.integerValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Whitelists["+ j +"].GroupId"));
				whitelist.setGroupName(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Whitelists["+ j +"].GroupName"));
				whitelist.setSupportedActions(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Whitelists["+ j +"].SupportedActions"));
				whitelist.setSupportedProducts(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Whitelists["+ j +"].SupportedProducts"));

				List<ResourceProperty1> existedMembers = new ArrayList<ResourceProperty1>();
				for (int k = 0; k < _ctx.lengthValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Whitelists["+ j +"].ExistedMembers.Length"); k++) {
					ResourceProperty1 resourceProperty1 = new ResourceProperty1();
					resourceProperty1.setName(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Whitelists["+ j +"].ExistedMembers["+ k +"].Name"));
					resourceProperty1.setValue(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Whitelists["+ j +"].ExistedMembers["+ k +"].Value"));

					existedMembers.add(resourceProperty1);
				}
				whitelist.setExistedMembers(existedMembers);

				whitelists.add(whitelist);
			}
			resourceWhitelist.setWhitelists(whitelists);

			List<ModuleRule> rules = new ArrayList<ModuleRule>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Rules.Length"); j++) {
				ModuleRule moduleRule = new ModuleRule();
				moduleRule.setGroupId(_ctx.integerValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Rules["+ j +"].GroupId"));
				moduleRule.setModuleRuleName(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Rules["+ j +"].ModuleRuleName"));
				moduleRule.setRequirements(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Rules["+ j +"].Requirements"));
				moduleRule.setNotFlag(_ctx.booleanValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Rules["+ j +"].NotFlag"));
				moduleRule.setSupportedActions(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Rules["+ j +"].SupportedActions"));
				moduleRule.setSupportedProducts(_ctx.stringValue("OpsDescribeResourceWhitelistResponse.ResourceWhitelists["+ i +"].Rules["+ j +"].SupportedProducts"));

				rules.add(moduleRule);
			}
			resourceWhitelist.setRules(rules);

			resourceWhitelists.add(resourceWhitelist);
		}
		opsDescribeResourceWhitelistResponse.setResourceWhitelists(resourceWhitelists);
	 
	 	return opsDescribeResourceWhitelistResponse;
	}
}