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

import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnPerformanceIndexResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnPerformanceIndexResponse.DialoguePassRate;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnPerformanceIndexResponse.DialoguePassRate.UnitValue4;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnPerformanceIndexResponse.KnowledgeHitRate;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnPerformanceIndexResponse.KnowledgeHitRate.UnitValue6;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnPerformanceIndexResponse.ResolutionRate;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnPerformanceIndexResponse.ResolutionRate.UnitValue;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnPerformanceIndexResponse.ValidAnswerRate;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnPerformanceIndexResponse.ValidAnswerRate.UnitValue2;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVnPerformanceIndexResponseUnmarshaller {

	public static DescribeVnPerformanceIndexResponse unmarshall(DescribeVnPerformanceIndexResponse describeVnPerformanceIndexResponse, UnmarshallerContext context) {
		
		describeVnPerformanceIndexResponse.setRequestId(context.stringValue("DescribeVnPerformanceIndexResponse.RequestId"));

		ResolutionRate resolutionRate = new ResolutionRate();
		resolutionRate.setTotalRateValue(context.stringValue("DescribeVnPerformanceIndexResponse.ResolutionRate.TotalRateValue"));

		List<UnitValue> unitValues = new ArrayList<UnitValue>();
		for (int i = 0; i < context.lengthValue("DescribeVnPerformanceIndexResponse.ResolutionRate.UnitValues.Length"); i++) {
			UnitValue unitValue = new UnitValue();
			unitValue.setTime(context.longValue("DescribeVnPerformanceIndexResponse.ResolutionRate.UnitValues["+ i +"].Time"));
			unitValue.setRateValue(context.stringValue("DescribeVnPerformanceIndexResponse.ResolutionRate.UnitValues["+ i +"].RateValue"));

			unitValues.add(unitValue);
		}
		resolutionRate.setUnitValues(unitValues);
		describeVnPerformanceIndexResponse.setResolutionRate(resolutionRate);

		ValidAnswerRate validAnswerRate = new ValidAnswerRate();
		validAnswerRate.setTotalRateValue(context.stringValue("DescribeVnPerformanceIndexResponse.ValidAnswerRate.TotalRateValue"));

		List<UnitValue2> unitValues1 = new ArrayList<UnitValue2>();
		for (int i = 0; i < context.lengthValue("DescribeVnPerformanceIndexResponse.ValidAnswerRate.UnitValues.Length"); i++) {
			UnitValue2 unitValue2 = new UnitValue2();
			unitValue2.setTime(context.longValue("DescribeVnPerformanceIndexResponse.ValidAnswerRate.UnitValues["+ i +"].Time"));
			unitValue2.setRateValue(context.stringValue("DescribeVnPerformanceIndexResponse.ValidAnswerRate.UnitValues["+ i +"].RateValue"));

			unitValues1.add(unitValue2);
		}
		validAnswerRate.setUnitValues1(unitValues1);
		describeVnPerformanceIndexResponse.setValidAnswerRate(validAnswerRate);

		DialoguePassRate dialoguePassRate = new DialoguePassRate();
		dialoguePassRate.setTotalRateValue(context.stringValue("DescribeVnPerformanceIndexResponse.DialoguePassRate.TotalRateValue"));

		List<UnitValue4> unitValues3 = new ArrayList<UnitValue4>();
		for (int i = 0; i < context.lengthValue("DescribeVnPerformanceIndexResponse.DialoguePassRate.UnitValues.Length"); i++) {
			UnitValue4 unitValue4 = new UnitValue4();
			unitValue4.setTime(context.longValue("DescribeVnPerformanceIndexResponse.DialoguePassRate.UnitValues["+ i +"].Time"));
			unitValue4.setRateValue(context.stringValue("DescribeVnPerformanceIndexResponse.DialoguePassRate.UnitValues["+ i +"].RateValue"));

			unitValues3.add(unitValue4);
		}
		dialoguePassRate.setUnitValues3(unitValues3);
		describeVnPerformanceIndexResponse.setDialoguePassRate(dialoguePassRate);

		KnowledgeHitRate knowledgeHitRate = new KnowledgeHitRate();
		knowledgeHitRate.setTotalRateValue(context.stringValue("DescribeVnPerformanceIndexResponse.KnowledgeHitRate.TotalRateValue"));

		List<UnitValue6> unitValues5 = new ArrayList<UnitValue6>();
		for (int i = 0; i < context.lengthValue("DescribeVnPerformanceIndexResponse.KnowledgeHitRate.UnitValues.Length"); i++) {
			UnitValue6 unitValue6 = new UnitValue6();
			unitValue6.setTime(context.longValue("DescribeVnPerformanceIndexResponse.KnowledgeHitRate.UnitValues["+ i +"].Time"));
			unitValue6.setRateValue(context.stringValue("DescribeVnPerformanceIndexResponse.KnowledgeHitRate.UnitValues["+ i +"].RateValue"));

			unitValues5.add(unitValue6);
		}
		knowledgeHitRate.setUnitValues5(unitValues5);
		describeVnPerformanceIndexResponse.setKnowledgeHitRate(knowledgeHitRate);
	 
	 	return describeVnPerformanceIndexResponse;
	}
}