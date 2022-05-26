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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.LoadRealNameInfoByPkResponse;
import com.aliyuncs.account_crm.model.v20160606.LoadRealNameInfoByPkResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class LoadRealNameInfoByPkResponseUnmarshaller {

	public static LoadRealNameInfoByPkResponse unmarshall(LoadRealNameInfoByPkResponse loadRealNameInfoByPkResponse, UnmarshallerContext _ctx) {
		
		loadRealNameInfoByPkResponse.setRequestId(_ctx.stringValue("LoadRealNameInfoByPkResponse.RequestId"));
		loadRealNameInfoByPkResponse.setCode(_ctx.stringValue("LoadRealNameInfoByPkResponse.Code"));
		loadRealNameInfoByPkResponse.setMsg(_ctx.stringValue("LoadRealNameInfoByPkResponse.Msg"));

		Data data = new Data();
		data.setNewUnityRealNameAccount(_ctx.stringValue("LoadRealNameInfoByPkResponse.Data.NewUnityRealNameAccount"));
		data.setCicCertifyProduct(_ctx.longValue("LoadRealNameInfoByPkResponse.Data.CicCertifyProduct"));
		data.setAuthAlipayDomain(_ctx.stringValue("LoadRealNameInfoByPkResponse.Data.AuthAlipayDomain"));
		data.setProcessingEnterpriseCertify(_ctx.booleanValue("LoadRealNameInfoByPkResponse.Data.ProcessingEnterpriseCertify"));
		data.setAuthAlipayLoginId(_ctx.stringValue("LoadRealNameInfoByPkResponse.Data.AuthAlipayLoginId"));
		data.setIsBankIDAuth(_ctx.booleanValue("LoadRealNameInfoByPkResponse.Data.IsBankIDAuth"));
		data.setAuthBeiAnCid(_ctx.stringValue("LoadRealNameInfoByPkResponse.Data.AuthBeiAnCid"));
		data.setCicCertifyFrom(_ctx.integerValue("LoadRealNameInfoByPkResponse.Data.CicCertifyFrom"));
		data.setAuthDomain(_ctx.stringValue("LoadRealNameInfoByPkResponse.Data.AuthDomain"));
		data.setCertifiedTime(_ctx.stringValue("LoadRealNameInfoByPkResponse.Data.CertifiedTime"));
		data.setCertifyStatus(_ctx.integerValue("LoadRealNameInfoByPkResponse.Data.CertifyStatus"));
		data.setAuthAlipay(_ctx.stringValue("LoadRealNameInfoByPkResponse.Data.AuthAlipay"));
		data.setCertifiedFrom(_ctx.stringValue("LoadRealNameInfoByPkResponse.Data.CertifiedFrom"));
		data.setAccountCertifyType(_ctx.stringValue("LoadRealNameInfoByPkResponse.Data.AccountCertifyType"));
		data.setLicenseNumber(_ctx.stringValue("LoadRealNameInfoByPkResponse.Data.LicenseNumber"));
		data.setLicenseType(_ctx.stringValue("LoadRealNameInfoByPkResponse.Data.LicenseType"));
		data.setName(_ctx.stringValue("LoadRealNameInfoByPkResponse.Data.Name"));
		data.setIsCertified(_ctx.booleanValue("LoadRealNameInfoByPkResponse.Data.IsCertified"));
		loadRealNameInfoByPkResponse.setData(data);
	 
	 	return loadRealNameInfoByPkResponse;
	}
}