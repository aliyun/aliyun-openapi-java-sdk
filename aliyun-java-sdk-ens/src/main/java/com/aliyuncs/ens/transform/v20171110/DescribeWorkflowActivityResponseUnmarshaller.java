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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeWorkflowActivityResponse;
import com.aliyuncs.ens.model.v20171110.DescribeWorkflowActivityResponse.ActivityInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWorkflowActivityResponseUnmarshaller {

	public static DescribeWorkflowActivityResponse unmarshall(DescribeWorkflowActivityResponse describeWorkflowActivityResponse, UnmarshallerContext _ctx) {
		
		describeWorkflowActivityResponse.setRequestId(_ctx.stringValue("DescribeWorkflowActivityResponse.RequestId"));

		List<ActivityInfos> activityInfo = new ArrayList<ActivityInfos>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWorkflowActivityResponse.ActivityInfo.Length"); i++) {
			ActivityInfos activityInfos = new ActivityInfos();
			activityInfos.setActivityId(_ctx.stringValue("DescribeWorkflowActivityResponse.ActivityInfo["+ i +"].ActivityId"));
			activityInfos.setActivityName(_ctx.stringValue("DescribeWorkflowActivityResponse.ActivityInfo["+ i +"].ActivityName"));
			activityInfos.setState(_ctx.stringValue("DescribeWorkflowActivityResponse.ActivityInfo["+ i +"].State"));
			activityInfos.setGmtStart(_ctx.stringValue("DescribeWorkflowActivityResponse.ActivityInfo["+ i +"].GmtStart"));
			activityInfos.setGmtEnd(_ctx.stringValue("DescribeWorkflowActivityResponse.ActivityInfo["+ i +"].GmtEnd"));
			activityInfos.setDuration(_ctx.stringValue("DescribeWorkflowActivityResponse.ActivityInfo["+ i +"].Duration"));
			activityInfos.setGmtCreate(_ctx.stringValue("DescribeWorkflowActivityResponse.ActivityInfo["+ i +"].GmtCreate"));
			activityInfos.setBizMethod(_ctx.stringValue("DescribeWorkflowActivityResponse.ActivityInfo["+ i +"].Method"));
			activityInfos.setInput(_ctx.stringValue("DescribeWorkflowActivityResponse.ActivityInfo["+ i +"].Input"));
			activityInfos.setOutput(_ctx.stringValue("DescribeWorkflowActivityResponse.ActivityInfo["+ i +"].Output"));
			activityInfos.setError(_ctx.stringValue("DescribeWorkflowActivityResponse.ActivityInfo["+ i +"].Error"));
			activityInfos.setWorkerNode(_ctx.stringValue("DescribeWorkflowActivityResponse.ActivityInfo["+ i +"].WorkerNode"));

			activityInfo.add(activityInfos);
		}
		describeWorkflowActivityResponse.setActivityInfo(activityInfo);
	 
	 	return describeWorkflowActivityResponse;
	}
}