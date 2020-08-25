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

import com.aliyuncs.sofa.model.v20190815.ListLinkeantcodeAntcodeUsergitauthResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeantcodeAntcodeUsergitauthResponseUnmarshaller {

	public static ListLinkeantcodeAntcodeUsergitauthResponse unmarshall(ListLinkeantcodeAntcodeUsergitauthResponse listLinkeantcodeAntcodeUsergitauthResponse, UnmarshallerContext _ctx) {
		
		listLinkeantcodeAntcodeUsergitauthResponse.setRequestId(_ctx.stringValue("ListLinkeantcodeAntcodeUsergitauthResponse.RequestId"));
		listLinkeantcodeAntcodeUsergitauthResponse.setResultCode(_ctx.stringValue("ListLinkeantcodeAntcodeUsergitauthResponse.ResultCode"));
		listLinkeantcodeAntcodeUsergitauthResponse.setResultMessage(_ctx.stringValue("ListLinkeantcodeAntcodeUsergitauthResponse.ResultMessage"));
		listLinkeantcodeAntcodeUsergitauthResponse.setResponseContent(_ctx.stringValue("ListLinkeantcodeAntcodeUsergitauthResponse.ResponseContent"));
		listLinkeantcodeAntcodeUsergitauthResponse.setResponseStatusCode(_ctx.longValue("ListLinkeantcodeAntcodeUsergitauthResponse.ResponseStatusCode"));
	 
	 	return listLinkeantcodeAntcodeUsergitauthResponse;
	}
}