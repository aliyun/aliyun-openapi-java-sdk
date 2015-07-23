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
package com.aliyuncs.ocs.transform.v20150301;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.ocs.model.v20150301.DescribeInstancesResponse;
import com.aliyuncs.ocs.model.v20150301.DescribeInstancesResponse.GetOcsInstancesResponse;
import com.aliyuncs.ocs.model.v20150301.DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext context) {
		
		describeInstancesResponse.setRequestId(context.stringValue("DescribeInstancesResponse.RequestId"));

		GetOcsInstancesResponse  getOcsInstancesResponse = new GetOcsInstancesResponse();
		getOcsInstancesResponse.setTotal(context.integerValue("DescribeInstancesResponse.GetOcsInstancesResponse.Total"));
		getOcsInstancesResponse.setPageNo(context.integerValue("DescribeInstancesResponse.GetOcsInstancesResponse.PageNo"));
		getOcsInstancesResponse.setPageSize(context.integerValue("DescribeInstancesResponse.GetOcsInstancesResponse.PageSize"));

		List<OcsInstance> ocsInstances = new ArrayList<OcsInstance>();
		for (int i = 0; i < context.lengthValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances.Length"); i++) {
			OcsInstance  ocsInstance = new OcsInstance();
			ocsInstance.setOcsInstanceId(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].OcsInstanceId"));
			ocsInstance.setOcsInstanceName(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].OcsInstanceName"));
			ocsInstance.setCapacity(context.longValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].Capacity"));
			ocsInstance.setQps(context.longValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].Qps"));
			ocsInstance.setBandwidth(context.longValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].Bandwidth"));
			ocsInstance.setConnections(context.longValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].Connections"));
			ocsInstance.setConnectionDomain(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].ConnectionDomain"));
			ocsInstance.setPort(context.integerValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].Port"));
			ocsInstance.setUserName(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].UserName"));
			ocsInstance.setRegionId(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].RegionId"));
			ocsInstance.setOcsInstanceStatus(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].OcsInstanceStatus"));
			ocsInstance.setgmtCreated(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].gmtCreated"));
			ocsInstance.setendTime(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].endTime"));
			ocsInstance.setchargeType(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].chargeType"));
			ocsInstance.setizId(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].izId"));
			ocsInstance.setNetworkType(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].NetworkType"));
			ocsInstance.setVpcId(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].VpcId"));
			ocsInstance.setVSwitchId(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].VSwitchId"));
			ocsInstance.setPrivateIp(context.stringValue("DescribeInstancesResponse.GetOcsInstancesResponse.OcsInstances["+ i +"].PrivateIp"));

			ocsInstances.add(ocsInstance);
		}
		getOcsInstancesResponse.setOcsInstances(ocsInstances);
		describeInstancesResponse.setGetOcsInstancesResponse(getOcsInstancesResponse);
	 
	 	return describeInstancesResponse;
	}
}