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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.AddDoubleVerificationGroupsResponse;
import com.aliyuncs.vcs.model.v20200515.AddDoubleVerificationGroupsResponse.ResultListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDoubleVerificationGroupsResponseUnmarshaller {

	public static AddDoubleVerificationGroupsResponse unmarshall(AddDoubleVerificationGroupsResponse addDoubleVerificationGroupsResponse, UnmarshallerContext _ctx) {
		
		addDoubleVerificationGroupsResponse.setRequestId(_ctx.stringValue("AddDoubleVerificationGroupsResponse.RequestId"));
		addDoubleVerificationGroupsResponse.setCode(_ctx.stringValue("AddDoubleVerificationGroupsResponse.Code"));
		addDoubleVerificationGroupsResponse.setMessage(_ctx.stringValue("AddDoubleVerificationGroupsResponse.Message"));

		List<ResultListItem> resultList = new ArrayList<ResultListItem>();
		for (int i = 0; i < _ctx.lengthValue("AddDoubleVerificationGroupsResponse.ResultList.Length"); i++) {
			ResultListItem resultListItem = new ResultListItem();
			resultListItem.setGroupId(_ctx.stringValue("AddDoubleVerificationGroupsResponse.ResultList["+ i +"].GroupId"));
			resultListItem.setCode(_ctx.stringValue("AddDoubleVerificationGroupsResponse.ResultList["+ i +"].Code"));
			resultListItem.setMessage(_ctx.stringValue("AddDoubleVerificationGroupsResponse.ResultList["+ i +"].Message"));

			resultList.add(resultListItem);
		}
		addDoubleVerificationGroupsResponse.setResultList(resultList);
	 
	 	return addDoubleVerificationGroupsResponse;
	}
}