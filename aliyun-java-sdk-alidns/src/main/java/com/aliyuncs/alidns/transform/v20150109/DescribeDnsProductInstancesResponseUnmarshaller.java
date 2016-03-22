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
package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeDnsProductInstancesResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsProductInstancesResponse.DnsProduct;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsProductInstancesResponseUnmarshaller {

	public static DescribeDnsProductInstancesResponse unmarshall(DescribeDnsProductInstancesResponse describeDnsProductInstancesResponse, UnmarshallerContext context) {
		
		describeDnsProductInstancesResponse.setRequestId(context.stringValue("DescribeDnsProductInstancesResponse.RequestId"));
		describeDnsProductInstancesResponse.setTotalCount(context.longValue("DescribeDnsProductInstancesResponse.TotalCount"));
		describeDnsProductInstancesResponse.setPageNumber(context.longValue("DescribeDnsProductInstancesResponse.PageNumber"));
		describeDnsProductInstancesResponse.setPageSize(context.longValue("DescribeDnsProductInstancesResponse.PageSize"));

		List<DnsProduct> dnsProducts = new ArrayList<DnsProduct>();
		for (int i = 0; i < context.lengthValue("DescribeDnsProductInstancesResponse.DnsProducts.Length"); i++) {
			DnsProduct dnsProduct = new DnsProduct();
			dnsProduct.setInstanceId(context.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].InstanceId"));
			dnsProduct.setVersionCode(context.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].VersionCode"));
			dnsProduct.setVersionName(context.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].VersionName"));
			dnsProduct.setStartTime(context.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].StartTime"));
			dnsProduct.setEndTime(context.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].EndTime"));
			dnsProduct.setDomain(context.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].Domain"));

			dnsProducts.add(dnsProduct);
		}
		describeDnsProductInstancesResponse.setDnsProducts(dnsProducts);
	 
	 	return describeDnsProductInstancesResponse;
	}
}