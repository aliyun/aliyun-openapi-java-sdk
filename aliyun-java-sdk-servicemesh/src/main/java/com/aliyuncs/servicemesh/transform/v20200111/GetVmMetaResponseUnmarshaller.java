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

package com.aliyuncs.servicemesh.transform.v20200111;

import com.aliyuncs.servicemesh.model.v20200111.GetVmMetaResponse;
import com.aliyuncs.servicemesh.model.v20200111.GetVmMetaResponse.VmMetaInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVmMetaResponseUnmarshaller {

	public static GetVmMetaResponse unmarshall(GetVmMetaResponse getVmMetaResponse, UnmarshallerContext _ctx) {
		
		getVmMetaResponse.setRequestId(_ctx.stringValue("GetVmMetaResponse.RequestId"));

		VmMetaInfo vmMetaInfo = new VmMetaInfo();
		vmMetaInfo.setRootCertPath(_ctx.stringValue("GetVmMetaResponse.VmMetaInfo.RootCertPath"));
		vmMetaInfo.setRootCertContent(_ctx.stringValue("GetVmMetaResponse.VmMetaInfo.RootCertContent"));
		vmMetaInfo.setKeyPath(_ctx.stringValue("GetVmMetaResponse.VmMetaInfo.KeyPath"));
		vmMetaInfo.setKeyContent(_ctx.stringValue("GetVmMetaResponse.VmMetaInfo.KeyContent"));
		vmMetaInfo.setCertChainPath(_ctx.stringValue("GetVmMetaResponse.VmMetaInfo.CertChainPath"));
		vmMetaInfo.setCertChainContent(_ctx.stringValue("GetVmMetaResponse.VmMetaInfo.CertChainContent"));
		vmMetaInfo.setEnvoyEnvPath(_ctx.stringValue("GetVmMetaResponse.VmMetaInfo.EnvoyEnvPath"));
		vmMetaInfo.setEnvoyEnvContent(_ctx.stringValue("GetVmMetaResponse.VmMetaInfo.EnvoyEnvContent"));
		vmMetaInfo.setHostsPath(_ctx.stringValue("GetVmMetaResponse.VmMetaInfo.HostsPath"));
		vmMetaInfo.setHostsContent(_ctx.stringValue("GetVmMetaResponse.VmMetaInfo.HostsContent"));
		vmMetaInfo.setTokenPath(_ctx.stringValue("GetVmMetaResponse.VmMetaInfo.TokenPath"));
		vmMetaInfo.setTokenContent(_ctx.stringValue("GetVmMetaResponse.VmMetaInfo.TokenContent"));
		getVmMetaResponse.setVmMetaInfo(vmMetaInfo);
	 
	 	return getVmMetaResponse;
	}
}