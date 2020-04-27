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
		listHandshakesForAccountResponse.setPageNumber(_ctx.integerValue("ListHandshakesForAccountResponse.PageNumber"));
		listHandshakesForAccountResponse.setPageSize(_ctx.integerValue("ListHandshakesForAccountResponse.PageSize"));
		listHandshakesForAccountResponse.setTotalCount(_ctx.integerValue("ListHandshakesForAccountResponse.TotalCount"));

		List<Handshake> handshakes = new ArrayList<Handshake>();
		for (int i = 0; i < _ctx.lengthValue("ListHandshakesForAccountResponse.Handshakes.Length"); i++) {
			Handshake handshake = new Handshake();
			handshake.setHandshakeId(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].HandshakeId"));
			handshake.setResourceDirectoryId(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].ResourceDirectoryId"));
			handshake.setMasterAccountId(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].MasterAccountId"));
			handshake.setMasterAccountName(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].MasterAccountName"));
			handshake.setTargetEntity(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].TargetEntity"));
			handshake.setTargetType(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].TargetType"));
			handshake.setNote(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].Note"));
			handshake.setStatus(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].Status"));
			handshake.setCreateTime(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].CreateTime"));
			handshake.setModifyTime(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].ModifyTime"));
			handshake.setExpireTime(_ctx.stringValue("ListHandshakesForAccountResponse.Handshakes["+ i +"].ExpireTime"));

			handshakes.add(handshake);
		}
		listHandshakesForAccountResponse.setHandshakes(handshakes);
	 
	 	return listHandshakesForAccountResponse;
	}
}