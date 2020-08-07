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

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.CheckSLRDeleteResponse;
import com.aliyuncs.csb.model.v20171118.CheckSLRDeleteResponse.RoleUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckSLRDeleteResponseUnmarshaller {

	public static CheckSLRDeleteResponse unmarshall(CheckSLRDeleteResponse checkSLRDeleteResponse, UnmarshallerContext _ctx) {
		
		checkSLRDeleteResponse.setRequestId(_ctx.stringValue("CheckSLRDeleteResponse.RequestId"));
		checkSLRDeleteResponse.setDeletable(_ctx.booleanValue("CheckSLRDeleteResponse.Deletable"));
		checkSLRDeleteResponse.setCode(_ctx.integerValue("CheckSLRDeleteResponse.Code"));
		checkSLRDeleteResponse.setMessage(_ctx.stringValue("CheckSLRDeleteResponse.Message"));

		List<RoleUsage> roleUsages = new ArrayList<RoleUsage>();
		for (int i = 0; i < _ctx.lengthValue("CheckSLRDeleteResponse.RoleUsages.Length"); i++) {
			RoleUsage roleUsage = new RoleUsage();
			roleUsage.setRegion(_ctx.stringValue("CheckSLRDeleteResponse.RoleUsages["+ i +"].Region"));

			List<String> resources = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckSLRDeleteResponse.RoleUsages["+ i +"].Resources.Length"); j++) {
				resources.add(_ctx.stringValue("CheckSLRDeleteResponse.RoleUsages["+ i +"].Resources["+ j +"]"));
			}
			roleUsage.setResources(resources);

			roleUsages.add(roleUsage);
		}
		checkSLRDeleteResponse.setRoleUsages(roleUsages);
	 
	 	return checkSLRDeleteResponse;
	}
}