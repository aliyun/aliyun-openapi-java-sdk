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
package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetCDNStatisSumResponse;
import com.aliyuncs.vod.model.v20170321.GetCDNStatisSumResponse.CDNMetric;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCDNStatisSumResponseUnmarshaller {

	public static GetCDNStatisSumResponse unmarshall(GetCDNStatisSumResponse getCDNStatisSumResponse, UnmarshallerContext context) {
		
		getCDNStatisSumResponse.setRequestId(context.stringValue("GetCDNStatisSumResponse.RequestId"));
		getCDNStatisSumResponse.setSumFlowDataValue(context.longValue("GetCDNStatisSumResponse.SumFlowDataValue"));
		getCDNStatisSumResponse.setMaxBpsDataValue(context.longValue("GetCDNStatisSumResponse.MaxBpsDataValue"));

		List<CDNMetric> cDNStatisList = new ArrayList<CDNMetric>();
		for (int i = 0; i < context.lengthValue("GetCDNStatisSumResponse.CDNStatisList.Length"); i++) {
			CDNMetric cDNMetric = new CDNMetric();
			cDNMetric.setStatTime(context.stringValue("GetCDNStatisSumResponse.CDNStatisList["+ i +"].StatTime"));
			cDNMetric.setFlowDataDomesticValue(context.longValue("GetCDNStatisSumResponse.CDNStatisList["+ i +"].FlowDataDomesticValue"));
			cDNMetric.setFlowDataOverseasValue(context.longValue("GetCDNStatisSumResponse.CDNStatisList["+ i +"].FlowDataOverseasValue"));
			cDNMetric.setFlowDataValue(context.longValue("GetCDNStatisSumResponse.CDNStatisList["+ i +"].FlowDataValue"));
			cDNMetric.setBpsDataDomesticValue(context.longValue("GetCDNStatisSumResponse.CDNStatisList["+ i +"].BpsDataDomesticValue"));
			cDNMetric.setBpsDataOverseasValue(context.longValue("GetCDNStatisSumResponse.CDNStatisList["+ i +"].BpsDataOverseasValue"));
			cDNMetric.setBpsDataValue(context.longValue("GetCDNStatisSumResponse.CDNStatisList["+ i +"].BpsDataValue"));

			cDNStatisList.add(cDNMetric);
		}
		getCDNStatisSumResponse.setCDNStatisList(cDNStatisList);
	 
	 	return getCDNStatisSumResponse;
	}
}