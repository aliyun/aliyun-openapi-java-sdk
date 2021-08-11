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

import com.aliyuncs.alb.model.v20200616.ListAclRelationsResponse;
import com.aliyuncs.alb.model.v20200616.ListAclRelationsResponse.AclRelation;
import com.aliyuncs.alb.model.v20200616.ListAclRelationsResponse.AclRelation.RelatedListener;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAclRelationsResponseUnmarshaller {

	public static ListAclRelationsResponse unmarshall(ListAclRelationsResponse listAclRelationsResponse, UnmarshallerContext _ctx) {
		
		listAclRelationsResponse.setRequestId(_ctx.stringValue("ListAclRelationsResponse.RequestId"));

		List<AclRelation> aclRelations = new ArrayList<AclRelation>();
		for (int i = 0; i < _ctx.lengthValue("ListAclRelationsResponse.AclRelations.Length"); i++) {
			AclRelation aclRelation = new AclRelation();
			aclRelation.setAclId(_ctx.stringValue("ListAclRelationsResponse.AclRelations["+ i +"].AclId"));

			List<RelatedListener> relatedListeners = new ArrayList<RelatedListener>();
			for (int j = 0; j < _ctx.lengthValue("ListAclRelationsResponse.AclRelations["+ i +"].RelatedListeners.Length"); j++) {
				RelatedListener relatedListener = new RelatedListener();
				relatedListener.setListenerId(_ctx.stringValue("ListAclRelationsResponse.AclRelations["+ i +"].RelatedListeners["+ j +"].ListenerId"));
				relatedListener.setListenerPort(_ctx.integerValue("ListAclRelationsResponse.AclRelations["+ i +"].RelatedListeners["+ j +"].ListenerPort"));
				relatedListener.setListenerProtocol(_ctx.stringValue("ListAclRelationsResponse.AclRelations["+ i +"].RelatedListeners["+ j +"].ListenerProtocol"));
				relatedListener.setLoadBalancerId(_ctx.stringValue("ListAclRelationsResponse.AclRelations["+ i +"].RelatedListeners["+ j +"].LoadBalancerId"));
				relatedListener.setStatus(_ctx.stringValue("ListAclRelationsResponse.AclRelations["+ i +"].RelatedListeners["+ j +"].Status"));

				relatedListeners.add(relatedListener);
			}
			aclRelation.setRelatedListeners(relatedListeners);

			aclRelations.add(aclRelation);
		}
		listAclRelationsResponse.setAclRelations(aclRelations);
	 
	 	return listAclRelationsResponse;
	}
}