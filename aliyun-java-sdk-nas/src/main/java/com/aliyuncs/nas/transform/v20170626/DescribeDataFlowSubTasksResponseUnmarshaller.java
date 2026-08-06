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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeDataFlowSubTasksResponse;
import com.aliyuncs.nas.model.v20170626.DescribeDataFlowSubTasksResponse.DataFlowSubTaskItem;
import com.aliyuncs.nas.model.v20170626.DescribeDataFlowSubTasksResponse.DataFlowSubTaskItem.FileDetail;
import com.aliyuncs.nas.model.v20170626.DescribeDataFlowSubTasksResponse.DataFlowSubTaskItem.ProgressStats;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataFlowSubTasksResponseUnmarshaller {

	public static DescribeDataFlowSubTasksResponse unmarshall(DescribeDataFlowSubTasksResponse describeDataFlowSubTasksResponse, UnmarshallerContext _ctx) {
		
		describeDataFlowSubTasksResponse.setRequestId(_ctx.stringValue("DescribeDataFlowSubTasksResponse.RequestId"));
		describeDataFlowSubTasksResponse.setNextToken(_ctx.stringValue("DescribeDataFlowSubTasksResponse.NextToken"));

		List<DataFlowSubTaskItem> dataFlowSubTask = new ArrayList<DataFlowSubTaskItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask.Length"); i++) {
			DataFlowSubTaskItem dataFlowSubTaskItem = new DataFlowSubTaskItem();
			dataFlowSubTaskItem.setStatus(_ctx.stringValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].Status"));
			dataFlowSubTaskItem.setProgress(_ctx.integerValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].Progress"));
			dataFlowSubTaskItem.setDataFlowSubTaskId(_ctx.stringValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].DataFlowSubTaskId"));
			dataFlowSubTaskItem.setEndTime(_ctx.stringValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].EndTime"));
			dataFlowSubTaskItem.setDstFilePath(_ctx.stringValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].DstFilePath"));
			dataFlowSubTaskItem.setCreateTime(_ctx.stringValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].CreateTime"));
			dataFlowSubTaskItem.setStartTime(_ctx.stringValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].StartTime"));
			dataFlowSubTaskItem.setErrorMsg(_ctx.stringValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].ErrorMsg"));
			dataFlowSubTaskItem.setDataFlowTaskId(_ctx.stringValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].DataFlowTaskId"));
			dataFlowSubTaskItem.setSrcFilePath(_ctx.stringValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].SrcFilePath"));
			dataFlowSubTaskItem.setFileSystemId(_ctx.stringValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].FileSystemId"));
			dataFlowSubTaskItem.setDataFlowId(_ctx.stringValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].DataFlowId"));

			FileDetail fileDetail = new FileDetail();
			fileDetail.setModifyTime(_ctx.longValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].FileDetail.ModifyTime"));
			fileDetail.setSize(_ctx.longValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].FileDetail.Size"));
			fileDetail.setChecksum(_ctx.stringValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].FileDetail.Checksum"));
			dataFlowSubTaskItem.setFileDetail(fileDetail);

			ProgressStats progressStats = new ProgressStats();
			progressStats.setAverageSpeed(_ctx.longValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].ProgressStats.AverageSpeed"));
			progressStats.setBytesDone(_ctx.longValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].ProgressStats.BytesDone"));
			progressStats.setActualBytes(_ctx.longValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].ProgressStats.ActualBytes"));
			progressStats.setBytesTotal(_ctx.longValue("DescribeDataFlowSubTasksResponse.DataFlowSubTask["+ i +"].ProgressStats.BytesTotal"));
			dataFlowSubTaskItem.setProgressStats(progressStats);

			dataFlowSubTask.add(dataFlowSubTaskItem);
		}
		describeDataFlowSubTasksResponse.setDataFlowSubTask(dataFlowSubTask);
	 
	 	return describeDataFlowSubTasksResponse;
	}
}