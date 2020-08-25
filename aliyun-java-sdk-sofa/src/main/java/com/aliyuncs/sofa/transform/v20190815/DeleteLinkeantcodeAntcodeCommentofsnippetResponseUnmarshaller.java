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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeCommentofsnippetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeCommentofsnippetResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeCommentofsnippetResponse unmarshall(DeleteLinkeantcodeAntcodeCommentofsnippetResponse deleteLinkeantcodeAntcodeCommentofsnippetResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeCommentofsnippetResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeCommentofsnippetResponse.RequestId"));
		deleteLinkeantcodeAntcodeCommentofsnippetResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeCommentofsnippetResponse.ResultCode"));
		deleteLinkeantcodeAntcodeCommentofsnippetResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeCommentofsnippetResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeCommentofsnippetResponse.setResponseContent(_ctx.stringValue("DeleteLinkeantcodeAntcodeCommentofsnippetResponse.ResponseContent"));
		deleteLinkeantcodeAntcodeCommentofsnippetResponse.setResponsePage(_ctx.stringValue("DeleteLinkeantcodeAntcodeCommentofsnippetResponse.ResponsePage"));
		deleteLinkeantcodeAntcodeCommentofsnippetResponse.setResponsePageInfoNextPage(_ctx.stringValue("DeleteLinkeantcodeAntcodeCommentofsnippetResponse.ResponsePageInfoNextPage"));
		deleteLinkeantcodeAntcodeCommentofsnippetResponse.setResponsePageInfoPerPage(_ctx.stringValue("DeleteLinkeantcodeAntcodeCommentofsnippetResponse.ResponsePageInfoPerPage"));
		deleteLinkeantcodeAntcodeCommentofsnippetResponse.setResponsePageInfoPrevPage(_ctx.stringValue("DeleteLinkeantcodeAntcodeCommentofsnippetResponse.ResponsePageInfoPrevPage"));
		deleteLinkeantcodeAntcodeCommentofsnippetResponse.setResponsePageInfoTotal(_ctx.stringValue("DeleteLinkeantcodeAntcodeCommentofsnippetResponse.ResponsePageInfoTotal"));
		deleteLinkeantcodeAntcodeCommentofsnippetResponse.setResponsePageInfoTotalPages(_ctx.stringValue("DeleteLinkeantcodeAntcodeCommentofsnippetResponse.ResponsePageInfoTotalPages"));
		deleteLinkeantcodeAntcodeCommentofsnippetResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeCommentofsnippetResponse.ResponseStatusCode"));
	 
	 	return deleteLinkeantcodeAntcodeCommentofsnippetResponse;
	}
}