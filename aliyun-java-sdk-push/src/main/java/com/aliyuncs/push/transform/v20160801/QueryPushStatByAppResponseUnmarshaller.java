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

package com.aliyuncs.push.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.push.model.v20160801.QueryPushStatByAppResponse;
import com.aliyuncs.push.model.v20160801.QueryPushStatByAppResponse.AppPushStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPushStatByAppResponseUnmarshaller {

	public static QueryPushStatByAppResponse unmarshall(QueryPushStatByAppResponse queryPushStatByAppResponse, UnmarshallerContext _ctx) {
		
		queryPushStatByAppResponse.setRequestId(_ctx.stringValue("QueryPushStatByAppResponse.RequestId"));

		List<AppPushStat> appPushStats = new ArrayList<AppPushStat>();
		for (int i = 0; i < _ctx.lengthValue("QueryPushStatByAppResponse.AppPushStats.Length"); i++) {
			AppPushStat appPushStat = new AppPushStat();
			appPushStat.setTime(_ctx.stringValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].Time"));
			appPushStat.setDeletedCount(_ctx.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].DeletedCount"));
			appPushStat.setOpenedCount(_ctx.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].OpenedCount"));
			appPushStat.setSmsReceiveSuccessCount(_ctx.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].SmsReceiveSuccessCount"));
			appPushStat.setSmsSkipCount(_ctx.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].SmsSkipCount"));
			appPushStat.setSmsReceiveFailedCount(_ctx.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].SmsReceiveFailedCount"));
			appPushStat.setSmsFailedCount(_ctx.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].SmsFailedCount"));
			appPushStat.setReceivedCount(_ctx.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].ReceivedCount"));
			appPushStat.setSentCount(_ctx.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].SentCount"));
			appPushStat.setSmsSentCount(_ctx.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].SmsSentCount"));
			appPushStat.setAcceptCount(_ctx.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].AcceptCount"));

			appPushStats.add(appPushStat);
		}
		queryPushStatByAppResponse.setAppPushStats(appPushStats);
	 
	 	return queryPushStatByAppResponse;
	}
}