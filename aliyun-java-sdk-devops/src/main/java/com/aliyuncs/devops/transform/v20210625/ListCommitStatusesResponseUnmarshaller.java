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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListCommitStatusesResponse;
import com.aliyuncs.devops.model.v20210625.ListCommitStatusesResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListCommitStatusesResponse.ResultItem.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCommitStatusesResponseUnmarshaller {

	public static ListCommitStatusesResponse unmarshall(ListCommitStatusesResponse listCommitStatusesResponse, UnmarshallerContext _ctx) {
		
		listCommitStatusesResponse.setRequestId(_ctx.stringValue("ListCommitStatusesResponse.requestId"));
		listCommitStatusesResponse.setSuccess(_ctx.booleanValue("ListCommitStatusesResponse.success"));
		listCommitStatusesResponse.setErrorCode(_ctx.stringValue("ListCommitStatusesResponse.errorCode"));
		listCommitStatusesResponse.setErrorMessage(_ctx.stringValue("ListCommitStatusesResponse.errorMessage"));
		listCommitStatusesResponse.setTotal(_ctx.longValue("ListCommitStatusesResponse.total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCommitStatusesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("ListCommitStatusesResponse.result["+ i +"].id"));
			resultItem.setSha(_ctx.stringValue("ListCommitStatusesResponse.result["+ i +"].sha"));
			resultItem.setContext(_ctx.stringValue("ListCommitStatusesResponse.result["+ i +"].context"));
			resultItem.setState(_ctx.stringValue("ListCommitStatusesResponse.result["+ i +"].state"));
			resultItem.setTargetUrl(_ctx.stringValue("ListCommitStatusesResponse.result["+ i +"].targetUrl"));
			resultItem.setDescription(_ctx.stringValue("ListCommitStatusesResponse.result["+ i +"].description"));

			Creator creator = new Creator();
			creator.setAliyunPk(_ctx.stringValue("ListCommitStatusesResponse.result["+ i +"].creator.aliyunPk"));
			creator.setLogin(_ctx.stringValue("ListCommitStatusesResponse.result["+ i +"].creator.login"));
			creator.setAvatarUrl(_ctx.stringValue("ListCommitStatusesResponse.result["+ i +"].creator.avatarUrl"));
			creator.setType(_ctx.stringValue("ListCommitStatusesResponse.result["+ i +"].creator.type"));
			resultItem.setCreator(creator);

			result.add(resultItem);
		}
		listCommitStatusesResponse.setResult(result);
	 
	 	return listCommitStatusesResponse;
	}
}