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

import com.aliyuncs.retailadvqa.model.v20230417.CalculateMemberLevelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CalculateMemberLevelResponseUnmarshaller {

	public static CalculateMemberLevelResponse unmarshall(CalculateMemberLevelResponse calculateMemberLevelResponse, UnmarshallerContext _ctx) {
		
		calculateMemberLevelResponse.setRequestId(_ctx.stringValue("CalculateMemberLevelResponse.RequestId"));
		calculateMemberLevelResponse.setSuccess(_ctx.stringValue("CalculateMemberLevelResponse.Success"));
		calculateMemberLevelResponse.setHttpStatusCode(_ctx.stringValue("CalculateMemberLevelResponse.HttpStatusCode"));
		calculateMemberLevelResponse.setErrorCode(_ctx.stringValue("CalculateMemberLevelResponse.ErrorCode"));
		calculateMemberLevelResponse.setErrorMessage(_ctx.stringValue("CalculateMemberLevelResponse.ErrorMessage"));
		calculateMemberLevelResponse.setMessage(_ctx.stringValue("CalculateMemberLevelResponse.message"));
		calculateMemberLevelResponse.setGrade(_ctx.stringValue("CalculateMemberLevelResponse.Grade"));
		calculateMemberLevelResponse.setOuterMemberId(_ctx.stringValue("CalculateMemberLevelResponse.OuterMemberId"));
	 
	 	return calculateMemberLevelResponse;
	}
}