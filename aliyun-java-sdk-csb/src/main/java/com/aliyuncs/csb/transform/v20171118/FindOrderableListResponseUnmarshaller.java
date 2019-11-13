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

import com.aliyuncs.csb.model.v20171118.FindOrderableListResponse;
import com.aliyuncs.csb.model.v20171118.FindOrderableListResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindOrderableListResponse.Data.Service;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindOrderableListResponseUnmarshaller {

	public static FindOrderableListResponse unmarshall(FindOrderableListResponse findOrderableListResponse, UnmarshallerContext _ctx) {
		
		findOrderableListResponse.setRequestId(_ctx.stringValue("FindOrderableListResponse.RequestId"));
		findOrderableListResponse.setCode(_ctx.integerValue("FindOrderableListResponse.Code"));
		findOrderableListResponse.setMessage(_ctx.stringValue("FindOrderableListResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("FindOrderableListResponse.Data.CurrentPage"));
		data.setPageNumber(_ctx.integerValue("FindOrderableListResponse.Data.PageNumber"));

		List<Service> serviceList = new ArrayList<Service>();
		for (int i = 0; i < _ctx.lengthValue("FindOrderableListResponse.Data.ServiceList.Length"); i++) {
			Service service = new Service();
			service.setAlias(_ctx.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].Alias"));
			service.setAllVisiable(_ctx.booleanValue("FindOrderableListResponse.Data.ServiceList["+ i +"].AllVisiable"));
			service.setApproveUserId(_ctx.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].ApproveUserId"));
			service.setCasTargets(_ctx.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].CasTargets"));
			service.setCreateTime(_ctx.longValue("FindOrderableListResponse.Data.ServiceList["+ i +"].CreateTime"));
			service.setCsbId(_ctx.longValue("FindOrderableListResponse.Data.ServiceList["+ i +"].CsbId"));
			service.setId(_ctx.longValue("FindOrderableListResponse.Data.ServiceList["+ i +"].Id"));
			service.setInterfaceName(_ctx.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].InterfaceName"));
			service.setModifiedTime(_ctx.longValue("FindOrderableListResponse.Data.ServiceList["+ i +"].ModifiedTime"));
			service.setOwnerId(_ctx.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].OwnerId"));
			service.setPrincipalName(_ctx.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].PrincipalName"));
			service.setProjectId(_ctx.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].ProjectId"));
			service.setProjectName(_ctx.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].ProjectName"));
			service.setScope(_ctx.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].Scope"));
			service.setServiceName(_ctx.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].ServiceName"));
			service.setServiceVersion(_ctx.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].ServiceVersion"));
			service.setSkipAuth(_ctx.booleanValue("FindOrderableListResponse.Data.ServiceList["+ i +"].SkipAuth"));
			service.setStatisticName(_ctx.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].StatisticName"));
			service.setStatus(_ctx.integerValue("FindOrderableListResponse.Data.ServiceList["+ i +"].Status"));
			service.setUserId(_ctx.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].UserId"));

			serviceList.add(service);
		}
		data.setServiceList(serviceList);
		findOrderableListResponse.setData(data);
	 
	 	return findOrderableListResponse;
	}
}