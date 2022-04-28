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

import com.aliyuncs.vcs.model.v20200515.DescribeSearchTablesResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeSearchTablesResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeSearchTablesResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSearchTablesResponseUnmarshaller {

	public static DescribeSearchTablesResponse unmarshall(DescribeSearchTablesResponse describeSearchTablesResponse, UnmarshallerContext _ctx) {
		
		describeSearchTablesResponse.setRequestId(_ctx.stringValue("DescribeSearchTablesResponse.RequestId"));
		describeSearchTablesResponse.setSuccess(_ctx.stringValue("DescribeSearchTablesResponse.Success"));
		describeSearchTablesResponse.setCode(_ctx.stringValue("DescribeSearchTablesResponse.Code"));
		describeSearchTablesResponse.setMessage(_ctx.stringValue("DescribeSearchTablesResponse.Message"));

		Data data = new Data();
		data.setPageSize(_ctx.longValue("DescribeSearchTablesResponse.Data.PageSize"));
		data.setPageNumbei(_ctx.longValue("DescribeSearchTablesResponse.Data.PageNumbei"));
		data.setTotalCount(_ctx.longValue("DescribeSearchTablesResponse.Data.TotalCount"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSearchTablesResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setSearchTableId(_ctx.stringValue("DescribeSearchTablesResponse.Data.Records["+ i +"].SearchTableId"));
			record.setSearchTableName(_ctx.stringValue("DescribeSearchTablesResponse.Data.Records["+ i +"].SearchTableName"));
			record.setTargetType(_ctx.stringValue("DescribeSearchTablesResponse.Data.Records["+ i +"].TargetType"));
			record.setAlgorithmId(_ctx.stringValue("DescribeSearchTablesResponse.Data.Records["+ i +"].AlgorithmId"));

			records.add(record);
		}
		data.setRecords(records);
		describeSearchTablesResponse.setData(data);
	 
	 	return describeSearchTablesResponse;
	}
}