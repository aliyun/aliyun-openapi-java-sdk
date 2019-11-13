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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.CreateRecordPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRecordPlanResponseUnmarshaller {

	public static CreateRecordPlanResponse unmarshall(CreateRecordPlanResponse createRecordPlanResponse, UnmarshallerContext _ctx) {
		
		createRecordPlanResponse.setRequestId(_ctx.stringValue("CreateRecordPlanResponse.RequestId"));
		createRecordPlanResponse.setSuccess(_ctx.booleanValue("CreateRecordPlanResponse.Success"));
		createRecordPlanResponse.setErrorMessage(_ctx.stringValue("CreateRecordPlanResponse.ErrorMessage"));
		createRecordPlanResponse.setCode(_ctx.stringValue("CreateRecordPlanResponse.Code"));
		createRecordPlanResponse.setData(_ctx.stringValue("CreateRecordPlanResponse.Data"));
	 
	 	return createRecordPlanResponse;
	}
}