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

package com.aliyuncs.r_kvstore.transform.v20150101;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstanceConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceConfigResponseUnmarshaller {

	public static DescribeInstanceConfigResponse unmarshall(DescribeInstanceConfigResponse describeInstanceConfigResponse, UnmarshallerContext context) {
		
		describeInstanceConfigResponse.setRequestId(context.stringValue("DescribeInstanceConfigResponse.RequestId"));
		describeInstanceConfigResponse.setConfig(context.stringValue("DescribeInstanceConfigResponse.Config"));
	 
	 	return describeInstanceConfigResponse;
	}
}