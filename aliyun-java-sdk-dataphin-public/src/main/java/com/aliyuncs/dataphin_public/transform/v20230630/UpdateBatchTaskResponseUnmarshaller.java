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

import com.aliyuncs.dataphin_public.model.v20230630.UpdateBatchTaskResponse;
import com.aliyuncs.dataphin_public.model.v20230630.UpdateBatchTaskResponse.UpdateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateBatchTaskResponseUnmarshaller {

	public static UpdateBatchTaskResponse unmarshall(UpdateBatchTaskResponse updateBatchTaskResponse, UnmarshallerContext _ctx) {
		
		updateBatchTaskResponse.setRequestId(_ctx.stringValue("UpdateBatchTaskResponse.RequestId"));
		updateBatchTaskResponse.setSuccess(_ctx.booleanValue("UpdateBatchTaskResponse.Success"));
		updateBatchTaskResponse.setHttpStatusCode(_ctx.integerValue("UpdateBatchTaskResponse.HttpStatusCode"));
		updateBatchTaskResponse.setCode(_ctx.stringValue("UpdateBatchTaskResponse.Code"));
		updateBatchTaskResponse.setMessage(_ctx.stringValue("UpdateBatchTaskResponse.Message"));

		UpdateResult updateResult = new UpdateResult();
		updateResult.setFileId(_ctx.longValue("UpdateBatchTaskResponse.UpdateResult.FileId"));
		updateBatchTaskResponse.setUpdateResult(updateResult);
	 
	 	return updateBatchTaskResponse;
	}
}