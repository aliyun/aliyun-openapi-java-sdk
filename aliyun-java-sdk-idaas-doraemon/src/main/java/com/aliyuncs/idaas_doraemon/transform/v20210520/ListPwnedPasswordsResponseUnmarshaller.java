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

package com.aliyuncs.idaas_doraemon.transform.v20210520;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idaas_doraemon.model.v20210520.ListPwnedPasswordsResponse;
import com.aliyuncs.idaas_doraemon.model.v20210520.ListPwnedPasswordsResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPwnedPasswordsResponseUnmarshaller {

	public static ListPwnedPasswordsResponse unmarshall(ListPwnedPasswordsResponse listPwnedPasswordsResponse, UnmarshallerContext _ctx) {
		
		listPwnedPasswordsResponse.setRequestId(_ctx.stringValue("ListPwnedPasswordsResponse.RequestId"));
		listPwnedPasswordsResponse.setPageNumber(_ctx.longValue("ListPwnedPasswordsResponse.PageNumber"));
		listPwnedPasswordsResponse.setTotalCount(_ctx.longValue("ListPwnedPasswordsResponse.TotalCount"));
		listPwnedPasswordsResponse.setPageSize(_ctx.longValue("ListPwnedPasswordsResponse.PageSize"));

		List<Items> pwnedPasswordInfos = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("ListPwnedPasswordsResponse.PwnedPasswordInfos.Length"); i++) {
			Items items = new Items();
			items.setHexPasswordSha1Hash(_ctx.stringValue("ListPwnedPasswordsResponse.PwnedPasswordInfos["+ i +"].HexPasswordSha1Hash"));
			items.setPwnedCount(_ctx.longValue("ListPwnedPasswordsResponse.PwnedPasswordInfos["+ i +"].PwnedCount"));

			pwnedPasswordInfos.add(items);
		}
		listPwnedPasswordsResponse.setPwnedPasswordInfos(pwnedPasswordInfos);
	 
	 	return listPwnedPasswordsResponse;
	}
}