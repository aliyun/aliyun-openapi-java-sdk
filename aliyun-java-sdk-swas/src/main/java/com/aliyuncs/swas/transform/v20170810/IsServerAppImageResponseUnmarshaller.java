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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.IsServerAppImageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class IsServerAppImageResponseUnmarshaller {

	public static IsServerAppImageResponse unmarshall(IsServerAppImageResponse isServerAppImageResponse, UnmarshallerContext _ctx) {
		
		isServerAppImageResponse.setRequestId(_ctx.stringValue("IsServerAppImageResponse.RequestId"));
		isServerAppImageResponse.setCode(_ctx.stringValue("IsServerAppImageResponse.Code"));
		isServerAppImageResponse.setSuccess(_ctx.booleanValue("IsServerAppImageResponse.Success"));
		isServerAppImageResponse.setResult(_ctx.booleanValue("IsServerAppImageResponse.Result"));
	 
	 	return isServerAppImageResponse;
	}
}