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

import com.aliyuncs.polardbx.model.v20200202.DescribeArchiveTableListResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeArchiveTableListResponse.Data;
import com.aliyuncs.polardbx.model.v20200202.DescribeArchiveTableListResponse.Data.ArchiveTable;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeArchiveTableListResponseUnmarshaller {

	public static DescribeArchiveTableListResponse unmarshall(DescribeArchiveTableListResponse describeArchiveTableListResponse, UnmarshallerContext _ctx) {
		
		describeArchiveTableListResponse.setRequestId(_ctx.stringValue("DescribeArchiveTableListResponse.RequestId"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("DescribeArchiveTableListResponse.Data.Total"));
		data.setPageIndex(_ctx.longValue("DescribeArchiveTableListResponse.Data.PageIndex"));
		data.setPageSize(_ctx.longValue("DescribeArchiveTableListResponse.Data.PageSize"));
		data.setTobeArchivedConut(_ctx.integerValue("DescribeArchiveTableListResponse.Data.TobeArchivedConut"));
		data.setRunningCount(_ctx.integerValue("DescribeArchiveTableListResponse.Data.RunningCount"));
		data.setSuccessCount(_ctx.integerValue("DescribeArchiveTableListResponse.Data.SuccessCount"));
		data.setPausedCount(_ctx.integerValue("DescribeArchiveTableListResponse.Data.PausedCount"));

		List<ArchiveTable> tables = new ArrayList<ArchiveTable>();
		for (int i = 0; i < _ctx.lengthValue("DescribeArchiveTableListResponse.Data.Tables.Length"); i++) {
			ArchiveTable archiveTable = new ArchiveTable();
			archiveTable.setSchemaName(_ctx.stringValue("DescribeArchiveTableListResponse.Data.Tables["+ i +"].SchemaName"));
			archiveTable.setTableName(_ctx.stringValue("DescribeArchiveTableListResponse.Data.Tables["+ i +"].TableName"));
			archiveTable.setCreatedDate(_ctx.longValue("DescribeArchiveTableListResponse.Data.Tables["+ i +"].CreatedDate"));
			archiveTable.setSpaceSize(_ctx.doubleValue("DescribeArchiveTableListResponse.Data.Tables["+ i +"].SpaceSize"));
			archiveTable.setFileCount(_ctx.integerValue("DescribeArchiveTableListResponse.Data.Tables["+ i +"].FileCount"));
			archiveTable.setLastSuccessArchiveTime(_ctx.longValue("DescribeArchiveTableListResponse.Data.Tables["+ i +"].LastSuccessArchiveTime"));
			archiveTable.setArchiveStatus(_ctx.stringValue("DescribeArchiveTableListResponse.Data.Tables["+ i +"].ArchiveStatus"));

			tables.add(archiveTable);
		}
		data.setTables(tables);
		describeArchiveTableListResponse.setData(data);
	 
	 	return describeArchiveTableListResponse;
	}
}