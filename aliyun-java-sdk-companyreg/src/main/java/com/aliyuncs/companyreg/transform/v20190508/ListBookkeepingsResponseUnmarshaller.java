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

package com.aliyuncs.companyreg.transform.v20190508;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20190508.ListBookkeepingsResponse;
import com.aliyuncs.companyreg.model.v20190508.ListBookkeepingsResponse.Bookkeeping;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBookkeepingsResponseUnmarshaller {

	public static ListBookkeepingsResponse unmarshall(ListBookkeepingsResponse listBookkeepingsResponse, UnmarshallerContext _ctx) {
		
		listBookkeepingsResponse.setRequestId(_ctx.stringValue("ListBookkeepingsResponse.RequestId"));
		listBookkeepingsResponse.setTotalItemNumber(_ctx.integerValue("ListBookkeepingsResponse.TotalItemNumber"));
		listBookkeepingsResponse.setCurrentPageNumber(_ctx.integerValue("ListBookkeepingsResponse.CurrentPageNumber"));
		listBookkeepingsResponse.setPageSize(_ctx.integerValue("ListBookkeepingsResponse.PageSize"));
		listBookkeepingsResponse.setTotalPageNumber(_ctx.integerValue("ListBookkeepingsResponse.TotalPageNumber"));

		List<Bookkeeping> bookkeepings = new ArrayList<Bookkeeping>();
		for (int i = 0; i < _ctx.lengthValue("ListBookkeepingsResponse.Bookkeepings.Length"); i++) {
			Bookkeeping bookkeeping = new Bookkeeping();
			bookkeeping.setBizId(_ctx.stringValue("ListBookkeepingsResponse.Bookkeepings["+ i +"].BizId"));
			bookkeeping.setCompanyName(_ctx.stringValue("ListBookkeepingsResponse.Bookkeepings["+ i +"].CompanyName"));
			bookkeeping.setOrderId(_ctx.stringValue("ListBookkeepingsResponse.Bookkeepings["+ i +"].OrderId"));
			bookkeeping.setStatus(_ctx.integerValue("ListBookkeepingsResponse.Bookkeepings["+ i +"].Status"));
			bookkeeping.setRenew(_ctx.booleanValue("ListBookkeepingsResponse.Bookkeepings["+ i +"].Renew"));
			bookkeeping.setNote(_ctx.stringValue("ListBookkeepingsResponse.Bookkeepings["+ i +"].Note"));
			bookkeeping.setCommodityType(_ctx.stringValue("ListBookkeepingsResponse.Bookkeepings["+ i +"].CommodityType"));

			bookkeepings.add(bookkeeping);
		}
		listBookkeepingsResponse.setBookkeepings(bookkeepings);
	 
	 	return listBookkeepingsResponse;
	}
}