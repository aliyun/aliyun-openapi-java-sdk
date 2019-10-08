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

import com.aliyuncs.kms.model.v20160120.ListAliasesByKeyIdResponse;
import com.aliyuncs.kms.model.v20160120.ListAliasesByKeyIdResponse.Alias;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAliasesByKeyIdResponseUnmarshaller {

	public static ListAliasesByKeyIdResponse unmarshall(ListAliasesByKeyIdResponse listAliasesByKeyIdResponse, UnmarshallerContext _ctx) {
		
		listAliasesByKeyIdResponse.setRequestId(_ctx.stringValue("ListAliasesByKeyIdResponse.RequestId"));
		listAliasesByKeyIdResponse.setTotalCount(_ctx.integerValue("ListAliasesByKeyIdResponse.TotalCount"));
		listAliasesByKeyIdResponse.setPageNumber(_ctx.integerValue("ListAliasesByKeyIdResponse.PageNumber"));
		listAliasesByKeyIdResponse.setPageSize(_ctx.integerValue("ListAliasesByKeyIdResponse.PageSize"));

		List<Alias> aliases = new ArrayList<Alias>();
		for (int i = 0; i < _ctx.lengthValue("ListAliasesByKeyIdResponse.Aliases.Length"); i++) {
			Alias alias = new Alias();
			alias.setKeyId(_ctx.stringValue("ListAliasesByKeyIdResponse.Aliases["+ i +"].KeyId"));
			alias.setAliasName(_ctx.stringValue("ListAliasesByKeyIdResponse.Aliases["+ i +"].AliasName"));
			alias.setAliasArn(_ctx.stringValue("ListAliasesByKeyIdResponse.Aliases["+ i +"].AliasArn"));

			aliases.add(alias);
		}
		listAliasesByKeyIdResponse.setAliases(aliases);
	 
	 	return listAliasesByKeyIdResponse;
	}
}