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

import com.aliyuncs.sofa.model.v20190815.MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse;
import com.aliyuncs.sofa.model.v20190815.MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseUnmarshaller {

	public static MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse unmarshall(MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse mountLinkedeploycoreDeploycoreAppservicebatchapplyResponse, UnmarshallerContext _ctx) {
		
		mountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.setRequestId(_ctx.stringValue("MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.RequestId"));
		mountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.setResultCode(_ctx.stringValue("MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.ResultCode"));
		mountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.setResultMessage(_ctx.stringValue("MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.ResultMessage"));
		mountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.setMessage(_ctx.stringValue("MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.Message"));
		mountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.setResponseStatusCode(_ctx.longValue("MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.ResponseStatusCode"));
		mountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.setSuccess(_ctx.booleanValue("MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setActionId(_ctx.longValue("MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.Data["+ i +"].ActionId"));
			dataItem.setAppServiceId(_ctx.longValue("MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.Data["+ i +"].AppServiceId"));
			dataItem.setConfigId(_ctx.longValue("MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.Data["+ i +"].ConfigId"));
			dataItem.setOrderId(_ctx.longValue("MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.Data["+ i +"].OrderId"));
			dataItem.setOrderUrl(_ctx.stringValue("MountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.Data["+ i +"].OrderUrl"));

			data.add(dataItem);
		}
		mountLinkedeploycoreDeploycoreAppservicebatchapplyResponse.setData(data);
	 
	 	return mountLinkedeploycoreDeploycoreAppservicebatchapplyResponse;
	}
}