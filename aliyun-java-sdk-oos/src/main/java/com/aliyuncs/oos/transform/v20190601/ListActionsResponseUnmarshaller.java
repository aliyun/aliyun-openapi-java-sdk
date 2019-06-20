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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListActionsResponse;
import com.aliyuncs.oos.model.v20190601.ListActionsResponse.Action;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListActionsResponseUnmarshaller {

	public static ListActionsResponse unmarshall(ListActionsResponse listActionsResponse, UnmarshallerContext context) {
		
		listActionsResponse.setRequestId(context.stringValue("ListActionsResponse.RequestId"));
		listActionsResponse.setMaxResults(context.integerValue("ListActionsResponse.MaxResults"));
		listActionsResponse.setNextToken(context.stringValue("ListActionsResponse.NextToken"));

		List<Action> actions = new ArrayList<Action>();
		for (int i = 0; i < context.lengthValue("ListActionsResponse.Actions.Length"); i++) {
			Action action = new Action();
			action.setActionName(context.stringValue("ListActionsResponse.Actions["+ i +"].ActionName"));
			action.setDescription(context.stringValue("ListActionsResponse.Actions["+ i +"].Description"));
			action.setActionType(context.stringValue("ListActionsResponse.Actions["+ i +"].ActionType"));
			action.setCreatedDate(context.stringValue("ListActionsResponse.Actions["+ i +"].CreatedDate"));
			action.setProperties(context.stringValue("ListActionsResponse.Actions["+ i +"].Properties"));
			action.setTemplateVersion(context.stringValue("ListActionsResponse.Actions["+ i +"].TemplateVersion"));

			actions.add(action);
		}
		listActionsResponse.setActions(actions);
	 
	 	return listActionsResponse;
	}
}