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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListServiceAuthsResponse;
import com.aliyuncs.devops.model.v20210625.ListServiceAuthsResponse.ServiceAuth;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceAuthsResponseUnmarshaller {

	public static ListServiceAuthsResponse unmarshall(ListServiceAuthsResponse listServiceAuthsResponse, UnmarshallerContext _ctx) {
		
		listServiceAuthsResponse.setRequestId(_ctx.stringValue("ListServiceAuthsResponse.requestId"));
		listServiceAuthsResponse.setErrorMessage(_ctx.stringValue("ListServiceAuthsResponse.errorMessage"));
		listServiceAuthsResponse.setErrorCode(_ctx.stringValue("ListServiceAuthsResponse.errorCode"));
		listServiceAuthsResponse.setSuccess(_ctx.booleanValue("ListServiceAuthsResponse.success"));

		List<ServiceAuth> serviceAuths = new ArrayList<ServiceAuth>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceAuthsResponse.serviceAuths.Length"); i++) {
			ServiceAuth serviceAuth = new ServiceAuth();
			serviceAuth.setId(_ctx.longValue("ListServiceAuthsResponse.serviceAuths["+ i +"].id"));
			serviceAuth.setOwnerName(_ctx.stringValue("ListServiceAuthsResponse.serviceAuths["+ i +"].ownerName"));
			serviceAuth.setType(_ctx.stringValue("ListServiceAuthsResponse.serviceAuths["+ i +"].type"));
			serviceAuth.setOwnerStaffId(_ctx.stringValue("ListServiceAuthsResponse.serviceAuths["+ i +"].ownerStaffId"));

			serviceAuths.add(serviceAuth);
		}
		listServiceAuthsResponse.setServiceAuths(serviceAuths);
	 
	 	return listServiceAuthsResponse;
	}
}