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

	public static QueryRegionConfigResponse unmarshall(QueryRegionConfigResponse queryRegionConfigResponse, UnmarshallerContext _ctx) {
		
		queryRegionConfigResponse.setRequestId(_ctx.stringValue("QueryRegionConfigResponse.RequestId"));
		queryRegionConfigResponse.setCode(_ctx.integerValue("QueryRegionConfigResponse.Code"));
		queryRegionConfigResponse.setMessage(_ctx.stringValue("QueryRegionConfigResponse.Message"));

		RegionConfig regionConfig = new RegionConfig();
		regionConfig.setAddressServerHost(_ctx.stringValue("QueryRegionConfigResponse.RegionConfig.AddressServerHost"));
		regionConfig.setAgentInstallScript(_ctx.stringValue("QueryRegionConfigResponse.RegionConfig.AgentInstallScript"));
		regionConfig.setFileServerType(_ctx.stringValue("QueryRegionConfigResponse.RegionConfig.FileServerType"));
		regionConfig.setId(_ctx.stringValue("QueryRegionConfigResponse.RegionConfig.Id"));
		regionConfig.setImageId(_ctx.stringValue("QueryRegionConfigResponse.RegionConfig.ImageId"));
		regionConfig.setName(_ctx.stringValue("QueryRegionConfigResponse.RegionConfig.Name"));
		regionConfig.setNo(_ctx.integerValue("QueryRegionConfigResponse.RegionConfig.No"));
		regionConfig.setTag(_ctx.stringValue("QueryRegionConfigResponse.RegionConfig.Tag"));

		FileServerConfig fileServerConfig = new FileServerConfig();
		fileServerConfig.setBucket(_ctx.stringValue("QueryRegionConfigResponse.RegionConfig.FileServerConfig.Bucket"));
		fileServerConfig.setInternalUrl(_ctx.stringValue("QueryRegionConfigResponse.RegionConfig.FileServerConfig.InternalUrl"));
		fileServerConfig.setPublicUrl(_ctx.stringValue("QueryRegionConfigResponse.RegionConfig.FileServerConfig.PublicUrl"));
		fileServerConfig.setVpcUrl(_ctx.stringValue("QueryRegionConfigResponse.RegionConfig.FileServerConfig.VpcUrl"));
		regionConfig.setFileServerConfig(fileServerConfig);
		queryRegionConfigResponse.setRegionConfig(regionConfig);
	 
	 	return queryRegionConfigResponse;
	}
}