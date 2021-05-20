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

package com.aliyuncs.quickbi_public.transform.v20200808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20200808.ListPortalMenuAuthorizationResponse;
import com.aliyuncs.quickbi_public.model.v20200808.ListPortalMenuAuthorizationResponse.Data;
import com.aliyuncs.quickbi_public.model.v20200808.ListPortalMenuAuthorizationResponse.Data.ReceiversItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPortalMenuAuthorizationResponseUnmarshaller {

	public static ListPortalMenuAuthorizationResponse unmarshall(ListPortalMenuAuthorizationResponse listPortalMenuAuthorizationResponse, UnmarshallerContext _ctx) {
		
		listPortalMenuAuthorizationResponse.setRequestId(_ctx.stringValue("ListPortalMenuAuthorizationResponse.RequestId"));
		listPortalMenuAuthorizationResponse.setSuccess(_ctx.booleanValue("ListPortalMenuAuthorizationResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListPortalMenuAuthorizationResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setMenuId(_ctx.stringValue("ListPortalMenuAuthorizationResponse.Result["+ i +"].MenuId"));
			data.setShowOnlyWithAccess(_ctx.booleanValue("ListPortalMenuAuthorizationResponse.Result["+ i +"].ShowOnlyWithAccess"));

			List<ReceiversItem> receivers = new ArrayList<ReceiversItem>();
			for (int j = 0; j < _ctx.lengthValue("ListPortalMenuAuthorizationResponse.Result["+ i +"].Receivers.Length"); j++) {
				ReceiversItem receiversItem = new ReceiversItem();
				receiversItem.setReceiverId(_ctx.stringValue("ListPortalMenuAuthorizationResponse.Result["+ i +"].Receivers["+ j +"].ReceiverId"));
				receiversItem.setReceiverType(_ctx.integerValue("ListPortalMenuAuthorizationResponse.Result["+ i +"].Receivers["+ j +"].ReceiverType"));

				receivers.add(receiversItem);
			}
			data.setReceivers(receivers);

			result.add(data);
		}
		listPortalMenuAuthorizationResponse.setResult(result);
	 
	 	return listPortalMenuAuthorizationResponse;
	}
}