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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeDataMaskingRunHistoryResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDataMaskingRunHistoryResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataMaskingRunHistoryResponseUnmarshaller {

	public static DescribeDataMaskingRunHistoryResponse unmarshall(DescribeDataMaskingRunHistoryResponse describeDataMaskingRunHistoryResponse, UnmarshallerContext _ctx) {
		
		describeDataMaskingRunHistoryResponse.setRequestId(_ctx.stringValue("DescribeDataMaskingRunHistoryResponse.RequestId"));
		describeDataMaskingRunHistoryResponse.setPageSize(_ctx.integerValue("DescribeDataMaskingRunHistoryResponse.PageSize"));
		describeDataMaskingRunHistoryResponse.setCurrentPage(_ctx.integerValue("DescribeDataMaskingRunHistoryResponse.CurrentPage"));
		describeDataMaskingRunHistoryResponse.setTotalCount(_ctx.integerValue("DescribeDataMaskingRunHistoryResponse.TotalCount"));

		List<Task> items = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataMaskingRunHistoryResponse.Items.Length"); i++) {
			Task task = new Task();
			task.setId(_ctx.longValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].Id"));
			task.setTaskId(_ctx.stringValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].TaskId"));
			task.setStartTime(_ctx.longValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].StartTime"));
			task.setRunIndex(_ctx.integerValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].RunIndex"));
			task.setType(_ctx.integerValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].Type"));
			task.setDstType(_ctx.integerValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].DstType"));
			task.setPercentage(_ctx.integerValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].Percentage"));
			task.setSrcType(_ctx.integerValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].SrcType"));
			task.setMaskingCount(_ctx.longValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].MaskingCount"));
			task.setConflictCount(_ctx.longValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].ConflictCount"));
			task.setStatus(_ctx.integerValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].Status"));
			task.setFailCode(_ctx.stringValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].FailCode"));
			task.setDstTypeCode(_ctx.stringValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].DstTypeCode"));
			task.setSrcTypeCode(_ctx.stringValue("DescribeDataMaskingRunHistoryResponse.Items["+ i +"].SrcTypeCode"));

			items.add(task);
		}
		describeDataMaskingRunHistoryResponse.setItems(items);
	 
	 	return describeDataMaskingRunHistoryResponse;
	}
}