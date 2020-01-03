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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuditFilesResponseUnmarshaller {

	public static DescribeAuditFilesResponse unmarshall(DescribeAuditFilesResponse describeAuditFilesResponse, UnmarshallerContext _ctx) {
		
		describeAuditFilesResponse.setRequestId(_ctx.stringValue("DescribeAuditFilesResponse.RequestId"));
		describeAuditFilesResponse.setTotalRecordCount(_ctx.integerValue("DescribeAuditFilesResponse.TotalRecordCount"));
		describeAuditFilesResponse.setPageNumber(_ctx.integerValue("DescribeAuditFilesResponse.PageNumber"));
		describeAuditFilesResponse.setPageRecordCount(_ctx.integerValue("DescribeAuditFilesResponse.PageRecordCount"));
		describeAuditFilesResponse.setDBInstanceId(_ctx.stringValue("DescribeAuditFilesResponse.DBInstanceId"));

		List<LogFile> items = new ArrayList<LogFile>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAuditFilesResponse.Items.Length"); i++) {
			LogFile logFile = new LogFile();
			logFile.setFileID(_ctx.integerValue("DescribeAuditFilesResponse.Items["+ i +"].FileID"));
			logFile.setLogStatus(_ctx.stringValue("DescribeAuditFilesResponse.Items["+ i +"].LogStatus"));
			logFile.setLogStartTime(_ctx.stringValue("DescribeAuditFilesResponse.Items["+ i +"].LogStartTime"));
			logFile.setLogEndTime(_ctx.stringValue("DescribeAuditFilesResponse.Items["+ i +"].LogEndTime"));
			logFile.setLogDownloadURL(_ctx.stringValue("DescribeAuditFilesResponse.Items["+ i +"].LogDownloadURL"));
			logFile.setLogSize(_ctx.longValue("DescribeAuditFilesResponse.Items["+ i +"].LogSize"));

			items.add(logFile);
		}
		describeAuditFilesResponse.setItems(items);
	 
	 	return describeAuditFilesResponse;
	}
}