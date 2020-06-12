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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryConsumerGroupStatusResponse;
import com.aliyuncs.iot.model.v20180120.QueryConsumerGroupStatusResponse.ConsumerGroupClientConnectionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryConsumerGroupStatusResponseUnmarshaller {

	public static QueryConsumerGroupStatusResponse unmarshall(QueryConsumerGroupStatusResponse queryConsumerGroupStatusResponse, UnmarshallerContext _ctx) {
		
		queryConsumerGroupStatusResponse.setRequestId(_ctx.stringValue("QueryConsumerGroupStatusResponse.RequestId"));
		queryConsumerGroupStatusResponse.setSuccess(_ctx.booleanValue("QueryConsumerGroupStatusResponse.Success"));
		queryConsumerGroupStatusResponse.setErrorMessage(_ctx.stringValue("QueryConsumerGroupStatusResponse.ErrorMessage"));
		queryConsumerGroupStatusResponse.setAccumulationCount(_ctx.integerValue("QueryConsumerGroupStatusResponse.AccumulationCount"));
		queryConsumerGroupStatusResponse.setConsumerSpeed(_ctx.integerValue("QueryConsumerGroupStatusResponse.ConsumerSpeed"));
		queryConsumerGroupStatusResponse.setLastConsumerTime(_ctx.stringValue("QueryConsumerGroupStatusResponse.LastConsumerTime"));
		queryConsumerGroupStatusResponse.setCode(_ctx.stringValue("QueryConsumerGroupStatusResponse.Code"));

		List<ConsumerGroupClientConnectionInfo> clientConnectionStatusList = new ArrayList<ConsumerGroupClientConnectionInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryConsumerGroupStatusResponse.ClientConnectionStatusList.Length"); i++) {
			ConsumerGroupClientConnectionInfo consumerGroupClientConnectionInfo = new ConsumerGroupClientConnectionInfo();
			consumerGroupClientConnectionInfo.setClientId(_ctx.stringValue("QueryConsumerGroupStatusResponse.ClientConnectionStatusList["+ i +"].ClientId"));
			consumerGroupClientConnectionInfo.setClientIpPort(_ctx.stringValue("QueryConsumerGroupStatusResponse.ClientConnectionStatusList["+ i +"].ClientIpPort"));
			consumerGroupClientConnectionInfo.setOnlineTime(_ctx.longValue("QueryConsumerGroupStatusResponse.ClientConnectionStatusList["+ i +"].OnlineTime"));

			clientConnectionStatusList.add(consumerGroupClientConnectionInfo);
		}
		queryConsumerGroupStatusResponse.setClientConnectionStatusList(clientConnectionStatusList);
	 
	 	return queryConsumerGroupStatusResponse;
	}
}