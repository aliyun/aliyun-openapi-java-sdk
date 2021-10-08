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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.BatchSetScdnDomainConfigsResponse;
import com.aliyuncs.scdn.model.v20171115.BatchSetScdnDomainConfigsResponse.DomainConfigModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchSetScdnDomainConfigsResponseUnmarshaller {

	public static BatchSetScdnDomainConfigsResponse unmarshall(BatchSetScdnDomainConfigsResponse batchSetScdnDomainConfigsResponse, UnmarshallerContext _ctx) {
		
		batchSetScdnDomainConfigsResponse.setRequestId(_ctx.stringValue("BatchSetScdnDomainConfigsResponse.RequestId"));

		List<DomainConfigModel> domainConfigList = new ArrayList<DomainConfigModel>();
		for (int i = 0; i < _ctx.lengthValue("BatchSetScdnDomainConfigsResponse.DomainConfigList.Length"); i++) {
			DomainConfigModel domainConfigModel = new DomainConfigModel();
			domainConfigModel.setDomainName(_ctx.stringValue("BatchSetScdnDomainConfigsResponse.DomainConfigList["+ i +"].DomainName"));
			domainConfigModel.setConfigId(_ctx.longValue("BatchSetScdnDomainConfigsResponse.DomainConfigList["+ i +"].ConfigId"));
			domainConfigModel.setFunctionName(_ctx.stringValue("BatchSetScdnDomainConfigsResponse.DomainConfigList["+ i +"].FunctionName"));

			domainConfigList.add(domainConfigModel);
		}
		batchSetScdnDomainConfigsResponse.setDomainConfigList(domainConfigList);
	 
	 	return batchSetScdnDomainConfigsResponse;
	}
}