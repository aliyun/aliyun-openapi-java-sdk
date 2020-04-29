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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeDomainCcActivityLogResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainCcActivityLogResponse.LogInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainCcActivityLogResponseUnmarshaller {

	public static DescribeDomainCcActivityLogResponse unmarshall(DescribeDomainCcActivityLogResponse describeDomainCcActivityLogResponse, UnmarshallerContext _ctx) {
		
		describeDomainCcActivityLogResponse.setRequestId(_ctx.stringValue("DescribeDomainCcActivityLogResponse.RequestId"));
		describeDomainCcActivityLogResponse.setPageIndex(_ctx.longValue("DescribeDomainCcActivityLogResponse.PageIndex"));
		describeDomainCcActivityLogResponse.setPageSize(_ctx.longValue("DescribeDomainCcActivityLogResponse.PageSize"));
		describeDomainCcActivityLogResponse.setTotal(_ctx.longValue("DescribeDomainCcActivityLogResponse.Total"));

		List<LogInfo> activityLog = new ArrayList<LogInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainCcActivityLogResponse.ActivityLog.Length"); i++) {
			LogInfo logInfo = new LogInfo();
			logInfo.setTimeStamp(_ctx.stringValue("DescribeDomainCcActivityLogResponse.ActivityLog["+ i +"].TimeStamp"));
			logInfo.setValue(_ctx.stringValue("DescribeDomainCcActivityLogResponse.ActivityLog["+ i +"].Value"));
			logInfo.setTriggerObject(_ctx.stringValue("DescribeDomainCcActivityLogResponse.ActivityLog["+ i +"].TriggerObject"));
			logInfo.setDomainName(_ctx.stringValue("DescribeDomainCcActivityLogResponse.ActivityLog["+ i +"].DomainName"));
			logInfo.setTtl(_ctx.longValue("DescribeDomainCcActivityLogResponse.ActivityLog["+ i +"].Ttl"));
			logInfo.setAction(_ctx.stringValue("DescribeDomainCcActivityLogResponse.ActivityLog["+ i +"].Action"));
			logInfo.setRuleName(_ctx.stringValue("DescribeDomainCcActivityLogResponse.ActivityLog["+ i +"].RuleName"));

			activityLog.add(logInfo);
		}
		describeDomainCcActivityLogResponse.setActivityLog(activityLog);
	 
	 	return describeDomainCcActivityLogResponse;
	}
}