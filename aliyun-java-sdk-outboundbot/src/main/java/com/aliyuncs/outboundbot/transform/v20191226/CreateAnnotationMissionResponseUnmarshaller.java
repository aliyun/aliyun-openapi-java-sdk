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

import com.aliyuncs.outboundbot.model.v20191226.CreateAnnotationMissionResponse;
import com.aliyuncs.outboundbot.model.v20191226.CreateAnnotationMissionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAnnotationMissionResponseUnmarshaller {

	public static CreateAnnotationMissionResponse unmarshall(CreateAnnotationMissionResponse createAnnotationMissionResponse, UnmarshallerContext _ctx) {
		
		createAnnotationMissionResponse.setRequestId(_ctx.stringValue("CreateAnnotationMissionResponse.RequestId"));
		createAnnotationMissionResponse.setSuccess(_ctx.booleanValue("CreateAnnotationMissionResponse.Success"));
		createAnnotationMissionResponse.setCode(_ctx.stringValue("CreateAnnotationMissionResponse.Code"));
		createAnnotationMissionResponse.setMessage(_ctx.stringValue("CreateAnnotationMissionResponse.Message"));
		createAnnotationMissionResponse.setHttpStatusCode(_ctx.integerValue("CreateAnnotationMissionResponse.HttpStatusCode"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("CreateAnnotationMissionResponse.Data.Success"));
		data.setMessage(_ctx.stringValue("CreateAnnotationMissionResponse.Data.Message"));
		createAnnotationMissionResponse.setData(data);
	 
	 	return createAnnotationMissionResponse;
	}
}