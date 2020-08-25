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

import com.aliyuncs.sofa.model.v20190815.ConfirmLinkefabricFabricEnvconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.ConfirmLinkefabricFabricEnvconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmLinkefabricFabricEnvconfigsResponseUnmarshaller {

	public static ConfirmLinkefabricFabricEnvconfigsResponse unmarshall(ConfirmLinkefabricFabricEnvconfigsResponse confirmLinkefabricFabricEnvconfigsResponse, UnmarshallerContext _ctx) {
		
		confirmLinkefabricFabricEnvconfigsResponse.setRequestId(_ctx.stringValue("ConfirmLinkefabricFabricEnvconfigsResponse.RequestId"));
		confirmLinkefabricFabricEnvconfigsResponse.setResultCode(_ctx.stringValue("ConfirmLinkefabricFabricEnvconfigsResponse.ResultCode"));
		confirmLinkefabricFabricEnvconfigsResponse.setResultMessage(_ctx.stringValue("ConfirmLinkefabricFabricEnvconfigsResponse.ResultMessage"));
		confirmLinkefabricFabricEnvconfigsResponse.setMessage(_ctx.stringValue("ConfirmLinkefabricFabricEnvconfigsResponse.Message"));
		confirmLinkefabricFabricEnvconfigsResponse.setResponseStatusCode(_ctx.longValue("ConfirmLinkefabricFabricEnvconfigsResponse.ResponseStatusCode"));
		confirmLinkefabricFabricEnvconfigsResponse.setSuccess(_ctx.booleanValue("ConfirmLinkefabricFabricEnvconfigsResponse.Success"));

		Data data = new Data();
		data.setAntxChangeJson(_ctx.stringValue("ConfirmLinkefabricFabricEnvconfigsResponse.Data.AntxChangeJson"));
		data.setLinkeUrl(_ctx.stringValue("ConfirmLinkefabricFabricEnvconfigsResponse.Data.LinkeUrl"));

		List<String> antxConflictInfo = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ConfirmLinkefabricFabricEnvconfigsResponse.Data.AntxConflictInfo.Length"); i++) {
			antxConflictInfo.add(_ctx.stringValue("ConfirmLinkefabricFabricEnvconfigsResponse.Data.AntxConflictInfo["+ i +"]"));
		}
		data.setAntxConflictInfo(antxConflictInfo);

		List<String> delKeyList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ConfirmLinkefabricFabricEnvconfigsResponse.Data.DelKeyList.Length"); i++) {
			delKeyList.add(_ctx.stringValue("ConfirmLinkefabricFabricEnvconfigsResponse.Data.DelKeyList["+ i +"]"));
		}
		data.setDelKeyList(delKeyList);
		confirmLinkefabricFabricEnvconfigsResponse.setData(data);
	 
	 	return confirmLinkefabricFabricEnvconfigsResponse;
	}
}