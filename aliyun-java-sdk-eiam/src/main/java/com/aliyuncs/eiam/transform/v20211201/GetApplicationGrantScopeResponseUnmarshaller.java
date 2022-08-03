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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.GetApplicationGrantScopeResponse;
import com.aliyuncs.eiam.model.v20211201.GetApplicationGrantScopeResponse.ApplicationGrantScope;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationGrantScopeResponseUnmarshaller {

	public static GetApplicationGrantScopeResponse unmarshall(GetApplicationGrantScopeResponse getApplicationGrantScopeResponse, UnmarshallerContext _ctx) {
		
		getApplicationGrantScopeResponse.setRequestId(_ctx.stringValue("GetApplicationGrantScopeResponse.RequestId"));

		ApplicationGrantScope applicationGrantScope = new ApplicationGrantScope();

		List<String> grantScopes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationGrantScopeResponse.ApplicationGrantScope.GrantScopes.Length"); i++) {
			grantScopes.add(_ctx.stringValue("GetApplicationGrantScopeResponse.ApplicationGrantScope.GrantScopes["+ i +"]"));
		}
		applicationGrantScope.setGrantScopes(grantScopes);
		getApplicationGrantScopeResponse.setApplicationGrantScope(applicationGrantScope);
	 
	 	return getApplicationGrantScopeResponse;
	}
}