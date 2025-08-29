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

import com.aliyuncs.dataphin_public.model.v20230630.CreateStreamBatchJobMappingResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CreateStreamBatchJobMappingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStreamBatchJobMappingResponseUnmarshaller {

	public static CreateStreamBatchJobMappingResponse unmarshall(CreateStreamBatchJobMappingResponse createStreamBatchJobMappingResponse, UnmarshallerContext _ctx) {
		
		createStreamBatchJobMappingResponse.setRequestId(_ctx.stringValue("CreateStreamBatchJobMappingResponse.RequestId"));
		createStreamBatchJobMappingResponse.setSuccess(_ctx.booleanValue("CreateStreamBatchJobMappingResponse.Success"));
		createStreamBatchJobMappingResponse.setHttpStatusCode(_ctx.integerValue("CreateStreamBatchJobMappingResponse.HttpStatusCode"));
		createStreamBatchJobMappingResponse.setCode(_ctx.stringValue("CreateStreamBatchJobMappingResponse.Code"));
		createStreamBatchJobMappingResponse.setMessage(_ctx.stringValue("CreateStreamBatchJobMappingResponse.Message"));

		Data data = new Data();
		data.setFileId(_ctx.stringValue("CreateStreamBatchJobMappingResponse.Data.FileId"));
		data.setUrl(_ctx.stringValue("CreateStreamBatchJobMappingResponse.Data.Url"));
		data.setJobId(_ctx.longValue("CreateStreamBatchJobMappingResponse.Data.JobId"));
		createStreamBatchJobMappingResponse.setData(data);
	 
	 	return createStreamBatchJobMappingResponse;
	}
}