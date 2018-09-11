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

import com.aliyuncs.rds.model.v20140815.DescribeOssDownloadsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeOssDownloadsResponse.OssDownload;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssDownloadsResponseUnmarshaller {

	public static DescribeOssDownloadsResponse unmarshall(DescribeOssDownloadsResponse describeOssDownloadsResponse, UnmarshallerContext context) {
		
		describeOssDownloadsResponse.setRequestId(context.stringValue("DescribeOssDownloadsResponse.RequestId"));
		describeOssDownloadsResponse.setDBInstanceId(context.stringValue("DescribeOssDownloadsResponse.DBInstanceId"));
		describeOssDownloadsResponse.setMigrateTaskId(context.stringValue("DescribeOssDownloadsResponse.MigrateTaskId"));

		List<OssDownload> items = new ArrayList<OssDownload>();
		for (int i = 0; i < context.lengthValue("DescribeOssDownloadsResponse.Items.Length"); i++) {
			OssDownload ossDownload = new OssDownload();
			ossDownload.setFileName(context.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].FileName"));
			ossDownload.setCreateTime(context.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].CreateTime"));
			ossDownload.setEndTime(context.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].EndTime"));
			ossDownload.setBackupMode(context.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].BackupMode"));
			ossDownload.setFileSize(context.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].FileSize"));
			ossDownload.setStatus(context.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].Status"));
			ossDownload.setIsAvailable(context.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].IsAvailable"));
			ossDownload.setDescription(context.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].Description"));

			items.add(ossDownload);
		}
		describeOssDownloadsResponse.setItems(items);
	 
	 	return describeOssDownloadsResponse;
	}
}