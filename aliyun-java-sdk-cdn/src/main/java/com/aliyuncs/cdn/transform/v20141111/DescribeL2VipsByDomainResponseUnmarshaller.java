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

import com.aliyuncs.cdn.model.v20141111.DescribeL2VipsByDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeL2VipsByDomainResponseUnmarshaller {

	public static DescribeL2VipsByDomainResponse unmarshall(DescribeL2VipsByDomainResponse describeL2VipsByDomainResponse, UnmarshallerContext context) {
		
		describeL2VipsByDomainResponse.setRequestId(context.stringValue("DescribeL2VipsByDomainResponse.RequestId"));
		describeL2VipsByDomainResponse.setDomainName(context.stringValue("DescribeL2VipsByDomainResponse.DomainName"));

		List<String> vips = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeL2VipsByDomainResponse.Vips.Length"); i++) {
			vips.add(context.stringValue("DescribeL2VipsByDomainResponse.Vips["+ i +"]"));
		}
		describeL2VipsByDomainResponse.setVips(vips);
	 
	 	return describeL2VipsByDomainResponse;
	}
}