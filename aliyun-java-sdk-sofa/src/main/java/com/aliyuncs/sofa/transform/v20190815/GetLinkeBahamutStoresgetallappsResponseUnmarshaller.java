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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutStoresgetallappsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutStoresgetallappsResponseUnmarshaller {

	public static GetLinkeBahamutStoresgetallappsResponse unmarshall(GetLinkeBahamutStoresgetallappsResponse getLinkeBahamutStoresgetallappsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutStoresgetallappsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutStoresgetallappsResponse.RequestId"));
		getLinkeBahamutStoresgetallappsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutStoresgetallappsResponse.ResultCode"));
		getLinkeBahamutStoresgetallappsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutStoresgetallappsResponse.ResultMessage"));
		getLinkeBahamutStoresgetallappsResponse.setResponseContent(_ctx.stringValue("GetLinkeBahamutStoresgetallappsResponse.ResponseContent"));
		getLinkeBahamutStoresgetallappsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutStoresgetallappsResponse.ResponseStatusCode"));
	 
	 	return getLinkeBahamutStoresgetallappsResponse;
	}
}