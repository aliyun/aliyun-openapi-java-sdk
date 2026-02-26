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

package com.aliyuncs.beian.transform.v20160810;

import com.aliyuncs.beian.model.v20160810.ManageAccessorDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ManageAccessorDomainResponseUnmarshaller {

	public static ManageAccessorDomainResponse unmarshall(ManageAccessorDomainResponse manageAccessorDomainResponse, UnmarshallerContext _ctx) {
		
		manageAccessorDomainResponse.setRequestId(_ctx.stringValue("ManageAccessorDomainResponse.RequestId"));
		manageAccessorDomainResponse.setCode(_ctx.integerValue("ManageAccessorDomainResponse.Code"));
		manageAccessorDomainResponse.setMessage(_ctx.stringValue("ManageAccessorDomainResponse.Message"));
	 
	 	return manageAccessorDomainResponse;
	}
}