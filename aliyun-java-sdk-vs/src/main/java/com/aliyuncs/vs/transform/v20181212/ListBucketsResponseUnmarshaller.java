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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.ListBucketsResponse;
import com.aliyuncs.vs.model.v20181212.ListBucketsResponse.BucketInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBucketsResponseUnmarshaller {

	public static ListBucketsResponse unmarshall(ListBucketsResponse listBucketsResponse, UnmarshallerContext _ctx) {
		
		listBucketsResponse.setRequestId(_ctx.stringValue("ListBucketsResponse.RequestId"));
		listBucketsResponse.setTotalCount(_ctx.longValue("ListBucketsResponse.TotalCount"));

		List<BucketInfo> bucketInfos = new ArrayList<BucketInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListBucketsResponse.BucketInfos.Length"); i++) {
			BucketInfo bucketInfo = new BucketInfo();
			bucketInfo.setBucketName(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].BucketName"));
			bucketInfo.setComment(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].Comment"));
			bucketInfo.setBucketAcl(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].BucketAcl"));
			bucketInfo.setDataRedundancyType(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].DataRedundancyType"));
			bucketInfo.setStorageClass(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].StorageClass"));
			bucketInfo.setDispatcherType(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].DispatcherType"));
			bucketInfo.setResourceType(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].ResourceType"));
			bucketInfo.setCreateTime(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].CreateTime"));
			bucketInfo.setModifyTime(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].ModifyTime"));
			bucketInfo.setEndpoint(_ctx.stringValue("ListBucketsResponse.BucketInfos["+ i +"].Endpoint"));

			bucketInfos.add(bucketInfo);
		}
		listBucketsResponse.setBucketInfos(bucketInfos);
	 
	 	return listBucketsResponse;
	}
}