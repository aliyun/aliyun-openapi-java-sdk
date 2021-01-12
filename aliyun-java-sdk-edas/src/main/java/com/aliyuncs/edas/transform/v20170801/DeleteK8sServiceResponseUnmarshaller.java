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

import com.aliyuncs.edas.model.v20170801.DeleteK8sServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteK8sServiceResponseUnmarshaller {

	public static DeleteK8sServiceResponse unmarshall(DeleteK8sServiceResponse deleteK8sServiceResponse, UnmarshallerContext _ctx) {
		
		deleteK8sServiceResponse.setRequestId(_ctx.stringValue("DeleteK8sServiceResponse.RequestId"));
		deleteK8sServiceResponse.setChangeOrderId(_ctx.stringValue("DeleteK8sServiceResponse.ChangeOrderId"));
		deleteK8sServiceResponse.setCode(_ctx.integerValue("DeleteK8sServiceResponse.Code"));
		deleteK8sServiceResponse.setMessage(_ctx.stringValue("DeleteK8sServiceResponse.Message"));
	 
	 	return deleteK8sServiceResponse;
	}
}