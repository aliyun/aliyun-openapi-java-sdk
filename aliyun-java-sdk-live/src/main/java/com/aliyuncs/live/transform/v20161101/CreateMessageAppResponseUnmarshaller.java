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

package com.aliyuncs.live.transform.v20161101;

import com.aliyuncs.live.model.v20161101.CreateMessageAppResponse;
import com.aliyuncs.live.model.v20161101.CreateMessageAppResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMessageAppResponseUnmarshaller {

	public static CreateMessageAppResponse unmarshall(CreateMessageAppResponse createMessageAppResponse, UnmarshallerContext _ctx) {
		
		createMessageAppResponse.setRequestId(_ctx.stringValue("CreateMessageAppResponse.RequestId"));

		Result result = new Result();
		result.setAppId(_ctx.stringValue("CreateMessageAppResponse.Result.AppId"));
		createMessageAppResponse.setResult(result);
	 
	 	return createMessageAppResponse;
	}
}