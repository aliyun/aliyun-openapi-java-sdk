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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindApproveServiceListResponseUnmarshaller {

	public static FindApproveServiceListResponse unmarshall(FindApproveServiceListResponse findApproveServiceListResponse, UnmarshallerContext context) {
		
		findApproveServiceListResponse.setRequestId(context.stringValue("FindApproveServiceListResponse.RequestId"));
		findApproveServiceListResponse.setCode(context.integerValue("FindApproveServiceListResponse.Code"));
		findApproveServiceListResponse.setMessage(context.stringValue("FindApproveServiceListResponse.Message"));

		Data data = new Data();
		data.setTotal(context.integerValue("FindApproveServiceListResponse.Data.Total"));
		data.setPageNumber(context.integerValue("FindApproveServiceListResponse.Data.PageNumber"));
		data.setCurrentPage(context.integerValue("FindApproveServiceListResponse.Data.CurrentPage"));

		List<Service> serviceList = new ArrayList<Service>();
		for (int i = 0; i < context.lengthValue("FindApproveServiceListResponse.Data.ServiceList.Length"); i++) {
			Service service = new Service();
			service.setAllVisiable(context.booleanValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].AllVisiable"));
			service.setCasTargets(context.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].CasTargets"));
			service.setCreateTime(context.longValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].CreateTime"));
			service.setCsbId(context.longValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].CsbId"));
			service.setId(context.longValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].Id"));
			service.setInterfaceName(context.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].InterfaceName"));
			service.setModifiedTime(context.longValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].ModifiedTime"));
			service.setOwnerId(context.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].OwnerId"));
			service.setPrincipalName(context.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].PrincipalName"));
			service.setProjectId(context.longValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].ProjectId"));
			service.setProjectName(context.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].ProjectName"));
			service.setQps(context.integerValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].Qps"));
			service.setScope(context.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].Scope"));
			service.setServiceName(context.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].ServiceName"));
			service.setServiceVersion(context.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].ServiceVersion"));
			service.setSkipAuth(context.booleanValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].SkipAuth"));
			service.setStatisticName(context.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].StatisticName"));
			service.setStatus(context.integerValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].Status"));
			service.setUserId(context.stringValue("FindApproveServiceListResponse.Data.ServiceList["+ i +"].UserId"));

			serviceList.add(service);
		}
		data.setServiceList(serviceList);
		findApproveServiceListResponse.setData(data);
	 
	 	return findApproveServiceListResponse;
	}
}