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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeDownloadSQLLogsResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDownloadSQLLogsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDownloadSQLLogsResponseUnmarshaller {

	public static DescribeDownloadSQLLogsResponse unmarshall(DescribeDownloadSQLLogsResponse describeDownloadSQLLogsResponse, UnmarshallerContext _ctx) {
		
		describeDownloadSQLLogsResponse.setRequestId(_ctx.stringValue("DescribeDownloadSQLLogsResponse.RequestId"));

		List<Item> records = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDownloadSQLLogsResponse.Records.Length"); i++) {
			Item item = new Item();
			item.setDownloadId(_ctx.longValue("DescribeDownloadSQLLogsResponse.Records["+ i +"].DownloadId"));
			item.setExceptionMsg(_ctx.stringValue("DescribeDownloadSQLLogsResponse.Records["+ i +"].ExceptionMsg"));
			item.setFileName(_ctx.stringValue("DescribeDownloadSQLLogsResponse.Records["+ i +"].FileName"));
			item.setStatus(_ctx.stringValue("DescribeDownloadSQLLogsResponse.Records["+ i +"].Status"));
			item.setDownloadUrl(_ctx.stringValue("DescribeDownloadSQLLogsResponse.Records["+ i +"].DownloadUrl"));

			records.add(item);
		}
		describeDownloadSQLLogsResponse.setRecords(records);
	 
	 	return describeDownloadSQLLogsResponse;
	}
}