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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.GetInstanceEndpointResponse;
import com.aliyuncs.cr.model.v20181201.GetInstanceEndpointResponse.AclEntriesItem;
import com.aliyuncs.cr.model.v20181201.GetInstanceEndpointResponse.Endpoints;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceEndpointResponseUnmarshaller {

	public static GetInstanceEndpointResponse unmarshall(GetInstanceEndpointResponse getInstanceEndpointResponse, UnmarshallerContext _ctx) {
		
		getInstanceEndpointResponse.setRequestId(_ctx.stringValue("GetInstanceEndpointResponse.RequestId"));
		getInstanceEndpointResponse.setIsSuccess(_ctx.booleanValue("GetInstanceEndpointResponse.IsSuccess"));
		getInstanceEndpointResponse.setCode(_ctx.stringValue("GetInstanceEndpointResponse.Code"));
		getInstanceEndpointResponse.setEnable(_ctx.booleanValue("GetInstanceEndpointResponse.Enable"));
		getInstanceEndpointResponse.setAclEnable(_ctx.booleanValue("GetInstanceEndpointResponse.AclEnable"));
		getInstanceEndpointResponse.setStatus(_ctx.stringValue("GetInstanceEndpointResponse.Status"));

		List<Endpoints> domains = new ArrayList<Endpoints>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceEndpointResponse.Domains.Length"); i++) {
			Endpoints endpoints = new Endpoints();
			endpoints.setDomain(_ctx.stringValue("GetInstanceEndpointResponse.Domains["+ i +"].Domain"));
			endpoints.setType(_ctx.stringValue("GetInstanceEndpointResponse.Domains["+ i +"].Type"));

			domains.add(endpoints);
		}
		getInstanceEndpointResponse.setDomains(domains);

		List<AclEntriesItem> aclEntries = new ArrayList<AclEntriesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceEndpointResponse.AclEntries.Length"); i++) {
			AclEntriesItem aclEntriesItem = new AclEntriesItem();
			aclEntriesItem.setEntry(_ctx.stringValue("GetInstanceEndpointResponse.AclEntries["+ i +"].Entry"));
			aclEntriesItem.setComment(_ctx.stringValue("GetInstanceEndpointResponse.AclEntries["+ i +"].Comment"));

			aclEntries.add(aclEntriesItem);
		}
		getInstanceEndpointResponse.setAclEntries(aclEntries);
	 
	 	return getInstanceEndpointResponse;
	}
}