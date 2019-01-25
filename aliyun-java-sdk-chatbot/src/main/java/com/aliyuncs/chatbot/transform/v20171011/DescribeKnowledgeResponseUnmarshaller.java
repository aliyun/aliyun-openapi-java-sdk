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

package com.aliyuncs.chatbot.transform.v20171011;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.chatbot.model.v20171011.DescribeKnowledgeResponse;
import com.aliyuncs.chatbot.model.v20171011.DescribeKnowledgeResponse.Outline;
import com.aliyuncs.chatbot.model.v20171011.DescribeKnowledgeResponse.SimQuestion;
import com.aliyuncs.chatbot.model.v20171011.DescribeKnowledgeResponse.Solution;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKnowledgeResponseUnmarshaller {

	public static DescribeKnowledgeResponse unmarshall(DescribeKnowledgeResponse describeKnowledgeResponse, UnmarshallerContext context) {
		
		describeKnowledgeResponse.setRequestId(context.stringValue("DescribeKnowledgeResponse.RequestId"));
		describeKnowledgeResponse.setEndDate(context.stringValue("DescribeKnowledgeResponse.EndDate"));
		describeKnowledgeResponse.setCreateUserName(context.stringValue("DescribeKnowledgeResponse.CreateUserName"));
		describeKnowledgeResponse.setKnowledgeTitle(context.stringValue("DescribeKnowledgeResponse.KnowledgeTitle"));
		describeKnowledgeResponse.setVersion(context.integerValue("DescribeKnowledgeResponse.Version"));
		describeKnowledgeResponse.setKnowledgeId(context.longValue("DescribeKnowledgeResponse.KnowledgeId"));
		describeKnowledgeResponse.setModifyUserName(context.stringValue("DescribeKnowledgeResponse.ModifyUserName"));
		describeKnowledgeResponse.setModifyTime(context.stringValue("DescribeKnowledgeResponse.ModifyTime"));
		describeKnowledgeResponse.setCreateTime(context.stringValue("DescribeKnowledgeResponse.CreateTime"));
		describeKnowledgeResponse.setKnowledgeType(context.integerValue("DescribeKnowledgeResponse.KnowledgeType"));
		describeKnowledgeResponse.setCategoryId(context.longValue("DescribeKnowledgeResponse.CategoryId"));
		describeKnowledgeResponse.setStartDate(context.stringValue("DescribeKnowledgeResponse.StartDate"));
		describeKnowledgeResponse.setKnowledgeStatus(context.integerValue("DescribeKnowledgeResponse.KnowledgeStatus"));

		List<String> keyWords = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeKnowledgeResponse.KeyWords.Length"); i++) {
			keyWords.add(context.stringValue("DescribeKnowledgeResponse.KeyWords["+ i +"]"));
		}
		describeKnowledgeResponse.setKeyWords(keyWords);

		List<String> coreWords = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeKnowledgeResponse.CoreWords.Length"); i++) {
			coreWords.add(context.stringValue("DescribeKnowledgeResponse.CoreWords["+ i +"]"));
		}
		describeKnowledgeResponse.setCoreWords(coreWords);

		List<Outline> outlines = new ArrayList<Outline>();
		for (int i = 0; i < context.lengthValue("DescribeKnowledgeResponse.Outlines.Length"); i++) {
			Outline outline = new Outline();
			outline.setKnowledgeId(context.longValue("DescribeKnowledgeResponse.Outlines["+ i +"].KnowledgeId"));
			outline.setTitle(context.stringValue("DescribeKnowledgeResponse.Outlines["+ i +"].Title"));
			outline.setOutlineId(context.longValue("DescribeKnowledgeResponse.Outlines["+ i +"].OutlineId"));

			outlines.add(outline);
		}
		describeKnowledgeResponse.setOutlines(outlines);

		List<SimQuestion> simQuestions = new ArrayList<SimQuestion>();
		for (int i = 0; i < context.lengthValue("DescribeKnowledgeResponse.SimQuestions.Length"); i++) {
			SimQuestion simQuestion = new SimQuestion();
			simQuestion.setModifyTime(context.stringValue("DescribeKnowledgeResponse.SimQuestions["+ i +"].ModifyTime"));
			simQuestion.setCreateTime(context.stringValue("DescribeKnowledgeResponse.SimQuestions["+ i +"].CreateTime"));
			simQuestion.setSimQuestionId(context.longValue("DescribeKnowledgeResponse.SimQuestions["+ i +"].SimQuestionId"));
			simQuestion.setTitle(context.stringValue("DescribeKnowledgeResponse.SimQuestions["+ i +"].Title"));

			simQuestions.add(simQuestion);
		}
		describeKnowledgeResponse.setSimQuestions(simQuestions);

		List<Solution> solutions = new ArrayList<Solution>();
		for (int i = 0; i < context.lengthValue("DescribeKnowledgeResponse.Solutions.Length"); i++) {
			Solution solution = new Solution();
			solution.setSummary(context.stringValue("DescribeKnowledgeResponse.Solutions["+ i +"].Summary"));
			solution.setModifyTime(context.stringValue("DescribeKnowledgeResponse.Solutions["+ i +"].ModifyTime"));
			solution.setCreateTime(context.stringValue("DescribeKnowledgeResponse.Solutions["+ i +"].CreateTime"));
			solution.setSolutionId(context.longValue("DescribeKnowledgeResponse.Solutions["+ i +"].SolutionId"));
			solution.setContent(context.stringValue("DescribeKnowledgeResponse.Solutions["+ i +"].Content"));
			solution.setPlainText(context.stringValue("DescribeKnowledgeResponse.Solutions["+ i +"].PlainText"));

			List<String> perspectiveIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeKnowledgeResponse.Solutions["+ i +"].PerspectiveIds.Length"); j++) {
				perspectiveIds.add(context.stringValue("DescribeKnowledgeResponse.Solutions["+ i +"].PerspectiveIds["+ j +"]"));
			}
			solution.setPerspectiveIds(perspectiveIds);

			solutions.add(solution);
		}
		describeKnowledgeResponse.setSolutions(solutions);
	 
	 	return describeKnowledgeResponse;
	}
}