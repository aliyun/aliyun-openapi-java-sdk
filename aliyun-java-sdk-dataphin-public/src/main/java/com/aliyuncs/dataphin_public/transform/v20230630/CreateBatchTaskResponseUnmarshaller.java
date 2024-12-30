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

import com.aliyuncs.dataphin_public.model.v20230630.CreateBatchTaskResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CreateBatchTaskResponse.CreateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBatchTaskResponseUnmarshaller {

	public static CreateBatchTaskResponse unmarshall(CreateBatchTaskResponse createBatchTaskResponse, UnmarshallerContext _ctx) {
		
		createBatchTaskResponse.setRequestId(_ctx.stringValue("CreateBatchTaskResponse.RequestId"));
		createBatchTaskResponse.setSuccess(_ctx.booleanValue("CreateBatchTaskResponse.Success"));
		createBatchTaskResponse.setHttpStatusCode(_ctx.integerValue("CreateBatchTaskResponse.HttpStatusCode"));
		createBatchTaskResponse.setCode(_ctx.stringValue("CreateBatchTaskResponse.Code"));
		createBatchTaskResponse.setMessage(_ctx.stringValue("CreateBatchTaskResponse.Message"));

		CreateResult createResult = new CreateResult();
		createResult.setFileId(_ctx.longValue("CreateBatchTaskResponse.CreateResult.FileId"));
		createBatchTaskResponse.setCreateResult(createResult);
	 
	 	return createBatchTaskResponse;
	}
}