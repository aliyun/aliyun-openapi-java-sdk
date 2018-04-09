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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeFlowJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowJobResponseUnmarshaller {

	public static DescribeFlowJobResponse unmarshall(DescribeFlowJobResponse describeFlowJobResponse, UnmarshallerContext context) {
		
		describeFlowJobResponse.setRequestId(context.stringValue("DescribeFlowJobResponse.RequestId"));
		describeFlowJobResponse.setId(context.stringValue("DescribeFlowJobResponse.Id"));
		describeFlowJobResponse.setGmtCreate(context.longValue("DescribeFlowJobResponse.GmtCreate"));
		describeFlowJobResponse.setGmtModified(context.longValue("DescribeFlowJobResponse.GmtModified"));
		describeFlowJobResponse.setName(context.stringValue("DescribeFlowJobResponse.Name"));
		describeFlowJobResponse.setDescription(context.stringValue("DescribeFlowJobResponse.Description"));
		describeFlowJobResponse.setFailAct(context.stringValue("DescribeFlowJobResponse.FailAct"));
		describeFlowJobResponse.setMaxRetry(context.integerValue("DescribeFlowJobResponse.MaxRetry"));
		describeFlowJobResponse.setRetryInterval(context.longValue("DescribeFlowJobResponse.RetryInterval"));
		describeFlowJobResponse.setParams(context.stringValue("DescribeFlowJobResponse.Params"));
		describeFlowJobResponse.setParamConf(context.stringValue("DescribeFlowJobResponse.ParamConf"));
		describeFlowJobResponse.setEnvConf(context.stringValue("DescribeFlowJobResponse.EnvConf"));
		describeFlowJobResponse.setRunConf(context.stringValue("DescribeFlowJobResponse.RunConf"));
		describeFlowJobResponse.setCategoryId(context.stringValue("DescribeFlowJobResponse.CategoryId"));
		describeFlowJobResponse.setMode(context.stringValue("DescribeFlowJobResponse.mode"));

		List<String> resource = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeFlowJobResponse.Resource.Length"); i++) {
			resource.add(context.stringValue("DescribeFlowJobResponse.Resource["+ i +"]"));
		}
		describeFlowJobResponse.setResource(resource);
	 
	 	return describeFlowJobResponse;
	}
}