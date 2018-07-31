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

import com.aliyuncs.mopen.model.v20180211.MoPenDeleteGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MoPenDeleteGroupResponseUnmarshaller {

	public static MoPenDeleteGroupResponse unmarshall(MoPenDeleteGroupResponse moPenDeleteGroupResponse, UnmarshallerContext context) {
		
		moPenDeleteGroupResponse.setSuccess(context.booleanValue("MoPenDeleteGroupResponse.Success"));
		moPenDeleteGroupResponse.setCode(context.stringValue("MoPenDeleteGroupResponse.Code"));
		moPenDeleteGroupResponse.setMessage(context.stringValue("MoPenDeleteGroupResponse.Message"));
		moPenDeleteGroupResponse.setDescription(context.stringValue("MoPenDeleteGroupResponse.Description"));
	 
	 	return moPenDeleteGroupResponse;
	}
}