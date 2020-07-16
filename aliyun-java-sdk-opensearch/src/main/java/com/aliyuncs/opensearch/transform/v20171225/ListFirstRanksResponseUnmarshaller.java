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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListFirstRanksResponse;
import com.aliyuncs.opensearch.model.v20171225.ListFirstRanksResponse.FirstRankItem;
import com.aliyuncs.opensearch.model.v20171225.ListFirstRanksResponse.FirstRankItem.MetaItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFirstRanksResponseUnmarshaller {

	public static ListFirstRanksResponse unmarshall(ListFirstRanksResponse listFirstRanksResponse, UnmarshallerContext _ctx) {
		
		listFirstRanksResponse.setRequestId(_ctx.stringValue("ListFirstRanksResponse.requestId"));

		List<FirstRankItem> result = new ArrayList<FirstRankItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFirstRanksResponse.result.Length"); i++) {
			FirstRankItem firstRankItem = new FirstRankItem();
			firstRankItem.setName(_ctx.stringValue("ListFirstRanksResponse.result["+ i +"].name"));
			firstRankItem.setDescription(_ctx.stringValue("ListFirstRanksResponse.result["+ i +"].description"));
			firstRankItem.setActive(_ctx.booleanValue("ListFirstRanksResponse.result["+ i +"].active"));
			firstRankItem.setCreated(_ctx.integerValue("ListFirstRanksResponse.result["+ i +"].created"));
			firstRankItem.setUpdated(_ctx.integerValue("ListFirstRanksResponse.result["+ i +"].updated"));

			List<MetaItem> meta = new ArrayList<MetaItem>();
			for (int j = 0; j < _ctx.lengthValue("ListFirstRanksResponse.result["+ i +"].meta.Length"); j++) {
				MetaItem metaItem = new MetaItem();
				metaItem.setAttribute(_ctx.stringValue("ListFirstRanksResponse.result["+ i +"].meta["+ j +"].attribute"));
				metaItem.setArg(_ctx.stringValue("ListFirstRanksResponse.result["+ i +"].meta["+ j +"].arg"));
				metaItem.setWeight(_ctx.integerValue("ListFirstRanksResponse.result["+ i +"].meta["+ j +"].weight"));

				meta.add(metaItem);
			}
			firstRankItem.setMeta(meta);

			result.add(firstRankItem);
		}
		listFirstRanksResponse.setResult(result);
	 
	 	return listFirstRanksResponse;
	}
}