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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.ListWhitePortalMenuResponse;
import com.aliyuncs.quickbi_public.model.v20220101.ListWhitePortalMenuResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWhitePortalMenuResponseUnmarshaller {

	public static ListWhitePortalMenuResponse unmarshall(ListWhitePortalMenuResponse listWhitePortalMenuResponse, UnmarshallerContext _ctx) {
		
		listWhitePortalMenuResponse.setRequestId(_ctx.stringValue("ListWhitePortalMenuResponse.RequestId"));
		listWhitePortalMenuResponse.setSuccess(_ctx.booleanValue("ListWhitePortalMenuResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListWhitePortalMenuResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setReceiverId(_ctx.stringValue("ListWhitePortalMenuResponse.Result["+ i +"].ReceiverId"));
			data.setReceiverType(_ctx.integerValue("ListWhitePortalMenuResponse.Result["+ i +"].ReceiverType"));
			data.setAuthPointsValue(_ctx.integerValue("ListWhitePortalMenuResponse.Result["+ i +"].AuthPointsValue"));

			result.add(data);
		}
		listWhitePortalMenuResponse.setResult(result);
	 
	 	return listWhitePortalMenuResponse;
	}
}