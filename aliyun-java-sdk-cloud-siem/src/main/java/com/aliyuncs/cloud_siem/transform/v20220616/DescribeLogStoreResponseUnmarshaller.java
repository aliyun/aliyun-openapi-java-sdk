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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeLogStoreResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeLogStoreResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogStoreResponseUnmarshaller {

	public static DescribeLogStoreResponse unmarshall(DescribeLogStoreResponse describeLogStoreResponse, UnmarshallerContext _ctx) {
		
		describeLogStoreResponse.setRequestId(_ctx.stringValue("DescribeLogStoreResponse.RequestId"));

		Data data = new Data();
		data.setLogStoreName(_ctx.stringValue("DescribeLogStoreResponse.Data.LogStoreName"));
		data.setTtl(_ctx.integerValue("DescribeLogStoreResponse.Data.Ttl"));
		data.setShardCount(_ctx.integerValue("DescribeLogStoreResponse.Data.ShardCount"));
		data.setEnableTracking(_ctx.booleanValue("DescribeLogStoreResponse.Data.EnableTracking"));
		data.setAutoSplit(_ctx.booleanValue("DescribeLogStoreResponse.Data.AutoSplit"));
		data.setMaxSplitShard(_ctx.integerValue("DescribeLogStoreResponse.Data.MaxSplitShard"));
		data.setAppendMeta(_ctx.booleanValue("DescribeLogStoreResponse.Data.AppendMeta"));
		describeLogStoreResponse.setData(data);
	 
	 	return describeLogStoreResponse;
	}
}