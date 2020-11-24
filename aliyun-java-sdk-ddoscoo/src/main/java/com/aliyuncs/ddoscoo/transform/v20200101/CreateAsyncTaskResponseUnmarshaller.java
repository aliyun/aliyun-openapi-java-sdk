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

package com.aliyuncs.ddoscoo.transform.v20200101;

import com.aliyuncs.ddoscoo.model.v20200101.CreateAsyncTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAsyncTaskResponseUnmarshaller {

	public static CreateAsyncTaskResponse unmarshall(CreateAsyncTaskResponse createAsyncTaskResponse, UnmarshallerContext _ctx) {
		
		createAsyncTaskResponse.setRequestId(_ctx.stringValue("CreateAsyncTaskResponse.RequestId"));
	 
	 	return createAsyncTaskResponse;
	}
}