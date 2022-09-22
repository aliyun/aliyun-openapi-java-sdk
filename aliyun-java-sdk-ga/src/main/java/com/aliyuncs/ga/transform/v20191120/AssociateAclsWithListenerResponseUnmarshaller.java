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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.AssociateAclsWithListenerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssociateAclsWithListenerResponseUnmarshaller {

	public static AssociateAclsWithListenerResponse unmarshall(AssociateAclsWithListenerResponse associateAclsWithListenerResponse, UnmarshallerContext _ctx) {
		
		associateAclsWithListenerResponse.setRequestId(_ctx.stringValue("AssociateAclsWithListenerResponse.RequestId"));
		associateAclsWithListenerResponse.setListenerId(_ctx.stringValue("AssociateAclsWithListenerResponse.ListenerId"));

		List<String> aclIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AssociateAclsWithListenerResponse.AclIds.Length"); i++) {
			aclIds.add(_ctx.stringValue("AssociateAclsWithListenerResponse.AclIds["+ i +"]"));
		}
		associateAclsWithListenerResponse.setAclIds(aclIds);
	 
	 	return associateAclsWithListenerResponse;
	}
}