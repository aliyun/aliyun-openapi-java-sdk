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

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.FindApproveServiceListResponse;
import com.aliyuncs.csb.model.v20171118.FindApproveServiceListResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindApproveServiceListResponse.Data.Service;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindApproveServiceListResponseUnmarshaller {

	public static FindApproveServiceListResponse unmarshall(FindApproveServiceListResponse findApproveServiceListResponse, UnmarshallerContext _ctx) {
		
		findApproveServiceListResponse.setRequestId(_ctx.stringValue("FindApproveServiceListResponse.RequestId"));
		findApproveServiceListResponse.setCode(_ctx.integerValue("FindApproveServiceListResponse.Code"));
		findApproveServiceListResponse.setMessage(_ctx.stringValue("FindApproveServiceListResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("FindApproveServiceListResponse.Data.Total"));
		data.setPageNumber(_ctx.integerValue("FindApproveServiceListResponse.Data.PageNumber"));
		data.setCurrentPage(_ctx.integerValue("FindApproveServiceListResponse.Data.CurrentPage"));

		List<Service> serviceList = new ArrayList<Service>();
		for (int i = 0; i < _ctx.lengthValue("FindApproveServiceListResponse.Data.ServiceList.Length"); i++) {
			Service service = new Service();
			service.setAllVisiable(_ctx.booleanValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].AllVisiable"));
			service.setCasTargets(_ctx.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].CasTargets"));
			service.setCreateTime(_ctx.longValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].CreateTime"));
			service.setCsbId(_ctx.longValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].CsbId"));
			service.setId(_ctx.longValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].Id"));
			service.setInterfaceName(_ctx.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].InterfaceName"));
			service.setModifiedTime(_ctx.longValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].ModifiedTime"));
			service.setOwnerId(_ctx.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].OwnerId"));
			service.setPrincipalName(_ctx.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].PrincipalName"));
			service.setProjectId(_ctx.longValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].ProjectId"));
			service.setProjectName(_ctx.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].ProjectName"));
			service.setQps(_ctx.integerValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].Qps"));
			service.setScope(_ctx.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].Scope"));
			service.setServiceName(_ctx.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].ServiceName"));
			service.setServiceVersion(_ctx.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].ServiceVersion"));
			service.setSkipAuth(_ctx.booleanValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].SkipAuth"));
			service.setStatisticName(_ctx.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].StatisticName"));
			service.setStatus(_ctx.integerValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].Status"));
			service.setUserId(_ctx.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].UserId"));

			serviceList.add(service);
		}
		data.setServiceList(serviceList);
		findApproveServiceListResponse.setData(data);
	 
	 	return findApproveServiceListResponse;
	}
}