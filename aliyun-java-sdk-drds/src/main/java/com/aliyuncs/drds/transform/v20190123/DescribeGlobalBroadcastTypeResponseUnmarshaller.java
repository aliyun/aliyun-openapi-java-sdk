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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.DescribeGlobalBroadcastTypeResponse;
import com.aliyuncs.drds.model.v20190123.DescribeGlobalBroadcastTypeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGlobalBroadcastTypeResponseUnmarshaller {

	public static DescribeGlobalBroadcastTypeResponse unmarshall(DescribeGlobalBroadcastTypeResponse describeGlobalBroadcastTypeResponse, UnmarshallerContext _ctx) {
		
		describeGlobalBroadcastTypeResponse.setRequestId(_ctx.stringValue("DescribeGlobalBroadcastTypeResponse.RequestId"));
		describeGlobalBroadcastTypeResponse.setSuccess(_ctx.booleanValue("DescribeGlobalBroadcastTypeResponse.Success"));

		Data data = new Data();
		data.setIsSyncType(_ctx.booleanValue("DescribeGlobalBroadcastTypeResponse.Data.IsSyncType"));
		describeGlobalBroadcastTypeResponse.setData(data);
	 
	 	return describeGlobalBroadcastTypeResponse;
	}
}