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

import com.aliyuncs.chatbot.model.v20171011.QueryKnowledgesResponse;
import com.aliyuncs.chatbot.model.v20171011.QueryKnowledgesResponse.Knowledge;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryKnowledgesResponseUnmarshaller {

	public static QueryKnowledgesResponse unmarshall(QueryKnowledgesResponse queryKnowledgesResponse, UnmarshallerContext context) {
		
		queryKnowledgesResponse.setRequestId(context.stringValue("QueryKnowledgesResponse.RequestId"));
		queryKnowledgesResponse.setPageNumber(context.integerValue("QueryKnowledgesResponse.PageNumber"));
		queryKnowledgesResponse.setPageSize(context.integerValue("QueryKnowledgesResponse.PageSize"));
		queryKnowledgesResponse.setTotalCount(context.integerValue("QueryKnowledgesResponse.TotalCount"));

		List<Knowledge> knowledges = new ArrayList<Knowledge>();
		for (int i = 0; i < context.lengthValue("QueryKnowledgesResponse.Knowledges.Length"); i++) {
			Knowledge knowledge = new Knowledge();
			knowledge.setKnowledgeId(context.longValue("QueryKnowledgesResponse.Knowledges["+ i +"].KnowledgeId"));
			knowledge.setModifyTime(context.stringValue("QueryKnowledgesResponse.Knowledges["+ i +"].ModifyTime"));
			knowledge.setModifyUserName(context.stringValue("QueryKnowledgesResponse.Knowledges["+ i +"].ModifyUserName"));
			knowledge.setCreateTime(context.stringValue("QueryKnowledgesResponse.Knowledges["+ i +"].CreateTime"));
			knowledge.setCreateUserName(context.stringValue("QueryKnowledgesResponse.Knowledges["+ i +"].CreateUserName"));
			knowledge.setCategoryId(context.longValue("QueryKnowledgesResponse.Knowledges["+ i +"].CategoryId"));
			knowledge.setKnowledgeStatus(context.integerValue("QueryKnowledgesResponse.Knowledges["+ i +"].KnowledgeStatus"));
			knowledge.setKnowledgeTitle(context.stringValue("QueryKnowledgesResponse.Knowledges["+ i +"].KnowledgeTitle"));
			knowledge.setStartDate(context.stringValue("QueryKnowledgesResponse.Knowledges["+ i +"].StartDate"));
			knowledge.setEndDate(context.stringValue("QueryKnowledgesResponse.Knowledges["+ i +"].EndDate"));
			knowledge.setVersion(context.stringValue("QueryKnowledgesResponse.Knowledges["+ i +"].Version"));

			List<String> coreWords = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryKnowledgesResponse.Knowledges["+ i +"].CoreWords.Length"); j++) {
				coreWords.add(context.stringValue("QueryKnowledgesResponse.Knowledges["+ i +"].CoreWords["+ j +"]"));
			}
			knowledge.setCoreWords(coreWords);

			knowledges.add(knowledge);
		}
		queryKnowledgesResponse.setKnowledges(knowledges);
	 
	 	return queryKnowledgesResponse;
	}
}