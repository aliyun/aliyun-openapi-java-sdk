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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindServiceListResponseUnmarshaller {

	public static FindServiceListResponse unmarshall(FindServiceListResponse findServiceListResponse, UnmarshallerContext context) {
		
		findServiceListResponse.setRequestId(context.stringValue("FindServiceListResponse.RequestId"));
		findServiceListResponse.setMessage(context.stringValue("FindServiceListResponse.Message"));
		findServiceListResponse.setCode(context.integerValue("FindServiceListResponse.Code"));

		Data data = new Data();
		data.setCurrentPage(context.integerValue("FindServiceListResponse.Data.CurrentPage"));
		data.setPageNumber(context.integerValue("FindServiceListResponse.Data.PageNumber"));
		data.setTotal(context.integerValue("FindServiceListResponse.Data.Total"));

		List<Service> serviceList = new ArrayList<Service>();
		for (int i = 0; i < context.lengthValue("FindServiceListResponse.Data.ServiceList.Length"); i++) {
			Service service = new Service();
			service.setAlias(context.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].Alias"));
			service.setAllVisiable(context.booleanValue("FindServiceListResponse.Data.ServiceList["+ i +"].AllVisiable"));
			service.setCreateTime(context.longValue("FindServiceListResponse.Data.ServiceList["+ i +"].CreateTime"));
			service.setCsbId(context.longValue("FindServiceListResponse.Data.ServiceList["+ i +"].CsbId"));
			service.setDescription(context.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].Description"));
			service.setId(context.longValue("FindServiceListResponse.Data.ServiceList["+ i +"].Id"));
			service.setInterfaceName(context.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].InterfaceName"));
			service.setModifiedTime(context.longValue("FindServiceListResponse.Data.ServiceList["+ i +"].ModifiedTime"));
			service.setOrderInfo(context.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].OrderInfo"));
			service.setOwnerId(context.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].OwnerId"));
			service.setPrincipalName(context.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].PrincipalName"));
			service.setProjectId(context.longValue("FindServiceListResponse.Data.ServiceList["+ i +"].ProjectId"));
			service.setProjectName(context.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].ProjectName"));
			service.setScope(context.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].Scope"));
			service.setServiceName(context.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].ServiceName"));
			service.setServiceVersion(context.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].ServiceVersion"));
			service.setSkipAuth(context.booleanValue("FindServiceListResponse.Data.ServiceList["+ i +"].SkipAuth"));
			service.setStatisticName(context.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].StatisticName"));
			service.setStatus(context.integerValue("FindServiceListResponse.Data.ServiceList["+ i +"].Status"));
			service.setUserId(context.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].UserId"));
			service.setCasTargets(context.stringValue("FindServiceListResponse.Data.ServiceList["+ i +"].CasTargets"));

			serviceList.add(service);
		}
		data.setServiceList(serviceList);
		findServiceListResponse.setData(data);
	 
	 	return findServiceListResponse;
	}
}