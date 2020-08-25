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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeNsubscribepullrequestResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeNsubscribepullrequestResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeNsubscribepullrequestResponse unmarshall(ExecLinkeantcodeAntcodeNsubscribepullrequestResponse execLinkeantcodeAntcodeNsubscribepullrequestResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeNsubscribepullrequestResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeNsubscribepullrequestResponse.RequestId"));
		execLinkeantcodeAntcodeNsubscribepullrequestResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeNsubscribepullrequestResponse.ResultCode"));
		execLinkeantcodeAntcodeNsubscribepullrequestResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeNsubscribepullrequestResponse.ResultMessage"));
		execLinkeantcodeAntcodeNsubscribepullrequestResponse.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeNsubscribepullrequestResponse.CreatedAt"));
		execLinkeantcodeAntcodeNsubscribepullrequestResponse.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeNsubscribepullrequestResponse.Email"));
		execLinkeantcodeAntcodeNsubscribepullrequestResponse.setId(_ctx.longValue("ExecLinkeantcodeAntcodeNsubscribepullrequestResponse.Id"));
		execLinkeantcodeAntcodeNsubscribepullrequestResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeNsubscribepullrequestResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeNsubscribepullrequestResponse.setSubscribableId(_ctx.longValue("ExecLinkeantcodeAntcodeNsubscribepullrequestResponse.SubscribableId"));
		execLinkeantcodeAntcodeNsubscribepullrequestResponse.setSubscribableType(_ctx.stringValue("ExecLinkeantcodeAntcodeNsubscribepullrequestResponse.SubscribableType"));
		execLinkeantcodeAntcodeNsubscribepullrequestResponse.setSubscribed(_ctx.booleanValue("ExecLinkeantcodeAntcodeNsubscribepullrequestResponse.Subscribed"));
		execLinkeantcodeAntcodeNsubscribepullrequestResponse.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeNsubscribepullrequestResponse.UpdatedAt"));
		execLinkeantcodeAntcodeNsubscribepullrequestResponse.setUserId(_ctx.longValue("ExecLinkeantcodeAntcodeNsubscribepullrequestResponse.UserId"));
	 
	 	return execLinkeantcodeAntcodeNsubscribepullrequestResponse;
	}
}