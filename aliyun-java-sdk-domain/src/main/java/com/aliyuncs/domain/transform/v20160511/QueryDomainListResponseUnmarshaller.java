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
package com.aliyuncs.domain.transform.v20160511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20160511.QueryDomainListResponse;
import com.aliyuncs.domain.model.v20160511.QueryDomainListResponse.Domain;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainListResponseUnmarshaller {

	public static QueryDomainListResponse unmarshall(QueryDomainListResponse queryDomainListResponse, UnmarshallerContext context) {
		
		queryDomainListResponse.setRequestId(context.stringValue("QueryDomainListResponse.RequestId"));
		queryDomainListResponse.setTotalItemNum(context.integerValue("QueryDomainListResponse.TotalItemNum"));
		queryDomainListResponse.setCurrentPageNum(context.integerValue("QueryDomainListResponse.CurrentPageNum"));
		queryDomainListResponse.setTotalPageNum(context.integerValue("QueryDomainListResponse.TotalPageNum"));
		queryDomainListResponse.setPageSize(context.integerValue("QueryDomainListResponse.PageSize"));
		queryDomainListResponse.setPrePage(context.booleanValue("QueryDomainListResponse.PrePage"));
		queryDomainListResponse.setNextPage(context.booleanValue("QueryDomainListResponse.NextPage"));

		List<Domain> data = new ArrayList<Domain>();
		for (int i = 0; i < context.lengthValue("QueryDomainListResponse.Data.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainName(context.stringValue("QueryDomainListResponse.Data["+ i +"].DomainName"));
			domain.setSaleId(context.stringValue("QueryDomainListResponse.Data["+ i +"].SaleId"));
			domain.setDeadDate(context.stringValue("QueryDomainListResponse.Data["+ i +"].DeadDate"));
			domain.setRegDate(context.stringValue("QueryDomainListResponse.Data["+ i +"].RegDate"));
			domain.setDomainAuditStatus(context.stringValue("QueryDomainListResponse.Data["+ i +"].DomainAuditStatus"));
			domain.setDomainRegType(context.stringValue("QueryDomainListResponse.Data["+ i +"].DomainRegType"));
			domain.setGroupId(context.stringValue("QueryDomainListResponse.Data["+ i +"].GroupId"));
			domain.setDomainType(context.stringValue("QueryDomainListResponse.Data["+ i +"].DomainType"));

			data.add(domain);
		}
		queryDomainListResponse.setData(data);
	 
	 	return queryDomainListResponse;
	}
}