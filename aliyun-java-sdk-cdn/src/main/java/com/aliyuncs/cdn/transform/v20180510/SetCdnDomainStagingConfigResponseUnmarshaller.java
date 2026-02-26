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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.SetCdnDomainStagingConfigResponse;
import com.aliyuncs.cdn.model.v20180510.SetCdnDomainStagingConfigResponse.DomainConfigModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetCdnDomainStagingConfigResponseUnmarshaller {

	public static SetCdnDomainStagingConfigResponse unmarshall(SetCdnDomainStagingConfigResponse setCdnDomainStagingConfigResponse, UnmarshallerContext _ctx) {
		
		setCdnDomainStagingConfigResponse.setRequestId(_ctx.stringValue("SetCdnDomainStagingConfigResponse.RequestId"));

		List<DomainConfigModel> domainConfigList = new ArrayList<DomainConfigModel>();
		for (int i = 0; i < _ctx.lengthValue("SetCdnDomainStagingConfigResponse.DomainConfigList.Length"); i++) {
			DomainConfigModel domainConfigModel = new DomainConfigModel();
			domainConfigModel.setConfigId(_ctx.longValue("SetCdnDomainStagingConfigResponse.DomainConfigList["+ i +"].ConfigId"));
			domainConfigModel.setDomainName(_ctx.stringValue("SetCdnDomainStagingConfigResponse.DomainConfigList["+ i +"].DomainName"));
			domainConfigModel.setFunctionName(_ctx.stringValue("SetCdnDomainStagingConfigResponse.DomainConfigList["+ i +"].FunctionName"));

			domainConfigList.add(domainConfigModel);
		}
		setCdnDomainStagingConfigResponse.setDomainConfigList(domainConfigList);
	 
	 	return setCdnDomainStagingConfigResponse;
	}
}