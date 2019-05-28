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

import com.aliyuncs.rds.model.v20140815.DescribeOssDownloadsForSQLServerResponse;
import com.aliyuncs.rds.model.v20140815.DescribeOssDownloadsForSQLServerResponse.OssDownload;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssDownloadsForSQLServerResponseUnmarshaller {

	public static DescribeOssDownloadsForSQLServerResponse unmarshall(DescribeOssDownloadsForSQLServerResponse describeOssDownloadsForSQLServerResponse, UnmarshallerContext context) {
		
		describeOssDownloadsForSQLServerResponse.setRequestId(context.stringValue("DescribeOssDownloadsForSQLServerResponse.RequestId"));
		describeOssDownloadsForSQLServerResponse.setDBInstanceName(context.stringValue("DescribeOssDownloadsForSQLServerResponse.DBInstanceName"));
		describeOssDownloadsForSQLServerResponse.setMigrateIaskId(context.stringValue("DescribeOssDownloadsForSQLServerResponse.MigrateIaskId"));

		List<OssDownload> items = new ArrayList<OssDownload>();
		for (int i = 0; i < context.lengthValue("DescribeOssDownloadsForSQLServerResponse.Items.Length"); i++) {
			OssDownload ossDownload = new OssDownload();
			ossDownload.setFileName(context.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].FileName"));
			ossDownload.setCreateTime(context.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].CreateTime"));
			ossDownload.setCreateTime1(context.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].CreateTime"));
			ossDownload.setBakType(context.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].BakType"));
			ossDownload.setFileSize(context.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].FileSize"));
			ossDownload.setStatus(context.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].Status"));
			ossDownload.setIsAvail(context.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].IsAvail"));
			ossDownload.setDesc(context.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].Desc"));

			items.add(ossDownload);
		}
		describeOssDownloadsForSQLServerResponse.setItems(items);
	 
	 	return describeOssDownloadsForSQLServerResponse;
	}
}