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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.PushDocumentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushDocumentResponseUnmarshaller {

	public static PushDocumentResponse unmarshall(PushDocumentResponse pushDocumentResponse, UnmarshallerContext _ctx) {
		
		pushDocumentResponse.setCode(_ctx.stringValue("PushDocumentResponse.code"));
		pushDocumentResponse.setMessage(_ctx.stringValue("PushDocumentResponse.message"));
		pushDocumentResponse.setRequestId(_ctx.stringValue("PushDocumentResponse.requestId"));
		pushDocumentResponse.setResult(_ctx.booleanValue("PushDocumentResponse.result"));
	 
	 	return pushDocumentResponse;
	}
}