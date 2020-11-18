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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeRecordTasksResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRecordTasksResponse.RecordTask;
import com.aliyuncs.rtc.model.v20180111.DescribeRecordTasksResponse.RecordTask.UserPanesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordTasksResponseUnmarshaller {

	public static DescribeRecordTasksResponse unmarshall(DescribeRecordTasksResponse describeRecordTasksResponse, UnmarshallerContext _ctx) {
		
		describeRecordTasksResponse.setRequestId(_ctx.stringValue("DescribeRecordTasksResponse.RequestId"));
		describeRecordTasksResponse.setTotalNum(_ctx.longValue("DescribeRecordTasksResponse.TotalNum"));
		describeRecordTasksResponse.setTotalPage(_ctx.longValue("DescribeRecordTasksResponse.TotalPage"));

		List<RecordTask> recordTasks = new ArrayList<RecordTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordTasksResponse.RecordTasks.Length"); i++) {
			RecordTask recordTask = new RecordTask();
			recordTask.setCreateTime(_ctx.stringValue("DescribeRecordTasksResponse.RecordTasks["+ i +"].CreateTime"));
			recordTask.setAppId(_ctx.stringValue("DescribeRecordTasksResponse.RecordTasks["+ i +"].AppId"));
			recordTask.setChannelId(_ctx.stringValue("DescribeRecordTasksResponse.RecordTasks["+ i +"].ChannelId"));
			recordTask.setTaskId(_ctx.stringValue("DescribeRecordTasksResponse.RecordTasks["+ i +"].TaskId"));
			recordTask.setTemplateId(_ctx.stringValue("DescribeRecordTasksResponse.RecordTasks["+ i +"].TemplateId"));
			recordTask.setStatus(_ctx.integerValue("DescribeRecordTasksResponse.RecordTasks["+ i +"].Status"));

			List<String> subSpecUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRecordTasksResponse.RecordTasks["+ i +"].SubSpecUsers.Length"); j++) {
				subSpecUsers.add(_ctx.stringValue("DescribeRecordTasksResponse.RecordTasks["+ i +"].SubSpecUsers["+ j +"]"));
			}
			recordTask.setSubSpecUsers(subSpecUsers);

			List<UserPanesItem> userPanes = new ArrayList<UserPanesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRecordTasksResponse.RecordTasks["+ i +"].UserPanes.Length"); j++) {
				UserPanesItem userPanesItem = new UserPanesItem();
				userPanesItem.setPaneId(_ctx.integerValue("DescribeRecordTasksResponse.RecordTasks["+ i +"].UserPanes["+ j +"].PaneId"));
				userPanesItem.setUserId(_ctx.stringValue("DescribeRecordTasksResponse.RecordTasks["+ i +"].UserPanes["+ j +"].UserId"));
				userPanesItem.setSource(_ctx.stringValue("DescribeRecordTasksResponse.RecordTasks["+ i +"].UserPanes["+ j +"].Source"));

				userPanes.add(userPanesItem);
			}
			recordTask.setUserPanes(userPanes);

			recordTasks.add(recordTask);
		}
		describeRecordTasksResponse.setRecordTasks(recordTasks);
	 
	 	return describeRecordTasksResponse;
	}
}