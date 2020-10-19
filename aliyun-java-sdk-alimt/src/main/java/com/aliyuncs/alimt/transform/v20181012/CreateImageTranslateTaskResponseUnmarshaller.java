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

package com.aliyuncs.alimt.transform.v20181012;

import com.aliyuncs.alimt.model.v20181012.CreateImageTranslateTaskResponse;
import com.aliyuncs.alimt.model.v20181012.CreateImageTranslateTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateImageTranslateTaskResponseUnmarshaller {

	public static CreateImageTranslateTaskResponse unmarshall(CreateImageTranslateTaskResponse createImageTranslateTaskResponse, UnmarshallerContext _ctx) {
		
		createImageTranslateTaskResponse.setRequestId(_ctx.stringValue("CreateImageTranslateTaskResponse.RequestId"));
		createImageTranslateTaskResponse.setCode(_ctx.integerValue("CreateImageTranslateTaskResponse.Code"));
		createImageTranslateTaskResponse.setMessage(_ctx.stringValue("CreateImageTranslateTaskResponse.Message"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("CreateImageTranslateTaskResponse.Data.TaskId"));
		createImageTranslateTaskResponse.setData(data);
	 
	 	return createImageTranslateTaskResponse;
	}
}