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

import com.aliyuncs.rds.model.v20140815.DescribeLogBackupFilesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeLogBackupFilesResponse.BinLogFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogBackupFilesResponseUnmarshaller {

	public static DescribeLogBackupFilesResponse unmarshall(DescribeLogBackupFilesResponse describeLogBackupFilesResponse, UnmarshallerContext _ctx) {
		
		describeLogBackupFilesResponse.setRequestId(_ctx.stringValue("DescribeLogBackupFilesResponse.RequestId"));
		describeLogBackupFilesResponse.setPageNumber(_ctx.integerValue("DescribeLogBackupFilesResponse.PageNumber"));
		describeLogBackupFilesResponse.setPageRecordCount(_ctx.integerValue("DescribeLogBackupFilesResponse.PageRecordCount"));
		describeLogBackupFilesResponse.setTotalFileSize(_ctx.longValue("DescribeLogBackupFilesResponse.TotalFileSize"));
		describeLogBackupFilesResponse.setTotalRecordCount(_ctx.integerValue("DescribeLogBackupFilesResponse.TotalRecordCount"));

		List<BinLogFile> items = new ArrayList<BinLogFile>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogBackupFilesResponse.Items.Length"); i++) {
			BinLogFile binLogFile = new BinLogFile();
			binLogFile.setDownloadLink(_ctx.stringValue("DescribeLogBackupFilesResponse.Items["+ i +"].DownloadLink"));
			binLogFile.setFileSize(_ctx.longValue("DescribeLogBackupFilesResponse.Items["+ i +"].FileSize"));
			binLogFile.setIntranetDownloadLink(_ctx.stringValue("DescribeLogBackupFilesResponse.Items["+ i +"].IntranetDownloadLink"));
			binLogFile.setLinkExpiredTime(_ctx.stringValue("DescribeLogBackupFilesResponse.Items["+ i +"].LinkExpiredTime"));
			binLogFile.setLogBeginTime(_ctx.stringValue("DescribeLogBackupFilesResponse.Items["+ i +"].LogBeginTime"));
			binLogFile.setLogEndTime(_ctx.stringValue("DescribeLogBackupFilesResponse.Items["+ i +"].LogEndTime"));

			items.add(binLogFile);
		}
		describeLogBackupFilesResponse.setItems(items);
	 
	 	return describeLogBackupFilesResponse;
	}
}