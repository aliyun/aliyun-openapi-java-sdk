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

package com.aliyuncs.iqa.transform.v20190813;

import com.aliyuncs.iqa.model.v20190813.DescribeProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProjectResponseUnmarshaller {

	public static DescribeProjectResponse unmarshall(DescribeProjectResponse describeProjectResponse, UnmarshallerContext _ctx) {
		
		describeProjectResponse.setRequestId(_ctx.stringValue("DescribeProjectResponse.RequestId"));
		describeProjectResponse.setProjectType(_ctx.stringValue("DescribeProjectResponse.ProjectType"));
		describeProjectResponse.setProjectId(_ctx.stringValue("DescribeProjectResponse.ProjectId"));
		describeProjectResponse.setProjectName(_ctx.stringValue("DescribeProjectResponse.ProjectName"));
		describeProjectResponse.setCreateTime(_ctx.longValue("DescribeProjectResponse.CreateTime"));
		describeProjectResponse.setDeployTime(_ctx.longValue("DescribeProjectResponse.DeployTime"));
		describeProjectResponse.setModelId(_ctx.stringValue("DescribeProjectResponse.ModelId"));
		describeProjectResponse.setModelName(_ctx.stringValue("DescribeProjectResponse.ModelName"));
		describeProjectResponse.setQuestionCount(_ctx.integerValue("DescribeProjectResponse.QuestionCount"));
		describeProjectResponse.setDataStatus(_ctx.stringValue("DescribeProjectResponse.DataStatus"));
		describeProjectResponse.setTestServiceStatus(_ctx.stringValue("DescribeProjectResponse.TestServiceStatus"));
		describeProjectResponse.setOnlineServiceStatus(_ctx.stringValue("DescribeProjectResponse.OnlineServiceStatus"));
		describeProjectResponse.setDeployAvailable(_ctx.stringValue("DescribeProjectResponse.DeployAvailable"));
	 
	 	return describeProjectResponse;
	}
}