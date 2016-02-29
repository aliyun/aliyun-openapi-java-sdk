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

import com.aliyuncs.httpdns.model.v20160201.DescribeDomainsResponse;
import com.aliyuncs.httpdns.model.v20160201.DescribeDomainsResponse.Domain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainsResponseUnmarshaller {

	public static DescribeDomainsResponse unmarshall(DescribeDomainsResponse describeDomainsResponse, UnmarshallerContext context) {
		
		describeDomainsResponse.setRequestId(context.stringValue("DescribeDomainsResponse.RequestId"));
		describeDomainsResponse.setTotalCount(context.longValue("DescribeDomainsResponse.TotalCount"));
		describeDomainsResponse.setPageNumber(context.longValue("DescribeDomainsResponse.PageNumber"));
		describeDomainsResponse.setPageSize(context.longValue("DescribeDomainsResponse.PageSize"));

		List<Domain> domains = new ArrayList<Domain>();
		for (int i = 0; i < context.lengthValue("DescribeDomainsResponse.Domains.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainName(context.stringValue("DescribeDomainsResponse.Domains["+ i +"].DomainName"));

			domains.add(domain);
		}
		describeDomainsResponse.setDomains(domains);
	 
	 	return describeDomainsResponse;
	}
}