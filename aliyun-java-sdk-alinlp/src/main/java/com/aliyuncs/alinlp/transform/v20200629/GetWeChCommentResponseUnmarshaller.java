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

package com.aliyuncs.alinlp.transform.v20200629;

import com.aliyuncs.alinlp.model.v20200629.GetWeChCommentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWeChCommentResponseUnmarshaller {

	public static GetWeChCommentResponse unmarshall(GetWeChCommentResponse getWeChCommentResponse, UnmarshallerContext _ctx) {
		
		getWeChCommentResponse.setRequestId(_ctx.stringValue("GetWeChCommentResponse.RequestId"));
		getWeChCommentResponse.setData(_ctx.stringValue("GetWeChCommentResponse.Data"));
	 
	 	return getWeChCommentResponse;
	}
}