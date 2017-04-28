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

import com.aliyuncs.cdn.model.v20141111.DescribeHistoryCharge95InfoResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeHistoryCharge95InfoResponse.HistoryCharge95Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHistoryCharge95InfoResponseUnmarshaller {

	public static DescribeHistoryCharge95InfoResponse unmarshall(DescribeHistoryCharge95InfoResponse describeHistoryCharge95InfoResponse, UnmarshallerContext context) {
		
		describeHistoryCharge95InfoResponse.setRequestId(context.stringValue("DescribeHistoryCharge95InfoResponse.RequestId"));
		describeHistoryCharge95InfoResponse.setPageNumber(context.longValue("DescribeHistoryCharge95InfoResponse.PageNumber"));
		describeHistoryCharge95InfoResponse.setPageSize(context.longValue("DescribeHistoryCharge95InfoResponse.PageSize"));
		describeHistoryCharge95InfoResponse.setTotalCount(context.longValue("DescribeHistoryCharge95InfoResponse.TotalCount"));
		describeHistoryCharge95InfoResponse.setTotalPages(context.longValue("DescribeHistoryCharge95InfoResponse.TotalPages"));
		describeHistoryCharge95InfoResponse.setUserName(context.stringValue("DescribeHistoryCharge95InfoResponse.UserName"));

		List<HistoryCharge95Info> historyCharge95InfosList = new ArrayList<HistoryCharge95Info>();
		for (int i = 0; i < context.lengthValue("DescribeHistoryCharge95InfoResponse.HistoryCharge95Infos.Length"); i++) {
			HistoryCharge95Info historyCharge95Info = new HistoryCharge95Info();
			historyCharge95Info.setDomainName(context.stringValue("DescribeHistoryCharge95InfoResponse.HistoryCharge95Infos["+ i +"].DomainName"));
			historyCharge95Info.setBillTime(context.stringValue("DescribeHistoryCharge95InfoResponse.HistoryCharge95Infos["+ i +"].BillTime"));
			historyCharge95Info.setChargeItem(context.stringValue("DescribeHistoryCharge95InfoResponse.HistoryCharge95Infos["+ i +"].ChargeItem"));
			historyCharge95Info.setMax95Bps(context.longValue("DescribeHistoryCharge95InfoResponse.HistoryCharge95Infos["+ i +"].Max95Bps"));
			historyCharge95Info.setMax95BpsTime(context.stringValue("DescribeHistoryCharge95InfoResponse.HistoryCharge95Infos["+ i +"].Max95BpsTime"));
			historyCharge95Info.setEffectiveFactor(context.floatValue("DescribeHistoryCharge95InfoResponse.HistoryCharge95Infos["+ i +"].EffectiveFactor"));
			historyCharge95Info.setStartTime(context.stringValue("DescribeHistoryCharge95InfoResponse.HistoryCharge95Infos["+ i +"].StartTime"));
			historyCharge95Info.setEndTime(context.stringValue("DescribeHistoryCharge95InfoResponse.HistoryCharge95Infos["+ i +"].EndTime"));
			historyCharge95Info.setProportion(context.floatValue("DescribeHistoryCharge95InfoResponse.HistoryCharge95Infos["+ i +"].Proportion"));
			historyCharge95Info.setDownloadUrl(context.stringValue("DescribeHistoryCharge95InfoResponse.HistoryCharge95Infos["+ i +"].DownloadUrl"));

			historyCharge95InfosList.add(historyCharge95Info);
		}
		describeHistoryCharge95InfoResponse.setHistoryCharge95Infos(historyCharge95InfosList);
	 
	 	return describeHistoryCharge95InfoResponse;
	}
}