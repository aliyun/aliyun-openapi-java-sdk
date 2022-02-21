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

package com.aliyuncs.resourcemanager.transform.v20200331;

import com.aliyuncs.resourcemanager.model.v20200331.DeregisterDelegatedAdministratorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeregisterDelegatedAdministratorResponseUnmarshaller {

	public static DeregisterDelegatedAdministratorResponse unmarshall(DeregisterDelegatedAdministratorResponse deregisterDelegatedAdministratorResponse, UnmarshallerContext _ctx) {
		
		deregisterDelegatedAdministratorResponse.setRequestId(_ctx.stringValue("DeregisterDelegatedAdministratorResponse.RequestId"));
	 
	 	return deregisterDelegatedAdministratorResponse;
	}
}