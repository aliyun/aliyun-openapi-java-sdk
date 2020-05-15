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

package com.aliyuncs.cassandra.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cassandra.model.v20190101.DescribeNodeToolExecutionHistoriesResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeNodeToolExecutionHistoriesResponse.History;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNodeToolExecutionHistoriesResponseUnmarshaller {

	public static DescribeNodeToolExecutionHistoriesResponse unmarshall(DescribeNodeToolExecutionHistoriesResponse describeNodeToolExecutionHistoriesResponse, UnmarshallerContext _ctx) {
		
		describeNodeToolExecutionHistoriesResponse.setRequestId(_ctx.stringValue("DescribeNodeToolExecutionHistoriesResponse.RequestId"));
		describeNodeToolExecutionHistoriesResponse.setPageNumber(_ctx.integerValue("DescribeNodeToolExecutionHistoriesResponse.PageNumber"));
		describeNodeToolExecutionHistoriesResponse.setPageSize(_ctx.integerValue("DescribeNodeToolExecutionHistoriesResponse.PageSize"));
		describeNodeToolExecutionHistoriesResponse.setTotalCount(_ctx.longValue("DescribeNodeToolExecutionHistoriesResponse.TotalCount"));

		List<History> histories = new ArrayList<History>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNodeToolExecutionHistoriesResponse.Histories.Length"); i++) {
			History history = new History();
			history.setJobId(_ctx.stringValue("DescribeNodeToolExecutionHistoriesResponse.Histories["+ i +"].JobId"));
			history.setCommand(_ctx.stringValue("DescribeNodeToolExecutionHistoriesResponse.Histories["+ i +"].Command"));
			history.setNodes(_ctx.stringValue("DescribeNodeToolExecutionHistoriesResponse.Histories["+ i +"].Nodes"));
			history.setModifyTime(_ctx.longValue("DescribeNodeToolExecutionHistoriesResponse.Histories["+ i +"].ModifyTime"));
			history.setCreateTime(_ctx.longValue("DescribeNodeToolExecutionHistoriesResponse.Histories["+ i +"].CreateTime"));
			history.setRegionId(_ctx.stringValue("DescribeNodeToolExecutionHistoriesResponse.Histories["+ i +"].RegionId"));
			history.setIsEnded(_ctx.booleanValue("DescribeNodeToolExecutionHistoriesResponse.Histories["+ i +"].IsEnded"));
			history.setArguments(_ctx.stringValue("DescribeNodeToolExecutionHistoriesResponse.Histories["+ i +"].Arguments"));
			history.setErrorMessage(_ctx.stringValue("DescribeNodeToolExecutionHistoriesResponse.Histories["+ i +"].ErrorMessage"));
			history.setDataCenterId(_ctx.stringValue("DescribeNodeToolExecutionHistoriesResponse.Histories["+ i +"].DataCenterId"));

			histories.add(history);
		}
		describeNodeToolExecutionHistoriesResponse.setHistories(histories);
	 
	 	return describeNodeToolExecutionHistoriesResponse;
	}
}