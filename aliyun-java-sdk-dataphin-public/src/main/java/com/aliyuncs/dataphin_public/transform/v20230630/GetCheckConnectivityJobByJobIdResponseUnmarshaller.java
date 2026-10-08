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

import com.aliyuncs.dataphin_public.model.v20230630.GetCheckConnectivityJobByJobIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetCheckConnectivityJobByJobIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCheckConnectivityJobByJobIdResponseUnmarshaller {

	public static GetCheckConnectivityJobByJobIdResponse unmarshall(GetCheckConnectivityJobByJobIdResponse getCheckConnectivityJobByJobIdResponse, UnmarshallerContext _ctx) {
		
		getCheckConnectivityJobByJobIdResponse.setRequestId(_ctx.stringValue("GetCheckConnectivityJobByJobIdResponse.RequestId"));
		getCheckConnectivityJobByJobIdResponse.setMessage(_ctx.stringValue("GetCheckConnectivityJobByJobIdResponse.Message"));
		getCheckConnectivityJobByJobIdResponse.setHttpStatusCode(_ctx.integerValue("GetCheckConnectivityJobByJobIdResponse.HttpStatusCode"));
		getCheckConnectivityJobByJobIdResponse.setCode(_ctx.stringValue("GetCheckConnectivityJobByJobIdResponse.Code"));
		getCheckConnectivityJobByJobIdResponse.setSuccess(_ctx.booleanValue("GetCheckConnectivityJobByJobIdResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetCheckConnectivityJobByJobIdResponse.Data.Status"));
		data.setTenantId(_ctx.stringValue("GetCheckConnectivityJobByJobIdResponse.Data.TenantId"));
		data.setJobType(_ctx.stringValue("GetCheckConnectivityJobByJobIdResponse.Data.JobType"));
		data.setErrorMsg(_ctx.stringValue("GetCheckConnectivityJobByJobIdResponse.Data.ErrorMsg"));
		data.setVoldemortTaskId(_ctx.stringValue("GetCheckConnectivityJobByJobIdResponse.Data.VoldemortTaskId"));
		data.setDataSourceId(_ctx.stringValue("GetCheckConnectivityJobByJobIdResponse.Data.DataSourceId"));
		data.setJobId(_ctx.stringValue("GetCheckConnectivityJobByJobIdResponse.Data.JobId"));
		getCheckConnectivityJobByJobIdResponse.setData(data);
	 
	 	return getCheckConnectivityJobByJobIdResponse;
	}
}