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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.ListHandshakesForAccountResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListHandshakesForAccountResponse.Handshake;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHandshakesForAccountResponseUnmarshaller {

	public static ListHandshakesForAccountResponse unmarshall(ListHandshakesForAccountResponse listHandshakesForAccountResponse, UnmarshallerContext _ctx) {
		
		listHandshakesForAccountResponse.setRequestId(_ctx.stringValue("ListHandshakesForAccountResponse.RequestId"));
		listHandshakesForAccountResponse.setTotalCount(_ctx.integerValue("ListHandshakesForAccountResponse.TotalCount"));
		listHandshakesForAccountResponse.setPageSize(_ctx.integerValue("ListHandshakesForAccountResponse.PageSize"));
		listHandshakesForAccountResponse.setPageNumber(_ctx.integerValue("ListHandshakesForAccountResponse.PageNumber"));

		List<Handshake> handshakes = new ArrayList<Handshake>();
		for (int i = 0; i < _ctx.lengthValue("ListHandshakesForAccountResponse.Handshakes.Length"); i++) {
			Handshake handshake = new Handshake();
			handshake.setStatus(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].Status"));
			handshake.setExpireTime(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].ExpireTime"));
			handshake.setResourceDirectoryId(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].ResourceDirectoryId"));
			handshake.setCreateTime(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].CreateTime"));
			handshake.setNote(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].Note"));
			handshake.setTargetEntity(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].TargetEntity"));
			handshake.setMasterAccountId(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].MasterAccountId"));
			handshake.setMasterAccountName(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].MasterAccountName"));
			handshake.setModifyTime(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].ModifyTime"));
			handshake.setTargetType(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].TargetType"));
			handshake.setHandshakeId(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].HandshakeId"));

			handshakes.add(handshake);
		}
		listHandshakesForAccountResponse.setHandshakes(handshakes);
	 
	 	return listHandshakesForAccountResponse;
	}
}