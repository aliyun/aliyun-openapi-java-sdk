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

import com.aliyuncs.retailadvqa_public.model.v20200515.CreateDatasetResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.CreateDatasetResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDatasetResponseUnmarshaller {

	public static CreateDatasetResponse unmarshall(CreateDatasetResponse createDatasetResponse, UnmarshallerContext _ctx) {
		
		createDatasetResponse.setRequestId(_ctx.stringValue("CreateDatasetResponse.RequestId"));
		createDatasetResponse.setErrorDesc(_ctx.stringValue("CreateDatasetResponse.ErrorDesc"));
		createDatasetResponse.setTraceId(_ctx.stringValue("CreateDatasetResponse.TraceId"));
		createDatasetResponse.setErrorCode(_ctx.stringValue("CreateDatasetResponse.ErrorCode"));
		createDatasetResponse.setSuccess(_ctx.booleanValue("CreateDatasetResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.stringValue("CreateDatasetResponse.Data.Id"));
		createDatasetResponse.setData(data);
	 
	 	return createDatasetResponse;
	}
}