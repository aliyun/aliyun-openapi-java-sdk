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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainISPDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainISPDataResponse.ISPProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainISPDataResponseUnmarshaller {

	public static DescribeDomainISPDataResponse unmarshall(DescribeDomainISPDataResponse describeDomainISPDataResponse, UnmarshallerContext context) {
		
		describeDomainISPDataResponse.setRequestId(context.stringValue("DescribeDomainISPDataResponse.RequestId"));
		describeDomainISPDataResponse.setDomainName(context.stringValue("DescribeDomainISPDataResponse.DomainName"));
		describeDomainISPDataResponse.setDataInterval(context.stringValue("DescribeDomainISPDataResponse.DataInterval"));
		describeDomainISPDataResponse.setStartTime(context.stringValue("DescribeDomainISPDataResponse.StartTime"));
		describeDomainISPDataResponse.setEndTime(context.stringValue("DescribeDomainISPDataResponse.EndTime"));

		List<ISPProportionData> value = new ArrayList<ISPProportionData>();
		for (int i = 0; i < context.lengthValue("DescribeDomainISPDataResponse.Value.Length"); i++) {
			ISPProportionData iSPProportionData = new ISPProportionData();
			iSPProportionData.setISP(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].ISP"));
			iSPProportionData.setProportion(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].Proportion"));
			iSPProportionData.setIspEname(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].IspEname"));
			iSPProportionData.setAvgObjectSize(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].AvgObjectSize"));
			iSPProportionData.setAvgResponseTime(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].AvgResponseTime"));
			iSPProportionData.setBps(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].Bps"));
			iSPProportionData.setByteHitRate(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].ByteHitRate"));
			iSPProportionData.setQps(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].Qps"));
			iSPProportionData.setReqErrRate(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].ReqErrRate"));
			iSPProportionData.setReqHitRate(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].ReqHitRate"));
			iSPProportionData.setAvgResponseRate(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].AvgResponseRate"));
			iSPProportionData.setTotalBytes(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].TotalBytes"));
			iSPProportionData.setBytesProportion(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].BytesProportion"));
			iSPProportionData.setTotalQuery(context.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].TotalQuery"));

			value.add(iSPProportionData);
		}
		describeDomainISPDataResponse.setValue(value);
	 
	 	return describeDomainISPDataResponse;
	}
}