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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.CreateShardTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateShardTaskResponseUnmarshaller {

	public static CreateShardTaskResponse unmarshall(CreateShardTaskResponse createShardTaskResponse, UnmarshallerContext context) {
		
		createShardTaskResponse.setRequestId(context.stringValue("CreateShardTaskResponse.RequestId"));
		createShardTaskResponse.setSuccess(context.booleanValue("CreateShardTaskResponse.Success"));
		createShardTaskResponse.setData(context.booleanValue("CreateShardTaskResponse.Data"));
	 
	 	return createShardTaskResponse;
	}
}