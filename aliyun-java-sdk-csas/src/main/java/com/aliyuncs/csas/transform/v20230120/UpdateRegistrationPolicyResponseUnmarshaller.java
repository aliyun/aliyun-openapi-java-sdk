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

import com.aliyuncs.csas.model.v20230120.UpdateRegistrationPolicyResponse;
import com.aliyuncs.csas.model.v20230120.UpdateRegistrationPolicyResponse.Policy;
import com.aliyuncs.csas.model.v20230120.UpdateRegistrationPolicyResponse.Policy.LimitDetailItem;
import com.aliyuncs.csas.model.v20230120.UpdateRegistrationPolicyResponse.Policy.LimitDetailItem.LimitCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRegistrationPolicyResponseUnmarshaller {

	public static UpdateRegistrationPolicyResponse unmarshall(UpdateRegistrationPolicyResponse updateRegistrationPolicyResponse, UnmarshallerContext _ctx) {
		
		updateRegistrationPolicyResponse.setRequestId(_ctx.stringValue("UpdateRegistrationPolicyResponse.RequestId"));

		Policy policy = new Policy();
		policy.setName(_ctx.stringValue("UpdateRegistrationPolicyResponse.Policy.Name"));
		policy.setPolicyId(_ctx.stringValue("UpdateRegistrationPolicyResponse.Policy.PolicyId"));
		policy.setPriority(_ctx.stringValue("UpdateRegistrationPolicyResponse.Policy.Priority"));
		policy.setDescription(_ctx.stringValue("UpdateRegistrationPolicyResponse.Policy.Description"));
		policy.setStatus(_ctx.stringValue("UpdateRegistrationPolicyResponse.Policy.Status"));
		policy.setMatchMode(_ctx.stringValue("UpdateRegistrationPolicyResponse.Policy.MatchMode"));
		policy.setCreateTime(_ctx.stringValue("UpdateRegistrationPolicyResponse.Policy.CreateTime"));

		List<String> whitelist = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateRegistrationPolicyResponse.Policy.Whitelist.Length"); i++) {
			whitelist.add(_ctx.stringValue("UpdateRegistrationPolicyResponse.Policy.Whitelist["+ i +"]"));
		}
		policy.setWhitelist(whitelist);

		List<String> userGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateRegistrationPolicyResponse.Policy.UserGroupIds.Length"); i++) {
			userGroupIds.add(_ctx.stringValue("UpdateRegistrationPolicyResponse.Policy.UserGroupIds["+ i +"]"));
		}
		policy.setUserGroupIds(userGroupIds);

		List<LimitDetailItem> limitDetail = new ArrayList<LimitDetailItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateRegistrationPolicyResponse.Policy.LimitDetail.Length"); i++) {
			LimitDetailItem limitDetailItem = new LimitDetailItem();
			limitDetailItem.setDeviceBelong(_ctx.stringValue("UpdateRegistrationPolicyResponse.Policy.LimitDetail["+ i +"].DeviceBelong"));
			limitDetailItem.setLimitType(_ctx.stringValue("UpdateRegistrationPolicyResponse.Policy.LimitDetail["+ i +"].LimitType"));

			LimitCount limitCount = new LimitCount();
			limitCount.setAll(_ctx.integerValue("UpdateRegistrationPolicyResponse.Policy.LimitDetail["+ i +"].LimitCount.All"));
			limitCount.setPC(_ctx.integerValue("UpdateRegistrationPolicyResponse.Policy.LimitDetail["+ i +"].LimitCount.PC"));
			limitCount.setMobile(_ctx.integerValue("UpdateRegistrationPolicyResponse.Policy.LimitDetail["+ i +"].LimitCount.Mobile"));
			limitDetailItem.setLimitCount(limitCount);

			limitDetail.add(limitDetailItem);
		}
		policy.setLimitDetail(limitDetail);
		updateRegistrationPolicyResponse.setPolicy(policy);
	 
	 	return updateRegistrationPolicyResponse;
	}
}