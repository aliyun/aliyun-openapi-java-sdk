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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.CreateK8sServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateK8sServiceResponseUnmarshaller {

	public static CreateK8sServiceResponse unmarshall(CreateK8sServiceResponse createK8sServiceResponse, UnmarshallerContext _ctx) {
		
		createK8sServiceResponse.setRequestId(_ctx.stringValue("CreateK8sServiceResponse.RequestId"));
		createK8sServiceResponse.setChangeOrderId(_ctx.stringValue("CreateK8sServiceResponse.ChangeOrderId"));
		createK8sServiceResponse.setCode(_ctx.integerValue("CreateK8sServiceResponse.Code"));
		createK8sServiceResponse.setMessage(_ctx.stringValue("CreateK8sServiceResponse.Message"));
	 
	 	return createK8sServiceResponse;
	}
}