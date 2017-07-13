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
package com.aliyuncs.httpdns.transform.v20160201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.httpdns.model.v20160201.ListDomainsResponse;
import com.aliyuncs.httpdns.model.v20160201.ListDomainsResponse.DomainInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDomainsResponseUnmarshaller {

	public static ListDomainsResponse unmarshall(ListDomainsResponse listDomainsResponse, UnmarshallerContext context) {
		
		listDomainsResponse.setRequestId(context.stringValue("ListDomainsResponse.RequestId"));
		listDomainsResponse.setTotalCount(context.longValue("ListDomainsResponse.TotalCount"));
		listDomainsResponse.setPageNumber(context.longValue("ListDomainsResponse.PageNumber"));
		listDomainsResponse.setPageSize(context.longValue("ListDomainsResponse.PageSize"));

		List<DomainInfo> domainInfos = new ArrayList<DomainInfo>();
		for (int i = 0; i < context.lengthValue("ListDomainsResponse.DomainInfos.Length"); i++) {
			DomainInfo domainInfo = new DomainInfo();
			domainInfo.setDomainName(context.stringValue("ListDomainsResponse.DomainInfos["+ i +"].DomainName"));
			domainInfo.setResolved(context.longValue("ListDomainsResponse.DomainInfos["+ i +"].Resolved"));
			domainInfo.setResolvedHttps(context.longValue("ListDomainsResponse.DomainInfos["+ i +"].ResolvedHttps"));

			domainInfos.add(domainInfo);
		}
		listDomainsResponse.setDomainInfos(domainInfos);
	 
	 	return listDomainsResponse;
	}
}