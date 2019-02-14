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

	public static DescribeUserUsageDataExportTaskResponse unmarshall(DescribeUserUsageDataExportTaskResponse describeUserUsageDataExportTaskResponse, UnmarshallerContext context) {
		
		describeUserUsageDataExportTaskResponse.setRequestId(context.stringValue("DescribeUserUsageDataExportTaskResponse.RequestId"));

		UsageDataPerPage usageDataPerPage = new UsageDataPerPage();
		usageDataPerPage.setTotalCount(context.integerValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.TotalCount"));
		usageDataPerPage.setPageSize(context.integerValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.PageSize"));
		usageDataPerPage.setPageNumber(context.integerValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.PageNumber"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTaskName(context.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].TaskName"));
			dataItem.setTaskId(context.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].TaskId"));
			dataItem.setCreateTime(context.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].CreateTime"));
			dataItem.setUpdateTime(context.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].UpdateTime"));
			dataItem.setStatus(context.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].Status"));
			dataItem.setDownloadUrl(context.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].DownloadUrl"));

			TaskConfig taskConfig = new TaskConfig();
			taskConfig.setStartTime(context.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].TaskConfig.StartTime"));
			taskConfig.setEndTime(context.stringValue("DescribeUserUsageDataExportTaskResponse.UsageDataPerPage.Data["+ i +"].TaskConfig.EndTime"));
			dataItem.setTaskConfig(taskConfig);

			data.add(dataItem);
		}
		usageDataPerPage.setData(data);
		describeUserUsageDataExportTaskResponse.setUsageDataPerPage(usageDataPerPage);
	 
	 	return describeUserUsageDataExportTaskResponse;
	}
}