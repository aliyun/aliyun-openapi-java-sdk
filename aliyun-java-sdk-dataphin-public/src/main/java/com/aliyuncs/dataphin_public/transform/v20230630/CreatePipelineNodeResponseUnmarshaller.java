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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.CreatePipelineNodeResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CreatePipelineNodeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePipelineNodeResponseUnmarshaller {

	public static CreatePipelineNodeResponse unmarshall(CreatePipelineNodeResponse createPipelineNodeResponse, UnmarshallerContext _ctx) {
		
		createPipelineNodeResponse.setRequestId(_ctx.stringValue("CreatePipelineNodeResponse.RequestId"));
		createPipelineNodeResponse.setSuccess(_ctx.booleanValue("CreatePipelineNodeResponse.Success"));
		createPipelineNodeResponse.setHttpStatusCode(_ctx.integerValue("CreatePipelineNodeResponse.HttpStatusCode"));
		createPipelineNodeResponse.setCode(_ctx.stringValue("CreatePipelineNodeResponse.Code"));
		createPipelineNodeResponse.setMessage(_ctx.stringValue("CreatePipelineNodeResponse.Message"));

		Data data = new Data();
		data.setPipelineId(_ctx.longValue("CreatePipelineNodeResponse.Data.PipelineId"));

		List<String> errorCodeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreatePipelineNodeResponse.Data.ErrorCodeList.Length"); i++) {
			errorCodeList.add(_ctx.stringValue("CreatePipelineNodeResponse.Data.ErrorCodeList["+ i +"]"));
		}
		data.setErrorCodeList(errorCodeList);

		List<String> errorMessageList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreatePipelineNodeResponse.Data.ErrorMessageList.Length"); i++) {
			errorMessageList.add(_ctx.stringValue("CreatePipelineNodeResponse.Data.ErrorMessageList["+ i +"]"));
		}
		data.setErrorMessageList(errorMessageList);
		createPipelineNodeResponse.setData(data);
	 
	 	return createPipelineNodeResponse;
	}
}