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
package com.aliyuncs.ossadmin.transform.v20150520;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.ossadmin.model.v20150520.GetBucketVipsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBucketVipsResponseUnmarshaller {

	public static GetBucketVipsResponse unmarshall(GetBucketVipsResponse getBucketVipsResponse, UnmarshallerContext context) {
		
		getBucketVipsResponse.setrequestId(context.stringValue("GetBucketVipsResponse.requestId"));

		List<String> vipList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetBucketVipsResponse.vipList.Length"); i++) {
			vipList.add(context.stringValue("GetBucketVipsResponse.vipList["+ i +"]"));
		}
		getBucketVipsResponse.setvipList(vipList);
	 
	 	return getBucketVipsResponse;
	}
}