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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetClriskIssueDataResponse;
import com.aliyuncs.sofa.model.v20190815.GetClriskIssueDataResponse.ValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClriskIssueDataResponseUnmarshaller {

	public static GetClriskIssueDataResponse unmarshall(GetClriskIssueDataResponse getClriskIssueDataResponse, UnmarshallerContext _ctx) {
		
		getClriskIssueDataResponse.setRequestId(_ctx.stringValue("GetClriskIssueDataResponse.RequestId"));
		getClriskIssueDataResponse.setResultCode(_ctx.stringValue("GetClriskIssueDataResponse.ResultCode"));
		getClriskIssueDataResponse.setResultMessage(_ctx.stringValue("GetClriskIssueDataResponse.ResultMessage"));
		getClriskIssueDataResponse.setCycle(_ctx.stringValue("GetClriskIssueDataResponse.Cycle"));
		getClriskIssueDataResponse.setIssueDataId(_ctx.stringValue("GetClriskIssueDataResponse.IssueDataId"));
		getClriskIssueDataResponse.setTaskId(_ctx.longValue("GetClriskIssueDataResponse.TaskId"));

		List<String> heads = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskIssueDataResponse.Heads.Length"); i++) {
			heads.add(_ctx.stringValue("GetClriskIssueDataResponse.Heads["+ i +"]"));
		}
		getClriskIssueDataResponse.setHeads(heads);

		List<ValuesItem> values = new ArrayList<ValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskIssueDataResponse.Values.Length"); i++) {
			ValuesItem valuesItem = new ValuesItem();

			List<String> names = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetClriskIssueDataResponse.Values["+ i +"].Names.Length"); j++) {
				names.add(_ctx.stringValue("GetClriskIssueDataResponse.Values["+ i +"].Names["+ j +"]"));
			}
			valuesItem.setNames(names);

			List<String> values1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetClriskIssueDataResponse.Values["+ i +"].Values.Length"); j++) {
				values1.add(_ctx.stringValue("GetClriskIssueDataResponse.Values["+ i +"].Values["+ j +"]"));
			}
			valuesItem.setValues1(values1);

			values.add(valuesItem);
		}
		getClriskIssueDataResponse.setValues(values);
	 
	 	return getClriskIssueDataResponse;
	}
}