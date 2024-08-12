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

import com.aliyuncs.wyota.model.v20210420.ListFbIssueLabelsByLCResponse;
import com.aliyuncs.wyota.model.v20210420.ListFbIssueLabelsByLCResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFbIssueLabelsByLCResponseUnmarshaller {

	public static ListFbIssueLabelsByLCResponse unmarshall(ListFbIssueLabelsByLCResponse listFbIssueLabelsByLCResponse, UnmarshallerContext _ctx) {
		
		listFbIssueLabelsByLCResponse.setRequestId(_ctx.stringValue("ListFbIssueLabelsByLCResponse.RequestId"));
		listFbIssueLabelsByLCResponse.setCode(_ctx.stringValue("ListFbIssueLabelsByLCResponse.Code"));
		listFbIssueLabelsByLCResponse.setMessage(_ctx.stringValue("ListFbIssueLabelsByLCResponse.Message"));

		Data data = new Data();

		List<String> issueLabel = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListFbIssueLabelsByLCResponse.Data.IssueLabel.Length"); i++) {
			issueLabel.add(_ctx.stringValue("ListFbIssueLabelsByLCResponse.Data.IssueLabel["+ i +"]"));
		}
		data.setIssueLabel(issueLabel);
		listFbIssueLabelsByLCResponse.setData(data);
	 
	 	return listFbIssueLabelsByLCResponse;
	}
}