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

package com.aliyuncs.marketing_event.transform.v20210101;

import com.aliyuncs.marketing_event.model.v20210101.DecryptTextResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DecryptTextResponseUnmarshaller {

	public static DecryptTextResponse unmarshall(DecryptTextResponse decryptTextResponse, UnmarshallerContext _ctx) {
		
		decryptTextResponse.setRequestId(_ctx.stringValue("DecryptTextResponse.RequestId"));
		decryptTextResponse.setSuccess(_ctx.booleanValue("DecryptTextResponse.Success"));
		decryptTextResponse.setCode(_ctx.stringValue("DecryptTextResponse.Code"));
		decryptTextResponse.setMessage(_ctx.stringValue("DecryptTextResponse.Message"));
		decryptTextResponse.setData(_ctx.stringValue("DecryptTextResponse.Data"));
	 
	 	return decryptTextResponse;
	}
}