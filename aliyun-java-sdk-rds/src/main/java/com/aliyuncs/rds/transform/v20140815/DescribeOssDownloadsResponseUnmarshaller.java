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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssDownloadsResponseUnmarshaller {

	public static DescribeOssDownloadsResponse unmarshall(DescribeOssDownloadsResponse describeOssDownloadsResponse, UnmarshallerContext _ctx) {
		
		describeOssDownloadsResponse.setRequestId(_ctx.stringValue("DescribeOssDownloadsResponse.RequestId"));
		describeOssDownloadsResponse.setDBInstanceId(_ctx.stringValue("DescribeOssDownloadsResponse.DBInstanceId"));
		describeOssDownloadsResponse.setMigrateTaskId(_ctx.stringValue("DescribeOssDownloadsResponse.MigrateTaskId"));

		List<OssDownload> items = new ArrayList<OssDownload>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssDownloadsResponse.Items.Length"); i++) {
			OssDownload ossDownload = new OssDownload();
			ossDownload.setFileName(_ctx.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].FileName"));
			ossDownload.setCreateTime(_ctx.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].CreateTime"));
			ossDownload.setEndTime(_ctx.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].EndTime"));
			ossDownload.setBackupMode(_ctx.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].BackupMode"));
			ossDownload.setFileSize(_ctx.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].FileSize"));
			ossDownload.setStatus(_ctx.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].Status"));
			ossDownload.setIsAvailable(_ctx.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].IsAvailable"));
			ossDownload.setDescription(_ctx.stringValue("DescribeOssDownloadsResponse.Items["+ i +"].Description"));

			items.add(ossDownload);
		}
		describeOssDownloadsResponse.setItems(items);
	 
	 	return describeOssDownloadsResponse;
	}
}