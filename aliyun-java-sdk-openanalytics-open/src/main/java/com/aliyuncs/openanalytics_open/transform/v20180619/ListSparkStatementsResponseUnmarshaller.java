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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics_open.model.v20180619.ListSparkStatementsResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.ListSparkStatementsResponse.StatementsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSparkStatementsResponseUnmarshaller {

	public static ListSparkStatementsResponse unmarshall(ListSparkStatementsResponse listSparkStatementsResponse, UnmarshallerContext _ctx) {
		
		listSparkStatementsResponse.setRequestId(_ctx.stringValue("ListSparkStatementsResponse.RequestId"));

		List<StatementsItem> statements = new ArrayList<StatementsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSparkStatementsResponse.Statements.Length"); i++) {
			StatementsItem statementsItem = new StatementsItem();
			statementsItem.setId(_ctx.integerValue("ListSparkStatementsResponse.Statements["+ i +"].Id"));
			statementsItem.setCode(_ctx.stringValue("ListSparkStatementsResponse.Statements["+ i +"].Code"));
			statementsItem.setState(_ctx.stringValue("ListSparkStatementsResponse.Statements["+ i +"].State"));
			statementsItem.setOutput(_ctx.stringValue("ListSparkStatementsResponse.Statements["+ i +"].Output"));
			statementsItem.setProgress(_ctx.floatValue("ListSparkStatementsResponse.Statements["+ i +"].Progress"));
			statementsItem.setStartedTime(_ctx.longValue("ListSparkStatementsResponse.Statements["+ i +"].StartedTime"));
			statementsItem.setCompletedTime(_ctx.longValue("ListSparkStatementsResponse.Statements["+ i +"].CompletedTime"));

			statements.add(statementsItem);
		}
		listSparkStatementsResponse.setStatements(statements);
	 
	 	return listSparkStatementsResponse;
	}
}