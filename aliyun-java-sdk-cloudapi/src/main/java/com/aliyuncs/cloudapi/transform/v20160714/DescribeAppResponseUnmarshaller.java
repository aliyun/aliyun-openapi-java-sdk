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

package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppResponseUnmarshaller {

	public static DescribeAppResponse unmarshall(DescribeAppResponse describeAppResponse, UnmarshallerContext _ctx) {
		
		describeAppResponse.setRequestId(_ctx.stringValue("DescribeAppResponse.RequestId"));
		describeAppResponse.setAppId(_ctx.longValue("DescribeAppResponse.AppId"));
		describeAppResponse.setAppName(_ctx.stringValue("DescribeAppResponse.AppName"));
		describeAppResponse.setDescription(_ctx.stringValue("DescribeAppResponse.Description"));
		describeAppResponse.setCreatedTime(_ctx.stringValue("DescribeAppResponse.CreatedTime"));
		describeAppResponse.setModifiedTime(_ctx.stringValue("DescribeAppResponse.ModifiedTime"));
	 
	 	return describeAppResponse;
	}
}