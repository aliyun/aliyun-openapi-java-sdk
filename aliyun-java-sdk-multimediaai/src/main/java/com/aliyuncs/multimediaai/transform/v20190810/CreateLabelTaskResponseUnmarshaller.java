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

package com.aliyuncs.multimediaai.transform.v20190810;

import com.aliyuncs.multimediaai.model.v20190810.CreateLabelTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLabelTaskResponseUnmarshaller {

	public static CreateLabelTaskResponse unmarshall(CreateLabelTaskResponse createLabelTaskResponse, UnmarshallerContext _ctx) {
		
		createLabelTaskResponse.setRequestId(_ctx.stringValue("CreateLabelTaskResponse.RequestId"));
		createLabelTaskResponse.setTaskId(_ctx.longValue("CreateLabelTaskResponse.TaskId"));
	 
	 	return createLabelTaskResponse;
	}
}