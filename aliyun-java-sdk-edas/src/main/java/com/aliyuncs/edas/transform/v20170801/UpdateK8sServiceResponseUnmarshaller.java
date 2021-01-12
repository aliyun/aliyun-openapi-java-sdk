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

import com.aliyuncs.edas.model.v20170801.UpdateK8sServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateK8sServiceResponseUnmarshaller {

	public static UpdateK8sServiceResponse unmarshall(UpdateK8sServiceResponse updateK8sServiceResponse, UnmarshallerContext _ctx) {
		
		updateK8sServiceResponse.setRequestId(_ctx.stringValue("UpdateK8sServiceResponse.RequestId"));
		updateK8sServiceResponse.setChangeOrderId(_ctx.stringValue("UpdateK8sServiceResponse.ChangeOrderId"));
		updateK8sServiceResponse.setCode(_ctx.integerValue("UpdateK8sServiceResponse.Code"));
		updateK8sServiceResponse.setMessage(_ctx.stringValue("UpdateK8sServiceResponse.Message"));
	 
	 	return updateK8sServiceResponse;
	}
}