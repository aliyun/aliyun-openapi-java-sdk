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

	public static DescribeOssDownloadsForSQLServerResponse unmarshall(DescribeOssDownloadsForSQLServerResponse describeOssDownloadsForSQLServerResponse, UnmarshallerContext _ctx) {
		
		describeOssDownloadsForSQLServerResponse.setRequestId(_ctx.stringValue("DescribeOssDownloadsForSQLServerResponse.RequestId"));
		describeOssDownloadsForSQLServerResponse.setDBInstanceName(_ctx.stringValue("DescribeOssDownloadsForSQLServerResponse.DBInstanceName"));
		describeOssDownloadsForSQLServerResponse.setMigrateIaskId(_ctx.stringValue("DescribeOssDownloadsForSQLServerResponse.MigrateIaskId"));

		List<OssDownload> items = new ArrayList<OssDownload>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssDownloadsForSQLServerResponse.Items.Length"); i++) {
			OssDownload ossDownload = new OssDownload();
			ossDownload.setFileName(_ctx.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].FileName"));
			ossDownload.setCreateTime(_ctx.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].CreateTime"));
			ossDownload.setCreateTime1(_ctx.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].CreateTime"));
			ossDownload.setBakType(_ctx.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].BakType"));
			ossDownload.setFileSize(_ctx.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].FileSize"));
			ossDownload.setStatus(_ctx.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].Status"));
			ossDownload.setIsAvail(_ctx.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].IsAvail"));
			ossDownload.setDesc(_ctx.stringValue("DescribeOssDownloadsForSQLServerResponse.Items["+ i +"].Desc"));

			items.add(ossDownload);
		}
		describeOssDownloadsForSQLServerResponse.setItems(items);
	 
	 	return describeOssDownloadsForSQLServerResponse;
	}
}