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

package com.aliyuncs.ens.transform.v20171110;

import com.aliyuncs.ens.model.v20171110.GetBucketInfoResponse;
import com.aliyuncs.ens.model.v20171110.GetBucketInfoResponse.BucketInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBucketInfoResponseUnmarshaller {

	public static GetBucketInfoResponse unmarshall(GetBucketInfoResponse getBucketInfoResponse, UnmarshallerContext _ctx) {
		
		getBucketInfoResponse.setRequestId(_ctx.stringValue("GetBucketInfoResponse.RequestId"));

		BucketInfo bucketInfo = new BucketInfo();
		bucketInfo.setBucketAcl(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.BucketAcl"));
		bucketInfo.setBucketName(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.BucketName"));
		bucketInfo.setCity(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.City"));
		bucketInfo.setComment(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.Comment"));
		bucketInfo.setCORSRule(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.CORSRule"));
		bucketInfo.setCreateTime(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.CreateTime"));
		bucketInfo.setDataRedundancyType(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.DataRedundancyType"));
		bucketInfo.setDispatcherType(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.DispatcherType"));
		bucketInfo.setEndpoint(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.Endpoint"));
		bucketInfo.setEngineInfo(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.EngineInfo"));
		bucketInfo.setIndexTableName(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.IndexTableName"));
		bucketInfo.setLifecycleRule(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.LifecycleRule"));
		bucketInfo.setLogicalBucketType(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.LogicalBucketType"));
		bucketInfo.setModifyTime(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.ModifyTime"));
		bucketInfo.setProduct(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.Product"));
		bucketInfo.setResourceType(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.ResourceType"));
		bucketInfo.setStorageClass(_ctx.stringValue("GetBucketInfoResponse.BucketInfo.StorageClass"));
		bucketInfo.setUserId(_ctx.longValue("GetBucketInfoResponse.BucketInfo.UserId"));
		getBucketInfoResponse.setBucketInfo(bucketInfo);
	 
	 	return getBucketInfoResponse;
	}
}