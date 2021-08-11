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

import com.aliyuncs.retailadvqa_public.model.v20200515.CreateDefaultEventSourceResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.CreateDefaultEventSourceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDefaultEventSourceResponseUnmarshaller {

	public static CreateDefaultEventSourceResponse unmarshall(CreateDefaultEventSourceResponse createDefaultEventSourceResponse, UnmarshallerContext _ctx) {
		
		createDefaultEventSourceResponse.setRequestId(_ctx.stringValue("CreateDefaultEventSourceResponse.RequestId"));
		createDefaultEventSourceResponse.setErrorDesc(_ctx.stringValue("CreateDefaultEventSourceResponse.ErrorDesc"));
		createDefaultEventSourceResponse.setTraceId(_ctx.stringValue("CreateDefaultEventSourceResponse.TraceId"));
		createDefaultEventSourceResponse.setErrorCode(_ctx.stringValue("CreateDefaultEventSourceResponse.ErrorCode"));
		createDefaultEventSourceResponse.setSuccess(_ctx.booleanValue("CreateDefaultEventSourceResponse.Success"));

		Data data = new Data();
		data.setEventSourceId(_ctx.stringValue("CreateDefaultEventSourceResponse.Data.EventSourceId"));
		data.setEventSourceName(_ctx.stringValue("CreateDefaultEventSourceResponse.Data.EventSourceName"));
		data.setEventSourceType(_ctx.stringValue("CreateDefaultEventSourceResponse.Data.EventSourceType"));
		data.setEventSourceCode(_ctx.stringValue("CreateDefaultEventSourceResponse.Data.EventSourceCode"));
		data.setGmtModified(_ctx.stringValue("CreateDefaultEventSourceResponse.Data.GmtModified"));
		data.setGmtCreate(_ctx.stringValue("CreateDefaultEventSourceResponse.Data.GmtCreate"));
		data.setCreateId(_ctx.stringValue("CreateDefaultEventSourceResponse.Data.CreateId"));
		data.setModifyId(_ctx.stringValue("CreateDefaultEventSourceResponse.Data.ModifyId"));
		data.setOrgnizationId(_ctx.stringValue("CreateDefaultEventSourceResponse.Data.OrgnizationId"));
		data.setWorkspaceId(_ctx.stringValue("CreateDefaultEventSourceResponse.Data.WorkspaceId"));
		data.setErrDescription(_ctx.stringValue("CreateDefaultEventSourceResponse.Data.ErrDescription"));
		data.setIsUse(_ctx.integerValue("CreateDefaultEventSourceResponse.Data.IsUse"));
		createDefaultEventSourceResponse.setData(data);
	 
	 	return createDefaultEventSourceResponse;
	}
}