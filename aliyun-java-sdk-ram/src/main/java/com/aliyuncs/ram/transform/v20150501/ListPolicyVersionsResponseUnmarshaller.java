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
package com.aliyuncs.ram.transform.v20150501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ram.model.v20150501.ListPolicyVersionsResponse;
import com.aliyuncs.ram.model.v20150501.ListPolicyVersionsResponse.PolicyVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPolicyVersionsResponseUnmarshaller {

	public static ListPolicyVersionsResponse unmarshall(ListPolicyVersionsResponse listPolicyVersionsResponse, UnmarshallerContext context) {
		
		listPolicyVersionsResponse.setRequestId(context.stringValue("ListPolicyVersionsResponse.RequestId"));

		List<PolicyVersion> policyVersions = new ArrayList<PolicyVersion>();
		for (int i = 0; i < context.lengthValue("ListPolicyVersionsResponse.PolicyVersions.Length"); i++) {
			PolicyVersion policyVersion = new PolicyVersion();
			policyVersion.setVersionId(context.stringValue("ListPolicyVersionsResponse.PolicyVersions["+ i +"].VersionId"));
			policyVersion.setIsDefaultVersion(context.booleanValue("ListPolicyVersionsResponse.PolicyVersions["+ i +"].IsDefaultVersion"));
			policyVersion.setPolicyDocument(context.stringValue("ListPolicyVersionsResponse.PolicyVersions["+ i +"].PolicyDocument"));
			policyVersion.setCreateDate(context.stringValue("ListPolicyVersionsResponse.PolicyVersions["+ i +"].CreateDate"));

			policyVersions.add(policyVersion);
		}
		listPolicyVersionsResponse.setPolicyVersions(policyVersions);
	 
	 	return listPolicyVersionsResponse;
	}
}