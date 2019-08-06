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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeTableResponse;
import com.aliyuncs.drds.model.v20190123.DescribeTableResponse.Data;
import com.aliyuncs.drds.model.v20190123.DescribeTableResponse.Data.ColumnInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTableResponseUnmarshaller {

	public static DescribeTableResponse unmarshall(DescribeTableResponse describeTableResponse, UnmarshallerContext _ctx) {
		
		describeTableResponse.setRequestId(_ctx.stringValue("DescribeTableResponse.RequestId"));
		describeTableResponse.setSuccess(_ctx.booleanValue("DescribeTableResponse.Success"));

		Data data = new Data();

		List<ColumnInfo> list = new ArrayList<ColumnInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTableResponse.Data.List.Length"); i++) {
			ColumnInfo columnInfo = new ColumnInfo();
			columnInfo.setColumnName(_ctx.stringValue("DescribeTableResponse.Data.List["+ i +"].ColumnName"));
			columnInfo.setColumnType(_ctx.stringValue("DescribeTableResponse.Data.List["+ i +"].ColumnType"));
			columnInfo.setExtra(_ctx.stringValue("DescribeTableResponse.Data.List["+ i +"].Extra"));
			columnInfo.setIndex(_ctx.stringValue("DescribeTableResponse.Data.List["+ i +"].Index"));
			columnInfo.setIsAllowNull(_ctx.stringValue("DescribeTableResponse.Data.List["+ i +"].IsAllowNull"));
			columnInfo.setIsPk(_ctx.stringValue("DescribeTableResponse.Data.List["+ i +"].IsPk"));

			list.add(columnInfo);
		}
		data.setList(list);
		describeTableResponse.setData(data);
	 
	 	return describeTableResponse;
	}
}