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

package com.aliyuncs.workorder.transform.v20210510;

import com.aliyuncs.workorder.model.v20210510.GetMessageTagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMessageTagResponseUnmarshaller {

	public static GetMessageTagResponse unmarshall(GetMessageTagResponse getMessageTagResponse, UnmarshallerContext _ctx) {
		
		getMessageTagResponse.setRequestId(_ctx.stringValue("GetMessageTagResponse.RequestId"));
		getMessageTagResponse.setCode(_ctx.integerValue("GetMessageTagResponse.Code"));
		getMessageTagResponse.setMessage(_ctx.stringValue("GetMessageTagResponse.Message"));
		getMessageTagResponse.setData(_ctx.stringValue("GetMessageTagResponse.Data"));
		getMessageTagResponse.setSuccess(_ctx.booleanValue("GetMessageTagResponse.Success"));
	 
	 	return getMessageTagResponse;
	}
}