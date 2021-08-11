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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.ListDeviceRecordsResponse;
import com.aliyuncs.vs.model.v20181212.ListDeviceRecordsResponse.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceRecordsResponseUnmarshaller {

	public static ListDeviceRecordsResponse unmarshall(ListDeviceRecordsResponse listDeviceRecordsResponse, UnmarshallerContext _ctx) {
		
		listDeviceRecordsResponse.setRequestId(_ctx.stringValue("ListDeviceRecordsResponse.RequestId"));
		listDeviceRecordsResponse.setPageSize(_ctx.longValue("ListDeviceRecordsResponse.PageSize"));
		listDeviceRecordsResponse.setPageNum(_ctx.longValue("ListDeviceRecordsResponse.PageNum"));
		listDeviceRecordsResponse.setPageCount(_ctx.longValue("ListDeviceRecordsResponse.PageCount"));
		listDeviceRecordsResponse.setTotalCount(_ctx.longValue("ListDeviceRecordsResponse.TotalCount"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceRecordsResponse.Records.Length"); i++) {
			Record record = new Record();
			record.setFilename(_ctx.stringValue("ListDeviceRecordsResponse.Records["+ i +"].Filename"));
			record.setStartTime(_ctx.stringValue("ListDeviceRecordsResponse.Records["+ i +"].StartTime"));
			record.setEndTime(_ctx.stringValue("ListDeviceRecordsResponse.Records["+ i +"].EndTime"));
			record.setRecordType(_ctx.stringValue("ListDeviceRecordsResponse.Records["+ i +"].RecordType"));
			record.setFileSize(_ctx.longValue("ListDeviceRecordsResponse.Records["+ i +"].FileSize"));

			records.add(record);
		}
		listDeviceRecordsResponse.setRecords(records);
	 
	 	return listDeviceRecordsResponse;
	}
}