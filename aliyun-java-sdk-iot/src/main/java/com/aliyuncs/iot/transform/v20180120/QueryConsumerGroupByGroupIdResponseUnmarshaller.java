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

import com.aliyuncs.iot.model.v20180120.QueryConsumerGroupByGroupIdResponse;
import com.aliyuncs.iot.model.v20180120.QueryConsumerGroupByGroupIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryConsumerGroupByGroupIdResponseUnmarshaller {

	public static QueryConsumerGroupByGroupIdResponse unmarshall(QueryConsumerGroupByGroupIdResponse queryConsumerGroupByGroupIdResponse, UnmarshallerContext _ctx) {
		
		queryConsumerGroupByGroupIdResponse.setRequestId(_ctx.stringValue("QueryConsumerGroupByGroupIdResponse.RequestId"));
		queryConsumerGroupByGroupIdResponse.setSuccess(_ctx.booleanValue("QueryConsumerGroupByGroupIdResponse.Success"));
		queryConsumerGroupByGroupIdResponse.setErrorMessage(_ctx.stringValue("QueryConsumerGroupByGroupIdResponse.ErrorMessage"));
		queryConsumerGroupByGroupIdResponse.setCode(_ctx.stringValue("QueryConsumerGroupByGroupIdResponse.Code"));

		Data data = new Data();
		data.setIotId(_ctx.stringValue("QueryConsumerGroupByGroupIdResponse.Data.IotId"));
		data.setGroupId(_ctx.stringValue("QueryConsumerGroupByGroupIdResponse.Data.GroupId"));
		data.setGroupName(_ctx.stringValue("QueryConsumerGroupByGroupIdResponse.Data.GroupName"));
		data.setCreator(_ctx.stringValue("QueryConsumerGroupByGroupIdResponse.Data.Creator"));
		data.setCreateTime(_ctx.stringValue("QueryConsumerGroupByGroupIdResponse.Data.CreateTime"));
		data.setAuthType(_ctx.stringValue("QueryConsumerGroupByGroupIdResponse.Data.AuthType"));
		queryConsumerGroupByGroupIdResponse.setData(data);
	 
	 	return queryConsumerGroupByGroupIdResponse;
	}
}