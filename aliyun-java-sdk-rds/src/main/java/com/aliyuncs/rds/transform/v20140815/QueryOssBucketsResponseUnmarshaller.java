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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.QueryOssBucketsResponse;
import com.aliyuncs.rds.model.v20140815.QueryOssBucketsResponse.BucketItem;
import com.aliyuncs.rds.model.v20140815.QueryOssBucketsResponse.BucketItem.Owner;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOssBucketsResponseUnmarshaller {

	public static QueryOssBucketsResponse unmarshall(QueryOssBucketsResponse queryOssBucketsResponse, UnmarshallerContext context) {
		
		queryOssBucketsResponse.setRequestId(context.stringValue("QueryOssBucketsResponse.RequestId"));

		List<BucketItem> bucket = new ArrayList<BucketItem>();
		for (int i = 0; i < context.lengthValue("QueryOssBucketsResponse.Bucket.Length"); i++) {
			BucketItem bucketItem = new BucketItem();
			bucketItem.setName(context.stringValue("QueryOssBucketsResponse.Bucket["+ i +"].name"));
			bucketItem.setLocation(context.stringValue("QueryOssBucketsResponse.Bucket["+ i +"].location"));
			bucketItem.setStorageClass(context.stringValue("QueryOssBucketsResponse.Bucket["+ i +"].storageClass"));
			bucketItem.setExtranetEndpoint(context.longValue("QueryOssBucketsResponse.Bucket["+ i +"].extranetEndpoint"));
			bucketItem.setIntranetEndpoint(context.longValue("QueryOssBucketsResponse.Bucket["+ i +"].intranetEndpoint"));
			bucketItem.setCreationDate(context.stringValue("QueryOssBucketsResponse.Bucket["+ i +"].creationDate"));

			Owner owner = new Owner();
			owner.setDisplayName(context.stringValue("QueryOssBucketsResponse.Bucket["+ i +"].owner.displayName"));
			owner.setId(context.stringValue("QueryOssBucketsResponse.Bucket["+ i +"].owner.id"));
			bucketItem.setOwner(owner);

			bucket.add(bucketItem);
		}
		queryOssBucketsResponse.setBucket(bucket);
	 
	 	return queryOssBucketsResponse;
	}
}