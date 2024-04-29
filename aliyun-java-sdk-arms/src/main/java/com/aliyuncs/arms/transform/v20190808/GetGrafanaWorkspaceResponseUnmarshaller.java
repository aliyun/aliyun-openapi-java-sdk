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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetGrafanaWorkspaceResponse;
import com.aliyuncs.arms.model.v20190808.GetGrafanaWorkspaceResponse.Data;
import com.aliyuncs.arms.model.v20190808.GetGrafanaWorkspaceResponse.Data.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGrafanaWorkspaceResponseUnmarshaller {

	public static GetGrafanaWorkspaceResponse unmarshall(GetGrafanaWorkspaceResponse getGrafanaWorkspaceResponse, UnmarshallerContext _ctx) {
		
		getGrafanaWorkspaceResponse.setRequestId(_ctx.stringValue("GetGrafanaWorkspaceResponse.RequestId"));
		getGrafanaWorkspaceResponse.setMessage(_ctx.stringValue("GetGrafanaWorkspaceResponse.Message"));
		getGrafanaWorkspaceResponse.setCode(_ctx.integerValue("GetGrafanaWorkspaceResponse.Code"));
		getGrafanaWorkspaceResponse.setSuccess(_ctx.booleanValue("GetGrafanaWorkspaceResponse.Success"));
		getGrafanaWorkspaceResponse.setTraceId(_ctx.stringValue("GetGrafanaWorkspaceResponse.TraceId"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.status"));
		data.setDescription(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.description"));
		data.setGrafanaWorkspaceEdition(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.grafanaWorkspaceEdition"));
		data.setEndTime(_ctx.floatValue("GetGrafanaWorkspaceResponse.Data.endTime"));
		data.setGrafanaWorkspaceId(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.grafanaWorkspaceId"));
		data.setGrafanaWorkspaceIp(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.grafanaWorkspaceIp"));
		data.setSnatIp(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.snatIp"));
		data.setGrafanaWorkspaceDomain(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.grafanaWorkspaceDomain"));
		data.setCommercial(_ctx.booleanValue("GetGrafanaWorkspaceResponse.Data.commercial"));
		data.setGrafanaWorkspaceName(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.grafanaWorkspaceName"));
		data.setGrafanaVersion(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.grafanaVersion"));
		data.setGmtCreate(_ctx.floatValue("GetGrafanaWorkspaceResponse.Data.gmtCreate"));
		data.setUserId(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.userId"));
		data.setMaxAccount(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.maxAccount"));
		data.setRegionId(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.regionId"));
		data.setBizProtocol(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.protocol"));
		data.setShareSynced(_ctx.booleanValue("GetGrafanaWorkspaceResponse.Data.shareSynced"));
		data.setNtmId(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.ntmId"));
		data.setPersonalDomain(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.personalDomain"));
		data.setPersonalDomainPrefix(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.personalDomainPrefix"));
		data.setResourceGroupId(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.resourceGroupId"));
		data.setDeployType(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.deployType"));
		data.setPrivateIp(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.privateIp"));
		data.setPrivateDomain(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.privateDomain"));

		List<String> upgradeVersion = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetGrafanaWorkspaceResponse.Data.upgradeVersion.Length"); i++) {
			upgradeVersion.add(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.upgradeVersion["+ i +"]"));
		}
		data.setUpgradeVersion(upgradeVersion);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetGrafanaWorkspaceResponse.Data.tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.tags["+ i +"].key"));
			tagsItem.setValue(_ctx.stringValue("GetGrafanaWorkspaceResponse.Data.tags["+ i +"].value"));

			tags.add(tagsItem);
		}
		data.setTags(tags);
		getGrafanaWorkspaceResponse.setData(data);
	 
	 	return getGrafanaWorkspaceResponse;
	}
}