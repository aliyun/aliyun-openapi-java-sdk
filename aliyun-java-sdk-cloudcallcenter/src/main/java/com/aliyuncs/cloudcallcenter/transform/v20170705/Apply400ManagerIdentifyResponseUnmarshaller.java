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

import com.aliyuncs.cloudcallcenter.model.v20170705.Apply400ManagerIdentifyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class Apply400ManagerIdentifyResponseUnmarshaller {

	public static Apply400ManagerIdentifyResponse unmarshall(Apply400ManagerIdentifyResponse apply400ManagerIdentifyResponse, UnmarshallerContext context) {
		
		apply400ManagerIdentifyResponse.setRequestId(context.stringValue("Apply400ManagerIdentifyResponse.RequestId"));
		apply400ManagerIdentifyResponse.setSuccess(context.booleanValue("Apply400ManagerIdentifyResponse.Success"));
		apply400ManagerIdentifyResponse.setCode(context.stringValue("Apply400ManagerIdentifyResponse.Code"));
		apply400ManagerIdentifyResponse.setMessage(context.stringValue("Apply400ManagerIdentifyResponse.Message"));
		apply400ManagerIdentifyResponse.setHttpStatusCode(context.integerValue("Apply400ManagerIdentifyResponse.HttpStatusCode"));
		apply400ManagerIdentifyResponse.setData(context.stringValue("Apply400ManagerIdentifyResponse.Data"));
	 
	 	return apply400ManagerIdentifyResponse;
	}
}