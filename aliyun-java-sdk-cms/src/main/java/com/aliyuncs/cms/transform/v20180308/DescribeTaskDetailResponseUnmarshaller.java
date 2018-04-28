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

package com.aliyuncs.cms.transform.v20180308;

import com.aliyuncs.cms.model.v20180308.DescribeTaskDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTaskDetailResponseUnmarshaller {

	public static DescribeTaskDetailResponse unmarshall(DescribeTaskDetailResponse describeTaskDetailResponse, UnmarshallerContext context) {
		
		describeTaskDetailResponse.setRequestId(context.stringValue("DescribeTaskDetailResponse.RequestId"));
		describeTaskDetailResponse.setCode(context.stringValue("DescribeTaskDetailResponse.Code"));
		describeTaskDetailResponse.setMessage(context.stringValue("DescribeTaskDetailResponse.Message"));
		describeTaskDetailResponse.setSuccess(context.stringValue("DescribeTaskDetailResponse.Success"));
		describeTaskDetailResponse.setData(context.stringValue("DescribeTaskDetailResponse.Data"));
	 
	 	return describeTaskDetailResponse;
	}
}