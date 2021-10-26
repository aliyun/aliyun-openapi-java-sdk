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

package com.aliyuncs.quickbi_public.transform.v20210325;

import com.aliyuncs.quickbi_public.model.v20210325.BuildSignatureUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BuildSignatureUrlResponseUnmarshaller {

	public static BuildSignatureUrlResponse unmarshall(BuildSignatureUrlResponse buildSignatureUrlResponse, UnmarshallerContext _ctx) {
		
		buildSignatureUrlResponse.setRequestId(_ctx.stringValue("BuildSignatureUrlResponse.RequestId"));
		buildSignatureUrlResponse.setResult(_ctx.stringValue("BuildSignatureUrlResponse.Result"));
		buildSignatureUrlResponse.setSuccess(_ctx.booleanValue("BuildSignatureUrlResponse.Success"));
	 
	 	return buildSignatureUrlResponse;
	}
}