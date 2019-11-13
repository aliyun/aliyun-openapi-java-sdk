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

import com.aliyuncs.csb.model.v20171118.FindServiceListResponse;
import com.aliyuncs.csb.model.v20171118.FindServiceListResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindServiceListResponse.Data.Service;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindServiceListResponseUnmarshaller {

	public static FindServiceListResponse unmarshall(FindServiceListResponse findServiceListResponse, UnmarshallerContext _ctx) {
		
		findServiceListResponse.setRequestId(_ctx.stringValue("FindServiceListResponse.RequestId"));
		findServiceListResponse.setMessage(_ctx.stringValue("FindServiceListResponse.Message"));
		findServiceListResponse.setCode(_ctx.integerValue("FindServiceListResponse.Code"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("FindServiceListResponse.Data.CurrentPage"));
		data.setPageNumber(_ctx.integerValue("FindServiceListResponse.Data.PageNumber"));
		data.setTotal(_ctx.integerValue("FindServiceListResponse.Data.Total"));

		List<Service> serviceList = new ArrayList<Service>();
		for (int i = 0; i < _ctx.lengthValue("FindServiceListResponse.Data.ServiceList.Length"); i++) {
			Service service = new Service();
			service.setAlias(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].Alias"));
			service.setAllVisiable(_ctx.booleanValue("FindServiceListResponse.Data.ServiceList["+ i +"].AllVisiable"));
			service.setCreateTime(_ctx.longValue("FindServiceListResponse.Data.ServiceList["+ i +"].CreateTime"));
			service.setCsbId(_ctx.longValue("FindServiceListResponse.Data.ServiceList["+ i +"].CsbId"));
			service.setDescription(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].Description"));
			service.setId(_ctx.longValue("FindServiceListResponse.Data.ServiceList["+ i +"].Id"));
			service.setInterfaceName(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].InterfaceName"));
			service.setModifiedTime(_ctx.longValue("FindServiceListResponse.Data.ServiceList["+ i +"].ModifiedTime"));
			service.setOrderInfo(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].OrderInfo"));
			service.setOwnerId(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].OwnerId"));
			service.setPrincipalName(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].PrincipalName"));
			service.setProjectId(_ctx.longValue("FindServiceListResponse.Data.ServiceList["+ i +"].ProjectId"));
			service.setProjectName(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].ProjectName"));
			service.setScope(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].Scope"));
			service.setServiceName(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].ServiceName"));
			service.setServiceVersion(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].ServiceVersion"));
			service.setSkipAuth(_ctx.booleanValue("FindServiceListResponse.Data.ServiceList["+ i +"].SkipAuth"));
			service.setStatisticName(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].StatisticName"));
			service.setStatus(_ctx.integerValue("FindServiceListResponse.Data.ServiceList["+ i +"].Status"));
			service.setUserId(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].UserId"));
			service.setCasTargets(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].CasTargets"));
			service.setRouteConfJson(_ctx.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].RouteConfJson"));

			serviceList.add(service);
		}
		data.setServiceList(serviceList);
		findServiceListResponse.setData(data);
	 
	 	return findServiceListResponse;
	}
}