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

import com.aliyuncs.rds.model.v20140815.DescribeSqlLogDetailArchiveStatusResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSqlLogDetailArchiveStatusResponse.ArchiveSQLLog;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlLogDetailArchiveStatusResponseUnmarshaller {

	public static DescribeSqlLogDetailArchiveStatusResponse unmarshall(DescribeSqlLogDetailArchiveStatusResponse describeSqlLogDetailArchiveStatusResponse, UnmarshallerContext context) {
		
		describeSqlLogDetailArchiveStatusResponse.setRequestId(context.stringValue("DescribeSqlLogDetailArchiveStatusResponse.RequestId"));
		describeSqlLogDetailArchiveStatusResponse.setDBInstanceID(context.integerValue("DescribeSqlLogDetailArchiveStatusResponse.DBInstanceID"));
		describeSqlLogDetailArchiveStatusResponse.setDBInstanceName(context.stringValue("DescribeSqlLogDetailArchiveStatusResponse.DBInstanceName"));
		describeSqlLogDetailArchiveStatusResponse.setItemsNumbers(context.integerValue("DescribeSqlLogDetailArchiveStatusResponse.ItemsNumbers"));

		List<ArchiveSQLLog> items = new ArrayList<ArchiveSQLLog>();
		for (int i = 0; i < context.lengthValue("DescribeSqlLogDetailArchiveStatusResponse.Items.Length"); i++) {
			ArchiveSQLLog archiveSQLLog = new ArchiveSQLLog();
			archiveSQLLog.setJobName(context.stringValue("DescribeSqlLogDetailArchiveStatusResponse.Items["+ i +"].JobName"));
			archiveSQLLog.setCreateTime(context.stringValue("DescribeSqlLogDetailArchiveStatusResponse.Items["+ i +"].CreateTime"));
			archiveSQLLog.setUpdateTime(context.stringValue("DescribeSqlLogDetailArchiveStatusResponse.Items["+ i +"].UpdateTime"));
			archiveSQLLog.setProcessRows(context.longValue("DescribeSqlLogDetailArchiveStatusResponse.Items["+ i +"].ProcessRows"));
			archiveSQLLog.setTotalRows(context.longValue("DescribeSqlLogDetailArchiveStatusResponse.Items["+ i +"].TotalRows"));
			archiveSQLLog.setFailMsg(context.stringValue("DescribeSqlLogDetailArchiveStatusResponse.Items["+ i +"].FailMsg"));
			archiveSQLLog.setJobStatus(context.stringValue("DescribeSqlLogDetailArchiveStatusResponse.Items["+ i +"].JobStatus"));
			archiveSQLLog.setDownloadLink(context.stringValue("DescribeSqlLogDetailArchiveStatusResponse.Items["+ i +"].DownloadLink"));
			archiveSQLLog.setLinkExpiredTime(context.stringValue("DescribeSqlLogDetailArchiveStatusResponse.Items["+ i +"].LinkExpiredTime"));

			items.add(archiveSQLLog);
		}
		describeSqlLogDetailArchiveStatusResponse.setItems(items);
	 
	 	return describeSqlLogDetailArchiveStatusResponse;
	}
}