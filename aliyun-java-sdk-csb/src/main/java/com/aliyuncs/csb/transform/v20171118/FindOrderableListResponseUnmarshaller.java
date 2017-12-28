/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.FindOrderableListResponse;
import com.aliyuncs.csb.model.v20171118.FindOrderableListResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindOrderableListResponse.Data.Service;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindOrderableListResponseUnmarshaller {

	public static FindOrderableListResponse unmarshall(FindOrderableListResponse findOrderableListResponse, UnmarshallerContext context) {
		
		findOrderableListResponse.setRequestId(context.stringValue("FindOrderableListResponse.RequestId"));
		findOrderableListResponse.setCode(context.integerValue("FindOrderableListResponse.Code"));
		findOrderableListResponse.setMessage(context.stringValue("FindOrderableListResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(context.integerValue("FindOrderableListResponse.Data.CurrentPage"));
		data.setPageNumber(context.integerValue("FindOrderableListResponse.Data.PageNumber"));

		List<Service> serviceList = new ArrayList<Service>();
		for (int i = 0; i < context.lengthValue("FindOrderableListResponse.Data.ServiceList.Length"); i++) {
			Service service = new Service();
			service.setAlias(context.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].Alias"));
			service.setAllVisiable(context.booleanValue("FindOrderableListResponse.Data.ServiceList["+ i +"].AllVisiable"));
			service.setApproveUserId(context.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].ApproveUserId"));
			service.setCasTargets(context.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].CasTargets"));
			service.setCreateTime(context.longValue("FindOrderableListResponse.Data.ServiceList["+ i +"].CreateTime"));
			service.setCsbId(context.longValue("FindOrderableListResponse.Data.ServiceList["+ i +"].CsbId"));
			service.setId(context.longValue("FindOrderableListResponse.Data.ServiceList["+ i +"].Id"));
			service.setInterfaceName(context.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].InterfaceName"));
			service.setModifiedTime(context.longValue("FindOrderableListResponse.Data.ServiceList["+ i +"].ModifiedTime"));
			service.setOwnerId(context.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].OwnerId"));
			service.setPrincipalName(context.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].PrincipalName"));
			service.setProjectId(context.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].ProjectId"));
			service.setProjectName(context.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].ProjectName"));
			service.setScope(context.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].Scope"));
			service.setServiceName(context.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].ServiceName"));
			service.setServiceVersion(context.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].ServiceVersion"));
			service.setSkipAuth(context.booleanValue("FindOrderableListResponse.Data.ServiceList["+ i +"].SkipAuth"));
			service.setStatisticName(context.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].StatisticName"));
			service.setStatus(context.integerValue("FindOrderableListResponse.Data.ServiceList["+ i +"].Status"));
			service.setUserId(context.stringValue("FindOrderableListResponse.Data.ServiceList["+ i +"].UserId"));

			serviceList.add(service);
		}
		data.setServiceList(serviceList);
		findOrderableListResponse.setData(data);
	 
	 	return findOrderableListResponse;
	}
}