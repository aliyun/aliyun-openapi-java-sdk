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

import com.aliyuncs.csas.model.v20230120.ListRegistrationPoliciesResponse;
import com.aliyuncs.csas.model.v20230120.ListRegistrationPoliciesResponse.DataList;
import com.aliyuncs.csas.model.v20230120.ListRegistrationPoliciesResponse.DataList.LimitDetailItem;
import com.aliyuncs.csas.model.v20230120.ListRegistrationPoliciesResponse.DataList.LimitDetailItem.LimitCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRegistrationPoliciesResponseUnmarshaller {

	public static ListRegistrationPoliciesResponse unmarshall(ListRegistrationPoliciesResponse listRegistrationPoliciesResponse, UnmarshallerContext _ctx) {
		
		listRegistrationPoliciesResponse.setRequestId(_ctx.stringValue("ListRegistrationPoliciesResponse.RequestId"));
		listRegistrationPoliciesResponse.setTotalNum(_ctx.stringValue("ListRegistrationPoliciesResponse.TotalNum"));

		List<DataList> policies = new ArrayList<DataList>();
		for (int i = 0; i < _ctx.lengthValue("ListRegistrationPoliciesResponse.Policies.Length"); i++) {
			DataList dataList = new DataList();
			dataList.setName(_ctx.stringValue("ListRegistrationPoliciesResponse.Policies["+ i +"].Name"));
			dataList.setPolicyId(_ctx.stringValue("ListRegistrationPoliciesResponse.Policies["+ i +"].PolicyId"));
			dataList.setDescription(_ctx.stringValue("ListRegistrationPoliciesResponse.Policies["+ i +"].Description"));
			dataList.setPriority(_ctx.longValue("ListRegistrationPoliciesResponse.Policies["+ i +"].Priority"));
			dataList.setStatus(_ctx.stringValue("ListRegistrationPoliciesResponse.Policies["+ i +"].Status"));
			dataList.setMatchMode(_ctx.stringValue("ListRegistrationPoliciesResponse.Policies["+ i +"].MatchMode"));
			dataList.setCreateTime(_ctx.stringValue("ListRegistrationPoliciesResponse.Policies["+ i +"].CreateTime"));

			List<String> whitelist = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRegistrationPoliciesResponse.Policies["+ i +"].Whitelist.Length"); j++) {
				whitelist.add(_ctx.stringValue("ListRegistrationPoliciesResponse.Policies["+ i +"].Whitelist["+ j +"]"));
			}
			dataList.setWhitelist(whitelist);

			List<String> userGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRegistrationPoliciesResponse.Policies["+ i +"].UserGroupIds.Length"); j++) {
				userGroupIds.add(_ctx.stringValue("ListRegistrationPoliciesResponse.Policies["+ i +"].UserGroupIds["+ j +"]"));
			}
			dataList.setUserGroupIds(userGroupIds);

			List<LimitDetailItem> limitDetail = new ArrayList<LimitDetailItem>();
			for (int j = 0; j < _ctx.lengthValue("ListRegistrationPoliciesResponse.Policies["+ i +"].LimitDetail.Length"); j++) {
				LimitDetailItem limitDetailItem = new LimitDetailItem();
				limitDetailItem.setDeviceBelong(_ctx.stringValue("ListRegistrationPoliciesResponse.Policies["+ i +"].LimitDetail["+ j +"].DeviceBelong"));
				limitDetailItem.setLimitType(_ctx.stringValue("ListRegistrationPoliciesResponse.Policies["+ i +"].LimitDetail["+ j +"].LimitType"));

				LimitCount limitCount = new LimitCount();
				limitCount.setAll(_ctx.integerValue("ListRegistrationPoliciesResponse.Policies["+ i +"].LimitDetail["+ j +"].LimitCount.All"));
				limitCount.setPC(_ctx.integerValue("ListRegistrationPoliciesResponse.Policies["+ i +"].LimitDetail["+ j +"].LimitCount.PC"));
				limitCount.setMobile(_ctx.integerValue("ListRegistrationPoliciesResponse.Policies["+ i +"].LimitDetail["+ j +"].LimitCount.Mobile"));
				limitDetailItem.setLimitCount(limitCount);

				limitDetail.add(limitDetailItem);
			}
			dataList.setLimitDetail(limitDetail);

			policies.add(dataList);
		}
		listRegistrationPoliciesResponse.setPolicies(policies);
	 
	 	return listRegistrationPoliciesResponse;
	}
}