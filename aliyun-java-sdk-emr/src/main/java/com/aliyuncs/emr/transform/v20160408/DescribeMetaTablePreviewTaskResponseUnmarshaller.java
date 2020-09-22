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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeMetaTablePreviewTaskResponse;
import com.aliyuncs.emr.model.v20160408.DescribeMetaTablePreviewTaskResponse.Data;
import com.aliyuncs.emr.model.v20160408.DescribeMetaTablePreviewTaskResponse.Data.Row;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetaTablePreviewTaskResponseUnmarshaller {

	public static DescribeMetaTablePreviewTaskResponse unmarshall(DescribeMetaTablePreviewTaskResponse describeMetaTablePreviewTaskResponse, UnmarshallerContext _ctx) {
		
		describeMetaTablePreviewTaskResponse.setRequestId(_ctx.stringValue("DescribeMetaTablePreviewTaskResponse.RequestId"));
		describeMetaTablePreviewTaskResponse.setTaskId(_ctx.stringValue("DescribeMetaTablePreviewTaskResponse.TaskId"));
		describeMetaTablePreviewTaskResponse.setTaskStatus(_ctx.stringValue("DescribeMetaTablePreviewTaskResponse.TaskStatus"));
		describeMetaTablePreviewTaskResponse.setStartTime(_ctx.longValue("DescribeMetaTablePreviewTaskResponse.StartTime"));
		describeMetaTablePreviewTaskResponse.setEndTime(_ctx.longValue("DescribeMetaTablePreviewTaskResponse.EndTime"));
		describeMetaTablePreviewTaskResponse.setExecuteTime(_ctx.longValue("DescribeMetaTablePreviewTaskResponse.ExecuteTime"));
		describeMetaTablePreviewTaskResponse.setTaskProcess(_ctx.integerValue("DescribeMetaTablePreviewTaskResponse.TaskProcess"));

		Data data = new Data();

		List<String> headers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMetaTablePreviewTaskResponse.Data.Headers.Length"); i++) {
			headers.add(_ctx.stringValue("DescribeMetaTablePreviewTaskResponse.Data.Headers["+ i +"]"));
		}
		data.setHeaders(headers);

		List<Row> rows = new ArrayList<Row>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMetaTablePreviewTaskResponse.Data.Rows.Length"); i++) {
			Row row = new Row();

			List<String> columns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMetaTablePreviewTaskResponse.Data.Rows["+ i +"].Columns.Length"); j++) {
				columns.add(_ctx.stringValue("DescribeMetaTablePreviewTaskResponse.Data.Rows["+ i +"].Columns["+ j +"]"));
			}
			row.setColumns(columns);

			rows.add(row);
		}
		data.setRows(rows);
		describeMetaTablePreviewTaskResponse.setData(data);
	 
	 	return describeMetaTablePreviewTaskResponse;
	}
}