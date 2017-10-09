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
package com.aliyuncs.ram.transform.v20150501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ram.model.v20150501.ListPoliciesResponse;
import com.aliyuncs.ram.model.v20150501.ListPoliciesResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPoliciesResponseUnmarshaller {

	public static ListPoliciesResponse unmarshall(ListPoliciesResponse listPoliciesResponse, UnmarshallerContext context) {
		
		listPoliciesResponse.setRequestId(context.stringValue("ListPoliciesResponse.RequestId"));
		listPoliciesResponse.setIsTruncated(context.booleanValue("ListPoliciesResponse.IsTruncated"));
		listPoliciesResponse.setMarker(context.stringValue("ListPoliciesResponse.Marker"));

		List<Policy> policies = new ArrayList<Policy>();
		for (int i = 0; i < context.lengthValue("ListPoliciesResponse.Policies.Length"); i++) {
			Policy policy = new Policy();
			policy.setPolicyName(context.stringValue("ListPoliciesResponse.Policies["+ i +"].PolicyName"));
			policy.setPolicyType(context.stringValue("ListPoliciesResponse.Policies["+ i +"].PolicyType"));
			policy.setDescription(context.stringValue("ListPoliciesResponse.Policies["+ i +"].Description"));
			policy.setDefaultVersion(context.stringValue("ListPoliciesResponse.Policies["+ i +"].DefaultVersion"));
			policy.setCreateDate(context.stringValue("ListPoliciesResponse.Policies["+ i +"].CreateDate"));
			policy.setUpdateDate(context.stringValue("ListPoliciesResponse.Policies["+ i +"].UpdateDate"));
			policy.setAttachmentCount(context.integerValue("ListPoliciesResponse.Policies["+ i +"].AttachmentCount"));

			policies.add(policy);
		}
		listPoliciesResponse.setPolicies(policies);
	 
	 	return listPoliciesResponse;
	}
}