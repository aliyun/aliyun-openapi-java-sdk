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

import com.aliyuncs.sofa.model.v20190815.MountLinkedeploycoreDeploycoreAppserviceapplyResponse;
import com.aliyuncs.sofa.model.v20190815.MountLinkedeploycoreDeploycoreAppserviceapplyResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class MountLinkedeploycoreDeploycoreAppserviceapplyResponseUnmarshaller {

	public static MountLinkedeploycoreDeploycoreAppserviceapplyResponse unmarshall(MountLinkedeploycoreDeploycoreAppserviceapplyResponse mountLinkedeploycoreDeploycoreAppserviceapplyResponse, UnmarshallerContext _ctx) {
		
		mountLinkedeploycoreDeploycoreAppserviceapplyResponse.setRequestId(_ctx.stringValue("MountLinkedeploycoreDeploycoreAppserviceapplyResponse.RequestId"));
		mountLinkedeploycoreDeploycoreAppserviceapplyResponse.setResultCode(_ctx.stringValue("MountLinkedeploycoreDeploycoreAppserviceapplyResponse.ResultCode"));
		mountLinkedeploycoreDeploycoreAppserviceapplyResponse.setResultMessage(_ctx.stringValue("MountLinkedeploycoreDeploycoreAppserviceapplyResponse.ResultMessage"));
		mountLinkedeploycoreDeploycoreAppserviceapplyResponse.setMessage(_ctx.stringValue("MountLinkedeploycoreDeploycoreAppserviceapplyResponse.Message"));
		mountLinkedeploycoreDeploycoreAppserviceapplyResponse.setResponseStatusCode(_ctx.longValue("MountLinkedeploycoreDeploycoreAppserviceapplyResponse.ResponseStatusCode"));
		mountLinkedeploycoreDeploycoreAppserviceapplyResponse.setSuccess(_ctx.booleanValue("MountLinkedeploycoreDeploycoreAppserviceapplyResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("MountLinkedeploycoreDeploycoreAppserviceapplyResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setActionId(_ctx.longValue("MountLinkedeploycoreDeploycoreAppserviceapplyResponse.Data["+ i +"].ActionId"));
			dataItem.setAppServiceId(_ctx.longValue("MountLinkedeploycoreDeploycoreAppserviceapplyResponse.Data["+ i +"].AppServiceId"));
			dataItem.setConfigId(_ctx.longValue("MountLinkedeploycoreDeploycoreAppserviceapplyResponse.Data["+ i +"].ConfigId"));
			dataItem.setOrderId(_ctx.longValue("MountLinkedeploycoreDeploycoreAppserviceapplyResponse.Data["+ i +"].OrderId"));
			dataItem.setOrderUrl(_ctx.stringValue("MountLinkedeploycoreDeploycoreAppserviceapplyResponse.Data["+ i +"].OrderUrl"));

			data.add(dataItem);
		}
		mountLinkedeploycoreDeploycoreAppserviceapplyResponse.setData(data);
	 
	 	return mountLinkedeploycoreDeploycoreAppserviceapplyResponse;
	}
}