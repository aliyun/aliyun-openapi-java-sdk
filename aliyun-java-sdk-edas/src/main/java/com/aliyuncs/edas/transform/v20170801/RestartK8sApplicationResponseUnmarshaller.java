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

import com.aliyuncs.edas.model.v20170801.RestartK8sApplicationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestartK8sApplicationResponseUnmarshaller {

	public static RestartK8sApplicationResponse unmarshall(RestartK8sApplicationResponse restartK8sApplicationResponse, UnmarshallerContext _ctx) {
		
		restartK8sApplicationResponse.setRequestId(_ctx.stringValue("RestartK8sApplicationResponse.RequestId"));
		restartK8sApplicationResponse.setCode(_ctx.integerValue("RestartK8sApplicationResponse.Code"));
		restartK8sApplicationResponse.setMessage(_ctx.stringValue("RestartK8sApplicationResponse.Message"));
		restartK8sApplicationResponse.setChangeOrderId(_ctx.stringValue("RestartK8sApplicationResponse.ChangeOrderId"));
	 
	 	return restartK8sApplicationResponse;
	}
}