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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.UnbindAccountLessLoginUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindAccountLessLoginUserResponseUnmarshaller {

	public static UnbindAccountLessLoginUserResponse unmarshall(UnbindAccountLessLoginUserResponse unbindAccountLessLoginUserResponse, UnmarshallerContext _ctx) {
		
		unbindAccountLessLoginUserResponse.setRequestId(_ctx.stringValue("UnbindAccountLessLoginUserResponse.RequestId"));
		unbindAccountLessLoginUserResponse.setSuccess(_ctx.booleanValue("UnbindAccountLessLoginUserResponse.Success"));
		unbindAccountLessLoginUserResponse.setCode(_ctx.stringValue("UnbindAccountLessLoginUserResponse.Code"));
		unbindAccountLessLoginUserResponse.setMessage(_ctx.stringValue("UnbindAccountLessLoginUserResponse.Message"));
		unbindAccountLessLoginUserResponse.setHttpStatusCode(_ctx.integerValue("UnbindAccountLessLoginUserResponse.HttpStatusCode"));
	 
	 	return unbindAccountLessLoginUserResponse;
	}
}