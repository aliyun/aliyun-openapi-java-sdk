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

package com.aliyuncs.oam.transform.v20170101;

import com.aliyuncs.oam.model.v20170101.DeleteTagMiddleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTagMiddleResponseUnmarshaller {

	public static DeleteTagMiddleResponse unmarshall(DeleteTagMiddleResponse deleteTagMiddleResponse, UnmarshallerContext _ctx) {
		
		deleteTagMiddleResponse.setRequestId(_ctx.stringValue("DeleteTagMiddleResponse.RequestId"));
		deleteTagMiddleResponse.setCode(_ctx.stringValue("DeleteTagMiddleResponse.Code"));
		deleteTagMiddleResponse.setMessage(_ctx.stringValue("DeleteTagMiddleResponse.Message"));
	 
	 	return deleteTagMiddleResponse;
	}
}