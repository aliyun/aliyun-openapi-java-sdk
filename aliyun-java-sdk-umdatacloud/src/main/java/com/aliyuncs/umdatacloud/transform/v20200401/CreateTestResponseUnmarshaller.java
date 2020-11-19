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

package com.aliyuncs.umdatacloud.transform.v20200401;

import com.aliyuncs.umdatacloud.model.v20200401.CreateTestResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTestResponseUnmarshaller {

	public static CreateTestResponse unmarshall(CreateTestResponse createTestResponse, UnmarshallerContext _ctx) {
		
		createTestResponse.setRequestId(_ctx.stringValue("CreateTestResponse.RequestId"));
		createTestResponse.setOutOne(_ctx.stringValue("CreateTestResponse.OutOne"));
		createTestResponse.setOutTwo(_ctx.stringValue("CreateTestResponse.OutTwo"));
	 
	 	return createTestResponse;
	}
}