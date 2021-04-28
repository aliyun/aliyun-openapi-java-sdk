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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.RemovePersonalNumbersFromUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemovePersonalNumbersFromUserResponseUnmarshaller {

	public static RemovePersonalNumbersFromUserResponse unmarshall(RemovePersonalNumbersFromUserResponse removePersonalNumbersFromUserResponse, UnmarshallerContext _ctx) {
		
		removePersonalNumbersFromUserResponse.setRequestId(_ctx.stringValue("RemovePersonalNumbersFromUserResponse.RequestId"));
		removePersonalNumbersFromUserResponse.setCode(_ctx.stringValue("RemovePersonalNumbersFromUserResponse.Code"));
		removePersonalNumbersFromUserResponse.setHttpStatusCode(_ctx.integerValue("RemovePersonalNumbersFromUserResponse.HttpStatusCode"));
		removePersonalNumbersFromUserResponse.setMessage(_ctx.stringValue("RemovePersonalNumbersFromUserResponse.Message"));
	 
	 	return removePersonalNumbersFromUserResponse;
	}
}