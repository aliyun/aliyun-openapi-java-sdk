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
package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeNqasResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeNqasResponse.Nqa;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNqasResponseUnmarshaller {

	public static DescribeNqasResponse unmarshall(DescribeNqasResponse describeNqasResponse, UnmarshallerContext context) {
		
		describeNqasResponse.setRequestId(context.stringValue("DescribeNqasResponse.RequestId"));
		describeNqasResponse.setTotalCount(context.integerValue("DescribeNqasResponse.TotalCount"));
		describeNqasResponse.setPageNumber(context.integerValue("DescribeNqasResponse.PageNumber"));
		describeNqasResponse.setPageSize(context.integerValue("DescribeNqasResponse.PageSize"));

		List<Nqa> nqas = new ArrayList<Nqa>();
		for (int i = 0; i < context.lengthValue("DescribeNqasResponse.Nqas.Length"); i++) {
			Nqa nqa = new Nqa();
			nqa.setNqaId(context.stringValue("DescribeNqasResponse.Nqas["+ i +"].NqaId"));
			nqa.setRegionId(context.stringValue("DescribeNqasResponse.Nqas["+ i +"].RegionId"));
			nqa.setStatus(context.stringValue("DescribeNqasResponse.Nqas["+ i +"].Status"));
			nqa.setRouterId(context.stringValue("DescribeNqasResponse.Nqas["+ i +"].RouterId"));
			nqa.setDestinationIp(context.stringValue("DescribeNqasResponse.Nqas["+ i +"].DestinationIp"));

			nqas.add(nqa);
		}
		describeNqasResponse.setNqas(nqas);
	 
	 	return describeNqasResponse;
	}
}