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

import com.aliyuncs.resourcemanager.model.v20200331.ListHandshakesForResourceDirectoryResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListHandshakesForResourceDirectoryResponse.Handshake;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHandshakesForResourceDirectoryResponseUnmarshaller {

	public static ListHandshakesForResourceDirectoryResponse unmarshall(ListHandshakesForResourceDirectoryResponse listHandshakesForResourceDirectoryResponse, UnmarshallerContext _ctx) {
		
		listHandshakesForResourceDirectoryResponse.setRequestId(_ctx.stringValue("ListHandshakesForResourceDirectoryResponse.RequestId"));
		listHandshakesForResourceDirectoryResponse.setTotalCount(_ctx.integerValue("ListHandshakesForResourceDirectoryResponse.TotalCount"));
		listHandshakesForResourceDirectoryResponse.setPageSize(_ctx.integerValue("ListHandshakesForResourceDirectoryResponse.PageSize"));
		listHandshakesForResourceDirectoryResponse.setPageNumber(_ctx.integerValue("ListHandshakesForResourceDirectoryResponse.PageNumber"));

		List<Handshake> handshakes = new ArrayList<Handshake>();
		for (int i = 0; i < _ctx.lengthValue("ListHandshakesForResourceDirectoryResponse.Handshakes.Length"); i++) {
			Handshake handshake = new Handshake();
			handshake.setStatus(_ctx.stringValue("ListHandshakesForResourceDirectoryResponse.Handshakes["+ i +"].Status"));
			handshake.setExpireTime(_ctx.stringValue("ListHandshakesForResourceDirectoryResponse.Handshakes["+ i +"].ExpireTime"));
			handshake.setResourceDirectoryId(_ctx.stringValue("ListHandshakesForResourceDirectoryResponse.Handshakes["+ i +"].ResourceDirectoryId"));
			handshake.setCreateTime(_ctx.stringValue("ListHandshakesForResourceDirectoryResponse.Handshakes["+ i +"].CreateTime"));
			handshake.setNote(_ctx.stringValue("ListHandshakesForResourceDirectoryResponse.Handshakes["+ i +"].Note"));
			handshake.setTargetEntity(_ctx.stringValue("ListHandshakesForResourceDirectoryResponse.Handshakes["+ i +"].TargetEntity"));
			handshake.setMasterAccountId(_ctx.stringValue("ListHandshakesForResourceDirectoryResponse.Handshakes["+ i +"].MasterAccountId"));
			handshake.setMasterAccountName(_ctx.stringValue("ListHandshakesForResourceDirectoryResponse.Handshakes["+ i +"].MasterAccountName"));
			handshake.setModifyTime(_ctx.stringValue("ListHandshakesForResourceDirectoryResponse.Handshakes["+ i +"].ModifyTime"));
			handshake.setTargetType(_ctx.stringValue("ListHandshakesForResourceDirectoryResponse.Handshakes["+ i +"].TargetType"));
			handshake.setHandshakeId(_ctx.stringValue("ListHandshakesForResourceDirectoryResponse.Handshakes["+ i +"].HandshakeId"));

			handshakes.add(handshake);
		}
		listHandshakesForResourceDirectoryResponse.setHandshakes(handshakes);
	 
	 	return listHandshakesForResourceDirectoryResponse;
	}
}