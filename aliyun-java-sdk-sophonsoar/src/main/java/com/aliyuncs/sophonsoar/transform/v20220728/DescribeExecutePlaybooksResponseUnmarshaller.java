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

package com.aliyuncs.sophonsoar.transform.v20220728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sophonsoar.model.v20220728.DescribeExecutePlaybooksResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeExecutePlaybooksResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExecutePlaybooksResponseUnmarshaller {

	public static DescribeExecutePlaybooksResponse unmarshall(DescribeExecutePlaybooksResponse describeExecutePlaybooksResponse, UnmarshallerContext _ctx) {
		
		describeExecutePlaybooksResponse.setRequestId(_ctx.stringValue("DescribeExecutePlaybooksResponse.RequestId"));

		List<Data> playbookMetrics = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExecutePlaybooksResponse.PlaybookMetrics.Length"); i++) {
			Data data = new Data();
			data.setDescription(_ctx.stringValue("DescribeExecutePlaybooksResponse.PlaybookMetrics["+ i +"].Description"));
			data.setActionType(_ctx.stringValue("DescribeExecutePlaybooksResponse.PlaybookMetrics["+ i +"].ActionType"));
			data.setDisplayName(_ctx.stringValue("DescribeExecutePlaybooksResponse.PlaybookMetrics["+ i +"].DisplayName"));
			data.setUuid(_ctx.stringValue("DescribeExecutePlaybooksResponse.PlaybookMetrics["+ i +"].Uuid"));
			data.setTaskConfig(_ctx.stringValue("DescribeExecutePlaybooksResponse.PlaybookMetrics["+ i +"].TaskConfig"));
			data.setParamConfig(_ctx.stringValue("DescribeExecutePlaybooksResponse.PlaybookMetrics["+ i +"].ParamConfig"));
			data.setCommandEntity(_ctx.stringValue("DescribeExecutePlaybooksResponse.PlaybookMetrics["+ i +"].CommandEntity"));
			data.setParamType(_ctx.stringValue("DescribeExecutePlaybooksResponse.PlaybookMetrics["+ i +"].ParamType"));

			playbookMetrics.add(data);
		}
		describeExecutePlaybooksResponse.setPlaybookMetrics(playbookMetrics);
	 
	 	return describeExecutePlaybooksResponse;
	}
}