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

package com.aliyuncs.linkface.transform.v20180720;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkface.model.v20180720.QueryLicensesResponse;
import com.aliyuncs.linkface.model.v20180720.QueryLicensesResponse.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLicensesResponseUnmarshaller {

	public static QueryLicensesResponse unmarshall(QueryLicensesResponse queryLicensesResponse, UnmarshallerContext context) {
		
		queryLicensesResponse.setRequestId(context.stringValue("QueryLicensesResponse.RequestId"));
		queryLicensesResponse.setCode(context.integerValue("QueryLicensesResponse.Code"));
		queryLicensesResponse.setMessage(context.stringValue("QueryLicensesResponse.Message"));
		queryLicensesResponse.setPageCount(context.integerValue("QueryLicensesResponse.PageCount"));
		queryLicensesResponse.setPageSize(context.integerValue("QueryLicensesResponse.PageSize"));
		queryLicensesResponse.setPage(context.integerValue("QueryLicensesResponse.Page"));
		queryLicensesResponse.setTotal(context.integerValue("QueryLicensesResponse.Total"));
		queryLicensesResponse.setSuccess(context.booleanValue("QueryLicensesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("QueryLicensesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setLicenseType(context.integerValue("QueryLicensesResponse.Data["+ i +"].LicenseType"));
			dataItem.setQuantity(context.integerValue("QueryLicensesResponse.Data["+ i +"].Quantity"));
			dataItem.setCostQuantity(context.integerValue("QueryLicensesResponse.Data["+ i +"].CostQuantity"));

			data.add(dataItem);
		}
		queryLicensesResponse.setData(data);
	 
	 	return queryLicensesResponse;
	}
}