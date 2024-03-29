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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeUserUsageDataExportTaskResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeUserUsageDataExportTaskResponse.UsageDataPerPage;
import com.aliyuncs.cdn.model.v20180510.DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.DataItem;
import com.aliyuncs.cdn.model.v20180510.DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.DataItem.TaskConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserUsageDataExportTaskResponseUnmarshaller {

	public static DescribeUserUsageDataExportTaskResponse unmarshall(DescribeUserUsageDataExportTaskResponse describeUserUsageDataExportTaskResponse, UnmarshallerContext _ctx) {
		
		describeUserUsageDataExportTaskResponse.setRequestId(_ctx.stringValue("DescribeUserUsageDataExportTaskResponse.RequestId"));

		UsageDataPerPage usageDataPerPage = new UsageDataPerPage();
		usageDataPerPage.setPageSize(_ctx.integerValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.PageSize"));
		usageDataPerPage.setPageNumber(_ctx.integerValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.PageNumber"));
		usageDataPerPage.setTotalCount(_ctx.integerValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatus(_ctx.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].Status"));
			dataItem.setUpdateTime(_ctx.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].UpdateTime"));
			dataItem.setDownloadUrl(_ctx.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].DownloadUrl"));
			dataItem.setCreateTime(_ctx.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].CreateTime"));
			dataItem.setTaskName(_ctx.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].TaskName"));
			dataItem.setTaskId(_ctx.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].TaskId"));

			TaskConfig taskConfig = new TaskConfig();
			taskConfig.setEndTime(_ctx.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].TaskConfig.EndTime"));
			taskConfig.setStartTime(_ctx.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].TaskConfig.StartTime"));
			dataItem.setTaskConfig(taskConfig);

			data.add(dataItem);
		}
		usageDataPerPage.setData(data);
		describeUserUsageDataExportTaskResponse.setUsageDataPerPage(usageDataPerPage);
	 
	 	return describeUserUsageDataExportTaskResponse;
	}
}