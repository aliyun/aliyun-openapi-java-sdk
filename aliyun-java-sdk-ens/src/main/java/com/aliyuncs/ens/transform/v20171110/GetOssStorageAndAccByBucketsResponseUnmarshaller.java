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

import com.aliyuncs.ens.model.v20171110.GetOssStorageAndAccByBucketsResponse;
import com.aliyuncs.ens.model.v20171110.GetOssStorageAndAccByBucketsResponse.BucketListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOssStorageAndAccByBucketsResponseUnmarshaller {

	public static GetOssStorageAndAccByBucketsResponse unmarshall(GetOssStorageAndAccByBucketsResponse getOssStorageAndAccByBucketsResponse, UnmarshallerContext _ctx) {
		
		getOssStorageAndAccByBucketsResponse.setRequestId(_ctx.stringValue("GetOssStorageAndAccByBucketsResponse.RequestId"));

		List<BucketListItem> bucketList = new ArrayList<BucketListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOssStorageAndAccByBucketsResponse.BucketList.Length"); i++) {
			BucketListItem bucketListItem = new BucketListItem();
			bucketListItem.setAcc(_ctx.longValue("GetOssStorageAndAccByBucketsResponse.BucketList["+ i +"].Acc"));
			bucketListItem.setBucket(_ctx.stringValue("GetOssStorageAndAccByBucketsResponse.BucketList["+ i +"].Bucket"));
			bucketListItem.setStorageUsageByte(_ctx.longValue("GetOssStorageAndAccByBucketsResponse.BucketList["+ i +"].StorageUsageByte"));

			bucketList.add(bucketListItem);
		}
		getOssStorageAndAccByBucketsResponse.setBucketList(bucketList);
	 
	 	return getOssStorageAndAccByBucketsResponse;
	}
}