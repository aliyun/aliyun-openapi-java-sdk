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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.ListAllProdsResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListAllProdsResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.ListAllProdsResponse.Data.ProdListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllProdsResponseUnmarshaller {

	public static ListAllProdsResponse unmarshall(ListAllProdsResponse listAllProdsResponse, UnmarshallerContext _ctx) {
		
		listAllProdsResponse.setRequestId(_ctx.stringValue("ListAllProdsResponse.RequestId"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListAllProdsResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("ListAllProdsResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("ListAllProdsResponse.Data.CurrentPage"));

		List<ProdListItem> prodList = new ArrayList<ProdListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAllProdsResponse.Data.ProdList.Length"); i++) {
			ProdListItem prodListItem = new ProdListItem();
			prodListItem.setProdCode(_ctx.stringValue("ListAllProdsResponse.Data.ProdList["+ i +"].ProdCode"));
			prodListItem.setTotalLogCount(_ctx.integerValue("ListAllProdsResponse.Data.ProdList["+ i +"].TotalLogCount"));
			prodListItem.setImportedLogCount(_ctx.integerValue("ListAllProdsResponse.Data.ProdList["+ i +"].ImportedLogCount"));
			prodListItem.setModifyTime(_ctx.stringValue("ListAllProdsResponse.Data.ProdList["+ i +"].ModifyTime"));
			prodListItem.setCloudCode(_ctx.stringValue("ListAllProdsResponse.Data.ProdList["+ i +"].CloudCode"));

			prodList.add(prodListItem);
		}
		data.setProdList(prodList);
		listAllProdsResponse.setData(data);
	 
	 	return listAllProdsResponse;
	}
}