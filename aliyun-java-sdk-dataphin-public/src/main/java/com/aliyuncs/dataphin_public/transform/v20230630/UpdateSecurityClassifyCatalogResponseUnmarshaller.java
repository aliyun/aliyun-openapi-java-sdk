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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.UpdateSecurityClassifyCatalogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSecurityClassifyCatalogResponseUnmarshaller {

	public static UpdateSecurityClassifyCatalogResponse unmarshall(UpdateSecurityClassifyCatalogResponse updateSecurityClassifyCatalogResponse, UnmarshallerContext _ctx) {
		
		updateSecurityClassifyCatalogResponse.setRequestId(_ctx.stringValue("UpdateSecurityClassifyCatalogResponse.RequestId"));
		updateSecurityClassifyCatalogResponse.setSuccess(_ctx.booleanValue("UpdateSecurityClassifyCatalogResponse.Success"));
		updateSecurityClassifyCatalogResponse.setHttpStatusCode(_ctx.integerValue("UpdateSecurityClassifyCatalogResponse.HttpStatusCode"));
		updateSecurityClassifyCatalogResponse.setCode(_ctx.stringValue("UpdateSecurityClassifyCatalogResponse.Code"));
		updateSecurityClassifyCatalogResponse.setMessage(_ctx.stringValue("UpdateSecurityClassifyCatalogResponse.Message"));
		updateSecurityClassifyCatalogResponse.setData(_ctx.stringValue("UpdateSecurityClassifyCatalogResponse.Data"));
	 
	 	return updateSecurityClassifyCatalogResponse;
	}
}