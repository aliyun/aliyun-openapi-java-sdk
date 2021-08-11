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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.ListSecurityPolicyRelationsResponse;
import com.aliyuncs.alb.model.v20200616.ListSecurityPolicyRelationsResponse.SecrityPolicyRelation;
import com.aliyuncs.alb.model.v20200616.ListSecurityPolicyRelationsResponse.SecrityPolicyRelation.RelatedListener;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecurityPolicyRelationsResponseUnmarshaller {

	public static ListSecurityPolicyRelationsResponse unmarshall(ListSecurityPolicyRelationsResponse listSecurityPolicyRelationsResponse, UnmarshallerContext _ctx) {
		
		listSecurityPolicyRelationsResponse.setRequestId(_ctx.stringValue("ListSecurityPolicyRelationsResponse.RequestId"));

		List<SecrityPolicyRelation> secrityPolicyRelations = new ArrayList<SecrityPolicyRelation>();
		for (int i = 0; i < _ctx.lengthValue("ListSecurityPolicyRelationsResponse.SecrityPolicyRelations.Length"); i++) {
			SecrityPolicyRelation secrityPolicyRelation = new SecrityPolicyRelation();
			secrityPolicyRelation.setSecurityPolicyId(_ctx.stringValue("ListSecurityPolicyRelationsResponse.SecrityPolicyRelations["+ i +"].SecurityPolicyId"));

			List<RelatedListener> relatedListeners = new ArrayList<RelatedListener>();
			for (int j = 0; j < _ctx.lengthValue("ListSecurityPolicyRelationsResponse.SecrityPolicyRelations["+ i +"].RelatedListeners.Length"); j++) {
				RelatedListener relatedListener = new RelatedListener();
				relatedListener.setListenerId(_ctx.stringValue("ListSecurityPolicyRelationsResponse.SecrityPolicyRelations["+ i +"].RelatedListeners["+ j +"].ListenerId"));
				relatedListener.setListenerPort(_ctx.longValue("ListSecurityPolicyRelationsResponse.SecrityPolicyRelations["+ i +"].RelatedListeners["+ j +"].ListenerPort"));
				relatedListener.setListenerProtocol(_ctx.stringValue("ListSecurityPolicyRelationsResponse.SecrityPolicyRelations["+ i +"].RelatedListeners["+ j +"].ListenerProtocol"));
				relatedListener.setLoadBalancerId(_ctx.stringValue("ListSecurityPolicyRelationsResponse.SecrityPolicyRelations["+ i +"].RelatedListeners["+ j +"].LoadBalancerId"));

				relatedListeners.add(relatedListener);
			}
			secrityPolicyRelation.setRelatedListeners(relatedListeners);

			secrityPolicyRelations.add(secrityPolicyRelation);
		}
		listSecurityPolicyRelationsResponse.setSecrityPolicyRelations(secrityPolicyRelations);
	 
	 	return listSecurityPolicyRelationsResponse;
	}
}