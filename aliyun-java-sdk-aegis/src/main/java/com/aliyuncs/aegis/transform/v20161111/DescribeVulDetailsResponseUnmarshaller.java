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

import com.aliyuncs.aegis.model.v20161111.DescribeVulDetailsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulDetailsResponseUnmarshaller {

	public static DescribeVulDetailsResponse unmarshall(DescribeVulDetailsResponse describeVulDetailsResponse, UnmarshallerContext context) {
		
		describeVulDetailsResponse.setRequestId(context.stringValue("DescribeVulDetailsResponse.RequestId"));
		describeVulDetailsResponse.setName(context.stringValue("DescribeVulDetailsResponse.Name"));
		describeVulDetailsResponse.setAliasName(context.stringValue("DescribeVulDetailsResponse.AliasName"));
		describeVulDetailsResponse.setLevel(context.stringValue("DescribeVulDetailsResponse.Level"));
		describeVulDetailsResponse.setVulPublishTs(context.longValue("DescribeVulDetailsResponse.VulPublishTs"));
		describeVulDetailsResponse.setType(context.stringValue("DescribeVulDetailsResponse.Type"));
		describeVulDetailsResponse.setProduct(context.stringValue("DescribeVulDetailsResponse.Product"));
		describeVulDetailsResponse.setHasPatch(context.booleanValue("DescribeVulDetailsResponse.HasPatch"));
		describeVulDetailsResponse.setPatchPublishTs(context.longValue("DescribeVulDetailsResponse.PatchPublishTs"));
		describeVulDetailsResponse.setPatchSource(context.stringValue("DescribeVulDetailsResponse.PatchSource"));
		describeVulDetailsResponse.setCvss(context.stringValue("DescribeVulDetailsResponse.Cvss"));
		describeVulDetailsResponse.setCveIds(context.stringValue("DescribeVulDetailsResponse.CveIds"));
		describeVulDetailsResponse.setAdvice(context.stringValue("DescribeVulDetailsResponse.Advice"));
		describeVulDetailsResponse.setDescription(context.stringValue("DescribeVulDetailsResponse.Description"));
		describeVulDetailsResponse.setPendingCount(context.integerValue("DescribeVulDetailsResponse.PendingCount"));
		describeVulDetailsResponse.setHandledCount(context.integerValue("DescribeVulDetailsResponse.HandledCount"));

		List<String> cveLists = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeVulDetailsResponse.CveLists.Length"); i++) {
			cveLists.add(context.stringValue("DescribeVulDetailsResponse.CveLists["+ i +"]"));
		}
		describeVulDetailsResponse.setCveLists(cveLists);
	 
	 	return describeVulDetailsResponse;
	}
}