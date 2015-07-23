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
package com.aliyuncs.yundun.transform.v20150416;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.yundun.model.v20150416.ListInstanceInfosResponse;
import com.aliyuncs.yundun.model.v20150416.ListInstanceInfosResponse.InstanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceInfosResponseUnmarshaller {

	public static ListInstanceInfosResponse unmarshall(ListInstanceInfosResponse listInstanceInfosResponse, UnmarshallerContext context) {
		
		listInstanceInfosResponse.setRequestId(context.stringValue("ListInstanceInfosResponse.RequestId"));
		listInstanceInfosResponse.setPageNumber(context.integerValue("ListInstanceInfosResponse.PageNumber"));
		listInstanceInfosResponse.setPageSize(context.integerValue("ListInstanceInfosResponse.PageSize"));
		listInstanceInfosResponse.setTotalCount(context.integerValue("ListInstanceInfosResponse.TotalCount"));

		List<InstanceInfo> infosList = new ArrayList<InstanceInfo>();
		for (int i = 0; i < context.lengthValue("ListInstanceInfosResponse.InfosList.Length"); i++) {
			InstanceInfo  instanceInfo = new InstanceInfo();
			instanceInfo.setRegion(context.stringValue("ListInstanceInfosResponse.InfosList["+ i +"].Region"));
			instanceInfo.setRegionName(context.stringValue("ListInstanceInfosResponse.InfosList["+ i +"].RegionName"));
			instanceInfo.setRegionEnName(context.stringValue("ListInstanceInfosResponse.InfosList["+ i +"].RegionEnName"));
			instanceInfo.setInstanceName(context.stringValue("ListInstanceInfosResponse.InfosList["+ i +"].InstanceName"));
			instanceInfo.setInstanceId(context.stringValue("ListInstanceInfosResponse.InfosList["+ i +"].InstanceId"));
			instanceInfo.setIp(context.stringValue("ListInstanceInfosResponse.InfosList["+ i +"].Ip"));
			instanceInfo.setInternetIp(context.stringValue("ListInstanceInfosResponse.InfosList["+ i +"].InternetIp"));
			instanceInfo.setIntranetIp(context.stringValue("ListInstanceInfosResponse.InfosList["+ i +"].IntranetIp"));
			instanceInfo.setDdos(context.integerValue("ListInstanceInfosResponse.InfosList["+ i +"].Ddos"));
			instanceInfo.setHostEvent(context.integerValue("ListInstanceInfosResponse.InfosList["+ i +"].HostEvent"));
			instanceInfo.setSecureCheck(context.integerValue("ListInstanceInfosResponse.InfosList["+ i +"].SecureCheck"));
			instanceInfo.setAegisStatus(context.integerValue("ListInstanceInfosResponse.InfosList["+ i +"].AegisStatus"));
			instanceInfo.setWaf(context.integerValue("ListInstanceInfosResponse.InfosList["+ i +"].Waf"));
			instanceInfo.setIsLock(context.booleanValue("ListInstanceInfosResponse.InfosList["+ i +"].IsLock"));
			instanceInfo.setLockType(context.stringValue("ListInstanceInfosResponse.InfosList["+ i +"].LockType"));
			instanceInfo.setUnLockTimes(context.integerValue("ListInstanceInfosResponse.InfosList["+ i +"].UnLockTimes"));
			instanceInfo.setTriggerTime(context.stringValue("ListInstanceInfosResponse.InfosList["+ i +"].TriggerTime"));

			infosList.add(instanceInfo);
		}
		listInstanceInfosResponse.setInfosList(infosList);
	 
	 	return listInstanceInfosResponse;
	}
}