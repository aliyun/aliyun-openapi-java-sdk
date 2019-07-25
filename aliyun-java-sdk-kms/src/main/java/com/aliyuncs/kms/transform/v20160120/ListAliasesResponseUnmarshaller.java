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

package com.aliyuncs.kms.transform.v20160120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.ListAliasesResponse;
import com.aliyuncs.kms.model.v20160120.ListAliasesResponse.Alias;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAliasesResponseUnmarshaller {

	public static ListAliasesResponse unmarshall(ListAliasesResponse listAliasesResponse, UnmarshallerContext _ctx) {
		
		listAliasesResponse.setRequestId(_ctx.stringValue("ListAliasesResponse.RequestId"));
		listAliasesResponse.setTotalCount(_ctx.integerValue("ListAliasesResponse.TotalCount"));
		listAliasesResponse.setPageNumber(_ctx.integerValue("ListAliasesResponse.PageNumber"));
		listAliasesResponse.setPageSize(_ctx.integerValue("ListAliasesResponse.PageSize"));

		List<Alias> aliases = new ArrayList<Alias>();
		for (int i = 0; i < _ctx.lengthValue("ListAliasesResponse.Aliases.Length"); i++) {
			Alias alias = new Alias();
			alias.setKeyId(_ctx.stringValue("ListAliasesResponse.Aliases["+ i +"].KeyId"));
			alias.setAliasName(_ctx.stringValue("ListAliasesResponse.Aliases["+ i +"].AliasName"));
			alias.setAliasArn(_ctx.stringValue("ListAliasesResponse.Aliases["+ i +"].AliasArn"));

			aliases.add(alias);
		}
		listAliasesResponse.setAliases(aliases);
	 
	 	return listAliasesResponse;
	}
}