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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListCorpsResponse;
import com.aliyuncs.vcs.model.v20200515.ListCorpsResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListCorpsResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCorpsResponseUnmarshaller {

	public static ListCorpsResponse unmarshall(ListCorpsResponse listCorpsResponse, UnmarshallerContext _ctx) {
		
		listCorpsResponse.setRequestId(_ctx.stringValue("ListCorpsResponse.RequestId"));
		listCorpsResponse.setCode(_ctx.stringValue("ListCorpsResponse.Code"));
		listCorpsResponse.setMessage(_ctx.stringValue("ListCorpsResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListCorpsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListCorpsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListCorpsResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("ListCorpsResponse.Data.TotalPage"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ListCorpsResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setCorpId(_ctx.stringValue("ListCorpsResponse.Data.Records["+ i +"].CorpId"));
			record.setCorpName(_ctx.stringValue("ListCorpsResponse.Data.Records["+ i +"].CorpName"));
			record.setDescription(_ctx.stringValue("ListCorpsResponse.Data.Records["+ i +"].Description"));
			record.setCreateDate(_ctx.stringValue("ListCorpsResponse.Data.Records["+ i +"].CreateDate"));
			record.setParentCorpId(_ctx.stringValue("ListCorpsResponse.Data.Records["+ i +"].ParentCorpId"));
			record.setAppName(_ctx.stringValue("ListCorpsResponse.Data.Records["+ i +"].AppName"));
			record.setDeviceCount(_ctx.integerValue("ListCorpsResponse.Data.Records["+ i +"].DeviceCount"));
			record.setIsvSubId(_ctx.stringValue("ListCorpsResponse.Data.Records["+ i +"].IsvSubId"));

			records.add(record);
		}
		data.setRecords(records);
		listCorpsResponse.setData(data);
	 
	 	return listCorpsResponse;
	}
}