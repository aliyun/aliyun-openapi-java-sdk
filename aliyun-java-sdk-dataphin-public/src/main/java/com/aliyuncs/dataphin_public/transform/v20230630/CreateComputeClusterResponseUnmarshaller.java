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

import com.aliyuncs.dataphin_public.model.v20230630.CreateComputeClusterResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CreateComputeClusterResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateComputeClusterResponseUnmarshaller {

	public static CreateComputeClusterResponse unmarshall(CreateComputeClusterResponse createComputeClusterResponse, UnmarshallerContext _ctx) {
		
		createComputeClusterResponse.setRequestId(_ctx.stringValue("CreateComputeClusterResponse.RequestId"));
		createComputeClusterResponse.setMessage(_ctx.stringValue("CreateComputeClusterResponse.Message"));
		createComputeClusterResponse.setHttpStatusCode(_ctx.integerValue("CreateComputeClusterResponse.HttpStatusCode"));
		createComputeClusterResponse.setCode(_ctx.stringValue("CreateComputeClusterResponse.Code"));
		createComputeClusterResponse.setSuccess(_ctx.booleanValue("CreateComputeClusterResponse.Success"));

		Data data = new Data();
		data.setDsId(_ctx.longValue("CreateComputeClusterResponse.Data.DsId"));
		createComputeClusterResponse.setData(data);
	 
	 	return createComputeClusterResponse;
	}
}