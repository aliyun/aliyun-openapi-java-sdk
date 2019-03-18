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
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeDomainsResolutionResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDomainsResolutionResponse.DomainResolution;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeDomainsResolutionResponseUnmarshaller {

	public static DescribeDomainsResolutionResponse unmarshall(DescribeDomainsResolutionResponse describeDomainsResolutionResponse, UnmarshallerContext context) {
		
		describeDomainsResolutionResponse.setRequestId(context.stringValue("DescribeDomainsResolutionResponse.RequestId"));
		describeDomainsResolutionResponse.setGroupId(context.stringValue("DescribeDomainsResolutionResponse.GroupId"));

		List<DomainResolution> domainResolutions = new ArrayList<DomainResolution>();
		for (int i = 0; i < context.lengthValue("DescribeDomainsResolutionResponse.DomainResolutions.Length"); i++) {
			DomainResolution domainResolution = new DomainResolution();
			domainResolution.setDomainName(context.stringValue("DescribeDomainsResolutionResponse.DomainResolutions["+ i +"].DomainName"));
			domainResolution.setDomainResolutionStatus(context.stringValue("DescribeDomainsResolutionResponse.DomainResolutions["+ i +"].DomainResolutionStatus"));

			domainResolutions.add(domainResolution);
		}
		describeDomainsResolutionResponse.setDomainResolutions(domainResolutions);
	 
	 	return describeDomainsResolutionResponse;
	}
}