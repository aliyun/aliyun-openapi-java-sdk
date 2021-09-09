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

import com.aliyuncs.edas.model.v20170801.ValidateK8sResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateK8sResourceResponseUnmarshaller {

	public static ValidateK8sResourceResponse unmarshall(ValidateK8sResourceResponse validateK8sResourceResponse, UnmarshallerContext _ctx) {
		
		validateK8sResourceResponse.setRequestId(_ctx.stringValue("ValidateK8sResourceResponse.RequestId"));
		validateK8sResourceResponse.setCode(_ctx.integerValue("ValidateK8sResourceResponse.Code"));
		validateK8sResourceResponse.setMessage(_ctx.stringValue("ValidateK8sResourceResponse.Message"));
	 
	 	return validateK8sResourceResponse;
	}
}