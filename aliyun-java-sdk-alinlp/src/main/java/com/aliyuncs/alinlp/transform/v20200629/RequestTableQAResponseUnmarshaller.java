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

import com.aliyuncs.alinlp.model.v20200629.RequestTableQAResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestTableQAResponseUnmarshaller {

	public static RequestTableQAResponse unmarshall(RequestTableQAResponse requestTableQAResponse, UnmarshallerContext _ctx) {
		
		requestTableQAResponse.setRequestId(_ctx.stringValue("RequestTableQAResponse.RequestId"));
		requestTableQAResponse.setData(_ctx.stringValue("RequestTableQAResponse.Data"));
	 
	 	return requestTableQAResponse;
	}
}