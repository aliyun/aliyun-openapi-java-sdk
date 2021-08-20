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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.ModifyOrderDeliveryAddressResponse;
import com.aliyuncs.linkedmall.model.v20180116.ModifyOrderDeliveryAddressResponse.Model;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyOrderDeliveryAddressResponseUnmarshaller {

	public static ModifyOrderDeliveryAddressResponse unmarshall(ModifyOrderDeliveryAddressResponse modifyOrderDeliveryAddressResponse, UnmarshallerContext _ctx) {
		
		modifyOrderDeliveryAddressResponse.setRequestId(_ctx.stringValue("ModifyOrderDeliveryAddressResponse.RequestId"));
		modifyOrderDeliveryAddressResponse.setCode(_ctx.stringValue("ModifyOrderDeliveryAddressResponse.Code"));
		modifyOrderDeliveryAddressResponse.setMessage(_ctx.stringValue("ModifyOrderDeliveryAddressResponse.Message"));
		modifyOrderDeliveryAddressResponse.setSubCode(_ctx.stringValue("ModifyOrderDeliveryAddressResponse.SubCode"));
		modifyOrderDeliveryAddressResponse.setSubMessage(_ctx.stringValue("ModifyOrderDeliveryAddressResponse.SubMessage"));
		modifyOrderDeliveryAddressResponse.setLogsId(_ctx.stringValue("ModifyOrderDeliveryAddressResponse.LogsId"));
		modifyOrderDeliveryAddressResponse.setSuccess(_ctx.booleanValue("ModifyOrderDeliveryAddressResponse.Success"));
		modifyOrderDeliveryAddressResponse.setTotalCount(_ctx.longValue("ModifyOrderDeliveryAddressResponse.TotalCount"));

		Model model = new Model();
		model.setResultInfo(_ctx.mapValue("ModifyOrderDeliveryAddressResponse.Model.ResultInfo"));
		modifyOrderDeliveryAddressResponse.setModel(model);
	 
	 	return modifyOrderDeliveryAddressResponse;
	}
}