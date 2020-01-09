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

package com.aliyuncs.vs.transform.v20181212;

import com.aliyuncs.vs.model.v20181212.DescribeAccountStatResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountStatResponseUnmarshaller {

	public static DescribeAccountStatResponse unmarshall(DescribeAccountStatResponse describeAccountStatResponse, UnmarshallerContext _ctx) {
		
		describeAccountStatResponse.setRequestId(_ctx.stringValue("DescribeAccountStatResponse.RequestId"));
		describeAccountStatResponse.setId(_ctx.stringValue("DescribeAccountStatResponse.Id"));
		describeAccountStatResponse.setGroupNum(_ctx.longValue("DescribeAccountStatResponse.GroupNum"));
		describeAccountStatResponse.setGroupLimit(_ctx.longValue("DescribeAccountStatResponse.GroupLimit"));
		describeAccountStatResponse.setTemplateNum(_ctx.longValue("DescribeAccountStatResponse.TemplateNum"));
		describeAccountStatResponse.setTemplateLimit(_ctx.longValue("DescribeAccountStatResponse.TemplateLimit"));
	 
	 	return describeAccountStatResponse;
	}
}