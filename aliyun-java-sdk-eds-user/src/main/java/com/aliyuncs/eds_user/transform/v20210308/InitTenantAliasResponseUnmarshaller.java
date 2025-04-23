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

package com.aliyuncs.eds_user.transform.v20210308;

import com.aliyuncs.eds_user.model.v20210308.InitTenantAliasResponse;
import com.aliyuncs.eds_user.model.v20210308.InitTenantAliasResponse.AliasInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitTenantAliasResponseUnmarshaller {

	public static InitTenantAliasResponse unmarshall(InitTenantAliasResponse initTenantAliasResponse, UnmarshallerContext _ctx) {
		
		initTenantAliasResponse.setRequestId(_ctx.stringValue("InitTenantAliasResponse.RequestId"));
		initTenantAliasResponse.setData(_ctx.stringValue("InitTenantAliasResponse.Data"));

		AliasInfo aliasInfo = new AliasInfo();
		aliasInfo.setAliasSourceType(_ctx.stringValue("InitTenantAliasResponse.AliasInfo.AliasSourceType"));
		aliasInfo.setAliasEditable(_ctx.booleanValue("InitTenantAliasResponse.AliasInfo.AliasEditable"));
		aliasInfo.setAliasEditDisabledReason(_ctx.stringValue("InitTenantAliasResponse.AliasInfo.AliasEditDisabledReason"));
		aliasInfo.setNextModifyTime(_ctx.stringValue("InitTenantAliasResponse.AliasInfo.NextModifyTime"));
		initTenantAliasResponse.setAliasInfo(aliasInfo);
	 
	 	return initTenantAliasResponse;
	}
}