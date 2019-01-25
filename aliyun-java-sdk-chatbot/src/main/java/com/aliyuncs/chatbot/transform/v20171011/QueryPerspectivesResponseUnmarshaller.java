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

import com.aliyuncs.chatbot.model.v20171011.QueryPerspectivesResponse;
import com.aliyuncs.chatbot.model.v20171011.QueryPerspectivesResponse.Perspective;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPerspectivesResponseUnmarshaller {

	public static QueryPerspectivesResponse unmarshall(QueryPerspectivesResponse queryPerspectivesResponse, UnmarshallerContext context) {
		
		queryPerspectivesResponse.setRequestId(context.stringValue("QueryPerspectivesResponse.RequestId"));

		List<Perspective> perspectives = new ArrayList<Perspective>();
		for (int i = 0; i < context.lengthValue("QueryPerspectivesResponse.Perspectives.Length"); i++) {
			Perspective perspective = new Perspective();
			perspective.setModifyUserName(context.stringValue("QueryPerspectivesResponse.Perspectives["+ i +"].ModifyUserName"));
			perspective.setModifyTime(context.stringValue("QueryPerspectivesResponse.Perspectives["+ i +"].ModifyTime"));
			perspective.setCreateTime(context.stringValue("QueryPerspectivesResponse.Perspectives["+ i +"].CreateTime"));
			perspective.setSelfDefine(context.stringValue("QueryPerspectivesResponse.Perspectives["+ i +"].SelfDefine"));
			perspective.setPerspectiveId(context.stringValue("QueryPerspectivesResponse.Perspectives["+ i +"].PerspectiveId"));
			perspective.setCreateUserName(context.stringValue("QueryPerspectivesResponse.Perspectives["+ i +"].CreateUserName"));
			perspective.setPerspectiveCode(context.stringValue("QueryPerspectivesResponse.Perspectives["+ i +"].PerspectiveCode"));
			perspective.setStatus(context.integerValue("QueryPerspectivesResponse.Perspectives["+ i +"].Status"));
			perspective.setName(context.stringValue("QueryPerspectivesResponse.Perspectives["+ i +"].Name"));

			perspectives.add(perspective);
		}
		queryPerspectivesResponse.setPerspectives(perspectives);
	 
	 	return queryPerspectivesResponse;
	}
}