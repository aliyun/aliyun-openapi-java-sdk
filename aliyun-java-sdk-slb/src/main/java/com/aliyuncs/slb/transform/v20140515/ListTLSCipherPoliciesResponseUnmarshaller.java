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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.ListTLSCipherPoliciesResponse;
import com.aliyuncs.slb.model.v20140515.ListTLSCipherPoliciesResponse.TLSCipherPolicy;
import com.aliyuncs.slb.model.v20140515.ListTLSCipherPoliciesResponse.TLSCipherPolicy.RelateListener;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTLSCipherPoliciesResponseUnmarshaller {

	public static ListTLSCipherPoliciesResponse unmarshall(ListTLSCipherPoliciesResponse listTLSCipherPoliciesResponse, UnmarshallerContext _ctx) {
		
		listTLSCipherPoliciesResponse.setRequestId(_ctx.stringValue("ListTLSCipherPoliciesResponse.RequestId"));
		listTLSCipherPoliciesResponse.setNextToken(_ctx.stringValue("ListTLSCipherPoliciesResponse.NextToken"));
		listTLSCipherPoliciesResponse.setIsTruncated(_ctx.booleanValue("ListTLSCipherPoliciesResponse.IsTruncated"));
		listTLSCipherPoliciesResponse.setTotalCount(_ctx.integerValue("ListTLSCipherPoliciesResponse.TotalCount"));

		List<TLSCipherPolicy> tLSCipherPolicies = new ArrayList<TLSCipherPolicy>();
		for (int i = 0; i < _ctx.lengthValue("ListTLSCipherPoliciesResponse.TLSCipherPolicies.Length"); i++) {
			TLSCipherPolicy tLSCipherPolicy = new TLSCipherPolicy();
			tLSCipherPolicy.setCreateTime(_ctx.longValue("ListTLSCipherPoliciesResponse.TLSCipherPolicies["+ i +"].CreateTime"));
			tLSCipherPolicy.setInstanceId(_ctx.stringValue("ListTLSCipherPoliciesResponse.TLSCipherPolicies["+ i +"].InstanceId"));
			tLSCipherPolicy.setName(_ctx.stringValue("ListTLSCipherPoliciesResponse.TLSCipherPolicies["+ i +"].Name"));
			tLSCipherPolicy.setStatus(_ctx.stringValue("ListTLSCipherPoliciesResponse.TLSCipherPolicies["+ i +"].Status"));

			List<String> tLSVersions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTLSCipherPoliciesResponse.TLSCipherPolicies["+ i +"].TLSVersions.Length"); j++) {
				tLSVersions.add(_ctx.stringValue("ListTLSCipherPoliciesResponse.TLSCipherPolicies["+ i +"].TLSVersions["+ j +"]"));
			}
			tLSCipherPolicy.setTLSVersions(tLSVersions);

			List<String> ciphers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTLSCipherPoliciesResponse.TLSCipherPolicies["+ i +"].Ciphers.Length"); j++) {
				ciphers.add(_ctx.stringValue("ListTLSCipherPoliciesResponse.TLSCipherPolicies["+ i +"].Ciphers["+ j +"]"));
			}
			tLSCipherPolicy.setCiphers(ciphers);

			List<RelateListener> relateListeners = new ArrayList<RelateListener>();
			for (int j = 0; j < _ctx.lengthValue("ListTLSCipherPoliciesResponse.TLSCipherPolicies["+ i +"].RelateListeners.Length"); j++) {
				RelateListener relateListener = new RelateListener();
				relateListener.setLoadBalancerId(_ctx.stringValue("ListTLSCipherPoliciesResponse.TLSCipherPolicies["+ i +"].RelateListeners["+ j +"].LoadBalancerId"));
				relateListener.setPort(_ctx.integerValue("ListTLSCipherPoliciesResponse.TLSCipherPolicies["+ i +"].RelateListeners["+ j +"].Port"));
				relateListener.setBizProtocol(_ctx.stringValue("ListTLSCipherPoliciesResponse.TLSCipherPolicies["+ i +"].RelateListeners["+ j +"].Protocol"));

				relateListeners.add(relateListener);
			}
			tLSCipherPolicy.setRelateListeners(relateListeners);

			tLSCipherPolicies.add(tLSCipherPolicy);
		}
		listTLSCipherPoliciesResponse.setTLSCipherPolicies(tLSCipherPolicies);
	 
	 	return listTLSCipherPoliciesResponse;
	}
}