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

import com.aliyuncs.chatbot.model.v20171011.QuerySystemEntitiesResponse;
import com.aliyuncs.chatbot.model.v20171011.QuerySystemEntitiesResponse.Entity;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySystemEntitiesResponseUnmarshaller {

	public static QuerySystemEntitiesResponse unmarshall(QuerySystemEntitiesResponse querySystemEntitiesResponse, UnmarshallerContext context) {
		
		querySystemEntitiesResponse.setRequestId(context.stringValue("QuerySystemEntitiesResponse.RequestId"));

		List<Entity> systemEntities = new ArrayList<Entity>();
		for (int i = 0; i < context.lengthValue("QuerySystemEntitiesResponse.SystemEntities.Length"); i++) {
			Entity entity = new Entity();
			entity.setDefaultQuestion(context.stringValue("QuerySystemEntitiesResponse.SystemEntities["+ i +"].DefaultQuestion"));
			entity.setEntityName(context.stringValue("QuerySystemEntitiesResponse.SystemEntities["+ i +"].EntityName"));
			entity.setEntityCode(context.stringValue("QuerySystemEntitiesResponse.SystemEntities["+ i +"].EntityCode"));

			systemEntities.add(entity);
		}
		querySystemEntitiesResponse.setSystemEntities(systemEntities);
	 
	 	return querySystemEntitiesResponse;
	}
}