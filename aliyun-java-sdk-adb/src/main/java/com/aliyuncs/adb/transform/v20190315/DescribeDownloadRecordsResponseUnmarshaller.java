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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeDownloadRecordsResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDownloadRecordsResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDownloadRecordsResponseUnmarshaller {

	public static DescribeDownloadRecordsResponse unmarshall(DescribeDownloadRecordsResponse describeDownloadRecordsResponse, UnmarshallerContext _ctx) {
		
		describeDownloadRecordsResponse.setRequestId(_ctx.stringValue("DescribeDownloadRecordsResponse.RequestId"));

		List<Items> records = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDownloadRecordsResponse.Records.Length"); i++) {
			Items items = new Items();
			items.setStatus(_ctx.stringValue("DescribeDownloadRecordsResponse.Records["+ i +"].Status"));
			items.setDownloadId(_ctx.longValue("DescribeDownloadRecordsResponse.Records["+ i +"].DownloadId"));
			items.setExceptionMsg(_ctx.stringValue("DescribeDownloadRecordsResponse.Records["+ i +"].ExceptionMsg"));
			items.setUrl(_ctx.stringValue("DescribeDownloadRecordsResponse.Records["+ i +"].Url"));
			items.setFileName(_ctx.stringValue("DescribeDownloadRecordsResponse.Records["+ i +"].FileName"));

			records.add(items);
		}
		describeDownloadRecordsResponse.setRecords(records);
	 
	 	return describeDownloadRecordsResponse;
	}
}