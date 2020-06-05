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

import com.aliyuncs.sgw.model.v20180511.DescribeOssBucketsResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeOssBucketsResponse.Bucket;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssBucketsResponseUnmarshaller {

	public static DescribeOssBucketsResponse unmarshall(DescribeOssBucketsResponse describeOssBucketsResponse, UnmarshallerContext _ctx) {
		
		describeOssBucketsResponse.setRequestId(_ctx.stringValue("DescribeOssBucketsResponse.RequestId"));
		describeOssBucketsResponse.setSuccess(_ctx.booleanValue("DescribeOssBucketsResponse.Success"));
		describeOssBucketsResponse.setCode(_ctx.stringValue("DescribeOssBucketsResponse.Code"));
		describeOssBucketsResponse.setMessage(_ctx.stringValue("DescribeOssBucketsResponse.Message"));

		List<Bucket> buckets = new ArrayList<Bucket>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssBucketsResponse.Buckets.Length"); i++) {
			Bucket bucket = new Bucket();
			bucket.setName(_ctx.stringValue("DescribeOssBucketsResponse.Buckets["+ i +"].Name"));

			buckets.add(bucket);
		}
		describeOssBucketsResponse.setBuckets(buckets);
	 
	 	return describeOssBucketsResponse;
	}
}