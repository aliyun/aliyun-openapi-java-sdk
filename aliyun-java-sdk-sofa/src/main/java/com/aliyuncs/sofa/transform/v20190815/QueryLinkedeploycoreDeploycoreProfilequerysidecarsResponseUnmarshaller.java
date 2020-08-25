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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse unmarshall(QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse queryLinkedeploycoreDeploycoreProfilequerysidecarsResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.RequestId"));
		queryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.Message"));
		queryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setType(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.Data["+ i +"].Type"));

			List<String> configs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.Data["+ i +"].Configs.Length"); j++) {
				configs.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.Data["+ i +"].Configs["+ j +"]"));
			}
			dataItem.setConfigs(configs);

			data.add(dataItem);
		}
		queryLinkedeploycoreDeploycoreProfilequerysidecarsResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreProfilequerysidecarsResponse;
	}
}