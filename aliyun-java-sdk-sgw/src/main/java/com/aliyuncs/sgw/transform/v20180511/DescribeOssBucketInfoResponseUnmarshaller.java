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

import com.aliyuncs.sgw.model.v20180511.DescribeOssBucketInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssBucketInfoResponseUnmarshaller {

	public static DescribeOssBucketInfoResponse unmarshall(DescribeOssBucketInfoResponse describeOssBucketInfoResponse, UnmarshallerContext _ctx) {
		
		describeOssBucketInfoResponse.setRequestId(_ctx.stringValue("DescribeOssBucketInfoResponse.RequestId"));
		describeOssBucketInfoResponse.setSuccess(_ctx.booleanValue("DescribeOssBucketInfoResponse.Success"));
		describeOssBucketInfoResponse.setCode(_ctx.stringValue("DescribeOssBucketInfoResponse.Code"));
		describeOssBucketInfoResponse.setMessage(_ctx.stringValue("DescribeOssBucketInfoResponse.Message"));
		describeOssBucketInfoResponse.setIsArchive(_ctx.booleanValue("DescribeOssBucketInfoResponse.IsArchive"));
		describeOssBucketInfoResponse.setIsBackToResource(_ctx.booleanValue("DescribeOssBucketInfoResponse.IsBackToResource"));
		describeOssBucketInfoResponse.setPollingInterval(_ctx.integerValue("DescribeOssBucketInfoResponse.PollingInterval"));
		describeOssBucketInfoResponse.setIsSupportServerSideEncryption(_ctx.booleanValue("DescribeOssBucketInfoResponse.IsSupportServerSideEncryption"));
		describeOssBucketInfoResponse.setIsFresh(_ctx.booleanValue("DescribeOssBucketInfoResponse.IsFresh"));
		describeOssBucketInfoResponse.setStorageSize(_ctx.longValue("DescribeOssBucketInfoResponse.StorageSize"));
		describeOssBucketInfoResponse.setIsVersioning(_ctx.booleanValue("DescribeOssBucketInfoResponse.IsVersioning"));
	 
	 	return describeOssBucketInfoResponse;
	}
}