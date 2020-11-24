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

package com.aliyuncs.ddoscoo.transform.v20200101;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeSlsLogstoreInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlsLogstoreInfoResponseUnmarshaller {

	public static DescribeSlsLogstoreInfoResponse unmarshall(DescribeSlsLogstoreInfoResponse describeSlsLogstoreInfoResponse, UnmarshallerContext _ctx) {
		
		describeSlsLogstoreInfoResponse.setRequestId(_ctx.stringValue("DescribeSlsLogstoreInfoResponse.RequestId"));
		describeSlsLogstoreInfoResponse.setQuota(_ctx.longValue("DescribeSlsLogstoreInfoResponse.Quota"));
		describeSlsLogstoreInfoResponse.setLogStore(_ctx.stringValue("DescribeSlsLogstoreInfoResponse.LogStore"));
		describeSlsLogstoreInfoResponse.setUsed(_ctx.longValue("DescribeSlsLogstoreInfoResponse.Used"));
		describeSlsLogstoreInfoResponse.setProject(_ctx.stringValue("DescribeSlsLogstoreInfoResponse.Project"));
		describeSlsLogstoreInfoResponse.setTtl(_ctx.integerValue("DescribeSlsLogstoreInfoResponse.Ttl"));
	 
	 	return describeSlsLogstoreInfoResponse;
	}
}