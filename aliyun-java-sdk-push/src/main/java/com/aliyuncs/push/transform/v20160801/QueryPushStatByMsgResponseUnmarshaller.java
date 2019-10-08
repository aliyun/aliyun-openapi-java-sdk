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

import com.aliyuncs.push.model.v20160801.QueryPushStatByMsgResponse;
import com.aliyuncs.push.model.v20160801.QueryPushStatByMsgResponse.PushStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPushStatByMsgResponseUnmarshaller {

	public static QueryPushStatByMsgResponse unmarshall(QueryPushStatByMsgResponse queryPushStatByMsgResponse, UnmarshallerContext _ctx) {
		
		queryPushStatByMsgResponse.setRequestId(_ctx.stringValue("QueryPushStatByMsgResponse.RequestId"));

		List<PushStat> pushStats = new ArrayList<PushStat>();
		for (int i = 0; i < _ctx.lengthValue("QueryPushStatByMsgResponse.PushStats.Length"); i++) {
			PushStat pushStat = new PushStat();
			pushStat.setMessageId(_ctx.stringValue("QueryPushStatByMsgResponse.PushStats["+ i +"].MessageId"));
			pushStat.setAcceptCount(_ctx.longValue("QueryPushStatByMsgResponse.PushStats["+ i +"].AcceptCount"));
			pushStat.setSentCount(_ctx.longValue("QueryPushStatByMsgResponse.PushStats["+ i +"].SentCount"));
			pushStat.setReceivedCount(_ctx.longValue("QueryPushStatByMsgResponse.PushStats["+ i +"].ReceivedCount"));
			pushStat.setOpenedCount(_ctx.longValue("QueryPushStatByMsgResponse.PushStats["+ i +"].OpenedCount"));
			pushStat.setDeletedCount(_ctx.longValue("QueryPushStatByMsgResponse.PushStats["+ i +"].DeletedCount"));
			pushStat.setSmsSentCount(_ctx.longValue("QueryPushStatByMsgResponse.PushStats["+ i +"].SmsSentCount"));
			pushStat.setSmsSkipCount(_ctx.longValue("QueryPushStatByMsgResponse.PushStats["+ i +"].SmsSkipCount"));
			pushStat.setSmsFailedCount(_ctx.longValue("QueryPushStatByMsgResponse.PushStats["+ i +"].SmsFailedCount"));
			pushStat.setSmsReceiveSuccessCount(_ctx.longValue("QueryPushStatByMsgResponse.PushStats["+ i +"].SmsReceiveSuccessCount"));
			pushStat.setSmsReceiveFailedCount(_ctx.longValue("QueryPushStatByMsgResponse.PushStats["+ i +"].SmsReceiveFailedCount"));

			pushStats.add(pushStat);
		}
		queryPushStatByMsgResponse.setPushStats(pushStats);
	 
	 	return queryPushStatByMsgResponse;
	}
}