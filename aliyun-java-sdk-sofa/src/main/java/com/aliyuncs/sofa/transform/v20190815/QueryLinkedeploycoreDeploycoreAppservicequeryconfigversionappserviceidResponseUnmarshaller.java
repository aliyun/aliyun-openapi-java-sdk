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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse unmarshall(QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse queryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.RequestId"));
		queryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.Message"));
		queryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppServiceId(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.Data["+ i +"].AppServiceId"));
			dataItem.setConfig(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.Data["+ i +"].Config"));
			dataItem.setConfigId(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.Data["+ i +"].ConfigId"));
			dataItem.setConfigStatus(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.Data["+ i +"].ConfigStatus"));
			dataItem.setConfigVersion(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.Data["+ i +"].ConfigVersion"));
			dataItem.setGmtCreate(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.Data["+ i +"].GmtCreate"));
			dataItem.setImageVersion(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.Data["+ i +"].ImageVersion"));
			dataItem.setOperator(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.Data["+ i +"].Operator"));

			data.add(dataItem);
		}
		queryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse;
	}
}