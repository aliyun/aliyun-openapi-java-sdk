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

import com.aliyuncs.outboundbot.model.v20191226.ModifyAnnotationMissionResponse;
import com.aliyuncs.outboundbot.model.v20191226.ModifyAnnotationMissionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyAnnotationMissionResponseUnmarshaller {

	public static ModifyAnnotationMissionResponse unmarshall(ModifyAnnotationMissionResponse modifyAnnotationMissionResponse, UnmarshallerContext _ctx) {
		
		modifyAnnotationMissionResponse.setRequestId(_ctx.stringValue("ModifyAnnotationMissionResponse.RequestId"));
		modifyAnnotationMissionResponse.setSuccess(_ctx.booleanValue("ModifyAnnotationMissionResponse.Success"));
		modifyAnnotationMissionResponse.setCode(_ctx.stringValue("ModifyAnnotationMissionResponse.Code"));
		modifyAnnotationMissionResponse.setMessage(_ctx.stringValue("ModifyAnnotationMissionResponse.Message"));
		modifyAnnotationMissionResponse.setHttpStatusCode(_ctx.integerValue("ModifyAnnotationMissionResponse.HttpStatusCode"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("ModifyAnnotationMissionResponse.Data.Success"));
		data.setMessage(_ctx.stringValue("ModifyAnnotationMissionResponse.Data.Message"));
		modifyAnnotationMissionResponse.setData(data);
	 
	 	return modifyAnnotationMissionResponse;
	}
}