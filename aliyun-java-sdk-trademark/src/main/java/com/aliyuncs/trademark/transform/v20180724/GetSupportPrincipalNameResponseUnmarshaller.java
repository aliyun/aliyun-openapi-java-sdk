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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.GetSupportPrincipalNameResponse;
import com.aliyuncs.trademark.model.v20180724.GetSupportPrincipalNameResponse.Principal;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSupportPrincipalNameResponseUnmarshaller {

	public static GetSupportPrincipalNameResponse unmarshall(GetSupportPrincipalNameResponse getSupportPrincipalNameResponse, UnmarshallerContext _ctx) {
		
		getSupportPrincipalNameResponse.setRequestId(_ctx.stringValue("GetSupportPrincipalNameResponse.RequestId"));

		List<Principal> principals = new ArrayList<Principal>();
		for (int i = 0; i < _ctx.lengthValue("GetSupportPrincipalNameResponse.Principals.Length"); i++) {
			Principal principal = new Principal();
			principal.setPrincipalDescription(_ctx.stringValue("GetSupportPrincipalNameResponse.Principals["+ i +"].PrincipalDescription"));
			principal.setDefaultPrincipal(_ctx.booleanValue("GetSupportPrincipalNameResponse.Principals["+ i +"].DefaultPrincipal"));
			principal.setPrincipalValue(_ctx.integerValue("GetSupportPrincipalNameResponse.Principals["+ i +"].PrincipalValue"));

			principals.add(principal);
		}
		getSupportPrincipalNameResponse.setPrincipals(principals);
	 
	 	return getSupportPrincipalNameResponse;
	}
}