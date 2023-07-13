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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.GetServiceListPageResponse;
import com.aliyuncs.mse.model.v20190531.GetServiceListPageResponse.Data;
import com.aliyuncs.mse.model.v20190531.GetServiceListPageResponse.Data.MscServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceListPageResponseUnmarshaller {

	public static GetServiceListPageResponse unmarshall(GetServiceListPageResponse getServiceListPageResponse, UnmarshallerContext _ctx) {
		
		getServiceListPageResponse.setRequestId(_ctx.stringValue("GetServiceListPageResponse.RequestId"));
		getServiceListPageResponse.setSuccess(_ctx.booleanValue("GetServiceListPageResponse.Success"));
		getServiceListPageResponse.setHttpStatusCode(_ctx.integerValue("GetServiceListPageResponse.HttpStatusCode"));
		getServiceListPageResponse.setMessage(_ctx.stringValue("GetServiceListPageResponse.Message"));
		getServiceListPageResponse.setCode(_ctx.integerValue("GetServiceListPageResponse.Code"));

		Data data = new Data();
		data.setCurrentPage(_ctx.stringValue("GetServiceListPageResponse.Data.CurrentPage"));
		data.setTotalSize(_ctx.stringValue("GetServiceListPageResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.stringValue("GetServiceListPageResponse.Data.PageNumber"));
		data.setPageSize(_ctx.stringValue("GetServiceListPageResponse.Data.PageSize"));

		List<MscServiceResponse> result = new ArrayList<MscServiceResponse>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceListPageResponse.Data.Result.Length"); i++) {
			MscServiceResponse mscServiceResponse = new MscServiceResponse();
			mscServiceResponse.setEdasAppName(_ctx.stringValue("GetServiceListPageResponse.Data.Result["+ i +"].EdasAppName"));
			mscServiceResponse.setAppName(_ctx.stringValue("GetServiceListPageResponse.Data.Result["+ i +"].AppName"));
			mscServiceResponse.setVersion(_ctx.stringValue("GetServiceListPageResponse.Data.Result["+ i +"].Version"));
			mscServiceResponse.setInstanceNum(_ctx.integerValue("GetServiceListPageResponse.Data.Result["+ i +"].InstanceNum"));
			mscServiceResponse.setGmtModifyTime(_ctx.stringValue("GetServiceListPageResponse.Data.Result["+ i +"].GmtModifyTime"));
			mscServiceResponse.setEdasAppId(_ctx.stringValue("GetServiceListPageResponse.Data.Result["+ i +"].EdasAppId"));
			mscServiceResponse.setAppId(_ctx.stringValue("GetServiceListPageResponse.Data.Result["+ i +"].AppId"));
			mscServiceResponse.setServiceName(_ctx.stringValue("GetServiceListPageResponse.Data.Result["+ i +"].ServiceName"));
			mscServiceResponse.setGroup(_ctx.stringValue("GetServiceListPageResponse.Data.Result["+ i +"].Group"));
			mscServiceResponse.setClusterName(_ctx.stringValue("GetServiceListPageResponse.Data.Result["+ i +"].ClusterName"));

			result.add(mscServiceResponse);
		}
		data.setResult(result);
		getServiceListPageResponse.setData(data);
	 
	 	return getServiceListPageResponse;
	}
}