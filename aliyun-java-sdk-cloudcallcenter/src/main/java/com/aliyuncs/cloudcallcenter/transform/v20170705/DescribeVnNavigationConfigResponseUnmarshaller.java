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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnNavigationConfigResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnNavigationConfigResponse.AskingBackConfig;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnNavigationConfigResponse.ComplainingConfig;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnNavigationConfigResponse.GreetingConfig;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnNavigationConfigResponse.RepeatingConfig;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnNavigationConfigResponse.SilenceTimeoutConfig;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnNavigationConfigResponse.UnrecognizingConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVnNavigationConfigResponseUnmarshaller {

	public static DescribeVnNavigationConfigResponse unmarshall(DescribeVnNavigationConfigResponse describeVnNavigationConfigResponse, UnmarshallerContext context) {
		
		describeVnNavigationConfigResponse.setRequestId(context.stringValue("DescribeVnNavigationConfigResponse.RequestId"));

		GreetingConfig greetingConfig = new GreetingConfig();
		greetingConfig.setGreetingWords(context.stringValue("DescribeVnNavigationConfigResponse.GreetingConfig.GreetingWords"));
		describeVnNavigationConfigResponse.setGreetingConfig(greetingConfig);

		UnrecognizingConfig unrecognizingConfig = new UnrecognizingConfig();
		unrecognizingConfig.setPrompt(context.stringValue("DescribeVnNavigationConfigResponse.UnrecognizingConfig.Prompt"));
		unrecognizingConfig.setThreshold(context.integerValue("DescribeVnNavigationConfigResponse.UnrecognizingConfig.Threshold"));
		unrecognizingConfig.setFinalPrompt(context.stringValue("DescribeVnNavigationConfigResponse.UnrecognizingConfig.FinalPrompt"));
		unrecognizingConfig.setFinalAction(context.stringValue("DescribeVnNavigationConfigResponse.UnrecognizingConfig.FinalAction"));
		unrecognizingConfig.setFinalActionParams(context.stringValue("DescribeVnNavigationConfigResponse.UnrecognizingConfig.FinalActionParams"));
		describeVnNavigationConfigResponse.setUnrecognizingConfig(unrecognizingConfig);

		RepeatingConfig repeatingConfig = new RepeatingConfig();

		List<String> utterances = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeVnNavigationConfigResponse.RepeatingConfig.Utterances.Length"); i++) {
			utterances.add(context.stringValue("DescribeVnNavigationConfigResponse.RepeatingConfig.Utterances["+ i +"]"));
		}
		repeatingConfig.setUtterances(utterances);
		describeVnNavigationConfigResponse.setRepeatingConfig(repeatingConfig);

		AskingBackConfig askingBackConfig = new AskingBackConfig();
		askingBackConfig.setEnabled(context.booleanValue("DescribeVnNavigationConfigResponse.AskingBackConfig.Enabled"));
		askingBackConfig.setPrompt(context.stringValue("DescribeVnNavigationConfigResponse.AskingBackConfig.Prompt"));
		askingBackConfig.setEnableNegativeFeedback(context.booleanValue("DescribeVnNavigationConfigResponse.AskingBackConfig.EnableNegativeFeedback"));
		askingBackConfig.setNegativeFeedbackPrompt(context.stringValue("DescribeVnNavigationConfigResponse.AskingBackConfig.NegativeFeedbackPrompt"));
		askingBackConfig.setNegativeFeedbackAction(context.stringValue("DescribeVnNavigationConfigResponse.AskingBackConfig.NegativeFeedbackAction"));
		askingBackConfig.setNegativeFeedbackActionParams(context.stringValue("DescribeVnNavigationConfigResponse.AskingBackConfig.NegativeFeedbackActionParams"));

		List<String> negativeFeedbackUtterances = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeVnNavigationConfigResponse.AskingBackConfig.NegativeFeedbackUtterances.Length"); i++) {
			negativeFeedbackUtterances.add(context.stringValue("DescribeVnNavigationConfigResponse.AskingBackConfig.NegativeFeedbackUtterances["+ i +"]"));
		}
		askingBackConfig.setNegativeFeedbackUtterances(negativeFeedbackUtterances);
		describeVnNavigationConfigResponse.setAskingBackConfig(askingBackConfig);

		ComplainingConfig complainingConfig = new ComplainingConfig();
		complainingConfig.setPrompt(context.stringValue("DescribeVnNavigationConfigResponse.ComplainingConfig.Prompt"));
		complainingConfig.setFinalAction(context.stringValue("DescribeVnNavigationConfigResponse.ComplainingConfig.FinalAction"));
		complainingConfig.setFinalActionParams(context.stringValue("DescribeVnNavigationConfigResponse.ComplainingConfig.FinalActionParams"));

		List<String> utterances1 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeVnNavigationConfigResponse.ComplainingConfig.Utterances.Length"); i++) {
			utterances1.add(context.stringValue("DescribeVnNavigationConfigResponse.ComplainingConfig.Utterances["+ i +"]"));
		}
		complainingConfig.setUtterances1(utterances1);
		describeVnNavigationConfigResponse.setComplainingConfig(complainingConfig);

		SilenceTimeoutConfig silenceTimeoutConfig = new SilenceTimeoutConfig();
		silenceTimeoutConfig.setPrompt(context.stringValue("DescribeVnNavigationConfigResponse.SilenceTimeoutConfig.Prompt"));
		silenceTimeoutConfig.setTimeout(context.longValue("DescribeVnNavigationConfigResponse.SilenceTimeoutConfig.Timeout"));
		silenceTimeoutConfig.setThreshold(context.integerValue("DescribeVnNavigationConfigResponse.SilenceTimeoutConfig.Threshold"));
		silenceTimeoutConfig.setFinalPrompt(context.stringValue("DescribeVnNavigationConfigResponse.SilenceTimeoutConfig.FinalPrompt"));
		silenceTimeoutConfig.setFinalAction(context.stringValue("DescribeVnNavigationConfigResponse.SilenceTimeoutConfig.FinalAction"));
		silenceTimeoutConfig.setFinalActionParams(context.stringValue("DescribeVnNavigationConfigResponse.SilenceTimeoutConfig.FinalActionParams"));
		describeVnNavigationConfigResponse.setSilenceTimeoutConfig(silenceTimeoutConfig);
	 
	 	return describeVnNavigationConfigResponse;
	}
}