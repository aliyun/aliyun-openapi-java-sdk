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

package com.aliyuncs.kms.transform.v20160120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.ListNetworkRulesResponse;
import com.aliyuncs.kms.model.v20160120.ListNetworkRulesResponse.NetworkRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNetworkRulesResponseUnmarshaller {

	public static ListNetworkRulesResponse unmarshall(ListNetworkRulesResponse listNetworkRulesResponse, UnmarshallerContext _ctx) {
		
		listNetworkRulesResponse.setRequestId(_ctx.stringValue("ListNetworkRulesResponse.RequestId"));
		listNetworkRulesResponse.setPageNumber(_ctx.integerValue("ListNetworkRulesResponse.PageNumber"));
		listNetworkRulesResponse.setPageSize(_ctx.integerValue("ListNetworkRulesResponse.PageSize"));
		listNetworkRulesResponse.setTotalCount(_ctx.integerValue("ListNetworkRulesResponse.TotalCount"));

		List<NetworkRule> networkRules = new ArrayList<NetworkRule>();
		for (int i = 0; i < _ctx.lengthValue("ListNetworkRulesResponse.NetworkRules.Length"); i++) {
			NetworkRule networkRule = new NetworkRule();
			networkRule.setType(_ctx.stringValue("ListNetworkRulesResponse.NetworkRules["+ i +"].Type"));
			networkRule.setName(_ctx.stringValue("ListNetworkRulesResponse.NetworkRules["+ i +"].Name"));

			networkRules.add(networkRule);
		}
		listNetworkRulesResponse.setNetworkRules(networkRules);
	 
	 	return listNetworkRulesResponse;
	}
}