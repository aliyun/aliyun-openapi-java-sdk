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

import com.aliyuncs.sofa.model.v20190815.DescribeDSTSlsConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDSTSlsConfigResponseUnmarshaller {

	public static DescribeDSTSlsConfigResponse unmarshall(DescribeDSTSlsConfigResponse describeDSTSlsConfigResponse, UnmarshallerContext _ctx) {
		
		describeDSTSlsConfigResponse.setRequestId(_ctx.stringValue("DescribeDSTSlsConfigResponse.RequestId"));
		describeDSTSlsConfigResponse.setResultCode(_ctx.stringValue("DescribeDSTSlsConfigResponse.ResultCode"));
		describeDSTSlsConfigResponse.setResultMessage(_ctx.stringValue("DescribeDSTSlsConfigResponse.ResultMessage"));
		describeDSTSlsConfigResponse.setAccessKey(_ctx.stringValue("DescribeDSTSlsConfigResponse.AccessKey"));
		describeDSTSlsConfigResponse.setAccessKeyId(_ctx.stringValue("DescribeDSTSlsConfigResponse.AccessKeyId"));
		describeDSTSlsConfigResponse.setCreateTime(_ctx.stringValue("DescribeDSTSlsConfigResponse.CreateTime"));
		describeDSTSlsConfigResponse.setOpenStatus(_ctx.stringValue("DescribeDSTSlsConfigResponse.OpenStatus"));
		describeDSTSlsConfigResponse.setSupportBizLog(_ctx.booleanValue("DescribeDSTSlsConfigResponse.SupportBizLog"));
		describeDSTSlsConfigResponse.setTenantId(_ctx.stringValue("DescribeDSTSlsConfigResponse.TenantId"));
		describeDSTSlsConfigResponse.setTokenRedirectUrl(_ctx.stringValue("DescribeDSTSlsConfigResponse.TokenRedirectUrl"));
		describeDSTSlsConfigResponse.setTokenValid(_ctx.booleanValue("DescribeDSTSlsConfigResponse.TokenValid"));
		describeDSTSlsConfigResponse.setType(_ctx.stringValue("DescribeDSTSlsConfigResponse.Type"));
		describeDSTSlsConfigResponse.setUpdateTime(_ctx.stringValue("DescribeDSTSlsConfigResponse.UpdateTime"));
		describeDSTSlsConfigResponse.setValid(_ctx.booleanValue("DescribeDSTSlsConfigResponse.Valid"));
		describeDSTSlsConfigResponse.setSlsMachineGroup(_ctx.stringValue("DescribeDSTSlsConfigResponse.SlsMachineGroup"));
	 
	 	return describeDSTSlsConfigResponse;
	}
}