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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.DescribeExpireCachesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpireCachesResponseUnmarshaller {

	public static DescribeExpireCachesResponse unmarshall(DescribeExpireCachesResponse describeExpireCachesResponse, UnmarshallerContext _ctx) {
		
		describeExpireCachesResponse.setRequestId(_ctx.stringValue("DescribeExpireCachesResponse.RequestId"));
		describeExpireCachesResponse.setSuccess(_ctx.booleanValue("DescribeExpireCachesResponse.Success"));
		describeExpireCachesResponse.setCode(_ctx.stringValue("DescribeExpireCachesResponse.Code"));
		describeExpireCachesResponse.setMessage(_ctx.stringValue("DescribeExpireCachesResponse.Message"));
		describeExpireCachesResponse.setCacheFilePaths(_ctx.stringValue("DescribeExpireCachesResponse.CacheFilePaths"));
	 
	 	return describeExpireCachesResponse;
	}
}