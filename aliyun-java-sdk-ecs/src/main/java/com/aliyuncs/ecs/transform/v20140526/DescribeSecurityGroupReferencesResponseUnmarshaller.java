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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupReferencesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupReferencesResponse.SecurityGroupReference;
import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupReferencesResponse.SecurityGroupReference.ReferencingSecurityGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityGroupReferencesResponseUnmarshaller {

	public static DescribeSecurityGroupReferencesResponse unmarshall(DescribeSecurityGroupReferencesResponse describeSecurityGroupReferencesResponse, UnmarshallerContext _ctx) {
		
		describeSecurityGroupReferencesResponse.setRequestId(_ctx.stringValue("DescribeSecurityGroupReferencesResponse.RequestId"));

		List<SecurityGroupReference> securityGroupReferences = new ArrayList<SecurityGroupReference>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityGroupReferencesResponse.SecurityGroupReferences.Length"); i++) {
			SecurityGroupReference securityGroupReference = new SecurityGroupReference();
			securityGroupReference.setSecurityGroupId(_ctx.stringValue("DescribeSecurityGroupReferencesResponse.SecurityGroupReferences["+ i +"].SecurityGroupId"));

			List<ReferencingSecurityGroup> referencingSecurityGroups = new ArrayList<ReferencingSecurityGroup>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSecurityGroupReferencesResponse.SecurityGroupReferences["+ i +"].ReferencingSecurityGroups.Length"); j++) {
				ReferencingSecurityGroup referencingSecurityGroup = new ReferencingSecurityGroup();
				referencingSecurityGroup.setAliUid(_ctx.stringValue("DescribeSecurityGroupReferencesResponse.SecurityGroupReferences["+ i +"].ReferencingSecurityGroups["+ j +"].AliUid"));
				referencingSecurityGroup.setSecurityGroupId(_ctx.stringValue("DescribeSecurityGroupReferencesResponse.SecurityGroupReferences["+ i +"].ReferencingSecurityGroups["+ j +"].SecurityGroupId"));

				referencingSecurityGroups.add(referencingSecurityGroup);
			}
			securityGroupReference.setReferencingSecurityGroups(referencingSecurityGroups);

			securityGroupReferences.add(securityGroupReference);
		}
		describeSecurityGroupReferencesResponse.setSecurityGroupReferences(securityGroupReferences);
	 
	 	return describeSecurityGroupReferencesResponse;
	}
}