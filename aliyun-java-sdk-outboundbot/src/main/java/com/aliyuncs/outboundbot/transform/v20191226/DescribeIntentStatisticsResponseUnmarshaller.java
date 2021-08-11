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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.DescribeIntentStatisticsResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeIntentStatisticsResponse.IntentStatisticsItem;
import com.aliyuncs.outboundbot.model.v20191226.DescribeIntentStatisticsResponse.IntentStatisticsItem1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIntentStatisticsResponseUnmarshaller {

	public static DescribeIntentStatisticsResponse unmarshall(DescribeIntentStatisticsResponse describeIntentStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeIntentStatisticsResponse.setRequestId(_ctx.stringValue("DescribeIntentStatisticsResponse.RequestId"));
		describeIntentStatisticsResponse.setSuccess(_ctx.booleanValue("DescribeIntentStatisticsResponse.Success"));
		describeIntentStatisticsResponse.setCode(_ctx.stringValue("DescribeIntentStatisticsResponse.Code"));
		describeIntentStatisticsResponse.setMessage(_ctx.stringValue("DescribeIntentStatisticsResponse.Message"));
		describeIntentStatisticsResponse.setHttpStatusCode(_ctx.integerValue("DescribeIntentStatisticsResponse.HttpStatusCode"));
		describeIntentStatisticsResponse.setInstanceId(_ctx.stringValue("DescribeIntentStatisticsResponse.InstanceId"));
		describeIntentStatisticsResponse.setGroupId(_ctx.stringValue("DescribeIntentStatisticsResponse.GroupId"));
		describeIntentStatisticsResponse.setProcessIntentNum(_ctx.integerValue("DescribeIntentStatisticsResponse.ProcessIntentNum"));
		describeIntentStatisticsResponse.setGlobalIntentNum(_ctx.integerValue("DescribeIntentStatisticsResponse.GlobalIntentNum"));

		List<IntentStatisticsItem> processIntents = new ArrayList<IntentStatisticsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIntentStatisticsResponse.ProcessIntents.Length"); i++) {
			IntentStatisticsItem intentStatisticsItem = new IntentStatisticsItem();
			intentStatisticsItem.setInstanceId(_ctx.stringValue("DescribeIntentStatisticsResponse.ProcessIntents["+ i +"].InstanceId"));
			intentStatisticsItem.setGroupId(_ctx.stringValue("DescribeIntentStatisticsResponse.ProcessIntents["+ i +"].GroupId"));
			intentStatisticsItem.setIntentId(_ctx.stringValue("DescribeIntentStatisticsResponse.ProcessIntents["+ i +"].IntentId"));
			intentStatisticsItem.setIntentName(_ctx.stringValue("DescribeIntentStatisticsResponse.ProcessIntents["+ i +"].IntentName"));
			intentStatisticsItem.setType(_ctx.stringValue("DescribeIntentStatisticsResponse.ProcessIntents["+ i +"].Type"));
			intentStatisticsItem.setHitNum(_ctx.integerValue("DescribeIntentStatisticsResponse.ProcessIntents["+ i +"].HitNum"));
			intentStatisticsItem.setHitAfterNoAnswer(_ctx.integerValue("DescribeIntentStatisticsResponse.ProcessIntents["+ i +"].HitAfterNoAnswer"));

			processIntents.add(intentStatisticsItem);
		}
		describeIntentStatisticsResponse.setProcessIntents(processIntents);

		List<IntentStatisticsItem> globalIntents = new ArrayList<IntentStatisticsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIntentStatisticsResponse.GlobalIntents.Length"); i++) {
			IntentStatisticsItem intentStatisticsItem_ = new IntentStatisticsItem();
			intentStatisticsItem_.setInstanceId(_ctx.stringValue("DescribeIntentStatisticsResponse.GlobalIntents["+ i +"].InstanceId"));
			intentStatisticsItem_.setGroupId(_ctx.stringValue("DescribeIntentStatisticsResponse.GlobalIntents["+ i +"].GroupId"));
			intentStatisticsItem_.setIntentId(_ctx.stringValue("DescribeIntentStatisticsResponse.GlobalIntents["+ i +"].IntentId"));
			intentStatisticsItem_.setIntentName(_ctx.stringValue("DescribeIntentStatisticsResponse.GlobalIntents["+ i +"].IntentName"));
			intentStatisticsItem_.setType(_ctx.stringValue("DescribeIntentStatisticsResponse.GlobalIntents["+ i +"].Type"));
			intentStatisticsItem_.setHitNum(_ctx.integerValue("DescribeIntentStatisticsResponse.GlobalIntents["+ i +"].HitNum"));
			intentStatisticsItem_.setHitAfterNoAnswer(_ctx.integerValue("DescribeIntentStatisticsResponse.GlobalIntents["+ i +"].HitAfterNoAnswer"));

			globalIntents.add(intentStatisticsItem_);
		}
		describeIntentStatisticsResponse.setGlobalIntents(globalIntents);

		List<IntentStatisticsItem1> intentsAfterNoAnswer = new ArrayList<IntentStatisticsItem1>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIntentStatisticsResponse.IntentsAfterNoAnswer.Length"); i++) {
			IntentStatisticsItem1 intentStatisticsItem1 = new IntentStatisticsItem1();
			intentStatisticsItem1.setInstanceId(_ctx.stringValue("DescribeIntentStatisticsResponse.IntentsAfterNoAnswer["+ i +"].InstanceId"));

			intentsAfterNoAnswer.add(intentStatisticsItem1);
		}
		describeIntentStatisticsResponse.setIntentsAfterNoAnswer(intentsAfterNoAnswer);
	 
	 	return describeIntentStatisticsResponse;
	}
}