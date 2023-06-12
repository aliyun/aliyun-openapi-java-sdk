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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListPolicesForPrivateAccessApplicationResponse;
import com.aliyuncs.csas.model.v20230120.ListPolicesForPrivateAccessApplicationResponse.Application;
import com.aliyuncs.csas.model.v20230120.ListPolicesForPrivateAccessApplicationResponse.Application.Policy;
import com.aliyuncs.csas.model.v20230120.ListPolicesForPrivateAccessApplicationResponse.Application.Policy.CustomUserAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPolicesForPrivateAccessApplicationResponseUnmarshaller {

	public static ListPolicesForPrivateAccessApplicationResponse unmarshall(ListPolicesForPrivateAccessApplicationResponse listPolicesForPrivateAccessApplicationResponse, UnmarshallerContext _ctx) {
		
		listPolicesForPrivateAccessApplicationResponse.setRequestId(_ctx.stringValue("ListPolicesForPrivateAccessApplicationResponse.RequestId"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListPolicesForPrivateAccessApplicationResponse.Applications.Length"); i++) {
			Application application = new Application();
			application.setApplicationId(_ctx.stringValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].ApplicationId"));

			List<Policy> policies = new ArrayList<Policy>();
			for (int j = 0; j < _ctx.lengthValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies.Length"); j++) {
				Policy policy = new Policy();
				policy.setPolicyId(_ctx.stringValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].PolicyId"));
				policy.setName(_ctx.stringValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].Name"));
				policy.setDescription(_ctx.stringValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].Description"));
				policy.setPolicyAction(_ctx.stringValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].PolicyAction"));
				policy.setPriority(_ctx.integerValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].Priority"));
				policy.setStatus(_ctx.stringValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].Status"));
				policy.setApplicationType(_ctx.stringValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].ApplicationType"));
				policy.setUserGroupType(_ctx.stringValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].UserGroupType"));
				policy.setCreateTime(_ctx.stringValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].CreateTime"));

				List<CustomUserAttribute> customUserAttributes = new ArrayList<CustomUserAttribute>();
				for (int k = 0; k < _ctx.lengthValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].CustomUserAttributes.Length"); k++) {
					CustomUserAttribute customUserAttribute = new CustomUserAttribute();
					customUserAttribute.setUserGroupType(_ctx.stringValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].CustomUserAttributes["+ k +"].UserGroupType"));
					customUserAttribute.setRelation(_ctx.stringValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].CustomUserAttributes["+ k +"].Relation"));
					customUserAttribute.setValue(_ctx.stringValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].CustomUserAttributes["+ k +"].Value"));
					customUserAttribute.setIdpId(_ctx.integerValue("ListPolicesForPrivateAccessApplicationResponse.Applications["+ i +"].Policies["+ j +"].CustomUserAttributes["+ k +"].IdpId"));

					customUserAttributes.add(customUserAttribute);
				}
				policy.setCustomUserAttributes(customUserAttributes);

				policies.add(policy);
			}
			application.setPolicies(policies);

			applications.add(application);
		}
		listPolicesForPrivateAccessApplicationResponse.setApplications(applications);
	 
	 	return listPolicesForPrivateAccessApplicationResponse;
	}
}