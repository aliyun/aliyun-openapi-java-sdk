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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.ListControlPoliciesResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListControlPoliciesResponse.ControlPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListControlPoliciesResponseUnmarshaller {

	public static ListControlPoliciesResponse unmarshall(ListControlPoliciesResponse listControlPoliciesResponse, UnmarshallerContext _ctx) {
		
		listControlPoliciesResponse.setRequestId(_ctx.stringValue("ListControlPoliciesResponse.RequestId"));
		listControlPoliciesResponse.setTotalCount(_ctx.integerValue("ListControlPoliciesResponse.TotalCount"));
		listControlPoliciesResponse.setPageSize(_ctx.integerValue("ListControlPoliciesResponse.PageSize"));
		listControlPoliciesResponse.setPageNumber(_ctx.integerValue("ListControlPoliciesResponse.PageNumber"));

		List<ControlPolicy> controlPolicies = new ArrayList<ControlPolicy>();
		for (int i = 0; i < _ctx.lengthValue("ListControlPoliciesResponse.ControlPolicies.Length"); i++) {
			ControlPolicy controlPolicy = new ControlPolicy();
			controlPolicy.setUpdateDate(_ctx.stringValue("ListControlPoliciesResponse.ControlPolicies["+ i +"].UpdateDate"));
			controlPolicy.setDescription(_ctx.stringValue("ListControlPoliciesResponse.ControlPolicies["+ i +"].Description"));
			controlPolicy.setEffectScope(_ctx.stringValue("ListControlPoliciesResponse.ControlPolicies["+ i +"].EffectScope"));
			controlPolicy.setAttachmentCount(_ctx.stringValue("ListControlPoliciesResponse.ControlPolicies["+ i +"].AttachmentCount"));
			controlPolicy.setPolicyName(_ctx.stringValue("ListControlPoliciesResponse.ControlPolicies["+ i +"].PolicyName"));
			controlPolicy.setPolicyId(_ctx.stringValue("ListControlPoliciesResponse.ControlPolicies["+ i +"].PolicyId"));
			controlPolicy.setCreateDate(_ctx.stringValue("ListControlPoliciesResponse.ControlPolicies["+ i +"].CreateDate"));
			controlPolicy.setPolicyType(_ctx.stringValue("ListControlPoliciesResponse.ControlPolicies["+ i +"].PolicyType"));

			controlPolicies.add(controlPolicy);
		}
		listControlPoliciesResponse.setControlPolicies(controlPolicies);
	 
	 	return listControlPoliciesResponse;
	}
}