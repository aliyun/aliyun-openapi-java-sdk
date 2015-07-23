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
import com.aliyuncs.ocs.model.v20150301.DescribeMonitorValuesResponse;
import com.aliyuncs.ocs.model.v20150301.DescribeMonitorValuesResponse.GetOcsMonitorValuesResponse;
import com.aliyuncs.ocs.model.v20150301.DescribeMonitorValuesResponse.GetOcsMonitorValuesResponse.OcsMonitorDTO;
import com.aliyuncs.ocs.model.v20150301.DescribeMonitorValuesResponse.GetOcsMonitorValuesResponse.OcsMonitorDTO.OcsMonitorKeyDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorValuesResponseUnmarshaller {

	public static DescribeMonitorValuesResponse unmarshall(DescribeMonitorValuesResponse describeMonitorValuesResponse, UnmarshallerContext context) {
		
		describeMonitorValuesResponse.setRequestId(context.stringValue("DescribeMonitorValuesResponse.RequestId"));

		GetOcsMonitorValuesResponse  getOcsMonitorValuesResponse = new GetOcsMonitorValuesResponse();
		getOcsMonitorValuesResponse.setDate(context.stringValue("DescribeMonitorValuesResponse.GetOcsMonitorValuesResponse.Date"));

		List<OcsMonitorDTO> ocsInstanceIds = new ArrayList<OcsMonitorDTO>();
		for (int i = 0; i < context.lengthValue("DescribeMonitorValuesResponse.GetOcsMonitorValuesResponse.OcsInstanceIds.Length"); i++) {
			OcsMonitorDTO  ocsMonitorDTO = new OcsMonitorDTO();
			ocsMonitorDTO.setOcsInstanceId(context.stringValue("DescribeMonitorValuesResponse.GetOcsMonitorValuesResponse.OcsInstanceIds["+ i +"].OcsInstanceId"));

			List<OcsMonitorKeyDTO> monitorKeys = new ArrayList<OcsMonitorKeyDTO>();
			for (int j = 0; j < context.lengthValue("DescribeMonitorValuesResponse.GetOcsMonitorValuesResponse.OcsInstanceIds["+ i +"].MonitorKeys.Length"); j++) {
				OcsMonitorKeyDTO  ocsMonitorKeyDTO = new OcsMonitorKeyDTO();
				ocsMonitorKeyDTO.setMonitorKey(context.stringValue("DescribeMonitorValuesResponse.GetOcsMonitorValuesResponse.OcsInstanceIds["+ i +"].MonitorKeys["+ j +"].MonitorKey"));
				ocsMonitorKeyDTO.setValue(context.stringValue("DescribeMonitorValuesResponse.GetOcsMonitorValuesResponse.OcsInstanceIds["+ i +"].MonitorKeys["+ j +"].Value"));
				ocsMonitorKeyDTO.setUnit(context.stringValue("DescribeMonitorValuesResponse.GetOcsMonitorValuesResponse.OcsInstanceIds["+ i +"].MonitorKeys["+ j +"].Unit"));
				ocsMonitorKeyDTO.setDate(context.stringValue("DescribeMonitorValuesResponse.GetOcsMonitorValuesResponse.OcsInstanceIds["+ i +"].MonitorKeys["+ j +"].Date"));

				monitorKeys.add(ocsMonitorKeyDTO);
			}
			ocsMonitorDTO.setMonitorKeys(monitorKeys);

			ocsInstanceIds.add(ocsMonitorDTO);
		}
		getOcsMonitorValuesResponse.setOcsInstanceIds(ocsInstanceIds);
		describeMonitorValuesResponse.setGetOcsMonitorValuesResponse(getOcsMonitorValuesResponse);
	 
	 	return describeMonitorValuesResponse;
	}
}