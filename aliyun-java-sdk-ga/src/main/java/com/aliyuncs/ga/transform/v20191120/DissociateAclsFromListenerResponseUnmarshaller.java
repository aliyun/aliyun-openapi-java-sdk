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

import com.aliyuncs.ga.model.v20191120.DissociateAclsFromListenerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DissociateAclsFromListenerResponseUnmarshaller {

	public static DissociateAclsFromListenerResponse unmarshall(DissociateAclsFromListenerResponse dissociateAclsFromListenerResponse, UnmarshallerContext _ctx) {
		
		dissociateAclsFromListenerResponse.setRequestId(_ctx.stringValue("DissociateAclsFromListenerResponse.RequestId"));
		dissociateAclsFromListenerResponse.setListenerId(_ctx.stringValue("DissociateAclsFromListenerResponse.ListenerId"));

		List<String> aclIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DissociateAclsFromListenerResponse.AclIds.Length"); i++) {
			aclIds.add(_ctx.stringValue("DissociateAclsFromListenerResponse.AclIds["+ i +"]"));
		}
		dissociateAclsFromListenerResponse.setAclIds(aclIds);
	 
	 	return dissociateAclsFromListenerResponse;
	}
}