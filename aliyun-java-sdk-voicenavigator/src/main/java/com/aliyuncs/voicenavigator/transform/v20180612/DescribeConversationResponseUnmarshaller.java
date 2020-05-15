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

package com.aliyuncs.voicenavigator.transform.v20180612;

import com.aliyuncs.voicenavigator.model.v20180612.DescribeConversationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConversationResponseUnmarshaller {

	public static DescribeConversationResponse unmarshall(DescribeConversationResponse describeConversationResponse, UnmarshallerContext _ctx) {
		
		describeConversationResponse.setRequestId(_ctx.stringValue("DescribeConversationResponse.RequestId"));
		describeConversationResponse.setCallingNumber(_ctx.stringValue("DescribeConversationResponse.CallingNumber"));
		describeConversationResponse.setBeginTime(_ctx.longValue("DescribeConversationResponse.BeginTime"));
		describeConversationResponse.setEndTime(_ctx.longValue("DescribeConversationResponse.EndTime"));
		describeConversationResponse.setTransferredToAgent(_ctx.booleanValue("DescribeConversationResponse.TransferredToAgent"));
		describeConversationResponse.setSkillGroupId(_ctx.stringValue("DescribeConversationResponse.SkillGroupId"));
		describeConversationResponse.setUserUtteranceCount(_ctx.integerValue("DescribeConversationResponse.UserUtteranceCount"));
		describeConversationResponse.setEffectiveAnswerCount(_ctx.integerValue("DescribeConversationResponse.EffectiveAnswerCount"));
		describeConversationResponse.setConversationId(_ctx.stringValue("DescribeConversationResponse.ConversationId"));
	 
	 	return describeConversationResponse;
	}
}