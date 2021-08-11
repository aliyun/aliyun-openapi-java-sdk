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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.CreateAppGroupResponse;
import com.aliyuncs.retailcloud.model.v20180313.CreateAppGroupResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppGroupResponseUnmarshaller {

	public static CreateAppGroupResponse unmarshall(CreateAppGroupResponse createAppGroupResponse, UnmarshallerContext _ctx) {
		
		createAppGroupResponse.setRequestId(_ctx.stringValue("CreateAppGroupResponse.RequestId"));
		createAppGroupResponse.setCode(_ctx.integerValue("CreateAppGroupResponse.Code"));
		createAppGroupResponse.setErrMsg(_ctx.stringValue("CreateAppGroupResponse.ErrMsg"));

		Result result = new Result();
		result.setAppGroupId(_ctx.longValue("CreateAppGroupResponse.Result.AppGroupId"));
		createAppGroupResponse.setResult(result);
	 
	 	return createAppGroupResponse;
	}
}