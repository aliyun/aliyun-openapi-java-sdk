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
package com.aliyuncs.sas_api.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas_api.model.v20170705.UpgradeInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeInstanceResponseUnmarshaller {

	public static UpgradeInstanceResponse unmarshall(UpgradeInstanceResponse upgradeInstanceResponse, UnmarshallerContext context) {
		
		upgradeInstanceResponse.setRequestId(context.stringValue("UpgradeInstanceResponse.RequestId"));
		upgradeInstanceResponse.setCode(context.stringValue("UpgradeInstanceResponse.Code"));
		upgradeInstanceResponse.setMessage(context.stringValue("UpgradeInstanceResponse.Message"));
		upgradeInstanceResponse.setOrderId(context.stringValue("UpgradeInstanceResponse.OrderId"));
		upgradeInstanceResponse.setInstanceId(context.stringValue("UpgradeInstanceResponse.InstanceId"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("UpgradeInstanceResponse.InstanceIds.Length"); i++) {
			instanceIds.add(context.stringValue("UpgradeInstanceResponse.InstanceIds["+ i +"]"));
		}
		upgradeInstanceResponse.setInstanceIds(instanceIds);
	 
	 	return upgradeInstanceResponse;
	}
}