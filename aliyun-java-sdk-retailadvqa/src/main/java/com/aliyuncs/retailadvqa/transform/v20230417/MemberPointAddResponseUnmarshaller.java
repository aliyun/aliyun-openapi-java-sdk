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

package com.aliyuncs.retailadvqa.transform.v20230417;

import com.aliyuncs.retailadvqa.model.v20230417.MemberPointAddResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MemberPointAddResponseUnmarshaller {

	public static MemberPointAddResponse unmarshall(MemberPointAddResponse memberPointAddResponse, UnmarshallerContext _ctx) {
		
		memberPointAddResponse.setRequestId(_ctx.stringValue("MemberPointAddResponse.RequestId"));
		memberPointAddResponse.setSuccess(_ctx.booleanValue("MemberPointAddResponse.Success"));
		memberPointAddResponse.setHttpStatusCode(_ctx.stringValue("MemberPointAddResponse.HttpStatusCode"));
		memberPointAddResponse.setErrorCode(_ctx.stringValue("MemberPointAddResponse.ErrorCode"));
		memberPointAddResponse.setErrorMessage(_ctx.stringValue("MemberPointAddResponse.ErrorMessage"));
		memberPointAddResponse.setCurrentQuantity(_ctx.stringValue("MemberPointAddResponse.CurrentQuantity"));
	 
	 	return memberPointAddResponse;
	}
}