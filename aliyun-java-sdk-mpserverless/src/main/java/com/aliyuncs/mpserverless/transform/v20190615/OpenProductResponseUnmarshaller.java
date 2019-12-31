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

package com.aliyuncs.mpserverless.transform.v20190615;

import com.aliyuncs.mpserverless.model.v20190615.OpenProductResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpenProductResponseUnmarshaller {

	public static OpenProductResponse unmarshall(OpenProductResponse openProductResponse, UnmarshallerContext _ctx) {
		
		openProductResponse.setSuccess(_ctx.booleanValue("OpenProductResponse.success"));
		openProductResponse.setCode(_ctx.stringValue("OpenProductResponse.code"));
		openProductResponse.setMessage(_ctx.stringValue("OpenProductResponse.message"));
		openProductResponse.setRequestId(_ctx.stringValue("OpenProductResponse.requestId"));
		openProductResponse.setSynchro(_ctx.stringValue("OpenProductResponse.synchro"));
		openProductResponse.setData(_ctx.stringValue("OpenProductResponse.data"));
	 
	 	return openProductResponse;
	}
}