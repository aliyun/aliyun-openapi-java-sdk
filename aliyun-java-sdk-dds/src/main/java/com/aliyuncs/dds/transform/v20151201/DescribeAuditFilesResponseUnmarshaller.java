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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeAuditFilesResponse;
import com.aliyuncs.dds.model.v20151201.DescribeAuditFilesResponse.LogFile;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuditFilesResponseUnmarshaller {

	public static DescribeAuditFilesResponse unmarshall(DescribeAuditFilesResponse describeAuditFilesResponse, UnmarshallerContext context) {
		
		describeAuditFilesResponse.setRequestId(context.stringValue("DescribeAuditFilesResponse.RequestId"));
		describeAuditFilesResponse.setTotalRecordCount(context.integerValue("DescribeAuditFilesResponse.TotalRecordCount"));
		describeAuditFilesResponse.setPageNumber(context.integerValue("DescribeAuditFilesResponse.PageNumber"));
		describeAuditFilesResponse.setPageRecordCount(context.integerValue("DescribeAuditFilesResponse.PageRecordCount"));
		describeAuditFilesResponse.setDBInstanceId(context.stringValue("DescribeAuditFilesResponse.DBInstanceId"));

		List<LogFile> items = new ArrayList<LogFile>();
		for (int i = 0; i < context.lengthValue("DescribeAuditFilesResponse.Items.Length"); i++) {
			LogFile logFile = new LogFile();
			logFile.setFileID(context.integerValue("DescribeAuditFilesResponse.Items["+ i +"].FileID"));
			logFile.setLogStatus(context.stringValue("DescribeAuditFilesResponse.Items["+ i +"].LogStatus"));
			logFile.setLogStartTime(context.stringValue("DescribeAuditFilesResponse.Items["+ i +"].LogStartTime"));
			logFile.setLogEndTime(context.stringValue("DescribeAuditFilesResponse.Items["+ i +"].LogEndTime"));
			logFile.setLogDownloadURL(context.stringValue("DescribeAuditFilesResponse.Items["+ i +"].LogDownloadURL"));
			logFile.setLogSize(context.longValue("DescribeAuditFilesResponse.Items["+ i +"].LogSize"));

			items.add(logFile);
		}
		describeAuditFilesResponse.setItems(items);
	 
	 	return describeAuditFilesResponse;
	}
}