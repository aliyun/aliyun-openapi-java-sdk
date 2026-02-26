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

import com.aliyuncs.dataphin_public.model.v20230630.GetCheckConnectivityJobsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetCheckConnectivityJobsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCheckConnectivityJobsResponseUnmarshaller {

	public static GetCheckConnectivityJobsResponse unmarshall(GetCheckConnectivityJobsResponse getCheckConnectivityJobsResponse, UnmarshallerContext _ctx) {
		
		getCheckConnectivityJobsResponse.setRequestId(_ctx.stringValue("GetCheckConnectivityJobsResponse.RequestId"));
		getCheckConnectivityJobsResponse.setMessage(_ctx.stringValue("GetCheckConnectivityJobsResponse.Message"));
		getCheckConnectivityJobsResponse.setHttpStatusCode(_ctx.integerValue("GetCheckConnectivityJobsResponse.HttpStatusCode"));
		getCheckConnectivityJobsResponse.setCode(_ctx.stringValue("GetCheckConnectivityJobsResponse.Code"));
		getCheckConnectivityJobsResponse.setSuccess(_ctx.booleanValue("GetCheckConnectivityJobsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckConnectivityJobsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatus(_ctx.stringValue("GetCheckConnectivityJobsResponse.Data["+ i +"].Status"));
			dataItem.setTenantId(_ctx.stringValue("GetCheckConnectivityJobsResponse.Data["+ i +"].TenantId"));
			dataItem.setJobType(_ctx.stringValue("GetCheckConnectivityJobsResponse.Data["+ i +"].JobType"));
			dataItem.setErrorMsg(_ctx.stringValue("GetCheckConnectivityJobsResponse.Data["+ i +"].ErrorMsg"));
			dataItem.setVoldemortTaskId(_ctx.stringValue("GetCheckConnectivityJobsResponse.Data["+ i +"].VoldemortTaskId"));
			dataItem.setDataSourceId(_ctx.stringValue("GetCheckConnectivityJobsResponse.Data["+ i +"].DataSourceId"));
			dataItem.setJobId(_ctx.stringValue("GetCheckConnectivityJobsResponse.Data["+ i +"].JobId"));

			data.add(dataItem);
		}
		getCheckConnectivityJobsResponse.setData(data);
	 
	 	return getCheckConnectivityJobsResponse;
	}
}