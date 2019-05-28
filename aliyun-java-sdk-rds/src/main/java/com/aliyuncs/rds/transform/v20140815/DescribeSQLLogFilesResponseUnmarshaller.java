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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeSQLLogFilesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSQLLogFilesResponse.LogFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogFilesResponseUnmarshaller {

	public static DescribeSQLLogFilesResponse unmarshall(DescribeSQLLogFilesResponse describeSQLLogFilesResponse, UnmarshallerContext context) {
		
		describeSQLLogFilesResponse.setRequestId(context.stringValue("DescribeSQLLogFilesResponse.RequestId"));
		describeSQLLogFilesResponse.setTotalRecordCount(context.integerValue("DescribeSQLLogFilesResponse.TotalRecordCount"));
		describeSQLLogFilesResponse.setPageNumber(context.integerValue("DescribeSQLLogFilesResponse.PageNumber"));
		describeSQLLogFilesResponse.setPageRecordCount(context.integerValue("DescribeSQLLogFilesResponse.PageRecordCount"));

		List<LogFile> items = new ArrayList<LogFile>();
		for (int i = 0; i < context.lengthValue("DescribeSQLLogFilesResponse.Items.Length"); i++) {
			LogFile logFile = new LogFile();
			logFile.setFileID(context.stringValue("DescribeSQLLogFilesResponse.Items["+ i +"].FileID"));
			logFile.setLogStatus(context.stringValue("DescribeSQLLogFilesResponse.Items["+ i +"].LogStatus"));
			logFile.setLogDownloadURL(context.stringValue("DescribeSQLLogFilesResponse.Items["+ i +"].LogDownloadURL"));
			logFile.setLogSize(context.stringValue("DescribeSQLLogFilesResponse.Items["+ i +"].LogSize"));
			logFile.setLogStartTime(context.stringValue("DescribeSQLLogFilesResponse.Items["+ i +"].LogStartTime"));
			logFile.setLogEndTime(context.stringValue("DescribeSQLLogFilesResponse.Items["+ i +"].LogEndTime"));

			items.add(logFile);
		}
		describeSQLLogFilesResponse.setItems(items);
	 
	 	return describeSQLLogFilesResponse;
	}
}