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

import com.aliyuncs.edas.model.v20170801.DeployK8sApplicationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeployK8sApplicationResponseUnmarshaller {

	public static DeployK8sApplicationResponse unmarshall(DeployK8sApplicationResponse deployK8sApplicationResponse, UnmarshallerContext context) {
		
		deployK8sApplicationResponse.setRequestId(context.stringValue("DeployK8sApplicationResponse.RequestId"));
		deployK8sApplicationResponse.setCode(context.integerValue("DeployK8sApplicationResponse.Code"));
		deployK8sApplicationResponse.setMessage(context.stringValue("DeployK8sApplicationResponse.Message"));
		deployK8sApplicationResponse.setChangeOrderId(context.stringValue("DeployK8sApplicationResponse.ChangeOrderId"));
	 
	 	return deployK8sApplicationResponse;
	}
}