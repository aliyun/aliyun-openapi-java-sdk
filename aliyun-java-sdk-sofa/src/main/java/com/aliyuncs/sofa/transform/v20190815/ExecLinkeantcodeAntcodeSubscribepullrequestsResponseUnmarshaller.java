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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeSubscribepullrequestsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeSubscribepullrequestsResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeSubscribepullrequestsResponse unmarshall(ExecLinkeantcodeAntcodeSubscribepullrequestsResponse execLinkeantcodeAntcodeSubscribepullrequestsResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeSubscribepullrequestsResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeSubscribepullrequestsResponse.RequestId"));
		execLinkeantcodeAntcodeSubscribepullrequestsResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeSubscribepullrequestsResponse.ResultCode"));
		execLinkeantcodeAntcodeSubscribepullrequestsResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeSubscribepullrequestsResponse.ResultMessage"));
		execLinkeantcodeAntcodeSubscribepullrequestsResponse.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeSubscribepullrequestsResponse.CreatedAt"));
		execLinkeantcodeAntcodeSubscribepullrequestsResponse.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeSubscribepullrequestsResponse.Email"));
		execLinkeantcodeAntcodeSubscribepullrequestsResponse.setId(_ctx.longValue("ExecLinkeantcodeAntcodeSubscribepullrequestsResponse.Id"));
		execLinkeantcodeAntcodeSubscribepullrequestsResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeSubscribepullrequestsResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeSubscribepullrequestsResponse.setSubscribableId(_ctx.longValue("ExecLinkeantcodeAntcodeSubscribepullrequestsResponse.SubscribableId"));
		execLinkeantcodeAntcodeSubscribepullrequestsResponse.setSubscribableType(_ctx.stringValue("ExecLinkeantcodeAntcodeSubscribepullrequestsResponse.SubscribableType"));
		execLinkeantcodeAntcodeSubscribepullrequestsResponse.setSubscribed(_ctx.booleanValue("ExecLinkeantcodeAntcodeSubscribepullrequestsResponse.Subscribed"));
		execLinkeantcodeAntcodeSubscribepullrequestsResponse.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeSubscribepullrequestsResponse.UpdatedAt"));
		execLinkeantcodeAntcodeSubscribepullrequestsResponse.setUserId(_ctx.longValue("ExecLinkeantcodeAntcodeSubscribepullrequestsResponse.UserId"));
	 
	 	return execLinkeantcodeAntcodeSubscribepullrequestsResponse;
	}
}