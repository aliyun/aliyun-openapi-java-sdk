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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.ListDcdnEsTemplateInfoResponse;
import com.aliyuncs.dcdn.model.v20180115.ListDcdnEsTemplateInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDcdnEsTemplateInfoResponseUnmarshaller {

	public static ListDcdnEsTemplateInfoResponse unmarshall(ListDcdnEsTemplateInfoResponse listDcdnEsTemplateInfoResponse, UnmarshallerContext _ctx) {
		
		listDcdnEsTemplateInfoResponse.setRequestId(_ctx.stringValue("ListDcdnEsTemplateInfoResponse.RequestId"));
		listDcdnEsTemplateInfoResponse.setTotalCount(_ctx.integerValue("ListDcdnEsTemplateInfoResponse.TotalCount"));
		listDcdnEsTemplateInfoResponse.setPageSize(_ctx.integerValue("ListDcdnEsTemplateInfoResponse.PageSize"));
		listDcdnEsTemplateInfoResponse.setPageNumber(_ctx.integerValue("ListDcdnEsTemplateInfoResponse.PageNumber"));

		List<DataItem> dataItems = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDcdnEsTemplateInfoResponse.DataItems.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.integerValue("ListDcdnEsTemplateInfoResponse.DataItems["+ i +"].Id"));
			dataItem.setTmplName(_ctx.stringValue("ListDcdnEsTemplateInfoResponse.DataItems["+ i +"].TmplName"));
			dataItem.setTmplDef(_ctx.stringValue("ListDcdnEsTemplateInfoResponse.DataItems["+ i +"].TmplDef"));
			dataItem.setTmplDesc(_ctx.stringValue("ListDcdnEsTemplateInfoResponse.DataItems["+ i +"].TmplDesc"));

			dataItems.add(dataItem);
		}
		listDcdnEsTemplateInfoResponse.setDataItems(dataItems);
	 
	 	return listDcdnEsTemplateInfoResponse;
	}
}