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

import com.aliyuncs.retailadvqa.model.v20230417.MemberPointConsumeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MemberPointConsumeResponseUnmarshaller {

	public static MemberPointConsumeResponse unmarshall(MemberPointConsumeResponse memberPointConsumeResponse, UnmarshallerContext _ctx) {
		
		memberPointConsumeResponse.setRequestId(_ctx.stringValue("MemberPointConsumeResponse.RequestId"));
		memberPointConsumeResponse.setSuccess(_ctx.stringValue("MemberPointConsumeResponse.Success"));
		memberPointConsumeResponse.setHttpStatusCode(_ctx.stringValue("MemberPointConsumeResponse.HttpStatusCode"));
		memberPointConsumeResponse.setErrorCode(_ctx.stringValue("MemberPointConsumeResponse.ErrorCode"));
		memberPointConsumeResponse.setErrorMessage(_ctx.stringValue("MemberPointConsumeResponse.ErrorMessage"));
		memberPointConsumeResponse.setCurrentQuantity(_ctx.stringValue("MemberPointConsumeResponse.CurrentQuantity"));
	 
	 	return memberPointConsumeResponse;
	}
}