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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.GetServerlessAppConfigDetailResponse;
import com.aliyuncs.edas.model.v20170801.GetServerlessAppConfigDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServerlessAppConfigDetailResponseUnmarshaller {

	public static GetServerlessAppConfigDetailResponse unmarshall(GetServerlessAppConfigDetailResponse getServerlessAppConfigDetailResponse, UnmarshallerContext _ctx) {
		
		getServerlessAppConfigDetailResponse.setCode(_ctx.integerValue("GetServerlessAppConfigDetailResponse.Code"));
		getServerlessAppConfigDetailResponse.setMessage(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Message"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.AppId"));
		data.setAppName(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.AppName"));
		data.setNamespaceId(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.NamespaceId"));
		data.setAppDescription(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.AppDescription"));
		data.setVpcId(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.VpcId"));
		data.setVSwitchId(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.VSwitchId"));
		data.setPackageType(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.PackageType"));
		data.setPackageVersion(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.PackageVersion"));
		data.setPackageUrl(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.PackageUrl"));
		data.setImageUrl(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.ImageUrl"));
		data.setJdk(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.Jdk"));
		data.setWebContainer(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.WebContainer"));
		data.setCpu(_ctx.integerValue("GetServerlessAppConfigDetailResponse.Data.Cpu"));
		data.setMemory(_ctx.integerValue("GetServerlessAppConfigDetailResponse.Data.Memory"));
		data.setReplicas(_ctx.integerValue("GetServerlessAppConfigDetailResponse.Data.Replicas"));
		data.setCommand(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.Command"));
		data.setCommandArgs(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.CommandArgs"));
		data.setEnvs(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.Envs"));
		data.setCustomHostAlias(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.CustomHostAlias"));
		data.setJarStartOptions(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.JarStartOptions"));
		data.setJarStartArgs(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.JarStartArgs"));
		data.setLiveness(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.Liveness"));
		data.setReadiness(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.Readiness"));
		data.setMinReadyInstances(_ctx.integerValue("GetServerlessAppConfigDetailResponse.Data.MinReadyInstances"));
		data.setBatchWaitTime(_ctx.integerValue("GetServerlessAppConfigDetailResponse.Data.BatchWaitTime"));
		data.setEdasContainerVersion(_ctx.stringValue("GetServerlessAppConfigDetailResponse.Data.EdasContainerVersion"));
		getServerlessAppConfigDetailResponse.setData(data);
	 
	 	return getServerlessAppConfigDetailResponse;
	}
}