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

import com.aliyuncs.rds.model.v20140815.DescribeFilesForSQLServerResponse;
import com.aliyuncs.rds.model.v20140815.DescribeFilesForSQLServerResponse.SQLServerUploadFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFilesForSQLServerResponseUnmarshaller {

	public static DescribeFilesForSQLServerResponse unmarshall(DescribeFilesForSQLServerResponse describeFilesForSQLServerResponse, UnmarshallerContext context) {
		
		describeFilesForSQLServerResponse.setRequestId(context.stringValue("DescribeFilesForSQLServerResponse.RequestId"));
		describeFilesForSQLServerResponse.setDBInstanceId(context.stringValue("DescribeFilesForSQLServerResponse.DBInstanceId"));
		describeFilesForSQLServerResponse.setTotalRecordCount(context.integerValue("DescribeFilesForSQLServerResponse.TotalRecordCount"));
		describeFilesForSQLServerResponse.setPageNumber(context.integerValue("DescribeFilesForSQLServerResponse.PageNumber"));
		describeFilesForSQLServerResponse.setPageRecordCount(context.integerValue("DescribeFilesForSQLServerResponse.PageRecordCount"));

		List<SQLServerUploadFile> items = new ArrayList<SQLServerUploadFile>();
		for (int i = 0; i < context.lengthValue("DescribeFilesForSQLServerResponse.Items.Length"); i++) {
			SQLServerUploadFile sQLServerUploadFile = new SQLServerUploadFile();
			sQLServerUploadFile.setDBName(context.stringValue("DescribeFilesForSQLServerResponse.Items["+ i +"].DBName"));
			sQLServerUploadFile.setFileName(context.stringValue("DescribeFilesForSQLServerResponse.Items["+ i +"].FileName"));
			sQLServerUploadFile.setFileSize(context.longValue("DescribeFilesForSQLServerResponse.Items["+ i +"].FileSize"));
			sQLServerUploadFile.setInternetFtpServer(context.stringValue("DescribeFilesForSQLServerResponse.Items["+ i +"].InternetFtpServer"));
			sQLServerUploadFile.setInternetPort(context.integerValue("DescribeFilesForSQLServerResponse.Items["+ i +"].InternetPort"));
			sQLServerUploadFile.setIntranetFtpserver(context.stringValue("DescribeFilesForSQLServerResponse.Items["+ i +"].IntranetFtpserver"));
			sQLServerUploadFile.setIntranetport(context.integerValue("DescribeFilesForSQLServerResponse.Items["+ i +"].Intranetport"));
			sQLServerUploadFile.setUserName(context.stringValue("DescribeFilesForSQLServerResponse.Items["+ i +"].UserName"));
			sQLServerUploadFile.setPassword(context.stringValue("DescribeFilesForSQLServerResponse.Items["+ i +"].Password"));
			sQLServerUploadFile.setFileStatus(context.stringValue("DescribeFilesForSQLServerResponse.Items["+ i +"].FileStatus"));
			sQLServerUploadFile.setDescription(context.stringValue("DescribeFilesForSQLServerResponse.Items["+ i +"].Description"));
			sQLServerUploadFile.setCreationTime(context.stringValue("DescribeFilesForSQLServerResponse.Items["+ i +"].CreationTime"));

			items.add(sQLServerUploadFile);
		}
		describeFilesForSQLServerResponse.setItems(items);
	 
	 	return describeFilesForSQLServerResponse;
	}
}