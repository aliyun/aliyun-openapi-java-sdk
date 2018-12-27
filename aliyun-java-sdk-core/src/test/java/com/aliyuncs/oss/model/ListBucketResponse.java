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
package com.aliyuncs.oss.model;

import java.util.List;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.oss.transform.ListBucketResponseUnmashaller;
import com.aliyuncs.transform.UnmarshallerContext;

public class ListBucketResponse extends AcsResponse {

    private Owner owner;
    private List<Bucket> buckets;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Bucket> getBuckets() {
        return buckets;
    }

    public void setBuckets(List<Bucket> buckets) {
        this.buckets = buckets;
    }

    @Override
    public ListBucketResponse getInstance(UnmarshallerContext context) {
        return ListBucketResponseUnmashaller.unmarshall(this, context);
    }

}
