/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudphoto.transform.v20170711;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphoto.model.v20170711.GetPhotoStoreResponse;
import com.aliyuncs.cloudphoto.model.v20170711.GetPhotoStoreResponse.PhotoStore;
import com.aliyuncs.cloudphoto.model.v20170711.GetPhotoStoreResponse.PhotoStore.Bucket;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhotoStoreResponseUnmarshaller {

	public static GetPhotoStoreResponse unmarshall(GetPhotoStoreResponse getPhotoStoreResponse, UnmarshallerContext context) {
		
		getPhotoStoreResponse.setRequestId(context.stringValue("GetPhotoStoreResponse.RequestId"));
		getPhotoStoreResponse.setCode(context.stringValue("GetPhotoStoreResponse.Code"));
		getPhotoStoreResponse.setMessage(context.stringValue("GetPhotoStoreResponse.Message"));
		getPhotoStoreResponse.setAction(context.stringValue("GetPhotoStoreResponse.Action"));

		PhotoStore photoStore = new PhotoStore();
		photoStore.setId(context.longValue("GetPhotoStoreResponse.PhotoStore.Id"));
		photoStore.setName(context.stringValue("GetPhotoStoreResponse.PhotoStore.Name"));
		photoStore.setRemark(context.stringValue("GetPhotoStoreResponse.PhotoStore.Remark"));
		photoStore.setDefaultQuota(context.longValue("GetPhotoStoreResponse.PhotoStore.DefaultQuota"));
		photoStore.setCtime(context.longValue("GetPhotoStoreResponse.PhotoStore.Ctime"));
		photoStore.setMtime(context.longValue("GetPhotoStoreResponse.PhotoStore.Mtime"));

		List<Bucket> buckets = new ArrayList<Bucket>();
		for (int i = 0; i < context.lengthValue("GetPhotoStoreResponse.PhotoStore.Buckets.Length"); i++) {
			Bucket bucket = new Bucket();
			bucket.setName(context.stringValue("GetPhotoStoreResponse.PhotoStore.Buckets["+ i +"].Name"));
			bucket.setRegion(context.stringValue("GetPhotoStoreResponse.PhotoStore.Buckets["+ i +"].Region"));
			bucket.setState(context.stringValue("GetPhotoStoreResponse.PhotoStore.Buckets["+ i +"].State"));
			bucket.setAcl(context.stringValue("GetPhotoStoreResponse.PhotoStore.Buckets["+ i +"].Acl"));

			buckets.add(bucket);
		}
		photoStore.setBuckets(buckets);
		getPhotoStoreResponse.setPhotoStore(photoStore);
	 
	 	return getPhotoStoreResponse;
	}
}