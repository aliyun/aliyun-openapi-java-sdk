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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobGroupAgentsDetailResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobGroupAgentsDetailResponse.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobGroupAgentsDetailResponseUnmarshaller {

	public static GetJobGroupAgentsDetailResponse unmarshall(GetJobGroupAgentsDetailResponse getJobGroupAgentsDetailResponse, UnmarshallerContext context) {
		
		getJobGroupAgentsDetailResponse.setRequestId(context.stringValue("GetJobGroupAgentsDetailResponse.RequestId"));
		getJobGroupAgentsDetailResponse.setSuccess(context.booleanValue("GetJobGroupAgentsDetailResponse.Success"));
		getJobGroupAgentsDetailResponse.setCode(context.stringValue("GetJobGroupAgentsDetailResponse.Code"));
		getJobGroupAgentsDetailResponse.setMessage(context.stringValue("GetJobGroupAgentsDetailResponse.Message"));
		getJobGroupAgentsDetailResponse.setHttpStatusCode(context.integerValue("GetJobGroupAgentsDetailResponse.HttpStatusCode"));

		Detail detail = new Detail();
		detail.setTotalAgentsNumber(context.stringValue("GetJobGroupAgentsDetailResponse.detail.TotalAgentsNumber"));
		detail.setOfflineAgentsNumber(context.stringValue("GetJobGroupAgentsDetailResponse.detail.OfflineAgentsNumber"));
		detail.setLoggedInAgentsNumber(context.stringValue("GetJobGroupAgentsDetailResponse.detail.LoggedInAgentsNumber"));
		detail.setReadyAgentsNumber(context.stringValue("GetJobGroupAgentsDetailResponse.detail.ReadyAgentsNumber"));
		detail.setTalkAgentsNumber(context.stringValue("GetJobGroupAgentsDetailResponse.detail.TalkAgentsNumber"));
		detail.setAcwAgentsNumber(context.stringValue("GetJobGroupAgentsDetailResponse.detail.AcwAgentsNumber"));
		detail.setNotReadyAgentsNumber(context.stringValue("GetJobGroupAgentsDetailResponse.detail.NotReadyAgentsNumber"));
		getJobGroupAgentsDetailResponse.setDetail(detail);
	 
	 	return getJobGroupAgentsDetailResponse;
	}
}