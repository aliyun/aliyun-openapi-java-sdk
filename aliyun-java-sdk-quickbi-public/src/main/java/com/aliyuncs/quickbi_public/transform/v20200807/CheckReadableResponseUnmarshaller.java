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

package com.aliyuncs.quickbi_public.transform.v20200807;

import com.aliyuncs.quickbi_public.model.v20200807.CheckReadableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckReadableResponseUnmarshaller {

	public static CheckReadableResponse unmarshall(CheckReadableResponse checkReadableResponse, UnmarshallerContext _ctx) {
		
		checkReadableResponse.setRequestId(_ctx.stringValue("CheckReadableResponse.RequestId"));
		checkReadableResponse.setSuccess(_ctx.booleanValue("CheckReadableResponse.Success"));
		checkReadableResponse.setResult(_ctx.booleanValue("CheckReadableResponse.Result"));
	 
	 	return checkReadableResponse;
	}
}