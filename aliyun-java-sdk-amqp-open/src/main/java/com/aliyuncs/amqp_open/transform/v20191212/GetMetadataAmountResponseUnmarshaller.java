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

package com.aliyuncs.amqp_open.transform.v20191212;

import com.aliyuncs.amqp_open.model.v20191212.GetMetadataAmountResponse;
import com.aliyuncs.amqp_open.model.v20191212.GetMetadataAmountResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetadataAmountResponseUnmarshaller {

	public static GetMetadataAmountResponse unmarshall(GetMetadataAmountResponse getMetadataAmountResponse, UnmarshallerContext _ctx) {
		
		getMetadataAmountResponse.setRequestId(_ctx.stringValue("GetMetadataAmountResponse.RequestId"));

		Data data = new Data();
		data.setCurrentVirtualHosts(_ctx.integerValue("GetMetadataAmountResponse.Data.CurrentVirtualHosts"));
		data.setMaxVirtualHosts(_ctx.integerValue("GetMetadataAmountResponse.Data.MaxVirtualHosts"));
		data.setCurrentExchanges(_ctx.integerValue("GetMetadataAmountResponse.Data.CurrentExchanges"));
		data.setMaxExchanges(_ctx.integerValue("GetMetadataAmountResponse.Data.MaxExchanges"));
		data.setCurrentQueues(_ctx.integerValue("GetMetadataAmountResponse.Data.CurrentQueues"));
		data.setMaxQueues(_ctx.integerValue("GetMetadataAmountResponse.Data.MaxQueues"));
		getMetadataAmountResponse.setData(data);
	 
	 	return getMetadataAmountResponse;
	}
}