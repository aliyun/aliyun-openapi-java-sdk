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

import com.aliyuncs.dds.model.v20151201.DescribeBinlogFilesResponse;
import com.aliyuncs.dds.model.v20151201.DescribeBinlogFilesResponse.LogFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBinlogFilesResponseUnmarshaller {

	public static DescribeBinlogFilesResponse unmarshall(DescribeBinlogFilesResponse describeBinlogFilesResponse, UnmarshallerContext _ctx) {
		
		describeBinlogFilesResponse.setRequestId(_ctx.stringValue("DescribeBinlogFilesResponse.RequestId"));
		describeBinlogFilesResponse.setPageNumber(_ctx.integerValue("DescribeBinlogFilesResponse.PageNumber"));
		describeBinlogFilesResponse.setMaxRecordsPerPage(_ctx.integerValue("DescribeBinlogFilesResponse.MaxRecordsPerPage"));
		describeBinlogFilesResponse.setTotalRecordCount(_ctx.integerValue("DescribeBinlogFilesResponse.TotalRecordCount"));

		List<LogFile> items = new ArrayList<LogFile>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBinlogFilesResponse.Items.Length"); i++) {
			LogFile logFile = new LogFile();
			logFile.setLogFileName(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].LogFileName"));
			logFile.setDumpDownloadURL(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].DumpDownloadURL"));
			logFile.setLogBeginTime(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].LogBeginTime"));
			logFile.setDumpBucket(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].DumpBucket"));
			logFile.setLinkExpiredTime(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].LinkExpiredTime"));
			logFile.setDownloadLink(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].DownloadLink"));
			logFile.setOSSEndpoint(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].OSSEndpoint"));
			logFile.setLogEndTime(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].LogEndTime"));
			logFile.setDumpState(_ctx.integerValue("DescribeBinlogFilesResponse.Items["+ i +"].DumpState"));
			logFile.setFileSize(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].FileSize"));
			logFile.setFileId(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].FileId"));
			logFile.setBinLogId(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].BinLogId"));
			logFile.setLogStatus(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].LogStatus"));

			items.add(logFile);
		}
		describeBinlogFilesResponse.setItems(items);
	 
	 	return describeBinlogFilesResponse;
	}
}