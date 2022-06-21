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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.GetVerifiableInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVerifiableInstanceResponseUnmarshaller {

	public static GetVerifiableInstanceResponse unmarshall(GetVerifiableInstanceResponse getVerifiableInstanceResponse, UnmarshallerContext _ctx) {
		
		getVerifiableInstanceResponse.setRequestId(_ctx.stringValue("GetVerifiableInstanceResponse.RequestId"));
		getVerifiableInstanceResponse.setInstanceName(_ctx.stringValue("GetVerifiableInstanceResponse.InstanceName"));
		getVerifiableInstanceResponse.setIsSuccess(_ctx.booleanValue("GetVerifiableInstanceResponse.IsSuccess"));
		getVerifiableInstanceResponse.setInternetIp(_ctx.stringValue("GetVerifiableInstanceResponse.InternetIp"));
		getVerifiableInstanceResponse.setExpireDate(_ctx.stringValue("GetVerifiableInstanceResponse.ExpireDate"));
		getVerifiableInstanceResponse.setInstanceId(_ctx.stringValue("GetVerifiableInstanceResponse.InstanceId"));
		getVerifiableInstanceResponse.setICP(_ctx.booleanValue("GetVerifiableInstanceResponse.ICP"));
		getVerifiableInstanceResponse.setCreateTime(_ctx.longValue("GetVerifiableInstanceResponse.CreateTime"));
		getVerifiableInstanceResponse.setExpireTime(_ctx.longValue("GetVerifiableInstanceResponse.ExpireTime"));
		getVerifiableInstanceResponse.setCode(_ctx.stringValue("GetVerifiableInstanceResponse.Code"));
		getVerifiableInstanceResponse.setCreateDate(_ctx.stringValue("GetVerifiableInstanceResponse.CreateDate"));
	 
	 	return getVerifiableInstanceResponse;
	}
}