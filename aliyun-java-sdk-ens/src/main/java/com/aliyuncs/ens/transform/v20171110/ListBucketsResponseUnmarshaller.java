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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.ListBucketsResponse;
import com.aliyuncs.ens.model.v20171110.ListBucketsResponse.BucketInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBucketsResponseUnmarshaller {

	public static ListBucketsResponse unmarshall(ListBucketsResponse listBucketsResponse, UnmarshallerContext _ctx) {
		
		listBucketsResponse.setRequestId(_ctx.stringValue("ListBucketsResponse.RequestId"));
		listBucketsResponse.setTotalCount(_ctx.longValue("ListBucketsResponse.TotalCount"));
		listBucketsResponse.setNextMarker(_ctx.stringValue("ListBucketsResponse.NextMarker"));

		List<BucketInfo> bucketInfos = new ArrayList<BucketInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListBucketsResponse.BucketInfos.Length"); i++) {
			BucketInfo bucketInfo = new BucketInfo();
			bucketInfo.setBucketAcl(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].BucketAcl"));
			bucketInfo.setBucketName(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].BucketName"));
			bucketInfo.setCity(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].City"));
			bucketInfo.setComment(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].Comment"));
			bucketInfo.setCORSRule(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].CORSRule"));
			bucketInfo.setCreateTime(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].CreateTime"));
			bucketInfo.setDataRedundancyType(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].DataRedundancyType"));
			bucketInfo.setDispatcherType(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].DispatcherType"));
			bucketInfo.setEndpoint(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].Endpoint"));
			bucketInfo.setEngineInfo(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].EngineInfo"));
			bucketInfo.setIndexTableName(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].IndexTableName"));
			bucketInfo.setLifecycleRule(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].LifecycleRule"));
			bucketInfo.setLogicalBucketType(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].LogicalBucketType"));
			bucketInfo.setModifyTime(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].ModifyTime"));
			bucketInfo.setProduct(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].Product"));
			bucketInfo.setResourceType(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].ResourceType"));
			bucketInfo.setStorageClass(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].StorageClass"));
			bucketInfo.setUserId(_ctx.longValue("ListBucketsResponse.BucketInfos["+ i +"].UserId"));
			bucketInfo.setEnsRegionId(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].EnsRegionId"));

			bucketInfos.add(bucketInfo);
		}
		listBucketsResponse.setBucketInfos(bucketInfos);
	 
	 	return listBucketsResponse;
	}
}