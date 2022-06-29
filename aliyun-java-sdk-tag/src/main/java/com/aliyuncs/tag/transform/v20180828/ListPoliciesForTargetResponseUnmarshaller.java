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

package com.aliyuncs.tag.transform.v20180828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.tag.model.v20180828.ListPoliciesForTargetResponse;
import com.aliyuncs.tag.model.v20180828.ListPoliciesForTargetResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPoliciesForTargetResponseUnmarshaller {

	public static ListPoliciesForTargetResponse unmarshall(ListPoliciesForTargetResponse listPoliciesForTargetResponse, UnmarshallerContext _ctx) {
		
		listPoliciesForTargetResponse.setRequestId(_ctx.stringValue("ListPoliciesForTargetResponse.RequestId"));
		listPoliciesForTargetResponse.setNextToken(_ctx.stringValue("ListPoliciesForTargetResponse.NextToken"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPoliciesForTargetResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setPolicyId(_ctx.stringValue("ListPoliciesForTargetResponse.Data["+ i +"].PolicyId"));
			dataItem.setPolicyName(_ctx.stringValue("ListPoliciesForTargetResponse.Data["+ i +"].PolicyName"));
			dataItem.setPolicyDesc(_ctx.stringValue("ListPoliciesForTargetResponse.Data["+ i +"].PolicyDesc"));
			dataItem.setPolicyContent(_ctx.stringValue("ListPoliciesForTargetResponse.Data["+ i +"].PolicyContent"));
			dataItem.setUserType(_ctx.stringValue("ListPoliciesForTargetResponse.Data["+ i +"].UserType"));

			data.add(dataItem);
		}
		listPoliciesForTargetResponse.setData(data);
	 
	 	return listPoliciesForTargetResponse;
	}
}