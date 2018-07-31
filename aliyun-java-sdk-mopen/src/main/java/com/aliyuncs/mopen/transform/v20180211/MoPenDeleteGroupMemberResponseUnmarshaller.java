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

package com.aliyuncs.mopen.transform.v20180211;

import com.aliyuncs.mopen.model.v20180211.MoPenDeleteGroupMemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MoPenDeleteGroupMemberResponseUnmarshaller {

	public static MoPenDeleteGroupMemberResponse unmarshall(MoPenDeleteGroupMemberResponse moPenDeleteGroupMemberResponse, UnmarshallerContext context) {
		
		moPenDeleteGroupMemberResponse.setCode(context.stringValue("MoPenDeleteGroupMemberResponse.Code"));
		moPenDeleteGroupMemberResponse.setSuccess(context.booleanValue("MoPenDeleteGroupMemberResponse.Success"));
		moPenDeleteGroupMemberResponse.setDescription(context.stringValue("MoPenDeleteGroupMemberResponse.Description"));
		moPenDeleteGroupMemberResponse.setMessage(context.stringValue("MoPenDeleteGroupMemberResponse.Message"));
	 
	 	return moPenDeleteGroupMemberResponse;
	}
}