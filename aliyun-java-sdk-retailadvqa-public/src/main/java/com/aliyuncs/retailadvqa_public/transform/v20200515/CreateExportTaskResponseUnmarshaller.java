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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.CreateExportTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateExportTaskResponseUnmarshaller {

	public static CreateExportTaskResponse unmarshall(CreateExportTaskResponse createExportTaskResponse, UnmarshallerContext _ctx) {
		
		createExportTaskResponse.setRequestId(_ctx.stringValue("CreateExportTaskResponse.RequestId"));
		createExportTaskResponse.setErrorDesc(_ctx.stringValue("CreateExportTaskResponse.ErrorDesc"));
		createExportTaskResponse.setTraceId(_ctx.stringValue("CreateExportTaskResponse.TraceId"));
		createExportTaskResponse.setData(_ctx.stringValue("CreateExportTaskResponse.Data"));
		createExportTaskResponse.setErrorCode(_ctx.stringValue("CreateExportTaskResponse.ErrorCode"));
		createExportTaskResponse.setSuccess(_ctx.booleanValue("CreateExportTaskResponse.Success"));
	 
	 	return createExportTaskResponse;
	}
}