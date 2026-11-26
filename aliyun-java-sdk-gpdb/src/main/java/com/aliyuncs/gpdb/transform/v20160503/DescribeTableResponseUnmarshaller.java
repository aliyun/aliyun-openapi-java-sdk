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

import com.aliyuncs.gpdb.model.v20160503.DescribeTableResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeTableResponse.ColumnListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTableResponseUnmarshaller {

	public static DescribeTableResponse unmarshall(DescribeTableResponse describeTableResponse, UnmarshallerContext _ctx) {
		
		describeTableResponse.setRequestId(_ctx.stringValue("DescribeTableResponse.RequestId"));
		describeTableResponse.setStatus(_ctx.stringValue("DescribeTableResponse.Status"));
		describeTableResponse.setMessage(_ctx.stringValue("DescribeTableResponse.Message"));

		List<ColumnListItem> columnList = new ArrayList<ColumnListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTableResponse.ColumnList.Length"); i++) {
			ColumnListItem columnListItem = new ColumnListItem();
			columnListItem.setComment(_ctx.stringValue("DescribeTableResponse.ColumnList["+ i +"].Comment"));
			columnListItem.setColumnDefault(_ctx.stringValue("DescribeTableResponse.ColumnList["+ i +"].ColumnDefault"));
			columnListItem.setScale(_ctx.integerValue("DescribeTableResponse.ColumnList["+ i +"].Scale"));
			columnListItem.setMaxLength(_ctx.integerValue("DescribeTableResponse.ColumnList["+ i +"].MaxLength"));
			columnListItem.setUdtName(_ctx.stringValue("DescribeTableResponse.ColumnList["+ i +"].UdtName"));
			columnListItem.setIsCaseSensitive(_ctx.booleanValue("DescribeTableResponse.ColumnList["+ i +"].IsCaseSensitive"));
			columnListItem.setIsCurrency(_ctx.booleanValue("DescribeTableResponse.ColumnList["+ i +"].IsCurrency"));
			columnListItem.setName(_ctx.stringValue("DescribeTableResponse.ColumnList["+ i +"].Name"));
			columnListItem.setTableName(_ctx.stringValue("DescribeTableResponse.ColumnList["+ i +"].TableName"));
			columnListItem.setPrecision(_ctx.integerValue("DescribeTableResponse.ColumnList["+ i +"].Precision"));
			columnListItem.setDataType(_ctx.stringValue("DescribeTableResponse.ColumnList["+ i +"].DataType"));
			columnListItem.setIsSigned(_ctx.booleanValue("DescribeTableResponse.ColumnList["+ i +"].IsSigned"));
			columnListItem.setNullable(_ctx.booleanValue("DescribeTableResponse.ColumnList["+ i +"].Nullable"));
			columnListItem.setSchemaName(_ctx.stringValue("DescribeTableResponse.ColumnList["+ i +"].SchemaName"));
			columnListItem.setIsPrimaryKey(_ctx.booleanValue("DescribeTableResponse.ColumnList["+ i +"].IsPrimaryKey"));

			columnList.add(columnListItem);
		}
		describeTableResponse.setColumnList(columnList);
	 
	 	return describeTableResponse;
	}
}