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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.UpdateEnhancedVpnGatewayResponse;
import com.aliyuncs.vpc.model.v20160428.UpdateEnhancedVpnGatewayResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateEnhancedVpnGatewayResponseUnmarshaller {

	public static UpdateEnhancedVpnGatewayResponse unmarshall(UpdateEnhancedVpnGatewayResponse updateEnhancedVpnGatewayResponse, UnmarshallerContext _ctx) {
		
		updateEnhancedVpnGatewayResponse.setRequestId(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.RequestId"));
		updateEnhancedVpnGatewayResponse.setVpnType(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.VpnType"));
		updateEnhancedVpnGatewayResponse.setStatus(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.Status"));
		updateEnhancedVpnGatewayResponse.setVpcId(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.VpcId"));
		updateEnhancedVpnGatewayResponse.setCreateTime(_ctx.longValue("UpdateEnhancedVpnGatewayResponse.CreateTime"));
		updateEnhancedVpnGatewayResponse.setAutoPropagate(_ctx.booleanValue("UpdateEnhancedVpnGatewayResponse.AutoPropagate"));
		updateEnhancedVpnGatewayResponse.setVpnGatewayId(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.VpnGatewayId"));
		updateEnhancedVpnGatewayResponse.setTag(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.Tag"));
		updateEnhancedVpnGatewayResponse.setVSwitchId(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.VSwitchId"));
		updateEnhancedVpnGatewayResponse.setEnableBgp(_ctx.booleanValue("UpdateEnhancedVpnGatewayResponse.EnableBgp"));
		updateEnhancedVpnGatewayResponse.setName(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.Name"));
		updateEnhancedVpnGatewayResponse.setDescription(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.Description"));
		updateEnhancedVpnGatewayResponse.setNetworkType(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.NetworkType"));
		updateEnhancedVpnGatewayResponse.setDisasterRecoveryVSwitchId(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.DisasterRecoveryVSwitchId"));
		updateEnhancedVpnGatewayResponse.setResourceGroupId(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.ResourceGroupId"));
		updateEnhancedVpnGatewayResponse.setGatewayType(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.GatewayType"));

		List<String> eniInstanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateEnhancedVpnGatewayResponse.EniInstanceIds.Length"); i++) {
			eniInstanceIds.add(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.EniInstanceIds["+ i +"]"));
		}
		updateEnhancedVpnGatewayResponse.setEniInstanceIds(eniInstanceIds);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("UpdateEnhancedVpnGatewayResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("UpdateEnhancedVpnGatewayResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		updateEnhancedVpnGatewayResponse.setTags(tags);
	 
	 	return updateEnhancedVpnGatewayResponse;
	}
}