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

package com.aliyuncs.lto.transform.v20210707;

import com.aliyuncs.lto.model.v20210707.UnFreezeMemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnFreezeMemberResponseUnmarshaller {

	public static UnFreezeMemberResponse unmarshall(UnFreezeMemberResponse unFreezeMemberResponse, UnmarshallerContext _ctx) {
		
		unFreezeMemberResponse.setRequestId(_ctx.stringValue("UnFreezeMemberResponse.RequestId"));
		unFreezeMemberResponse.setCode(_ctx.stringValue("UnFreezeMemberResponse.Code"));
		unFreezeMemberResponse.setHttpStatusCode(_ctx.integerValue("UnFreezeMemberResponse.HttpStatusCode"));
		unFreezeMemberResponse.setMessage(_ctx.stringValue("UnFreezeMemberResponse.Message"));
		unFreezeMemberResponse.setSuccess(_ctx.booleanValue("UnFreezeMemberResponse.Success"));
	 
	 	return unFreezeMemberResponse;
	}
}