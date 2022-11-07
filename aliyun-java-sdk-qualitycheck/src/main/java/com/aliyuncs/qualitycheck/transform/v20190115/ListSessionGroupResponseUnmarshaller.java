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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListSessionGroupResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListSessionGroupResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSessionGroupResponseUnmarshaller {

	public static ListSessionGroupResponse unmarshall(ListSessionGroupResponse listSessionGroupResponse, UnmarshallerContext _ctx) {
		
		listSessionGroupResponse.setRequestId(_ctx.stringValue("ListSessionGroupResponse.RequestId"));
		listSessionGroupResponse.setCount(_ctx.integerValue("ListSessionGroupResponse.Count"));
		listSessionGroupResponse.setCurrentPage(_ctx.integerValue("ListSessionGroupResponse.CurrentPage"));
		listSessionGroupResponse.setPageSize(_ctx.integerValue("ListSessionGroupResponse.PageSize"));
		listSessionGroupResponse.setPageNumber(_ctx.integerValue("ListSessionGroupResponse.PageNumber"));
		listSessionGroupResponse.setResultCountId(_ctx.stringValue("ListSessionGroupResponse.ResultCountId"));
		listSessionGroupResponse.setLastDataId(_ctx.stringValue("ListSessionGroupResponse.LastDataId"));
		listSessionGroupResponse.setSuccess(_ctx.booleanValue("ListSessionGroupResponse.Success"));
		listSessionGroupResponse.setCode(_ctx.stringValue("ListSessionGroupResponse.Code"));
		listSessionGroupResponse.setMessage(_ctx.stringValue("ListSessionGroupResponse.Message"));
		listSessionGroupResponse.setHttpStatusCode(_ctx.integerValue("ListSessionGroupResponse.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListSessionGroupResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("ListSessionGroupResponse.Messages["+ i +"]"));
		}
		listSessionGroupResponse.setMessages(messages);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSessionGroupResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSessionGroupId(_ctx.stringValue("ListSessionGroupResponse.Data["+ i +"].SessionGroupId"));
			dataItem.setSchemeTaskConfigId(_ctx.longValue("ListSessionGroupResponse.Data["+ i +"].SchemeTaskConfigId"));
			dataItem.setSchemeTaskConfigName(_ctx.stringValue("ListSessionGroupResponse.Data["+ i +"].SchemeTaskConfigName"));
			dataItem.setScore(_ctx.longValue("ListSessionGroupResponse.Data["+ i +"].Score"));
			dataItem.setSessionCount(_ctx.integerValue("ListSessionGroupResponse.Data["+ i +"].SessionCount"));
			dataItem.setHitSessionCount(_ctx.integerValue("ListSessionGroupResponse.Data["+ i +"].HitSessionCount"));
			dataItem.setCallStartTime(_ctx.stringValue("ListSessionGroupResponse.Data["+ i +"].CallStartTime"));
			dataItem.setReviewStatus(_ctx.integerValue("ListSessionGroupResponse.Data["+ i +"].ReviewStatus"));
			dataItem.setAssignStatus(_ctx.integerValue("ListSessionGroupResponse.Data["+ i +"].AssignStatus"));
			dataItem.setSessionGroupReviewedOrComplained(_ctx.booleanValue("ListSessionGroupResponse.Data["+ i +"].SessionGroupReviewedOrComplained"));
			dataItem.setLastDataId(_ctx.stringValue("ListSessionGroupResponse.Data["+ i +"].LastDataId"));

			List<String> customerServiceIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSessionGroupResponse.Data["+ i +"].CustomerServiceIdList.Length"); j++) {
				customerServiceIdList.add(_ctx.stringValue("ListSessionGroupResponse.Data["+ i +"].CustomerServiceIdList["+ j +"]"));
			}
			dataItem.setCustomerServiceIdList(customerServiceIdList);

			List<String> customerServiceNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSessionGroupResponse.Data["+ i +"].CustomerServiceNameList.Length"); j++) {
				customerServiceNameList.add(_ctx.stringValue("ListSessionGroupResponse.Data["+ i +"].CustomerServiceNameList["+ j +"]"));
			}
			dataItem.setCustomerServiceNameList(customerServiceNameList);

			List<String> customerIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSessionGroupResponse.Data["+ i +"].CustomerIdList.Length"); j++) {
				customerIdList.add(_ctx.stringValue("ListSessionGroupResponse.Data["+ i +"].CustomerIdList["+ j +"]"));
			}
			dataItem.setCustomerIdList(customerIdList);

			List<String> customerNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSessionGroupResponse.Data["+ i +"].CustomerNameList.Length"); j++) {
				customerNameList.add(_ctx.stringValue("ListSessionGroupResponse.Data["+ i +"].CustomerNameList["+ j +"]"));
			}
			dataItem.setCustomerNameList(customerNameList);

			List<String> callerList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSessionGroupResponse.Data["+ i +"].CallerList.Length"); j++) {
				callerList.add(_ctx.stringValue("ListSessionGroupResponse.Data["+ i +"].CallerList["+ j +"]"));
			}
			dataItem.setCallerList(callerList);

			List<String> skillGroupNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSessionGroupResponse.Data["+ i +"].SkillGroupNameList.Length"); j++) {
				skillGroupNameList.add(_ctx.stringValue("ListSessionGroupResponse.Data["+ i +"].SkillGroupNameList["+ j +"]"));
			}
			dataItem.setSkillGroupNameList(skillGroupNameList);

			List<String> reviewerList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSessionGroupResponse.Data["+ i +"].ReviewerList.Length"); j++) {
				reviewerList.add(_ctx.stringValue("ListSessionGroupResponse.Data["+ i +"].ReviewerList["+ j +"]"));
			}
			dataItem.setReviewerList(reviewerList);

			data.add(dataItem);
		}
		listSessionGroupResponse.setData(data);
	 
	 	return listSessionGroupResponse;
	}
}