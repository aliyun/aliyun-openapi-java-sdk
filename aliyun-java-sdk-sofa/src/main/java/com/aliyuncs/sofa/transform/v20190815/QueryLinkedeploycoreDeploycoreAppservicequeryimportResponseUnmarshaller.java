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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreAppservicequeryimportResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse unmarshall(QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse queryLinkedeploycoreDeploycoreAppservicequeryimportResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreAppservicequeryimportResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse.RequestId"));
		queryLinkedeploycoreDeploycoreAppservicequeryimportResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreAppservicequeryimportResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreAppservicequeryimportResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse.Message"));
		queryLinkedeploycoreDeploycoreAppservicequeryimportResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreAppservicequeryimportResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse.Data.TotalCount"));

		List<String> metaList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse.Data.MetaList.Length"); i++) {
			metaList.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryimportResponse.Data.MetaList["+ i +"]"));
		}
		data.setMetaList(metaList);
		queryLinkedeploycoreDeploycoreAppservicequeryimportResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreAppservicequeryimportResponse;
	}
}