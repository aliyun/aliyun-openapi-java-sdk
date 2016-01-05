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
package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeUserDomainsResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeUserDomainsResponse.PageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserDomainsResponseUnmarshaller {

	public static DescribeUserDomainsResponse unmarshall(DescribeUserDomainsResponse describeUserDomainsResponse, UnmarshallerContext context) {
		
		describeUserDomainsResponse.setRequestId(context.stringValue("DescribeUserDomainsResponse.RequestId"));
		describeUserDomainsResponse.setPageNumber(context.longValue("DescribeUserDomainsResponse.PageNumber"));
		describeUserDomainsResponse.setPageSize(context.longValue("DescribeUserDomainsResponse.PageSize"));
		describeUserDomainsResponse.setTotalCount(context.longValue("DescribeUserDomainsResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < context.lengthValue("DescribeUserDomainsResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setDomainName(context.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].DomainName"));
			pageData.setCname(context.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].Cname"));
			pageData.setCdnType(context.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].CdnType"));
			pageData.setDomainStatus(context.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].DomainStatus"));
			pageData.setGmtCreated(context.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].GmtCreated"));
			pageData.setGmtModified(context.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].GmtModified"));
			pageData.setDescription(context.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].Description"));

			domains.add(pageData);
		}
		describeUserDomainsResponse.setDomains(domains);
	 
	 	return describeUserDomainsResponse;
	}
}