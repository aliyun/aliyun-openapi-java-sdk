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

import com.aliyuncs.retailadvqa_public.model.v20200515.UpdateDatasetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDatasetResponseUnmarshaller {

	public static UpdateDatasetResponse unmarshall(UpdateDatasetResponse updateDatasetResponse, UnmarshallerContext _ctx) {
		
		updateDatasetResponse.setRequestId(_ctx.stringValue("UpdateDatasetResponse.RequestId"));
		updateDatasetResponse.setErrorDesc(_ctx.stringValue("UpdateDatasetResponse.ErrorDesc"));
		updateDatasetResponse.setTraceId(_ctx.stringValue("UpdateDatasetResponse.TraceId"));
		updateDatasetResponse.setData(_ctx.stringValue("UpdateDatasetResponse.Data"));
		updateDatasetResponse.setErrorCode(_ctx.stringValue("UpdateDatasetResponse.ErrorCode"));
		updateDatasetResponse.setSuccess(_ctx.booleanValue("UpdateDatasetResponse.Success"));
	 
	 	return updateDatasetResponse;
	}
}