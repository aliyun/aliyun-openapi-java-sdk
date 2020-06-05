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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeSharesBucketInfoForExpressSyncResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeSharesBucketInfoForExpressSyncResponse.BucketInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSharesBucketInfoForExpressSyncResponseUnmarshaller {

	public static DescribeSharesBucketInfoForExpressSyncResponse unmarshall(DescribeSharesBucketInfoForExpressSyncResponse describeSharesBucketInfoForExpressSyncResponse, UnmarshallerContext _ctx) {
		
		describeSharesBucketInfoForExpressSyncResponse.setRequestId(_ctx.stringValue("DescribeSharesBucketInfoForExpressSyncResponse.RequestId"));
		describeSharesBucketInfoForExpressSyncResponse.setSuccess(_ctx.booleanValue("DescribeSharesBucketInfoForExpressSyncResponse.Success"));
		describeSharesBucketInfoForExpressSyncResponse.setCode(_ctx.stringValue("DescribeSharesBucketInfoForExpressSyncResponse.Code"));
		describeSharesBucketInfoForExpressSyncResponse.setMessage(_ctx.stringValue("DescribeSharesBucketInfoForExpressSyncResponse.Message"));

		List<BucketInfo> bucketInfos = new ArrayList<BucketInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSharesBucketInfoForExpressSyncResponse.BucketInfos.Length"); i++) {
			BucketInfo bucketInfo = new BucketInfo();
			bucketInfo.setBucketRegion(_ctx.stringValue("DescribeSharesBucketInfoForExpressSyncResponse.BucketInfos["+ i +"].BucketRegion"));
			bucketInfo.setBucketName(_ctx.stringValue("DescribeSharesBucketInfoForExpressSyncResponse.BucketInfos["+ i +"].BucketName"));
			bucketInfo.setBucketPrefix(_ctx.stringValue("DescribeSharesBucketInfoForExpressSyncResponse.BucketInfos["+ i +"].BucketPrefix"));

			bucketInfos.add(bucketInfo);
		}
		describeSharesBucketInfoForExpressSyncResponse.setBucketInfos(bucketInfos);
	 
	 	return describeSharesBucketInfoForExpressSyncResponse;
	}
}