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

package com.aliyuncs.ltl.transform.v20190510;

import com.aliyuncs.ltl.model.v20190510.UnLockMemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnLockMemberResponseUnmarshaller {

	public static UnLockMemberResponse unmarshall(UnLockMemberResponse unLockMemberResponse, UnmarshallerContext _ctx) {
		
		unLockMemberResponse.setRequestId(_ctx.stringValue("UnLockMemberResponse.RequestId"));
		unLockMemberResponse.setCode(_ctx.integerValue("UnLockMemberResponse.Code"));
		unLockMemberResponse.setSuccess(_ctx.booleanValue("UnLockMemberResponse.Success"));
		unLockMemberResponse.setMessage(_ctx.stringValue("UnLockMemberResponse.Message"));
		unLockMemberResponse.setData(_ctx.stringValue("UnLockMemberResponse.Data"));
	 
	 	return unLockMemberResponse;
	}
}