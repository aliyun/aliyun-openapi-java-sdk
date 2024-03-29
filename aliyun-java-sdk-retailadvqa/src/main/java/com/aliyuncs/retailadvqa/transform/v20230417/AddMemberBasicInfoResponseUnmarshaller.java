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

import com.aliyuncs.retailadvqa.model.v20230417.AddMemberBasicInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMemberBasicInfoResponseUnmarshaller {

	public static AddMemberBasicInfoResponse unmarshall(AddMemberBasicInfoResponse addMemberBasicInfoResponse, UnmarshallerContext _ctx) {
		
		addMemberBasicInfoResponse.setRequestId(_ctx.stringValue("AddMemberBasicInfoResponse.RequestId"));
		addMemberBasicInfoResponse.setSuccess(_ctx.booleanValue("AddMemberBasicInfoResponse.Success"));
		addMemberBasicInfoResponse.setErrorCode(_ctx.stringValue("AddMemberBasicInfoResponse.ErrorCode"));
		addMemberBasicInfoResponse.setErrorMessage(_ctx.stringValue("AddMemberBasicInfoResponse.ErrorMessage"));
		addMemberBasicInfoResponse.setOuterMemberId(_ctx.stringValue("AddMemberBasicInfoResponse.OuterMemberId"));
	 
	 	return addMemberBasicInfoResponse;
	}
}