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

import com.aliyuncs.csas.model.v20230120.GetRegistrationPolicyResponse;
import com.aliyuncs.csas.model.v20230120.GetRegistrationPolicyResponse.LimitDetailItem;
import com.aliyuncs.csas.model.v20230120.GetRegistrationPolicyResponse.LimitDetailItem.LimitCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRegistrationPolicyResponseUnmarshaller {

	public static GetRegistrationPolicyResponse unmarshall(GetRegistrationPolicyResponse getRegistrationPolicyResponse, UnmarshallerContext _ctx) {
		
		getRegistrationPolicyResponse.setRequestId(_ctx.stringValue("GetRegistrationPolicyResponse.RequestId"));
		getRegistrationPolicyResponse.setName(_ctx.stringValue("GetRegistrationPolicyResponse.Name"));
		getRegistrationPolicyResponse.setPolicyId(_ctx.stringValue("GetRegistrationPolicyResponse.PolicyId"));
		getRegistrationPolicyResponse.setDescription(_ctx.stringValue("GetRegistrationPolicyResponse.Description"));
		getRegistrationPolicyResponse.setPriority(_ctx.longValue("GetRegistrationPolicyResponse.Priority"));
		getRegistrationPolicyResponse.setStatus(_ctx.stringValue("GetRegistrationPolicyResponse.Status"));
		getRegistrationPolicyResponse.setMatchMode(_ctx.stringValue("GetRegistrationPolicyResponse.MatchMode"));
		getRegistrationPolicyResponse.setCreateTime(_ctx.stringValue("GetRegistrationPolicyResponse.CreateTime"));

		List<String> whitelist = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegistrationPolicyResponse.Whitelist.Length"); i++) {
			whitelist.add(_ctx.stringValue("GetRegistrationPolicyResponse.Whitelist["+ i +"]"));
		}
		getRegistrationPolicyResponse.setWhitelist(whitelist);

		List<String> userGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegistrationPolicyResponse.UserGroupIds.Length"); i++) {
			userGroupIds.add(_ctx.stringValue("GetRegistrationPolicyResponse.UserGroupIds["+ i +"]"));
		}
		getRegistrationPolicyResponse.setUserGroupIds(userGroupIds);

		List<LimitDetailItem> limitDetail = new ArrayList<LimitDetailItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRegistrationPolicyResponse.LimitDetail.Length"); i++) {
			LimitDetailItem limitDetailItem = new LimitDetailItem();
			limitDetailItem.setDeviceBelong(_ctx.stringValue("GetRegistrationPolicyResponse.LimitDetail["+ i +"].DeviceBelong"));
			limitDetailItem.setLimitType(_ctx.stringValue("GetRegistrationPolicyResponse.LimitDetail["+ i +"].LimitType"));

			LimitCount limitCount = new LimitCount();
			limitCount.setAll(_ctx.integerValue("GetRegistrationPolicyResponse.LimitDetail["+ i +"].LimitCount.All"));
			limitCount.setPC(_ctx.integerValue("GetRegistrationPolicyResponse.LimitDetail["+ i +"].LimitCount.PC"));
			limitCount.setMobile(_ctx.integerValue("GetRegistrationPolicyResponse.LimitDetail["+ i +"].LimitCount.Mobile"));
			limitDetailItem.setLimitCount(limitCount);

			limitDetail.add(limitDetailItem);
		}
		getRegistrationPolicyResponse.setLimitDetail(limitDetail);
	 
	 	return getRegistrationPolicyResponse;
	}
}