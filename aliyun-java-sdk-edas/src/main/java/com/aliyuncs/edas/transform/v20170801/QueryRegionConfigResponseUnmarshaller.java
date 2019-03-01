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

import com.aliyuncs.edas.model.v20170801.QueryRegionConfigResponse;
import com.aliyuncs.edas.model.v20170801.QueryRegionConfigResponse.RegionConfig;
import com.aliyuncs.edas.model.v20170801.QueryRegionConfigResponse.RegionConfig.FileServerConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRegionConfigResponseUnmarshaller {

	public static QueryRegionConfigResponse unmarshall(QueryRegionConfigResponse queryRegionConfigResponse, UnmarshallerContext context) {
		
		queryRegionConfigResponse.setRequestId(context.stringValue("QueryRegionConfigResponse.RequestId"));
		queryRegionConfigResponse.setCode(context.integerValue("QueryRegionConfigResponse.Code"));
		queryRegionConfigResponse.setMessage(context.stringValue("QueryRegionConfigResponse.Message"));

		RegionConfig regionConfig = new RegionConfig();
		regionConfig.setAddressServerHost(context.stringValue("QueryRegionConfigResponse.RegionConfig.AddressServerHost"));
		regionConfig.setAgentInstallScript(context.stringValue("QueryRegionConfigResponse.RegionConfig.AgentInstallScript"));
		regionConfig.setFileServerType(context.stringValue("QueryRegionConfigResponse.RegionConfig.FileServerType"));
		regionConfig.setId(context.stringValue("QueryRegionConfigResponse.RegionConfig.Id"));
		regionConfig.setImageId(context.stringValue("QueryRegionConfigResponse.RegionConfig.ImageId"));
		regionConfig.setName(context.stringValue("QueryRegionConfigResponse.RegionConfig.Name"));
		regionConfig.setNo(context.integerValue("QueryRegionConfigResponse.RegionConfig.No"));
		regionConfig.setTag(context.stringValue("QueryRegionConfigResponse.RegionConfig.Tag"));

		FileServerConfig fileServerConfig = new FileServerConfig();
		fileServerConfig.setBucket(context.stringValue("QueryRegionConfigResponse.RegionConfig.FileServerConfig.Bucket"));
		fileServerConfig.setInternalUrl(context.stringValue("QueryRegionConfigResponse.RegionConfig.FileServerConfig.InternalUrl"));
		fileServerConfig.setPublicUrl(context.stringValue("QueryRegionConfigResponse.RegionConfig.FileServerConfig.PublicUrl"));
		fileServerConfig.setVpcUrl(context.stringValue("QueryRegionConfigResponse.RegionConfig.FileServerConfig.VpcUrl"));
		regionConfig.setFileServerConfig(fileServerConfig);
		queryRegionConfigResponse.setRegionConfig(regionConfig);
	 
	 	return queryRegionConfigResponse;
	}
}