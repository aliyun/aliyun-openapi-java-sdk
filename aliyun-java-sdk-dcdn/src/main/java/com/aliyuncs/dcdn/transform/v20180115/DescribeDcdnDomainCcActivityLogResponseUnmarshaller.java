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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainCcActivityLogResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainCcActivityLogResponse.LogInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainCcActivityLogResponseUnmarshaller {

	public static DescribeDcdnDomainCcActivityLogResponse unmarshall(DescribeDcdnDomainCcActivityLogResponse describeDcdnDomainCcActivityLogResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainCcActivityLogResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainCcActivityLogResponse.RequestId"));
		describeDcdnDomainCcActivityLogResponse.setPageIndex(_ctx.longValue("DescribeDcdnDomainCcActivityLogResponse.PageIndex"));
		describeDcdnDomainCcActivityLogResponse.setPageSize(_ctx.longValue("DescribeDcdnDomainCcActivityLogResponse.PageSize"));
		describeDcdnDomainCcActivityLogResponse.setTotal(_ctx.longValue("DescribeDcdnDomainCcActivityLogResponse.Total"));

		List<LogInfo> activityLog = new ArrayList<LogInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainCcActivityLogResponse.ActivityLog.Length"); i++) {
			LogInfo logInfo = new LogInfo();
			logInfo.setValue(_ctx.stringValue("DescribeDcdnDomainCcActivityLogResponse.ActivityLog["+ i +"].Value"));
			logInfo.setTtl(_ctx.longValue("DescribeDcdnDomainCcActivityLogResponse.ActivityLog["+ i +"].Ttl"));
			logInfo.setAction(_ctx.stringValue("DescribeDcdnDomainCcActivityLogResponse.ActivityLog["+ i +"].Action"));
			logInfo.setTriggerObject(_ctx.stringValue("DescribeDcdnDomainCcActivityLogResponse.ActivityLog["+ i +"].TriggerObject"));
			logInfo.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainCcActivityLogResponse.ActivityLog["+ i +"].TimeStamp"));
			logInfo.setDomainName(_ctx.stringValue("DescribeDcdnDomainCcActivityLogResponse.ActivityLog["+ i +"].DomainName"));
			logInfo.setRuleName(_ctx.stringValue("DescribeDcdnDomainCcActivityLogResponse.ActivityLog["+ i +"].RuleName"));

			activityLog.add(logInfo);
		}
		describeDcdnDomainCcActivityLogResponse.setActivityLog(activityLog);
	 
	 	return describeDcdnDomainCcActivityLogResponse;
	}
}