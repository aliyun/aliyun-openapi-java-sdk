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

package com.aliyuncs.nlb.transform.v20220430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nlb.model.v20220430.ListSecurityPolicyResponse;
import com.aliyuncs.nlb.model.v20220430.ListSecurityPolicyResponse.SecurityPolicie;
import com.aliyuncs.nlb.model.v20220430.ListSecurityPolicyResponse.SecurityPolicie.RelatedListener;
import com.aliyuncs.nlb.model.v20220430.ListSecurityPolicyResponse.SecurityPolicie.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecurityPolicyResponseUnmarshaller {

	public static ListSecurityPolicyResponse unmarshall(ListSecurityPolicyResponse listSecurityPolicyResponse, UnmarshallerContext _ctx) {
		
		listSecurityPolicyResponse.setRequestId(_ctx.stringValue("ListSecurityPolicyResponse.RequestId"));
		listSecurityPolicyResponse.setSuccess(_ctx.booleanValue("ListSecurityPolicyResponse.Success"));
		listSecurityPolicyResponse.setCode(_ctx.stringValue("ListSecurityPolicyResponse.Code"));
		listSecurityPolicyResponse.setMessage(_ctx.stringValue("ListSecurityPolicyResponse.Message"));
		listSecurityPolicyResponse.setHttpStatusCode(_ctx.integerValue("ListSecurityPolicyResponse.HttpStatusCode"));
		listSecurityPolicyResponse.setDynamicCode(_ctx.stringValue("ListSecurityPolicyResponse.DynamicCode"));
		listSecurityPolicyResponse.setDynamicMessage(_ctx.stringValue("ListSecurityPolicyResponse.DynamicMessage"));
		listSecurityPolicyResponse.setTotalCount(_ctx.integerValue("ListSecurityPolicyResponse.TotalCount"));
		listSecurityPolicyResponse.setNextToken(_ctx.stringValue("ListSecurityPolicyResponse.NextToken"));
		listSecurityPolicyResponse.setMaxResults(_ctx.integerValue("ListSecurityPolicyResponse.MaxResults"));

		List<SecurityPolicie> securityPolicies = new ArrayList<SecurityPolicie>();
		for (int i = 0; i < _ctx.lengthValue("ListSecurityPolicyResponse.SecurityPolicies.Length"); i++) {
			SecurityPolicie securityPolicie = new SecurityPolicie();
			securityPolicie.setSecurityPolicyId(_ctx.stringValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].SecurityPolicyId"));
			securityPolicie.setSecurityPolicyName(_ctx.stringValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].SecurityPolicyName"));
			securityPolicie.setTlsVersion(_ctx.stringValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].TlsVersion"));
			securityPolicie.setCiphers(_ctx.stringValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].Ciphers"));
			securityPolicie.setRegionId(_ctx.stringValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].RegionId"));
			securityPolicie.setResourceGroupId(_ctx.stringValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].ResourceGroupId"));
			securityPolicie.setSecurityPolicyStatus(_ctx.stringValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].SecurityPolicyStatus"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			securityPolicie.setTags(tags);

			List<RelatedListener> relatedListeners = new ArrayList<RelatedListener>();
			for (int j = 0; j < _ctx.lengthValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].RelatedListeners.Length"); j++) {
				RelatedListener relatedListener = new RelatedListener();
				relatedListener.setListenerId(_ctx.stringValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].RelatedListeners["+ j +"].ListenerId"));
				relatedListener.setListenerPort(_ctx.longValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].RelatedListeners["+ j +"].ListenerPort"));
				relatedListener.setListenerProtocol(_ctx.stringValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].RelatedListeners["+ j +"].ListenerProtocol"));
				relatedListener.setLoadBalancerId(_ctx.stringValue("ListSecurityPolicyResponse.SecurityPolicies["+ i +"].RelatedListeners["+ j +"].LoadBalancerId"));

				relatedListeners.add(relatedListener);
			}
			securityPolicie.setRelatedListeners(relatedListeners);

			securityPolicies.add(securityPolicie);
		}
		listSecurityPolicyResponse.setSecurityPolicies(securityPolicies);
	 
	 	return listSecurityPolicyResponse;
	}
}