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

import com.aliyuncs.drds.model.v20190123.DescribeTableShardingInfoResponse;
import com.aliyuncs.drds.model.v20190123.DescribeTableShardingInfoResponse.Data;
import com.aliyuncs.drds.model.v20190123.DescribeTableShardingInfoResponse.Data.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTableShardingInfoResponseUnmarshaller {

	public static DescribeTableShardingInfoResponse unmarshall(DescribeTableShardingInfoResponse describeTableShardingInfoResponse, UnmarshallerContext _ctx) {
		
		describeTableShardingInfoResponse.setRequestId(_ctx.stringValue("DescribeTableShardingInfoResponse.RequestId"));
		describeTableShardingInfoResponse.setSuccess(_ctx.booleanValue("DescribeTableShardingInfoResponse.Success"));

		Data data = new Data();
		data.setDbShardingFunction(_ctx.stringValue("DescribeTableShardingInfoResponse.Data.DbShardingFunction"));
		data.setDbRightShiftOffset(_ctx.integerValue("DescribeTableShardingInfoResponse.Data.DbRightShiftOffset"));
		data.setTbShardingFunction(_ctx.stringValue("DescribeTableShardingInfoResponse.Data.TbShardingFunction"));
		data.setTbRightShiftOffset(_ctx.integerValue("DescribeTableShardingInfoResponse.Data.TbRightShiftOffset"));
		data.setTbPartitions(_ctx.integerValue("DescribeTableShardingInfoResponse.Data.TbPartitions"));
		data.setIsShard(_ctx.booleanValue("DescribeTableShardingInfoResponse.Data.IsShard"));
		data.setTbComputeLength(_ctx.integerValue("DescribeTableShardingInfoResponse.Data.TbComputeLength"));
		data.setDbComputeLength(_ctx.integerValue("DescribeTableShardingInfoResponse.Data.DbComputeLength"));

		List<String> dbShardingColumnList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTableShardingInfoResponse.Data.DbShardingColumnList.Length"); i++) {
			dbShardingColumnList.add(_ctx.stringValue("DescribeTableShardingInfoResponse.Data.DbShardingColumnList["+ i +"]"));
		}
		data.setDbShardingColumnList(dbShardingColumnList);

		List<String> tbShardingColumnList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTableShardingInfoResponse.Data.TbShardingColumnList.Length"); i++) {
			tbShardingColumnList.add(_ctx.stringValue("DescribeTableShardingInfoResponse.Data.TbShardingColumnList["+ i +"]"));
		}
		data.setTbShardingColumnList(tbShardingColumnList);

		List<Column> columnList = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTableShardingInfoResponse.Data.ColumnList.Length"); i++) {
			Column column = new Column();
			column.setName(_ctx.stringValue("DescribeTableShardingInfoResponse.Data.ColumnList["+ i +"].Name"));
			column.setType(_ctx.stringValue("DescribeTableShardingInfoResponse.Data.ColumnList["+ i +"].Type"));

			columnList.add(column);
		}
		data.setColumnList(columnList);
		describeTableShardingInfoResponse.setData(data);
	 
	 	return describeTableShardingInfoResponse;
	}
}