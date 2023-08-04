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

import com.aliyuncs.retailadvqa.model.v20230417.MemberPointChangeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MemberPointChangeResponseUnmarshaller {

	public static MemberPointChangeResponse unmarshall(MemberPointChangeResponse memberPointChangeResponse, UnmarshallerContext _ctx) {
		
		memberPointChangeResponse.setRequestId(_ctx.stringValue("MemberPointChangeResponse.RequestId"));
		memberPointChangeResponse.setSuccess(_ctx.stringValue("MemberPointChangeResponse.Success"));
		memberPointChangeResponse.setErrorCode(_ctx.stringValue("MemberPointChangeResponse.ErrorCode"));
		memberPointChangeResponse.setErrorMessage(_ctx.stringValue("MemberPointChangeResponse.ErrorMessage"));
		memberPointChangeResponse.setAccountBalance(_ctx.stringValue("MemberPointChangeResponse.AccountBalance"));
		memberPointChangeResponse.setLevelName(_ctx.stringValue("MemberPointChangeResponse.LevelName"));
	 
	 	return memberPointChangeResponse;
	}
}