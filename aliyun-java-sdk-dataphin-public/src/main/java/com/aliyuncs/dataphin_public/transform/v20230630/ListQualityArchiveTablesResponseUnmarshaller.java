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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListQualityArchiveTablesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityArchiveTablesResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityArchiveTablesResponse.Data.ArchiveTable;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQualityArchiveTablesResponseUnmarshaller {

	public static ListQualityArchiveTablesResponse unmarshall(ListQualityArchiveTablesResponse listQualityArchiveTablesResponse, UnmarshallerContext _ctx) {
		
		listQualityArchiveTablesResponse.setRequestId(_ctx.stringValue("ListQualityArchiveTablesResponse.RequestId"));
		listQualityArchiveTablesResponse.setMessage(_ctx.stringValue("ListQualityArchiveTablesResponse.Message"));
		listQualityArchiveTablesResponse.setHttpStatusCode(_ctx.integerValue("ListQualityArchiveTablesResponse.HttpStatusCode"));
		listQualityArchiveTablesResponse.setCode(_ctx.stringValue("ListQualityArchiveTablesResponse.Code"));
		listQualityArchiveTablesResponse.setSuccess(_ctx.booleanValue("ListQualityArchiveTablesResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListQualityArchiveTablesResponse.Data.TotalCount"));

		List<ArchiveTable> archiveTableList = new ArrayList<ArchiveTable>();
		for (int i = 0; i < _ctx.lengthValue("ListQualityArchiveTablesResponse.Data.ArchiveTableList.Length"); i++) {
			ArchiveTable archiveTable = new ArchiveTable();
			archiveTable.setArchiveTableName(_ctx.stringValue("ListQualityArchiveTablesResponse.Data.ArchiveTableList["+ i +"].ArchiveTableName"));
			archiveTable.setIsDefault(_ctx.booleanValue("ListQualityArchiveTablesResponse.Data.ArchiveTableList["+ i +"].IsDefault"));
			archiveTable.setMaxArchiveCount(_ctx.longValue("ListQualityArchiveTablesResponse.Data.ArchiveTableList["+ i +"].MaxArchiveCount"));
			archiveTable.setLifecycle(_ctx.integerValue("ListQualityArchiveTablesResponse.Data.ArchiveTableList["+ i +"].Lifecycle"));
			archiveTable.setArchiveTableId(_ctx.longValue("ListQualityArchiveTablesResponse.Data.ArchiveTableList["+ i +"].ArchiveTableId"));
			archiveTable.setDdl(_ctx.stringValue("ListQualityArchiveTablesResponse.Data.ArchiveTableList["+ i +"].Ddl"));

			archiveTableList.add(archiveTable);
		}
		data.setArchiveTableList(archiveTableList);
		listQualityArchiveTablesResponse.setData(data);
	 
	 	return listQualityArchiveTablesResponse;
	}
}