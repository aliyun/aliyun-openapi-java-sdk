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

import com.aliyuncs.companyreg.model.v20200306.ListUserDetailSolutionsResponse;
import com.aliyuncs.companyreg.model.v20200306.ListUserDetailSolutionsResponse.Solution;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserDetailSolutionsResponseUnmarshaller {

	public static ListUserDetailSolutionsResponse unmarshall(ListUserDetailSolutionsResponse listUserDetailSolutionsResponse, UnmarshallerContext _ctx) {
		
		listUserDetailSolutionsResponse.setRequestId(_ctx.stringValue("ListUserDetailSolutionsResponse.RequestId"));
		listUserDetailSolutionsResponse.setCurrentPageNum(_ctx.integerValue("ListUserDetailSolutionsResponse.CurrentPageNum"));
		listUserDetailSolutionsResponse.setPageSize(_ctx.integerValue("ListUserDetailSolutionsResponse.PageSize"));
		listUserDetailSolutionsResponse.setTotalItemNum(_ctx.integerValue("ListUserDetailSolutionsResponse.TotalItemNum"));
		listUserDetailSolutionsResponse.setTotalPageNum(_ctx.integerValue("ListUserDetailSolutionsResponse.TotalPageNum"));

		List<Solution> data = new ArrayList<Solution>();
		for (int i = 0; i < _ctx.lengthValue("ListUserDetailSolutionsResponse.Data.Length"); i++) {
			Solution solution = new Solution();
			solution.setBizId(_ctx.stringValue("ListUserDetailSolutionsResponse.Data["+ i +"].BizId"));
			solution.setBizType(_ctx.stringValue("ListUserDetailSolutionsResponse.Data["+ i +"].BizType"));
			solution.setCreateTime(_ctx.longValue("ListUserDetailSolutionsResponse.Data["+ i +"].CreateTime"));
			solution.setDeliveryOrderBizId(_ctx.stringValue("ListUserDetailSolutionsResponse.Data["+ i +"].DeliveryOrderBizId"));
			solution.setExtInfo(_ctx.stringValue("ListUserDetailSolutionsResponse.Data["+ i +"].ExtInfo"));
			solution.setIntentionAssignBizId(_ctx.stringValue("ListUserDetailSolutionsResponse.Data["+ i +"].IntentionAssignBizId"));
			solution.setIntentionBizId(_ctx.stringValue("ListUserDetailSolutionsResponse.Data["+ i +"].IntentionBizId"));
			solution.setPartnerCode(_ctx.stringValue("ListUserDetailSolutionsResponse.Data["+ i +"].PartnerCode"));
			solution.setReason(_ctx.stringValue("ListUserDetailSolutionsResponse.Data["+ i +"].Reason"));
			solution.setStatus(_ctx.integerValue("ListUserDetailSolutionsResponse.Data["+ i +"].Status"));
			solution.setUpdateTime(_ctx.longValue("ListUserDetailSolutionsResponse.Data["+ i +"].UpdateTime"));
			solution.setUserId(_ctx.stringValue("ListUserDetailSolutionsResponse.Data["+ i +"].UserId"));

			data.add(solution);
		}
		listUserDetailSolutionsResponse.setData(data);
	 
	 	return listUserDetailSolutionsResponse;
	}
}