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
package com.aliyuncs.oss.transform;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oss.model.Bucket;
import com.aliyuncs.oss.model.ListBucketResponse;
import com.aliyuncs.oss.model.Owner;
import com.aliyuncs.transform.UnmarshallerContext;

public class ListBucketResponseUnmashaller {
    public static ListBucketResponse unmarshall(ListBucketResponse listBucketResponse,
                                                UnmarshallerContext context) {

        Owner owner = new Owner();
        owner.setId(context.stringValue("ListBucketResponse.Owner.ID"));
        owner.setDisplayName(context.stringValue("ListBucketResponse.Owner.DisplayName"));
        listBucketResponse.setOwner(owner);

        List<Bucket> buckets = new ArrayList<Bucket>();
        for (int i = 0; i < context.lengthValue("ListBucketResponse.Buckets.Length"); i++) {
            Bucket bucket = new Bucket();
            bucket.setLocation(context.stringValue("ListBucketResponse.Buckets[" + i + "].Location"));
            bucket.setName(context.stringValue("ListBucketResponse.Buckets[" + i + "].Name"));
            bucket.setCreationDate(context.stringValue("ListBucketResponse.Buckets[" + i + "].CreationDate"));
            buckets.add(bucket);
        }
        listBucketResponse.setBuckets(buckets);

        return listBucketResponse;
    }
}
