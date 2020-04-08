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

import com.aliyuncs.cassandra.model.v20190101.DescribeParameterModificationHistoriesResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeParameterModificationHistoriesResponse.History;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterModificationHistoriesResponseUnmarshaller {

	public static DescribeParameterModificationHistoriesResponse unmarshall(DescribeParameterModificationHistoriesResponse describeParameterModificationHistoriesResponse, UnmarshallerContext _ctx) {
		
		describeParameterModificationHistoriesResponse.setRequestId(_ctx.stringValue("DescribeParameterModificationHistoriesResponse.RequestId"));
		describeParameterModificationHistoriesResponse.setPageNumber(_ctx.integerValue("DescribeParameterModificationHistoriesResponse.PageNumber"));
		describeParameterModificationHistoriesResponse.setPageSize(_ctx.integerValue("DescribeParameterModificationHistoriesResponse.PageSize"));
		describeParameterModificationHistoriesResponse.setTotalCount(_ctx.longValue("DescribeParameterModificationHistoriesResponse.TotalCount"));

		List<History> histories = new ArrayList<History>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParameterModificationHistoriesResponse.Histories.Length"); i++) {
			History history = new History();
			history.setName(_ctx.stringValue("DescribeParameterModificationHistoriesResponse.Histories["+ i +"].Name"));
			history.setOldValue(_ctx.stringValue("DescribeParameterModificationHistoriesResponse.Histories["+ i +"].OldValue"));
			history.setNewValue(_ctx.stringValue("DescribeParameterModificationHistoriesResponse.Histories["+ i +"].NewValue"));
			history.setTime(_ctx.longValue("DescribeParameterModificationHistoriesResponse.Histories["+ i +"].Time"));

			histories.add(history);
		}
		describeParameterModificationHistoriesResponse.setHistories(histories);
	 
	 	return describeParameterModificationHistoriesResponse;
	}
}