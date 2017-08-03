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

import com.aliyuncs.cloudphoto.model.v20170711.ListPhotoStoresResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListPhotoStoresResponse.PhotoStore;
import com.aliyuncs.cloudphoto.model.v20170711.ListPhotoStoresResponse.PhotoStore.Bucket;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPhotoStoresResponseUnmarshaller {

	public static ListPhotoStoresResponse unmarshall(ListPhotoStoresResponse listPhotoStoresResponse, UnmarshallerContext context) {
		
		listPhotoStoresResponse.setRequestId(context.stringValue("ListPhotoStoresResponse.RequestId"));
		listPhotoStoresResponse.setCode(context.stringValue("ListPhotoStoresResponse.Code"));
		listPhotoStoresResponse.setMessage(context.stringValue("ListPhotoStoresResponse.Message"));
		listPhotoStoresResponse.setAction(context.stringValue("ListPhotoStoresResponse.Action"));

		List<PhotoStore> photoStores = new ArrayList<PhotoStore>();
		for (int i = 0; i < context.lengthValue("ListPhotoStoresResponse.PhotoStores.Length"); i++) {
			PhotoStore photoStore = new PhotoStore();
			photoStore.setId(context.longValue("ListPhotoStoresResponse.PhotoStores["+ i +"].Id"));
			photoStore.setName(context.stringValue("ListPhotoStoresResponse.PhotoStores["+ i +"].Name"));
			photoStore.setRemark(context.stringValue("ListPhotoStoresResponse.PhotoStores["+ i +"].Remark"));
			photoStore.setDefaultQuota(context.longValue("ListPhotoStoresResponse.PhotoStores["+ i +"].DefaultQuota"));
			photoStore.setCtime(context.longValue("ListPhotoStoresResponse.PhotoStores["+ i +"].Ctime"));
			photoStore.setMtime(context.longValue("ListPhotoStoresResponse.PhotoStores["+ i +"].Mtime"));

			List<Bucket> buckets = new ArrayList<Bucket>();
			for (int j = 0; j < context.lengthValue("ListPhotoStoresResponse.PhotoStores["+ i +"].Buckets.Length"); j++) {
				Bucket bucket = new Bucket();
				bucket.setName(context.stringValue("ListPhotoStoresResponse.PhotoStores["+ i +"].Buckets["+ j +"].Name"));
				bucket.setRegion(context.stringValue("ListPhotoStoresResponse.PhotoStores["+ i +"].Buckets["+ j +"].Region"));
				bucket.setState(context.stringValue("ListPhotoStoresResponse.PhotoStores["+ i +"].Buckets["+ j +"].State"));

				buckets.add(bucket);
			}
			photoStore.setBuckets(buckets);

			photoStores.add(photoStore);
		}
		listPhotoStoresResponse.setPhotoStores(photoStores);
	 
	 	return listPhotoStoresResponse;
	}
}