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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainHttpsDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainHttpsDataResponse.HttpsStatisticsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainHttpsDataResponseUnmarshaller {

	public static DescribeDomainHttpsDataResponse unmarshall(DescribeDomainHttpsDataResponse describeDomainHttpsDataResponse, UnmarshallerContext context) {
		
		describeDomainHttpsDataResponse.setRequestId(context.stringValue("DescribeDomainHttpsDataResponse.RequestId"));
		describeDomainHttpsDataResponse.setDomainNames(context.stringValue("DescribeDomainHttpsDataResponse.DomainNames"));
		describeDomainHttpsDataResponse.setDataInterval(context.stringValue("DescribeDomainHttpsDataResponse.DataInterval"));

		List<HttpsStatisticsInfo> httpsStatisticsInfos = new ArrayList<HttpsStatisticsInfo>();
		for (int i = 0; i < context.lengthValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos.Length"); i++) {
			HttpsStatisticsInfo httpsStatisticsInfo = new HttpsStatisticsInfo();
			httpsStatisticsInfo.setTime(context.stringValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].Time"));
			httpsStatisticsInfo.setL1HttpsBps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1HttpsBps"));
			httpsStatisticsInfo.setL1HttpsInnerBps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1HttpsInnerBps"));
			httpsStatisticsInfo.setL1HttpsOutBps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1HttpsOutBps"));
			httpsStatisticsInfo.setL1HttpsQps(context.longValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1HttpsQps"));
			httpsStatisticsInfo.setL1HttpsInnerQps(context.longValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1HttpsInnerQps"));
			httpsStatisticsInfo.setL1HttpsOutQps(context.longValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1HttpsOutQps"));
			httpsStatisticsInfo.setL1HttpsTtraf(context.longValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1HttpsTtraf"));
			httpsStatisticsInfo.setHttpsSrcBps(context.longValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].HttpsSrcBps"));
			httpsStatisticsInfo.setHttpsSrcTraf(context.longValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].HttpsSrcTraf"));
			httpsStatisticsInfo.setL1HttpsInnerTraf(context.longValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1HttpsInnerTraf"));
			httpsStatisticsInfo.setL1HttpsOutTraf(context.longValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1HttpsOutTraf"));
			httpsStatisticsInfo.setHttpsByteHitRate(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].HttpsByteHitRate"));
			httpsStatisticsInfo.setHttpsReqHitRate(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].HttpsReqHitRate"));
			httpsStatisticsInfo.setL1HttpsHitRate(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1HttpsHitRate"));
			httpsStatisticsInfo.setL1HttpsInner_acc(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1HttpsInner_acc"));
			httpsStatisticsInfo.setL1HttpsOut_acc(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1HttpsOut_acc"));
			httpsStatisticsInfo.setL1HttpsTacc(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1HttpsTacc"));
			httpsStatisticsInfo.setL1DyHttpsBps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1DyHttpsBps"));
			httpsStatisticsInfo.setL1DyHttpsInnerBps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1DyHttpsInnerBps"));
			httpsStatisticsInfo.setL1DyHttpsOutBps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1DyHttpsOutBps"));
			httpsStatisticsInfo.setL1StHttpsBps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1StHttpsBps"));
			httpsStatisticsInfo.setL1StHttpsInnerBps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1StHttpsInnerBps"));
			httpsStatisticsInfo.setL1StHttpsOutBps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1StHttpsOutBps"));
			httpsStatisticsInfo.setL1DyHttpsTraf(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].l1DyHttpsTraf"));
			httpsStatisticsInfo.setL1DyHttpsInnerTraf(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1DyHttpsInnerTraf"));
			httpsStatisticsInfo.setL1DyHttpsOutTraf(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1DyHttpsOutTraf"));
			httpsStatisticsInfo.setL1StHttpsTraf(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1StHttpsTraf"));
			httpsStatisticsInfo.setL1StHttpsInnerTraf(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1StHttpsInnerTraf"));
			httpsStatisticsInfo.setL1StHttpsOutTraf(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1StHttpsOutTraf"));
			httpsStatisticsInfo.setL1DyHttpsQps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1DyHttpsQps"));
			httpsStatisticsInfo.setL1DyHttpsInnerQps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1DyHttpsInnerQps"));
			httpsStatisticsInfo.setL1DyHttpsOutQps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1DyHttpsOutQps"));
			httpsStatisticsInfo.setL1StHttpsQps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1StHttpsQps"));
			httpsStatisticsInfo.setL1StHttpsInnerQps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1StHttpsInnerQps"));
			httpsStatisticsInfo.setL1StHttpsOutQps(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1StHttpsOutQps"));
			httpsStatisticsInfo.setL1DyHttpsAcc(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1DyHttpsAcc"));
			httpsStatisticsInfo.setL1DyHttpsInnerAcc(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1DyHttpsInnerAcc"));
			httpsStatisticsInfo.setL1DyHttpsOutAcc(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1DyHttpsOutAcc"));
			httpsStatisticsInfo.setL1StHttpsAcc(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1StHttpsAcc"));
			httpsStatisticsInfo.setL1StHttpsInnerAcc(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1StHttpsInnerAcc"));
			httpsStatisticsInfo.setL1StHttpsOutAcc(context.floatValue("DescribeDomainHttpsDataResponse.HttpsStatisticsInfos["+ i +"].L1StHttpsOutAcc"));

			httpsStatisticsInfos.add(httpsStatisticsInfo);
		}
		describeDomainHttpsDataResponse.setHttpsStatisticsInfos(httpsStatisticsInfos);
	 
	 	return describeDomainHttpsDataResponse;
	}
}