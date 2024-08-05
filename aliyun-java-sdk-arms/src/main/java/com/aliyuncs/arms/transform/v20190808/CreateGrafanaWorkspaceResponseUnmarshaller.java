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

import com.aliyuncs.arms.model.v20190808.CreateGrafanaWorkspaceResponse;
import com.aliyuncs.arms.model.v20190808.CreateGrafanaWorkspaceResponse.Data;
import com.aliyuncs.arms.model.v20190808.CreateGrafanaWorkspaceResponse.Data.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGrafanaWorkspaceResponseUnmarshaller {

	public static CreateGrafanaWorkspaceResponse unmarshall(CreateGrafanaWorkspaceResponse createGrafanaWorkspaceResponse, UnmarshallerContext _ctx) {
		
		createGrafanaWorkspaceResponse.setRequestId(_ctx.stringValue("CreateGrafanaWorkspaceResponse.RequestId"));
		createGrafanaWorkspaceResponse.setMessage(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Message"));
		createGrafanaWorkspaceResponse.setCode(_ctx.integerValue("CreateGrafanaWorkspaceResponse.Code"));
		createGrafanaWorkspaceResponse.setSuccess(_ctx.booleanValue("CreateGrafanaWorkspaceResponse.Success"));
		createGrafanaWorkspaceResponse.setTraceId(_ctx.stringValue("CreateGrafanaWorkspaceResponse.TraceId"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.status"));
		data.setDescription(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.description"));
		data.setGrafanaWorkspaceEdition(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.grafanaWorkspaceEdition"));
		data.setEndTime(_ctx.floatValue("CreateGrafanaWorkspaceResponse.Data.endTime"));
		data.setGrafanaWorkspaceId(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.grafanaWorkspaceId"));
		data.setGrafanaWorkspaceIp(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.grafanaWorkspaceIp"));
		data.setSnatIp(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.snatIp"));
		data.setGrafanaWorkspaceDomain(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.grafanaWorkspaceDomain"));
		data.setGrafanaWorkspaceDomainStatus(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.grafanaWorkspaceDomainStatus"));
		data.setCommercial(_ctx.booleanValue("CreateGrafanaWorkspaceResponse.Data.commercial"));
		data.setGrafanaWorkspaceName(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.grafanaWorkspaceName"));
		data.setGrafanaVersion(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.grafanaVersion"));
		data.setGmtCreate(_ctx.floatValue("CreateGrafanaWorkspaceResponse.Data.gmtCreate"));
		data.setUserId(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.userId"));
		data.setMaxAccount(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.maxAccount"));
		data.setRegionId(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.regionId"));
		data.setBizProtocol(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.protocol"));
		data.setShareSynced(_ctx.booleanValue("CreateGrafanaWorkspaceResponse.Data.shareSynced"));
		data.setNtmId(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.ntmId"));
		data.setPersonalDomain(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.personalDomain"));
		data.setPersonalDomainPrefix(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.personalDomainPrefix"));
		data.setResourceGroupId(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.resourceGroupId"));
		data.setDeployType(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.deployType"));
		data.setPrivateIp(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.privateIp"));
		data.setPrivateDomain(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.privateDomain"));

		List<String> upgradeVersion = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateGrafanaWorkspaceResponse.Data.upgradeVersion.Length"); i++) {
			upgradeVersion.add(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.upgradeVersion["+ i +"]"));
		}
		data.setUpgradeVersion(upgradeVersion);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateGrafanaWorkspaceResponse.Data.tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.tags["+ i +"].key"));
			tagsItem.setValue(_ctx.stringValue("CreateGrafanaWorkspaceResponse.Data.tags["+ i +"].value"));

			tags.add(tagsItem);
		}
		data.setTags(tags);
		createGrafanaWorkspaceResponse.setData(data);
	 
	 	return createGrafanaWorkspaceResponse;
	}
}