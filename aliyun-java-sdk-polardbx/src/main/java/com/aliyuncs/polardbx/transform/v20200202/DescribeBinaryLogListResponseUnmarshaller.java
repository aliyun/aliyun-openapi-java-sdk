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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribeBinaryLogListResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeBinaryLogListResponse.LogListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBinaryLogListResponseUnmarshaller {

	public static DescribeBinaryLogListResponse unmarshall(DescribeBinaryLogListResponse describeBinaryLogListResponse, UnmarshallerContext _ctx) {
		
		describeBinaryLogListResponse.setRequestId(_ctx.stringValue("DescribeBinaryLogListResponse.RequestId"));
		describeBinaryLogListResponse.setPageNumber(_ctx.integerValue("DescribeBinaryLogListResponse.PageNumber"));
		describeBinaryLogListResponse.setPageSize(_ctx.integerValue("DescribeBinaryLogListResponse.PageSize"));
		describeBinaryLogListResponse.setTotalNumber(_ctx.integerValue("DescribeBinaryLogListResponse.TotalNumber"));

		List<LogListItem> logList = new ArrayList<LogListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBinaryLogListResponse.LogList.Length"); i++) {
			LogListItem logListItem = new LogListItem();
			logListItem.setId(_ctx.longValue("DescribeBinaryLogListResponse.LogList["+ i +"].Id"));
			logListItem.setCreatedTime(_ctx.stringValue("DescribeBinaryLogListResponse.LogList["+ i +"].CreatedTime"));
			logListItem.setModifiedTime(_ctx.stringValue("DescribeBinaryLogListResponse.LogList["+ i +"].ModifiedTime"));
			logListItem.setFileName(_ctx.stringValue("DescribeBinaryLogListResponse.LogList["+ i +"].FileName"));
			logListItem.setUploadStatus(_ctx.integerValue("DescribeBinaryLogListResponse.LogList["+ i +"].UploadStatus"));
			logListItem.setPurgeStatus(_ctx.integerValue("DescribeBinaryLogListResponse.LogList["+ i +"].PurgeStatus"));
			logListItem.setUploadHost(_ctx.stringValue("DescribeBinaryLogListResponse.LogList["+ i +"].UploadHost"));
			logListItem.setBeginTime(_ctx.stringValue("DescribeBinaryLogListResponse.LogList["+ i +"].BeginTime"));
			logListItem.setEndTime(_ctx.stringValue("DescribeBinaryLogListResponse.LogList["+ i +"].EndTime"));
			logListItem.setLogSize(_ctx.longValue("DescribeBinaryLogListResponse.LogList["+ i +"].LogSize"));
			logListItem.setDownloadLink(_ctx.stringValue("DescribeBinaryLogListResponse.LogList["+ i +"].DownloadLink"));

			logList.add(logListItem);
		}
		describeBinaryLogListResponse.setLogList(logList);
	 
	 	return describeBinaryLogListResponse;
	}
}