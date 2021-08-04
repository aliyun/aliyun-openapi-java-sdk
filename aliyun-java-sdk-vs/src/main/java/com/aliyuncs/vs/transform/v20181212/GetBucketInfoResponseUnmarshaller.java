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

import com.aliyuncs.vs.model.v20181212.GetBucketInfoResponse;
import com.aliyuncs.vs.model.v20181212.GetBucketInfoResponse.BucketInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBucketInfoResponseUnmarshaller {

	public static GetBucketInfoResponse unmarshall(GetBucketInfoResponse getBucketInfoResponse, UnmarshallerContext _ctx) {
		
		getBucketInfoResponse.setRequestId(_ctx.stringValue("GetBucketInfoResponse.RequestId"));

		BucketInfo bucketInfo = new BucketInfo();
		bucketInfo.setBucketName(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.BucketName"));
		bucketInfo.setComment(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.Comment"));
		bucketInfo.setBucketAcl(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.BucketAcl"));
		bucketInfo.setDataRedundancyType(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.DataRedundancyType"));
		bucketInfo.setStorageClass(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.StorageClass"));
		bucketInfo.setDispatcherType(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.DispatcherType"));
		bucketInfo.setResourceType(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.ResourceType"));
		bucketInfo.setCreateTime(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.CreateTime"));
		bucketInfo.setModifyTime(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.ModifyTime"));
		bucketInfo.setEndpoint(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.Endpoint"));
		getBucketInfoResponse.setBucketInfo(bucketInfo);
	 
	 	return getBucketInfoResponse;
	}
}