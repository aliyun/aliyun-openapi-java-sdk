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

import com.aliyuncs.sofa.model.v20190815.ListMsSgRouterRuleVersionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMsSgRouterRuleVersionsResponseUnmarshaller {

	public static ListMsSgRouterRuleVersionsResponse unmarshall(ListMsSgRouterRuleVersionsResponse listMsSgRouterRuleVersionsResponse, UnmarshallerContext _ctx) {
		
		listMsSgRouterRuleVersionsResponse.setRequestId(_ctx.stringValue("ListMsSgRouterRuleVersionsResponse.RequestId"));
		listMsSgRouterRuleVersionsResponse.setResultCode(_ctx.stringValue("ListMsSgRouterRuleVersionsResponse.ResultCode"));
		listMsSgRouterRuleVersionsResponse.setResultMessage(_ctx.stringValue("ListMsSgRouterRuleVersionsResponse.ResultMessage"));

		List<String> versions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListMsSgRouterRuleVersionsResponse.Versions.Length"); i++) {
			versions.add(_ctx.stringValue("ListMsSgRouterRuleVersionsResponse.Versions["+ i +"]"));
		}
		listMsSgRouterRuleVersionsResponse.setVersions(versions);
	 
	 	return listMsSgRouterRuleVersionsResponse;
	}
}