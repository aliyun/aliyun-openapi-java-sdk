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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListExpressCompanyResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListExpressCompanyResponse.ExpressCompanyBiz;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExpressCompanyResponseUnmarshaller {

	public static ListExpressCompanyResponse unmarshall(ListExpressCompanyResponse listExpressCompanyResponse, UnmarshallerContext _ctx) {
		
		listExpressCompanyResponse.setRequestId(_ctx.stringValue("ListExpressCompanyResponse.RequestId"));
		listExpressCompanyResponse.setPageSize(_ctx.integerValue("ListExpressCompanyResponse.PageSize"));
		listExpressCompanyResponse.setTotalCount(_ctx.integerValue("ListExpressCompanyResponse.TotalCount"));
		listExpressCompanyResponse.setPageNumber(_ctx.integerValue("ListExpressCompanyResponse.PageNumber"));
		listExpressCompanyResponse.setSuccess(_ctx.booleanValue("ListExpressCompanyResponse.Success"));

		List<ExpressCompanyBiz> expressCompanies = new ArrayList<ExpressCompanyBiz>();
		for (int i = 0; i < _ctx.lengthValue("ListExpressCompanyResponse.ExpressCompanies.Length"); i++) {
			ExpressCompanyBiz expressCompanyBiz = new ExpressCompanyBiz();
			expressCompanyBiz.setDisable(_ctx.integerValue("ListExpressCompanyResponse.ExpressCompanies["+ i +"].Disable"));
			expressCompanyBiz.setUpdateDate(_ctx.stringValue("ListExpressCompanyResponse.ExpressCompanies["+ i +"].UpdateDate"));
			expressCompanyBiz.setCreateDate(_ctx.stringValue("ListExpressCompanyResponse.ExpressCompanies["+ i +"].CreateDate"));
			expressCompanyBiz.setExpressCompanyId(_ctx.stringValue("ListExpressCompanyResponse.ExpressCompanies["+ i +"].ExpressCompanyId"));
			expressCompanyBiz.setExpressCompanyName(_ctx.stringValue("ListExpressCompanyResponse.ExpressCompanies["+ i +"].ExpressCompanyName"));
			expressCompanyBiz.setExpressCompanyCode(_ctx.stringValue("ListExpressCompanyResponse.ExpressCompanies["+ i +"].ExpressCompanyCode"));
			expressCompanyBiz.setDescription(_ctx.stringValue("ListExpressCompanyResponse.ExpressCompanies["+ i +"].Description"));

			expressCompanies.add(expressCompanyBiz);
		}
		listExpressCompanyResponse.setExpressCompanies(expressCompanies);
	 
	 	return listExpressCompanyResponse;
	}
}