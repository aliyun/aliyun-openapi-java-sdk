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

package com.aliyuncs.aliyuncvc.transform.v20190919;

import com.aliyuncs.aliyuncvc.model.v20190919.RemoveMeetingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveMeetingResponseUnmarshaller {

	public static RemoveMeetingResponse unmarshall(RemoveMeetingResponse removeMeetingResponse, UnmarshallerContext _ctx) {
		
		removeMeetingResponse.setRequestId(_ctx.stringValue("RemoveMeetingResponse.RequestId"));
		removeMeetingResponse.setErrorCode(_ctx.integerValue("RemoveMeetingResponse.ErrorCode"));
		removeMeetingResponse.setMessage(_ctx.stringValue("RemoveMeetingResponse.Message"));
		removeMeetingResponse.setSuccess(_ctx.booleanValue("RemoveMeetingResponse.Success"));
	 
	 	return removeMeetingResponse;
	}
}