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

import com.aliyuncs.edas.model.v20170801.UpdateK8sSecretResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateK8sSecretResponseUnmarshaller {

	public static UpdateK8sSecretResponse unmarshall(UpdateK8sSecretResponse updateK8sSecretResponse, UnmarshallerContext _ctx) {
		
		updateK8sSecretResponse.setRequestId(_ctx.stringValue("UpdateK8sSecretResponse.RequestId"));
		updateK8sSecretResponse.setCode(_ctx.integerValue("UpdateK8sSecretResponse.Code"));
		updateK8sSecretResponse.setMessage(_ctx.stringValue("UpdateK8sSecretResponse.Message"));
	 
	 	return updateK8sSecretResponse;
	}
}