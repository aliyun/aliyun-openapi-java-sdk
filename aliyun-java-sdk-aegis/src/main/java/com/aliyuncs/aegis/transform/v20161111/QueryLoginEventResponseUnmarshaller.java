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
package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.QueryLoginEventResponse;
import com.aliyuncs.aegis.model.v20161111.QueryLoginEventResponse.Data;
import com.aliyuncs.aegis.model.v20161111.QueryLoginEventResponse.Data.Entity;
import com.aliyuncs.aegis.model.v20161111.QueryLoginEventResponse.Data.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLoginEventResponseUnmarshaller {

	public static QueryLoginEventResponse unmarshall(QueryLoginEventResponse queryLoginEventResponse, UnmarshallerContext context) {
		
		queryLoginEventResponse.setRequestId(context.stringValue("QueryLoginEventResponse.requestId"));
		queryLoginEventResponse.setCode(context.stringValue("QueryLoginEventResponse.Code"));
		queryLoginEventResponse.setSuccess(context.booleanValue("QueryLoginEventResponse.Success"));
		queryLoginEventResponse.setMessage(context.stringValue("QueryLoginEventResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(context.integerValue("QueryLoginEventResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(context.integerValue("QueryLoginEventResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(context.integerValue("QueryLoginEventResponse.Data.PageInfo.TotalCount"));
		pageInfo.setCount(context.integerValue("QueryLoginEventResponse.Data.PageInfo.Count"));
		data.setPageInfo(pageInfo);

		List<Entity> list = new ArrayList<Entity>();
		for (int i = 0; i < context.lengthValue("QueryLoginEventResponse.Data.List.Length"); i++) {
			Entity entity = new Entity();
			entity.setUuid(context.stringValue("QueryLoginEventResponse.Data.List["+ i +"].Uuid"));
			entity.setLoginTime(context.stringValue("QueryLoginEventResponse.Data.List["+ i +"].LoginTime"));
			entity.setLoginType(context.integerValue("QueryLoginEventResponse.Data.List["+ i +"].LoginType"));
			entity.setLoginTypeName(context.stringValue("QueryLoginEventResponse.Data.List["+ i +"].LoginTypeName"));
			entity.setBuyVersion(context.stringValue("QueryLoginEventResponse.Data.List["+ i +"].BuyVersion"));
			entity.setLoginSourceIp(context.stringValue("QueryLoginEventResponse.Data.List["+ i +"].LoginSourceIp"));
			entity.setGroupId(context.integerValue("QueryLoginEventResponse.Data.List["+ i +"].GroupId"));
			entity.setInstanceName(context.stringValue("QueryLoginEventResponse.Data.List["+ i +"].InstanceName"));
			entity.setInstanceId(context.stringValue("QueryLoginEventResponse.Data.List["+ i +"].InstanceId"));
			entity.setIp(context.stringValue("QueryLoginEventResponse.Data.List["+ i +"].Ip"));
			entity.setRegion(context.stringValue("QueryLoginEventResponse.Data.List["+ i +"].Region"));
			entity.setStatus(context.integerValue("QueryLoginEventResponse.Data.List["+ i +"].Status"));
			entity.setStatusName(context.stringValue("QueryLoginEventResponse.Data.List["+ i +"].StatusName"));
			entity.setLocation(context.stringValue("QueryLoginEventResponse.Data.List["+ i +"].Location"));
			entity.setUserName(context.stringValue("QueryLoginEventResponse.Data.List["+ i +"].UserName"));

			list.add(entity);
		}
		data.setList(list);
		queryLoginEventResponse.setData(data);
	 
	 	return queryLoginEventResponse;
	}
}