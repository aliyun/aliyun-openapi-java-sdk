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

package com.aliyuncs.wyota.transform.v20210420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wyota.model.v20210420.ListFbIssueLabelsResponse;
import com.aliyuncs.wyota.model.v20210420.ListFbIssueLabelsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFbIssueLabelsResponseUnmarshaller {

	public static ListFbIssueLabelsResponse unmarshall(ListFbIssueLabelsResponse listFbIssueLabelsResponse, UnmarshallerContext _ctx) {
		
		listFbIssueLabelsResponse.setRequestId(_ctx.stringValue("ListFbIssueLabelsResponse.RequestId"));
		listFbIssueLabelsResponse.setCode(_ctx.stringValue("ListFbIssueLabelsResponse.Code"));
		listFbIssueLabelsResponse.setMessage(_ctx.stringValue("ListFbIssueLabelsResponse.Message"));

		Data data = new Data();

		List<String> issueLabel = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListFbIssueLabelsResponse.Data.IssueLabel.Length"); i++) {
			issueLabel.add(_ctx.stringValue("ListFbIssueLabelsResponse.Data.IssueLabel["+ i +"]"));
		}
		data.setIssueLabel(issueLabel);
		listFbIssueLabelsResponse.setData(data);
	 
	 	return listFbIssueLabelsResponse;
	}
}