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

	public static GetServerlessAppConfigDetailResponse unmarshall(GetServerlessAppConfigDetailResponse getServerlessAppConfigDetailResponse, UnmarshallerContext context) {
		
		getServerlessAppConfigDetailResponse.setCode(context.integerValue("GetServerlessAppConfigDetailResponse.Code"));
		getServerlessAppConfigDetailResponse.setMessage(context.stringValue("GetServerlessAppConfigDetailResponse.Message"));

		Data data = new Data();
		data.setAppId(context.stringValue("GetServerlessAppConfigDetailResponse.Data.AppId"));
		data.setAppName(context.stringValue("GetServerlessAppConfigDetailResponse.Data.AppName"));
		data.setNamespaceId(context.stringValue("GetServerlessAppConfigDetailResponse.Data.NamespaceId"));
		data.setAppDescription(context.stringValue("GetServerlessAppConfigDetailResponse.Data.AppDescription"));
		data.setVpcId(context.stringValue("GetServerlessAppConfigDetailResponse.Data.VpcId"));
		data.setVSwitchId(context.stringValue("GetServerlessAppConfigDetailResponse.Data.VSwitchId"));
		data.setPackageType(context.stringValue("GetServerlessAppConfigDetailResponse.Data.PackageType"));
		data.setPackageVersion(context.stringValue("GetServerlessAppConfigDetailResponse.Data.PackageVersion"));
		data.setPackageUrl(context.stringValue("GetServerlessAppConfigDetailResponse.Data.PackageUrl"));
		data.setImageUrl(context.stringValue("GetServerlessAppConfigDetailResponse.Data.ImageUrl"));
		data.setJdk(context.stringValue("GetServerlessAppConfigDetailResponse.Data.Jdk"));
		data.setWebContainer(context.stringValue("GetServerlessAppConfigDetailResponse.Data.WebContainer"));
		data.setCpu(context.integerValue("GetServerlessAppConfigDetailResponse.Data.Cpu"));
		data.setMemory(context.integerValue("GetServerlessAppConfigDetailResponse.Data.Memory"));
		data.setReplicas(context.integerValue("GetServerlessAppConfigDetailResponse.Data.Replicas"));
		data.setCommand(context.stringValue("GetServerlessAppConfigDetailResponse.Data.Command"));
		data.setCommandArgs(context.stringValue("GetServerlessAppConfigDetailResponse.Data.CommandArgs"));
		data.setEnvs(context.stringValue("GetServerlessAppConfigDetailResponse.Data.Envs"));
		data.setCustomHostAlias(context.stringValue("GetServerlessAppConfigDetailResponse.Data.CustomHostAlias"));
		data.setJarStartOptions(context.stringValue("GetServerlessAppConfigDetailResponse.Data.JarStartOptions"));
		data.setJarStartArgs(context.stringValue("GetServerlessAppConfigDetailResponse.Data.JarStartArgs"));
		data.setLiveness(context.stringValue("GetServerlessAppConfigDetailResponse.Data.Liveness"));
		data.setReadiness(context.stringValue("GetServerlessAppConfigDetailResponse.Data.Readiness"));
		data.setMinReadyInstances(context.integerValue("GetServerlessAppConfigDetailResponse.Data.MinReadyInstances"));
		data.setBatchWaitTime(context.integerValue("GetServerlessAppConfigDetailResponse.Data.BatchWaitTime"));
		getServerlessAppConfigDetailResponse.setData(data);
	 
	 	return getServerlessAppConfigDetailResponse;
	}
}