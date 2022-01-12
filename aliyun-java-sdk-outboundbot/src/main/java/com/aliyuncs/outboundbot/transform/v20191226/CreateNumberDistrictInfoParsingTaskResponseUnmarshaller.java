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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.CreateNumberDistrictInfoParsingTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNumberDistrictInfoParsingTaskResponseUnmarshaller {

	public static CreateNumberDistrictInfoParsingTaskResponse unmarshall(CreateNumberDistrictInfoParsingTaskResponse createNumberDistrictInfoParsingTaskResponse, UnmarshallerContext _ctx) {
		
		createNumberDistrictInfoParsingTaskResponse.setRequestId(_ctx.stringValue("CreateNumberDistrictInfoParsingTaskResponse.RequestId"));
		createNumberDistrictInfoParsingTaskResponse.setHttpStatusCode(_ctx.integerValue("CreateNumberDistrictInfoParsingTaskResponse.HttpStatusCode"));
		createNumberDistrictInfoParsingTaskResponse.setCode(_ctx.stringValue("CreateNumberDistrictInfoParsingTaskResponse.Code"));
		createNumberDistrictInfoParsingTaskResponse.setMessage(_ctx.stringValue("CreateNumberDistrictInfoParsingTaskResponse.Message"));
		createNumberDistrictInfoParsingTaskResponse.setSuccess(_ctx.booleanValue("CreateNumberDistrictInfoParsingTaskResponse.Success"));
	 
	 	return createNumberDistrictInfoParsingTaskResponse;
	}
}