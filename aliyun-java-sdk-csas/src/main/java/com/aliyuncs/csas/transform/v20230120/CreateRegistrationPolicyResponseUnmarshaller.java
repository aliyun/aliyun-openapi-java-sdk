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

import com.aliyuncs.csas.model.v20230120.CreateRegistrationPolicyResponse;
import com.aliyuncs.csas.model.v20230120.CreateRegistrationPolicyResponse.Policy;
import com.aliyuncs.csas.model.v20230120.CreateRegistrationPolicyResponse.Policy.LimitDetailItem;
import com.aliyuncs.csas.model.v20230120.CreateRegistrationPolicyResponse.Policy.LimitDetailItem.LimitCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRegistrationPolicyResponseUnmarshaller {

	public static CreateRegistrationPolicyResponse unmarshall(CreateRegistrationPolicyResponse createRegistrationPolicyResponse, UnmarshallerContext _ctx) {
		
		createRegistrationPolicyResponse.setRequestId(_ctx.stringValue("CreateRegistrationPolicyResponse.RequestId"));

		Policy policy = new Policy();
		policy.setName(_ctx.stringValue("CreateRegistrationPolicyResponse.Policy.Name"));
		policy.setPolicyId(_ctx.stringValue("CreateRegistrationPolicyResponse.Policy.PolicyId"));
		policy.setPriority(_ctx.stringValue("CreateRegistrationPolicyResponse.Policy.Priority"));
		policy.setDescription(_ctx.stringValue("CreateRegistrationPolicyResponse.Policy.Description"));
		policy.setStatus(_ctx.stringValue("CreateRegistrationPolicyResponse.Policy.Status"));
		policy.setMatchMode(_ctx.stringValue("CreateRegistrationPolicyResponse.Policy.MatchMode"));
		policy.setCreateTime(_ctx.stringValue("CreateRegistrationPolicyResponse.Policy.CreateTime"));

		List<String> whitelist = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateRegistrationPolicyResponse.Policy.Whitelist.Length"); i++) {
			whitelist.add(_ctx.stringValue("CreateRegistrationPolicyResponse.Policy.Whitelist["+ i +"]"));
		}
		policy.setWhitelist(whitelist);

		List<String> userGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateRegistrationPolicyResponse.Policy.UserGroupIds.Length"); i++) {
			userGroupIds.add(_ctx.stringValue("CreateRegistrationPolicyResponse.Policy.UserGroupIds["+ i +"]"));
		}
		policy.setUserGroupIds(userGroupIds);

		List<LimitDetailItem> limitDetail = new ArrayList<LimitDetailItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateRegistrationPolicyResponse.Policy.LimitDetail.Length"); i++) {
			LimitDetailItem limitDetailItem = new LimitDetailItem();
			limitDetailItem.setDeviceBelong(_ctx.stringValue("CreateRegistrationPolicyResponse.Policy.LimitDetail["+ i +"].DeviceBelong"));
			limitDetailItem.setLimitType(_ctx.stringValue("CreateRegistrationPolicyResponse.Policy.LimitDetail["+ i +"].LimitType"));

			LimitCount limitCount = new LimitCount();
			limitCount.setAll(_ctx.integerValue("CreateRegistrationPolicyResponse.Policy.LimitDetail["+ i +"].LimitCount.All"));
			limitCount.setPC(_ctx.integerValue("CreateRegistrationPolicyResponse.Policy.LimitDetail["+ i +"].LimitCount.PC"));
			limitCount.setMobile(_ctx.integerValue("CreateRegistrationPolicyResponse.Policy.LimitDetail["+ i +"].LimitCount.Mobile"));
			limitDetailItem.setLimitCount(limitCount);

			limitDetail.add(limitDetailItem);
		}
		policy.setLimitDetail(limitDetail);
		createRegistrationPolicyResponse.setPolicy(policy);
	 
	 	return createRegistrationPolicyResponse;
	}
}