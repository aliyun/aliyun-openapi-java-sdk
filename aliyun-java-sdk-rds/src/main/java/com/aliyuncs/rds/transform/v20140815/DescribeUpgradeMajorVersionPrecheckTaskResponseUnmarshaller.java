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

import com.aliyuncs.rds.model.v20140815.DescribeUpgradeMajorVersionPrecheckTaskResponse;
import com.aliyuncs.rds.model.v20140815.DescribeUpgradeMajorVersionPrecheckTaskResponse.Tasks;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUpgradeMajorVersionPrecheckTaskResponseUnmarshaller {

	public static DescribeUpgradeMajorVersionPrecheckTaskResponse unmarshall(DescribeUpgradeMajorVersionPrecheckTaskResponse describeUpgradeMajorVersionPrecheckTaskResponse, UnmarshallerContext _ctx) {
		
		describeUpgradeMajorVersionPrecheckTaskResponse.setRequestId(_ctx.stringValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.RequestId"));
		describeUpgradeMajorVersionPrecheckTaskResponse.setPageNumber(_ctx.integerValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.PageNumber"));
		describeUpgradeMajorVersionPrecheckTaskResponse.setPageRecordCount(_ctx.integerValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.PageRecordCount"));
		describeUpgradeMajorVersionPrecheckTaskResponse.setTotalRecordCount(_ctx.integerValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.TotalRecordCount"));

		List<Tasks> items = new ArrayList<Tasks>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.Items.Length"); i++) {
			Tasks tasks = new Tasks();
			tasks.setTargetMajorVersion(_ctx.stringValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.Items["+ i +"].TargetMajorVersion"));
			tasks.setEffectiveTime(_ctx.stringValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.Items["+ i +"].EffectiveTime"));
			tasks.setSourceMajorVersion(_ctx.stringValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.Items["+ i +"].SourceMajorVersion"));
			tasks.setResult(_ctx.stringValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.Items["+ i +"].Result"));
			tasks.setTaskId(_ctx.integerValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.Items["+ i +"].TaskId"));
			tasks.setDetail(_ctx.stringValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.Items["+ i +"].Detail"));
			tasks.setCheckTime(_ctx.stringValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.Items["+ i +"].CheckTime"));
			tasks.setRecommendDiskSize(_ctx.integerValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.Items["+ i +"].RecommendDiskSize"));
			tasks.setRecommendLeastMemSize(_ctx.integerValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.Items["+ i +"].RecommendLeastMemSize"));
			tasks.setRecommendMemSize(_ctx.integerValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.Items["+ i +"].RecommendMemSize"));
			tasks.setUpgradeMode(_ctx.stringValue("DescribeUpgradeMajorVersionPrecheckTaskResponse.Items["+ i +"].UpgradeMode"));

			items.add(tasks);
		}
		describeUpgradeMajorVersionPrecheckTaskResponse.setItems(items);
	 
	 	return describeUpgradeMajorVersionPrecheckTaskResponse;
	}
}