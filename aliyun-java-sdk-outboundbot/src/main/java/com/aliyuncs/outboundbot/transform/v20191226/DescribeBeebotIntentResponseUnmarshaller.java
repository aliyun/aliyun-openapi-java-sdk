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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DescribeBeebotIntentResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeBeebotIntentResponse.Intent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBeebotIntentResponseUnmarshaller {

	public static DescribeBeebotIntentResponse unmarshall(DescribeBeebotIntentResponse describeBeebotIntentResponse, UnmarshallerContext _ctx) {
		
		describeBeebotIntentResponse.setRequestId(_ctx.stringValue("DescribeBeebotIntentResponse.RequestId"));
		describeBeebotIntentResponse.setHttpStatusCode(_ctx.integerValue("DescribeBeebotIntentResponse.HttpStatusCode"));
		describeBeebotIntentResponse.setSuccess(_ctx.booleanValue("DescribeBeebotIntentResponse.Success"));
		describeBeebotIntentResponse.setBeebotRequestId(_ctx.stringValue("DescribeBeebotIntentResponse.BeebotRequestId"));
		describeBeebotIntentResponse.setCode(_ctx.stringValue("DescribeBeebotIntentResponse.Code"));
		describeBeebotIntentResponse.setMessage(_ctx.stringValue("DescribeBeebotIntentResponse.Message"));
		describeBeebotIntentResponse.setIntentId(_ctx.longValue("DescribeBeebotIntentResponse.IntentId"));

		Intent intent = new Intent();
		intent.setIntentId(_ctx.longValue("DescribeBeebotIntentResponse.Intent.IntentId"));
		intent.setIntentName(_ctx.stringValue("DescribeBeebotIntentResponse.Intent.IntentName"));
		intent.setAliasName(_ctx.stringValue("DescribeBeebotIntentResponse.Intent.AliasName"));
		intent.setCreateUserName(_ctx.stringValue("DescribeBeebotIntentResponse.Intent.CreateUserName"));
		intent.setCreateUserId(_ctx.stringValue("DescribeBeebotIntentResponse.Intent.CreateUserId"));
		intent.setModifyUserId(_ctx.stringValue("DescribeBeebotIntentResponse.Intent.ModifyUserId"));
		intent.setModifyUserName(_ctx.stringValue("DescribeBeebotIntentResponse.Intent.ModifyUserName"));
		intent.setCreateTime(_ctx.stringValue("DescribeBeebotIntentResponse.Intent.CreateTime"));
		intent.setModifyTime(_ctx.stringValue("DescribeBeebotIntentResponse.Intent.ModifyTime"));
		describeBeebotIntentResponse.setIntent(intent);
	 
	 	return describeBeebotIntentResponse;
	}
}