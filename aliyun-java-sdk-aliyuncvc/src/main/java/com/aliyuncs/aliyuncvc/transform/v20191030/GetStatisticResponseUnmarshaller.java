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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import com.aliyuncs.aliyuncvc.model.v20191030.GetStatisticResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.GetStatisticResponse.StatisticInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStatisticResponseUnmarshaller {

	public static GetStatisticResponse unmarshall(GetStatisticResponse getStatisticResponse, UnmarshallerContext _ctx) {
		
		getStatisticResponse.setRequestId(_ctx.stringValue("GetStatisticResponse.RequestId"));
		getStatisticResponse.setErrorCode(_ctx.integerValue("GetStatisticResponse.ErrorCode"));
		getStatisticResponse.setMessage(_ctx.stringValue("GetStatisticResponse.Message"));
		getStatisticResponse.setSuccess(_ctx.booleanValue("GetStatisticResponse.Success"));

		StatisticInfo statisticInfo = new StatisticInfo();
		statisticInfo.setMeetingDuration(_ctx.longValue("GetStatisticResponse.StatisticInfo.MeetingDuration"));
		statisticInfo.setMeetingNumber(_ctx.longValue("GetStatisticResponse.StatisticInfo.MeetingNumber"));
		statisticInfo.setMemberNumber(_ctx.longValue("GetStatisticResponse.StatisticInfo.MemberNumber"));
		statisticInfo.setMaxConcurrency(_ctx.longValue("GetStatisticResponse.StatisticInfo.MaxConcurrency"));
		getStatisticResponse.setStatisticInfo(statisticInfo);
	 
	 	return getStatisticResponse;
	}
}