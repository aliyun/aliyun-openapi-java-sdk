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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.ListOperationRecordsResponse;
import com.aliyuncs.pts.model.v20190810.ListOperationRecordsResponse.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOperationRecordsResponseUnmarshaller {

	public static ListOperationRecordsResponse unmarshall(ListOperationRecordsResponse listOperationRecordsResponse, UnmarshallerContext _ctx) {
		
		listOperationRecordsResponse.setRequestId(_ctx.stringValue("ListOperationRecordsResponse.RequestId"));
		listOperationRecordsResponse.setSuccess(_ctx.booleanValue("ListOperationRecordsResponse.Success"));
		listOperationRecordsResponse.setCode(_ctx.stringValue("ListOperationRecordsResponse.Code"));
		listOperationRecordsResponse.setMessage(_ctx.stringValue("ListOperationRecordsResponse.Message"));
		listOperationRecordsResponse.setHttpStatusCode(_ctx.integerValue("ListOperationRecordsResponse.HttpStatusCode"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ListOperationRecordsResponse.Records.Length"); i++) {
			Record record = new Record();
			record.setContent(_ctx.stringValue("ListOperationRecordsResponse.Records["+ i +"].Content"));
			record.setOperator(_ctx.stringValue("ListOperationRecordsResponse.Records["+ i +"].Operator"));
			record.setType(_ctx.stringValue("ListOperationRecordsResponse.Records["+ i +"].Type"));
			record.setCreateTime(_ctx.longValue("ListOperationRecordsResponse.Records["+ i +"].CreateTime"));

			records.add(record);
		}
		listOperationRecordsResponse.setRecords(records);
	 
	 	return listOperationRecordsResponse;
	}
}