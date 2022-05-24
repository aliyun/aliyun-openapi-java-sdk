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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeUpgradeMajorVersionTasksResponse;
import com.aliyuncs.rds.model.v20140815.DescribeUpgradeMajorVersionTasksResponse.Tasks;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUpgradeMajorVersionTasksResponseUnmarshaller {

	public static DescribeUpgradeMajorVersionTasksResponse unmarshall(DescribeUpgradeMajorVersionTasksResponse describeUpgradeMajorVersionTasksResponse, UnmarshallerContext _ctx) {
		
		describeUpgradeMajorVersionTasksResponse.setRequestId(_ctx.stringValue("DescribeUpgradeMajorVersionTasksResponse.RequestId"));
		describeUpgradeMajorVersionTasksResponse.setPageNumber(_ctx.integerValue("DescribeUpgradeMajorVersionTasksResponse.PageNumber"));
		describeUpgradeMajorVersionTasksResponse.setPageRecordCount(_ctx.integerValue("DescribeUpgradeMajorVersionTasksResponse.PageRecordCount"));
		describeUpgradeMajorVersionTasksResponse.setTotalRecordCount(_ctx.integerValue("DescribeUpgradeMajorVersionTasksResponse.TotalRecordCount"));

		List<Tasks> items = new ArrayList<Tasks>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUpgradeMajorVersionTasksResponse.Items.Length"); i++) {
			Tasks tasks = new Tasks();
			tasks.setTargetMajorVersion(_ctx.stringValue("DescribeUpgradeMajorVersionTasksResponse.Items["+ i +"].TargetMajorVersion"));
			tasks.setResult(_ctx.stringValue("DescribeUpgradeMajorVersionTasksResponse.Items["+ i +"].Result"));
			tasks.setEndTime(_ctx.stringValue("DescribeUpgradeMajorVersionTasksResponse.Items["+ i +"].EndTime"));
			tasks.setStartTime(_ctx.stringValue("DescribeUpgradeMajorVersionTasksResponse.Items["+ i +"].StartTime"));
			tasks.setSourceMajorVersion(_ctx.stringValue("DescribeUpgradeMajorVersionTasksResponse.Items["+ i +"].SourceMajorVersion"));
			tasks.setUpgradeMode(_ctx.stringValue("DescribeUpgradeMajorVersionTasksResponse.Items["+ i +"].UpgradeMode"));
			tasks.setCollectStatMode(_ctx.stringValue("DescribeUpgradeMajorVersionTasksResponse.Items["+ i +"].CollectStatMode"));
			tasks.setSourceInsName(_ctx.stringValue("DescribeUpgradeMajorVersionTasksResponse.Items["+ i +"].SourceInsName"));
			tasks.setTaskId(_ctx.integerValue("DescribeUpgradeMajorVersionTasksResponse.Items["+ i +"].TaskId"));
			tasks.setTargetInsName(_ctx.stringValue("DescribeUpgradeMajorVersionTasksResponse.Items["+ i +"].TargetInsName"));
			tasks.setSwitchTime(_ctx.stringValue("DescribeUpgradeMajorVersionTasksResponse.Items["+ i +"].SwitchTime"));
			tasks.setDetail(_ctx.stringValue("DescribeUpgradeMajorVersionTasksResponse.Items["+ i +"].Detail"));

			items.add(tasks);
		}
		describeUpgradeMajorVersionTasksResponse.setItems(items);
	 
	 	return describeUpgradeMajorVersionTasksResponse;
	}
}