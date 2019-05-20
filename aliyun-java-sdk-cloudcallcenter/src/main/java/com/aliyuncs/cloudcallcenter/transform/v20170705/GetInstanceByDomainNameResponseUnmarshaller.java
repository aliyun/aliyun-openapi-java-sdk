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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetInstanceByDomainNameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceByDomainNameResponseUnmarshaller {

	public static GetInstanceByDomainNameResponse unmarshall(GetInstanceByDomainNameResponse getInstanceByDomainNameResponse, UnmarshallerContext context) {
		
		getInstanceByDomainNameResponse.setRequestId(context.stringValue("GetInstanceByDomainNameResponse.RequestId"));
		getInstanceByDomainNameResponse.setSuccess(context.booleanValue("GetInstanceByDomainNameResponse.Success"));
		getInstanceByDomainNameResponse.setCode(context.stringValue("GetInstanceByDomainNameResponse.Code"));
		getInstanceByDomainNameResponse.setMessage(context.stringValue("GetInstanceByDomainNameResponse.Message"));
		getInstanceByDomainNameResponse.setHttpStatusCode(context.integerValue("GetInstanceByDomainNameResponse.HttpStatusCode"));
		getInstanceByDomainNameResponse.setInstance(context.stringValue("GetInstanceByDomainNameResponse.Instance"));
	 
	 	return getInstanceByDomainNameResponse;
	}
}