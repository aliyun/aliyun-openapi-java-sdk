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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetClriskSubscribeUserInfoResponse;
import com.aliyuncs.sofa.model.v20190815.GetClriskSubscribeUserInfoResponse.DdMessageNoticeAggregateItem;
import com.aliyuncs.sofa.model.v20190815.GetClriskSubscribeUserInfoResponse.EmailNoticeAggregate;
import com.aliyuncs.sofa.model.v20190815.GetClriskSubscribeUserInfoResponse.MessageNoticeAggregate;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClriskSubscribeUserInfoResponseUnmarshaller {

	public static GetClriskSubscribeUserInfoResponse unmarshall(GetClriskSubscribeUserInfoResponse getClriskSubscribeUserInfoResponse, UnmarshallerContext _ctx) {
		
		getClriskSubscribeUserInfoResponse.setRequestId(_ctx.stringValue("GetClriskSubscribeUserInfoResponse.RequestId"));
		getClriskSubscribeUserInfoResponse.setResultCode(_ctx.stringValue("GetClriskSubscribeUserInfoResponse.ResultCode"));
		getClriskSubscribeUserInfoResponse.setResultMessage(_ctx.stringValue("GetClriskSubscribeUserInfoResponse.ResultMessage"));

		EmailNoticeAggregate emailNoticeAggregate = new EmailNoticeAggregate();
		emailNoticeAggregate.setEmailAddress(_ctx.stringValue("GetClriskSubscribeUserInfoResponse.EmailNoticeAggregate.EmailAddress"));
		emailNoticeAggregate.setIsIssueSubscribe(_ctx.booleanValue("GetClriskSubscribeUserInfoResponse.EmailNoticeAggregate.IsIssueSubscribe"));
		emailNoticeAggregate.setIsModelSubscribe(_ctx.booleanValue("GetClriskSubscribeUserInfoResponse.EmailNoticeAggregate.IsModelSubscribe"));
		emailNoticeAggregate.setIsTaskSubscribe(_ctx.booleanValue("GetClriskSubscribeUserInfoResponse.EmailNoticeAggregate.IsTaskSubscribe"));
		getClriskSubscribeUserInfoResponse.setEmailNoticeAggregate(emailNoticeAggregate);

		MessageNoticeAggregate messageNoticeAggregate = new MessageNoticeAggregate();
		messageNoticeAggregate.setIsIssueSubscribe(_ctx.booleanValue("GetClriskSubscribeUserInfoResponse.MessageNoticeAggregate.IsIssueSubscribe"));
		messageNoticeAggregate.setIsModelSubscribe(_ctx.booleanValue("GetClriskSubscribeUserInfoResponse.MessageNoticeAggregate.IsModelSubscribe"));
		messageNoticeAggregate.setIsTaskSubscribe(_ctx.booleanValue("GetClriskSubscribeUserInfoResponse.MessageNoticeAggregate.IsTaskSubscribe"));
		messageNoticeAggregate.setNumber(_ctx.stringValue("GetClriskSubscribeUserInfoResponse.MessageNoticeAggregate.Number"));
		getClriskSubscribeUserInfoResponse.setMessageNoticeAggregate(messageNoticeAggregate);

		List<DdMessageNoticeAggregateItem> ddMessageNoticeAggregate = new ArrayList<DdMessageNoticeAggregateItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskSubscribeUserInfoResponse.DdMessageNoticeAggregate.Length"); i++) {
			DdMessageNoticeAggregateItem ddMessageNoticeAggregateItem = new DdMessageNoticeAggregateItem();
			ddMessageNoticeAggregateItem.setIsIssueSubscribe(_ctx.booleanValue("GetClriskSubscribeUserInfoResponse.DdMessageNoticeAggregate["+ i +"].IsIssueSubscribe"));
			ddMessageNoticeAggregateItem.setIsModelSubscribe(_ctx.booleanValue("GetClriskSubscribeUserInfoResponse.DdMessageNoticeAggregate["+ i +"].IsModelSubscribe"));
			ddMessageNoticeAggregateItem.setIsTaskSubscribe(_ctx.booleanValue("GetClriskSubscribeUserInfoResponse.DdMessageNoticeAggregate["+ i +"].IsTaskSubscribe"));
			ddMessageNoticeAggregateItem.setName(_ctx.stringValue("GetClriskSubscribeUserInfoResponse.DdMessageNoticeAggregate["+ i +"].Name"));
			ddMessageNoticeAggregateItem.setSecret(_ctx.stringValue("GetClriskSubscribeUserInfoResponse.DdMessageNoticeAggregate["+ i +"].Secret"));
			ddMessageNoticeAggregateItem.setWebHookAddress(_ctx.stringValue("GetClriskSubscribeUserInfoResponse.DdMessageNoticeAggregate["+ i +"].WebHookAddress"));

			ddMessageNoticeAggregate.add(ddMessageNoticeAggregateItem);
		}
		getClriskSubscribeUserInfoResponse.setDdMessageNoticeAggregate(ddMessageNoticeAggregate);
	 
	 	return getClriskSubscribeUserInfoResponse;
	}
}