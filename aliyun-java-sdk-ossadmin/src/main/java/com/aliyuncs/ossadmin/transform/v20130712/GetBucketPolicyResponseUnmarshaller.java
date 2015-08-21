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
package com.aliyuncs.ossadmin.transform.v20130712;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.ossadmin.model.v20130712.GetBucketPolicyResponse;
import com.aliyuncs.ossadmin.model.v20130712.GetBucketPolicyResponse.WhiteReferList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBucketPolicyResponseUnmarshaller {

	public static GetBucketPolicyResponse unmarshall(GetBucketPolicyResponse getBucketPolicyResponse, UnmarshallerContext context) {
		
		getBucketPolicyResponse.setDisallowEmptyRefer(context.booleanValue("GetBucketPolicyResponse.DisallowEmptyRefer"));
		getBucketPolicyResponse.setEnableDualCluster(context.booleanValue("GetBucketPolicyResponse.EnableDualCluster"));
		getBucketPolicyResponse.setErrorFile(context.stringValue("GetBucketPolicyResponse.ErrorFile"));
		getBucketPolicyResponse.setIndexFile(context.stringValue("GetBucketPolicyResponse.IndexFile"));
		getBucketPolicyResponse.setLocation(context.stringValue("GetBucketPolicyResponse.Location"));
		getBucketPolicyResponse.setLogBucket(context.stringValue("GetBucketPolicyResponse.LogBucket"));
		getBucketPolicyResponse.setLogPrefix(context.stringValue("GetBucketPolicyResponse.LogPrefix"));
		getBucketPolicyResponse.setIamPolicy(context.stringValue("GetBucketPolicyResponse.IamPolicy"));

		WhiteReferList  whiteReferList = new WhiteReferList();

		List<String> referList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetBucketPolicyResponse.WhiteReferList.ReferList.Length"); i++) {
			referList.add(context.stringValue("GetBucketPolicyResponse.WhiteReferList.ReferList["+ i +"]"));
		}
		whiteReferList.setReferList(referList);
		getBucketPolicyResponse.setWhiteReferList(whiteReferList);
	 
	 	return getBucketPolicyResponse;
	}
}