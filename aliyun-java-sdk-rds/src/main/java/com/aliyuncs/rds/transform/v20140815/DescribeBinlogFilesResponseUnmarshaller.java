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

import com.aliyuncs.rds.model.v20140815.DescribeBinlogFilesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeBinlogFilesResponse.BinLogFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBinlogFilesResponseUnmarshaller {

	public static DescribeBinlogFilesResponse unmarshall(DescribeBinlogFilesResponse describeBinlogFilesResponse, UnmarshallerContext _ctx) {
		
		describeBinlogFilesResponse.setRequestId(_ctx.stringValue("DescribeBinlogFilesResponse.RequestId"));
		describeBinlogFilesResponse.setTotalFileSize(_ctx.longValue("DescribeBinlogFilesResponse.TotalFileSize"));
		describeBinlogFilesResponse.setPageNumber(_ctx.integerValue("DescribeBinlogFilesResponse.PageNumber"));
		describeBinlogFilesResponse.setPageRecordCount(_ctx.integerValue("DescribeBinlogFilesResponse.PageRecordCount"));
		describeBinlogFilesResponse.setTotalRecordCount(_ctx.integerValue("DescribeBinlogFilesResponse.TotalRecordCount"));

		List<BinLogFile> items = new ArrayList<BinLogFile>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBinlogFilesResponse.Items.Length"); i++) {
			BinLogFile binLogFile = new BinLogFile();
			binLogFile.setRemoteStatus(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].RemoteStatus"));
			binLogFile.setIntranetDownloadLink(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].IntranetDownloadLink"));
			binLogFile.setLogBeginTime(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].LogBeginTime"));
			binLogFile.setLinkExpiredTime(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].LinkExpiredTime"));
			binLogFile.setDownloadLink(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].DownloadLink"));
			binLogFile.setLogFileName(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].LogFileName"));
			binLogFile.setChecksum(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].Checksum"));
			binLogFile.setLogEndTime(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].LogEndTime"));
			binLogFile.setHostInstanceID(_ctx.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].HostInstanceID"));
			binLogFile.setFileSize(_ctx.longValue("DescribeBinlogFilesResponse.Items["+ i +"].FileSize"));

			items.add(binLogFile);
		}
		describeBinlogFilesResponse.setItems(items);
	 
	 	return describeBinlogFilesResponse;
	}
}