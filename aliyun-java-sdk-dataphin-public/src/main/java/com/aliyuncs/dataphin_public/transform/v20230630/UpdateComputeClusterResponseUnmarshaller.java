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

import com.aliyuncs.dataphin_public.model.v20230630.UpdateComputeClusterResponse;
import com.aliyuncs.dataphin_public.model.v20230630.UpdateComputeClusterResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateComputeClusterResponseUnmarshaller {

	public static UpdateComputeClusterResponse unmarshall(UpdateComputeClusterResponse updateComputeClusterResponse, UnmarshallerContext _ctx) {
		
		updateComputeClusterResponse.setRequestId(_ctx.stringValue("UpdateComputeClusterResponse.RequestId"));
		updateComputeClusterResponse.setMessage(_ctx.stringValue("UpdateComputeClusterResponse.Message"));
		updateComputeClusterResponse.setHttpStatusCode(_ctx.integerValue("UpdateComputeClusterResponse.HttpStatusCode"));
		updateComputeClusterResponse.setCode(_ctx.stringValue("UpdateComputeClusterResponse.Code"));
		updateComputeClusterResponse.setSuccess(_ctx.booleanValue("UpdateComputeClusterResponse.Success"));

		Data data = new Data();
		data.setDsId(_ctx.longValue("UpdateComputeClusterResponse.Data.DsId"));
		updateComputeClusterResponse.setData(data);
	 
	 	return updateComputeClusterResponse;
	}
}