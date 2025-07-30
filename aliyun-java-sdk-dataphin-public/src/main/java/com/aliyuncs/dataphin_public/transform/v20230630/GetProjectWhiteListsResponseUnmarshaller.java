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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetProjectWhiteListsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetProjectWhiteListsResponse.WhiteList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectWhiteListsResponseUnmarshaller {

	public static GetProjectWhiteListsResponse unmarshall(GetProjectWhiteListsResponse getProjectWhiteListsResponse, UnmarshallerContext _ctx) {
		
		getProjectWhiteListsResponse.setRequestId(_ctx.stringValue("GetProjectWhiteListsResponse.RequestId"));
		getProjectWhiteListsResponse.setSuccess(_ctx.booleanValue("GetProjectWhiteListsResponse.Success"));
		getProjectWhiteListsResponse.setHttpStatusCode(_ctx.integerValue("GetProjectWhiteListsResponse.HttpStatusCode"));
		getProjectWhiteListsResponse.setCode(_ctx.stringValue("GetProjectWhiteListsResponse.Code"));
		getProjectWhiteListsResponse.setMessage(_ctx.stringValue("GetProjectWhiteListsResponse.Message"));

		List<WhiteList> whiteLists = new ArrayList<WhiteList>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectWhiteListsResponse.WhiteLists.Length"); i++) {
			WhiteList whiteList = new WhiteList();
			whiteList.setDescription(_ctx.stringValue("GetProjectWhiteListsResponse.WhiteLists["+ i +"].Description"));
			whiteList.setIp(_ctx.stringValue("GetProjectWhiteListsResponse.WhiteLists["+ i +"].Ip"));
			whiteList.setPort(_ctx.stringValue("GetProjectWhiteListsResponse.WhiteLists["+ i +"].Port"));

			whiteLists.add(whiteList);
		}
		getProjectWhiteListsResponse.setWhiteLists(whiteLists);
	 
	 	return getProjectWhiteListsResponse;
	}
}