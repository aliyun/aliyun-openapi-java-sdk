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

import com.aliyuncs.ocs.model.v20150301.CreateInstanceResponse;
import com.aliyuncs.ocs.model.v20150301.CreateInstanceResponse.OcsInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstanceResponseUnmarshaller {

	public static CreateInstanceResponse unmarshall(CreateInstanceResponse createInstanceResponse, UnmarshallerContext context) {
		
		createInstanceResponse.setRequestId(context.stringValue("CreateInstanceResponse.RequestId"));

		OcsInstance  ocsInstance = new OcsInstance();
		ocsInstance.setOcsInstanceId(context.stringValue("CreateInstanceResponse.OcsInstance.OcsInstanceId"));
		ocsInstance.setOcsInstanceName(context.stringValue("CreateInstanceResponse.OcsInstance.OcsInstanceName"));
		ocsInstance.setCapacity(context.longValue("CreateInstanceResponse.OcsInstance.Capacity"));
		ocsInstance.setQps(context.longValue("CreateInstanceResponse.OcsInstance.Qps"));
		ocsInstance.setBandwidth(context.longValue("CreateInstanceResponse.OcsInstance.Bandwidth"));
		ocsInstance.setConnections(context.longValue("CreateInstanceResponse.OcsInstance.Connections"));
		ocsInstance.setConnectionDomain(context.stringValue("CreateInstanceResponse.OcsInstance.ConnectionDomain"));
		ocsInstance.setPort(context.integerValue("CreateInstanceResponse.OcsInstance.Port"));
		ocsInstance.setUserName(context.stringValue("CreateInstanceResponse.OcsInstance.UserName"));
		ocsInstance.setRegionId(context.stringValue("CreateInstanceResponse.OcsInstance.RegionId"));
		ocsInstance.setOcsInstanceStatus(context.stringValue("CreateInstanceResponse.OcsInstance.OcsInstanceStatus"));
		ocsInstance.setGmtCreated(context.stringValue("CreateInstanceResponse.OcsInstance.GmtCreated"));
		ocsInstance.setEndTime(context.stringValue("CreateInstanceResponse.OcsInstance.EndTime"));
		ocsInstance.setChargeType(context.stringValue("CreateInstanceResponse.OcsInstance.ChargeType"));
		ocsInstance.setIzId(context.stringValue("CreateInstanceResponse.OcsInstance.IzId"));
		ocsInstance.setNetworkType(context.stringValue("CreateInstanceResponse.OcsInstance.NetworkType"));
		ocsInstance.setVpcId(context.stringValue("CreateInstanceResponse.OcsInstance.VpcId"));
		ocsInstance.setVSwitchId(context.stringValue("CreateInstanceResponse.OcsInstance.VSwitchId"));
		ocsInstance.setPrivateIp(context.stringValue("CreateInstanceResponse.OcsInstance.PrivateIp"));
		createInstanceResponse.setOcsInstance(ocsInstance);
	 
	 	return createInstanceResponse;
	}
}