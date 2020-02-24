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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.voicenavigator.model.v20180612.DescribeNavigationConfigResponse;
import com.aliyuncs.voicenavigator.model.v20180612.DescribeNavigationConfigResponse.AskingBackConfig;
import com.aliyuncs.voicenavigator.model.v20180612.DescribeNavigationConfigResponse.ComplainingConfig;
import com.aliyuncs.voicenavigator.model.v20180612.DescribeNavigationConfigResponse.GreetingConfig;
import com.aliyuncs.voicenavigator.model.v20180612.DescribeNavigationConfigResponse.RepeatingConfig;
import com.aliyuncs.voicenavigator.model.v20180612.DescribeNavigationConfigResponse.SilenceTimeoutConfig;
import com.aliyuncs.voicenavigator.model.v20180612.DescribeNavigationConfigResponse.UnrecognizingConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNavigationConfigResponseUnmarshaller {

	public static DescribeNavigationConfigResponse unmarshall(DescribeNavigationConfigResponse describeNavigationConfigResponse, UnmarshallerContext _ctx) {
		
		describeNavigationConfigResponse.setRequestId(_ctx.stringValue("DescribeNavigationConfigResponse.RequestId"));

		GreetingConfig greetingConfig = new GreetingConfig();
		greetingConfig.setGreetingWords(_ctx.stringValue("DescribeNavigationConfigResponse.GreetingConfig.GreetingWords"));
		greetingConfig.setSourceType(_ctx.stringValue("DescribeNavigationConfigResponse.GreetingConfig.SourceType"));
		greetingConfig.setIntentTrigger(_ctx.stringValue("DescribeNavigationConfigResponse.GreetingConfig.IntentTrigger"));
		describeNavigationConfigResponse.setGreetingConfig(greetingConfig);

		UnrecognizingConfig unrecognizingConfig = new UnrecognizingConfig();
		unrecognizingConfig.setPrompt(_ctx.stringValue("DescribeNavigationConfigResponse.UnrecognizingConfig.Prompt"));
		unrecognizingConfig.setThreshold(_ctx.integerValue("DescribeNavigationConfigResponse.UnrecognizingConfig.Threshold"));
		unrecognizingConfig.setFinalPrompt(_ctx.stringValue("DescribeNavigationConfigResponse.UnrecognizingConfig.FinalPrompt"));
		unrecognizingConfig.setFinalAction(_ctx.stringValue("DescribeNavigationConfigResponse.UnrecognizingConfig.FinalAction"));
		unrecognizingConfig.setFinalActionParams(_ctx.stringValue("DescribeNavigationConfigResponse.UnrecognizingConfig.FinalActionParams"));
		describeNavigationConfigResponse.setUnrecognizingConfig(unrecognizingConfig);

		RepeatingConfig repeatingConfig = new RepeatingConfig();

		List<String> utterances = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNavigationConfigResponse.RepeatingConfig.Utterances.Length"); i++) {
			utterances.add(_ctx.stringValue("DescribeNavigationConfigResponse.RepeatingConfig.Utterances["+ i +"]"));
		}
		repeatingConfig.setUtterances(utterances);
		describeNavigationConfigResponse.setRepeatingConfig(repeatingConfig);

		AskingBackConfig askingBackConfig = new AskingBackConfig();
		askingBackConfig.setEnabled(_ctx.booleanValue("DescribeNavigationConfigResponse.AskingBackConfig.Enabled"));
		askingBackConfig.setPrompt(_ctx.stringValue("DescribeNavigationConfigResponse.AskingBackConfig.Prompt"));
		askingBackConfig.setEnableNegativeFeedback(_ctx.booleanValue("DescribeNavigationConfigResponse.AskingBackConfig.EnableNegativeFeedback"));
		askingBackConfig.setNegativeFeedbackPrompt(_ctx.stringValue("DescribeNavigationConfigResponse.AskingBackConfig.NegativeFeedbackPrompt"));
		askingBackConfig.setNegativeFeedbackAction(_ctx.stringValue("DescribeNavigationConfigResponse.AskingBackConfig.NegativeFeedbackAction"));
		askingBackConfig.setNegativeFeedbackActionParams(_ctx.stringValue("DescribeNavigationConfigResponse.AskingBackConfig.NegativeFeedbackActionParams"));

		List<String> negativeFeedbackUtterances = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNavigationConfigResponse.AskingBackConfig.NegativeFeedbackUtterances.Length"); i++) {
			negativeFeedbackUtterances.add(_ctx.stringValue("DescribeNavigationConfigResponse.AskingBackConfig.NegativeFeedbackUtterances["+ i +"]"));
		}
		askingBackConfig.setNegativeFeedbackUtterances(negativeFeedbackUtterances);
		describeNavigationConfigResponse.setAskingBackConfig(askingBackConfig);

		ComplainingConfig complainingConfig = new ComplainingConfig();
		complainingConfig.setPrompt(_ctx.stringValue("DescribeNavigationConfigResponse.ComplainingConfig.Prompt"));
		complainingConfig.setFinalAction(_ctx.stringValue("DescribeNavigationConfigResponse.ComplainingConfig.FinalAction"));
		complainingConfig.setFinalActionParams(_ctx.stringValue("DescribeNavigationConfigResponse.ComplainingConfig.FinalActionParams"));

		List<String> utterances1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNavigationConfigResponse.ComplainingConfig.Utterances.Length"); i++) {
			utterances1.add(_ctx.stringValue("DescribeNavigationConfigResponse.ComplainingConfig.Utterances["+ i +"]"));
		}
		complainingConfig.setUtterances1(utterances1);
		describeNavigationConfigResponse.setComplainingConfig(complainingConfig);

		SilenceTimeoutConfig silenceTimeoutConfig = new SilenceTimeoutConfig();
		silenceTimeoutConfig.setPrompt(_ctx.stringValue("DescribeNavigationConfigResponse.SilenceTimeoutConfig.Prompt"));
		silenceTimeoutConfig.setTimeout(_ctx.longValue("DescribeNavigationConfigResponse.SilenceTimeoutConfig.Timeout"));
		silenceTimeoutConfig.setThreshold(_ctx.integerValue("DescribeNavigationConfigResponse.SilenceTimeoutConfig.Threshold"));
		silenceTimeoutConfig.setFinalPrompt(_ctx.stringValue("DescribeNavigationConfigResponse.SilenceTimeoutConfig.FinalPrompt"));
		silenceTimeoutConfig.setFinalAction(_ctx.stringValue("DescribeNavigationConfigResponse.SilenceTimeoutConfig.FinalAction"));
		silenceTimeoutConfig.setFinalActionParams(_ctx.stringValue("DescribeNavigationConfigResponse.SilenceTimeoutConfig.FinalActionParams"));
		silenceTimeoutConfig.setSourceType(_ctx.stringValue("DescribeNavigationConfigResponse.SilenceTimeoutConfig.SourceType"));
		silenceTimeoutConfig.setIntentTrigger(_ctx.stringValue("DescribeNavigationConfigResponse.SilenceTimeoutConfig.IntentTrigger"));
		describeNavigationConfigResponse.setSilenceTimeoutConfig(silenceTimeoutConfig);
	 
	 	return describeNavigationConfigResponse;
	}
}