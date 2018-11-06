/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeLoginLogsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeLoginLogsResponse.LogListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoginLogsResponseUnmarshaller {

	public static DescribeLoginLogsResponse unmarshall(DescribeLoginLogsResponse describeLoginLogsResponse, UnmarshallerContext context) {
		
		describeLoginLogsResponse.setRequestId(context.stringValue("DescribeLoginLogsResponse.RequestId"));
		describeLoginLogsResponse.setPageSize(context.integerValue("DescribeLoginLogsResponse.PageSize"));
		describeLoginLogsResponse.setCurrentPage(context.integerValue("DescribeLoginLogsResponse.CurrentPage"));
		describeLoginLogsResponse.setTotalCount(context.integerValue("DescribeLoginLogsResponse.TotalCount"));

		List<LogListItem> logList = new ArrayList<LogListItem>();
		for (int i = 0; i < context.lengthValue("DescribeLoginLogsResponse.LogList.Length"); i++) {
			LogListItem logListItem = new LogListItem();
			logListItem.setLoginSourceIp(context.stringValue("DescribeLoginLogsResponse.LogList["+ i +"].LoginSourceIp"));
			logListItem.setInstanceName(context.stringValue("DescribeLoginLogsResponse.LogList["+ i +"].InstanceName"));
			logListItem.setGroupId(context.longValue("DescribeLoginLogsResponse.LogList["+ i +"].GroupId"));
			logListItem.setIp(context.stringValue("DescribeLoginLogsResponse.LogList["+ i +"].Ip"));
			logListItem.setType(context.stringValue("DescribeLoginLogsResponse.LogList["+ i +"].Type"));
			logListItem.setUserName(context.stringValue("DescribeLoginLogsResponse.LogList["+ i +"].UserName"));
			logListItem.setUuid(context.stringValue("DescribeLoginLogsResponse.LogList["+ i +"].Uuid"));
			logListItem.setProtocol(context.integerValue("DescribeLoginLogsResponse.LogList["+ i +"].Protocol"));
			logListItem.setLoginTime(context.longValue("DescribeLoginLogsResponse.LogList["+ i +"].LoginTime"));
			logListItem.setInstanceId(context.stringValue("DescribeLoginLogsResponse.LogList["+ i +"].InstanceId"));
			logListItem.setOsVersion(context.stringValue("DescribeLoginLogsResponse.LogList["+ i +"].OsVersion"));
			logListItem.setProtocolName(context.stringValue("DescribeLoginLogsResponse.LogList["+ i +"].ProtocolName"));
			logListItem.setOnline(context.stringValue("DescribeLoginLogsResponse.LogList["+ i +"].Online"));
			logListItem.setLocation(context.stringValue("DescribeLoginLogsResponse.LogList["+ i +"].Location"));
			logListItem.setId(context.longValue("DescribeLoginLogsResponse.LogList["+ i +"].id"));
			logListItem.setRegion(context.stringValue("DescribeLoginLogsResponse.LogList["+ i +"].Region"));
			logListItem.setStatus(context.integerValue("DescribeLoginLogsResponse.LogList["+ i +"].Status"));

			logList.add(logListItem);
		}
		describeLoginLogsResponse.setLogList(logList);
	 
	 	return describeLoginLogsResponse;
	}
}