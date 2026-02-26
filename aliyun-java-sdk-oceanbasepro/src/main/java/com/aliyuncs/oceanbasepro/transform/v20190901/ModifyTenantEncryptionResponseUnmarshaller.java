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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import com.aliyuncs.oceanbasepro.model.v20190901.ModifyTenantEncryptionResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.ModifyTenantEncryptionResponse.TenantEncryption;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyTenantEncryptionResponseUnmarshaller {

	public static ModifyTenantEncryptionResponse unmarshall(ModifyTenantEncryptionResponse modifyTenantEncryptionResponse, UnmarshallerContext _ctx) {
		
		modifyTenantEncryptionResponse.setRequestId(_ctx.stringValue("ModifyTenantEncryptionResponse.RequestId"));

		TenantEncryption tenantEncryption = new TenantEncryption();
		tenantEncryption.setInstanceId(_ctx.stringValue("ModifyTenantEncryptionResponse.TenantEncryption.InstanceId"));
		tenantEncryption.setTenantId(_ctx.stringValue("ModifyTenantEncryptionResponse.TenantEncryption.TenantId"));
		tenantEncryption.setEncryptionType(_ctx.stringValue("ModifyTenantEncryptionResponse.TenantEncryption.EncryptionType"));
		modifyTenantEncryptionResponse.setTenantEncryption(tenantEncryption);
	 
	 	return modifyTenantEncryptionResponse;
	}
}