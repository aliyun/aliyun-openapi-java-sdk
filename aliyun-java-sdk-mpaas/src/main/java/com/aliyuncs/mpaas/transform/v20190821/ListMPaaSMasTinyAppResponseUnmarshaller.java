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

package com.aliyuncs.mpaas.transform.v20190821;

import com.aliyuncs.mpaas.model.v20190821.ListMPaaSMasTinyAppResponse;
import com.aliyuncs.mpaas.model.v20190821.ListMPaaSMasTinyAppResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMPaaSMasTinyAppResponseUnmarshaller {

	public static ListMPaaSMasTinyAppResponse unmarshall(ListMPaaSMasTinyAppResponse listMPaaSMasTinyAppResponse, UnmarshallerContext _ctx) {
		
		listMPaaSMasTinyAppResponse.setRequestId(_ctx.stringValue("ListMPaaSMasTinyAppResponse.RequestId"));
		listMPaaSMasTinyAppResponse.setResultCode(_ctx.stringValue("ListMPaaSMasTinyAppResponse.ResultCode"));
		listMPaaSMasTinyAppResponse.setResultMessage(_ctx.stringValue("ListMPaaSMasTinyAppResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.longValue("ListMPaaSMasTinyAppResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("ListMPaaSMasTinyAppResponse.ResultContent.Data"));
		resultContent.setMsg(_ctx.stringValue("ListMPaaSMasTinyAppResponse.ResultContent.Msg"));
		listMPaaSMasTinyAppResponse.setResultContent(resultContent);
	 
	 	return listMPaaSMasTinyAppResponse;
	}
}