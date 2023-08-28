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

package com.aliyuncs.eflo.transform.v20220530;

import com.aliyuncs.eflo.model.v20220530.GetElasticNetworkInterfaceResponse;
import com.aliyuncs.eflo.model.v20220530.GetElasticNetworkInterfaceResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetElasticNetworkInterfaceResponseUnmarshaller {

	public static GetElasticNetworkInterfaceResponse unmarshall(GetElasticNetworkInterfaceResponse getElasticNetworkInterfaceResponse, UnmarshallerContext _ctx) {
		
		getElasticNetworkInterfaceResponse.setRequestId(_ctx.stringValue("GetElasticNetworkInterfaceResponse.RequestId"));
		getElasticNetworkInterfaceResponse.setCode(_ctx.integerValue("GetElasticNetworkInterfaceResponse.Code"));
		getElasticNetworkInterfaceResponse.setMessage(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Message"));

		Content content = new Content();
		content.setRegionId(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.RegionId"));
		content.setZoneId(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.ZoneId"));
		content.setElasticNetworkInterfaceId(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.ElasticNetworkInterfaceId"));
		content.setNodeId(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.NodeId"));
		content.setStatus(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.Status"));
		content.setIp(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.Ip"));
		content.setVpcId(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.VpcId"));
		content.setVSwitchId(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.VSwitchId"));
		content.setMessage(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.Message"));
		content.setMac(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.Mac"));
		content.setType(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.Type"));
		content.setGateway(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.Gateway"));
		content.setMask(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.Mask"));
		content.setCreateTime(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.CreateTime"));
		content.setGmtModified(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.GmtModified"));
		content.setDescription(_ctx.stringValue("GetElasticNetworkInterfaceResponse.Content.Description"));
		getElasticNetworkInterfaceResponse.setContent(content);
	 
	 	return getElasticNetworkInterfaceResponse;
	}
}