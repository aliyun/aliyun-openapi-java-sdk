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

package com.aliyuncs.companyreg.transform.v20200306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20200306.ListUserSolutionsResponse;
import com.aliyuncs.companyreg.model.v20200306.ListUserSolutionsResponse.Solution;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserSolutionsResponseUnmarshaller {

	public static ListUserSolutionsResponse unmarshall(ListUserSolutionsResponse listUserSolutionsResponse, UnmarshallerContext _ctx) {
		
		listUserSolutionsResponse.setRequestId(_ctx.stringValue("ListUserSolutionsResponse.RequestId"));
		listUserSolutionsResponse.setTotalItemNum(_ctx.integerValue("ListUserSolutionsResponse.TotalItemNum"));
		listUserSolutionsResponse.setCurrentPageNum(_ctx.integerValue("ListUserSolutionsResponse.CurrentPageNum"));
		listUserSolutionsResponse.setPageSize(_ctx.integerValue("ListUserSolutionsResponse.PageSize"));
		listUserSolutionsResponse.setTotalPageNum(_ctx.integerValue("ListUserSolutionsResponse.TotalPageNum"));

		List<Solution> data = new ArrayList<Solution>();
		for (int i = 0; i < _ctx.lengthValue("ListUserSolutionsResponse.Data.Length"); i++) {
			Solution solution = new Solution();
			solution.setBizType(_ctx.stringValue("ListUserSolutionsResponse.Data["+ i +"].BizType"));
			solution.setBizId(_ctx.stringValue("ListUserSolutionsResponse.Data["+ i +"].BizId"));
			solution.setUserId(_ctx.stringValue("ListUserSolutionsResponse.Data["+ i +"].UserId"));
			solution.setIntentionBizId(_ctx.stringValue("ListUserSolutionsResponse.Data["+ i +"].IntentionBizId"));
			solution.setPartnerCode(_ctx.stringValue("ListUserSolutionsResponse.Data["+ i +"].PartnerCode"));
			solution.setStatus(_ctx.integerValue("ListUserSolutionsResponse.Data["+ i +"].Status"));
			solution.setReason(_ctx.stringValue("ListUserSolutionsResponse.Data["+ i +"].Reason"));
			solution.setUpdateTime(_ctx.longValue("ListUserSolutionsResponse.Data["+ i +"].UpdateTime"));
			solution.setCreateTime(_ctx.longValue("ListUserSolutionsResponse.Data["+ i +"].CreateTime"));
			solution.setDeliveryOrderBizId(_ctx.stringValue("ListUserSolutionsResponse.Data["+ i +"].DeliveryOrderBizId"));
			solution.setIntentionAssignBizId(_ctx.stringValue("ListUserSolutionsResponse.Data["+ i +"].IntentionAssignBizId"));

			data.add(solution);
		}
		listUserSolutionsResponse.setData(data);
	 
	 	return listUserSolutionsResponse;
	}
}