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

import com.aliyuncs.sofa.model.v20190815.ListLinkeantcodeAntcodeRepositoryfilesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeantcodeAntcodeRepositoryfilesResponseUnmarshaller {

	public static ListLinkeantcodeAntcodeRepositoryfilesResponse unmarshall(ListLinkeantcodeAntcodeRepositoryfilesResponse listLinkeantcodeAntcodeRepositoryfilesResponse, UnmarshallerContext _ctx) {
		
		listLinkeantcodeAntcodeRepositoryfilesResponse.setRequestId(_ctx.stringValue("ListLinkeantcodeAntcodeRepositoryfilesResponse.RequestId"));
		listLinkeantcodeAntcodeRepositoryfilesResponse.setResultCode(_ctx.stringValue("ListLinkeantcodeAntcodeRepositoryfilesResponse.ResultCode"));
		listLinkeantcodeAntcodeRepositoryfilesResponse.setResultMessage(_ctx.stringValue("ListLinkeantcodeAntcodeRepositoryfilesResponse.ResultMessage"));
		listLinkeantcodeAntcodeRepositoryfilesResponse.setResponseContent(_ctx.stringValue("ListLinkeantcodeAntcodeRepositoryfilesResponse.ResponseContent"));
		listLinkeantcodeAntcodeRepositoryfilesResponse.setResponsePage(_ctx.stringValue("ListLinkeantcodeAntcodeRepositoryfilesResponse.ResponsePage"));
		listLinkeantcodeAntcodeRepositoryfilesResponse.setResponsePageInfoNextPage(_ctx.stringValue("ListLinkeantcodeAntcodeRepositoryfilesResponse.ResponsePageInfoNextPage"));
		listLinkeantcodeAntcodeRepositoryfilesResponse.setResponsePageInfoPerPage(_ctx.stringValue("ListLinkeantcodeAntcodeRepositoryfilesResponse.ResponsePageInfoPerPage"));
		listLinkeantcodeAntcodeRepositoryfilesResponse.setResponsePageInfoPrevPage(_ctx.stringValue("ListLinkeantcodeAntcodeRepositoryfilesResponse.ResponsePageInfoPrevPage"));
		listLinkeantcodeAntcodeRepositoryfilesResponse.setResponsePageInfoTotal(_ctx.stringValue("ListLinkeantcodeAntcodeRepositoryfilesResponse.ResponsePageInfoTotal"));
		listLinkeantcodeAntcodeRepositoryfilesResponse.setResponsePageInfoTotalPages(_ctx.stringValue("ListLinkeantcodeAntcodeRepositoryfilesResponse.ResponsePageInfoTotalPages"));
		listLinkeantcodeAntcodeRepositoryfilesResponse.setResponseStatusCode(_ctx.longValue("ListLinkeantcodeAntcodeRepositoryfilesResponse.ResponseStatusCode"));
	 
	 	return listLinkeantcodeAntcodeRepositoryfilesResponse;
	}
}