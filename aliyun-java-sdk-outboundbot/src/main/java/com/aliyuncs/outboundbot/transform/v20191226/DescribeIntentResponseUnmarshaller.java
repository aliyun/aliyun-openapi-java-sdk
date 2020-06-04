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

import com.aliyuncs.outboundbot.model.v20191226.DescribeIntentResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeIntentResponse.Intent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIntentResponseUnmarshaller {

	public static DescribeIntentResponse unmarshall(DescribeIntentResponse describeIntentResponse, UnmarshallerContext _ctx) {
		
		describeIntentResponse.setRequestId(_ctx.stringValue("DescribeIntentResponse.RequestId"));
		describeIntentResponse.setCode(_ctx.stringValue("DescribeIntentResponse.Code"));
		describeIntentResponse.setHttpStatusCode(_ctx.integerValue("DescribeIntentResponse.HttpStatusCode"));
		describeIntentResponse.setMessage(_ctx.stringValue("DescribeIntentResponse.Message"));
		describeIntentResponse.setSuccess(_ctx.booleanValue("DescribeIntentResponse.Success"));

		Intent intent = new Intent();
		intent.setCreateTime(_ctx.longValue("DescribeIntentResponse.Intent.CreateTime"));
		intent.setIntentDescription(_ctx.stringValue("DescribeIntentResponse.Intent.IntentDescription"));
		intent.setIntentId(_ctx.stringValue("DescribeIntentResponse.Intent.IntentId"));
		intent.setIntentName(_ctx.stringValue("DescribeIntentResponse.Intent.IntentName"));
		intent.setKeywords(_ctx.stringValue("DescribeIntentResponse.Intent.Keywords"));
		intent.setScriptId(_ctx.stringValue("DescribeIntentResponse.Intent.ScriptId"));
		intent.setUpdateTime(_ctx.longValue("DescribeIntentResponse.Intent.UpdateTime"));
		intent.setUtterances(_ctx.stringValue("DescribeIntentResponse.Intent.Utterances"));
		describeIntentResponse.setIntent(intent);
	 
	 	return describeIntentResponse;
	}
}