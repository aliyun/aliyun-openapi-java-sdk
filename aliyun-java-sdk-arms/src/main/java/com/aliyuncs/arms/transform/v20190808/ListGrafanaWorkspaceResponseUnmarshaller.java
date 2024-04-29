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

import com.aliyuncs.arms.model.v20190808.ListGrafanaWorkspaceResponse;
import com.aliyuncs.arms.model.v20190808.ListGrafanaWorkspaceResponse.GrafanaWorkspace;
import com.aliyuncs.arms.model.v20190808.ListGrafanaWorkspaceResponse.GrafanaWorkspace.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGrafanaWorkspaceResponseUnmarshaller {

	public static ListGrafanaWorkspaceResponse unmarshall(ListGrafanaWorkspaceResponse listGrafanaWorkspaceResponse, UnmarshallerContext _ctx) {
		
		listGrafanaWorkspaceResponse.setRequestId(_ctx.stringValue("ListGrafanaWorkspaceResponse.RequestId"));
		listGrafanaWorkspaceResponse.setMessage(_ctx.stringValue("ListGrafanaWorkspaceResponse.Message"));
		listGrafanaWorkspaceResponse.setCode(_ctx.integerValue("ListGrafanaWorkspaceResponse.Code"));
		listGrafanaWorkspaceResponse.setSuccess(_ctx.booleanValue("ListGrafanaWorkspaceResponse.Success"));
		listGrafanaWorkspaceResponse.setTraceId(_ctx.stringValue("ListGrafanaWorkspaceResponse.TraceId"));

		List<GrafanaWorkspace> data = new ArrayList<GrafanaWorkspace>();
		for (int i = 0; i < _ctx.lengthValue("ListGrafanaWorkspaceResponse.Data.Length"); i++) {
			GrafanaWorkspace grafanaWorkspace = new GrafanaWorkspace();
			grafanaWorkspace.setStatus(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].status"));
			grafanaWorkspace.setDescription(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].description"));
			grafanaWorkspace.setGrafanaWorkspaceEdition(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].grafanaWorkspaceEdition"));
			grafanaWorkspace.setEndTime(_ctx.floatValue("ListGrafanaWorkspaceResponse.Data["+ i +"].endTime"));
			grafanaWorkspace.setGrafanaWorkspaceId(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].grafanaWorkspaceId"));
			grafanaWorkspace.setGrafanaWorkspaceIp(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].grafanaWorkspaceIp"));
			grafanaWorkspace.setSnatIp(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].snatIp"));
			grafanaWorkspace.setGrafanaWorkspaceDomain(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].grafanaWorkspaceDomain"));
			grafanaWorkspace.setCommercial(_ctx.booleanValue("ListGrafanaWorkspaceResponse.Data["+ i +"].commercial"));
			grafanaWorkspace.setGrafanaWorkspaceName(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].grafanaWorkspaceName"));
			grafanaWorkspace.setGrafanaVersion(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].grafanaVersion"));
			grafanaWorkspace.setGmtCreate(_ctx.floatValue("ListGrafanaWorkspaceResponse.Data["+ i +"].gmtCreate"));
			grafanaWorkspace.setUserId(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].userId"));
			grafanaWorkspace.setMaxAccount(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].maxAccount"));
			grafanaWorkspace.setRegionId(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].regionId"));
			grafanaWorkspace.setBizProtocol(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].protocol"));
			grafanaWorkspace.setShareSynced(_ctx.booleanValue("ListGrafanaWorkspaceResponse.Data["+ i +"].shareSynced"));
			grafanaWorkspace.setNtmId(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].ntmId"));
			grafanaWorkspace.setPersonalDomain(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].personalDomain"));
			grafanaWorkspace.setPersonalDomainPrefix(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].personalDomainPrefix"));
			grafanaWorkspace.setResourceGroupId(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].resourceGroupId"));
			grafanaWorkspace.setDeployType(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].deployType"));
			grafanaWorkspace.setPrivateIp(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].privateIp"));
			grafanaWorkspace.setPrivateDomain(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].privateDomain"));

			List<String> upgradeVersion = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListGrafanaWorkspaceResponse.Data["+ i +"].upgradeVersion.Length"); j++) {
				upgradeVersion.add(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].upgradeVersion["+ j +"]"));
			}
			grafanaWorkspace.setUpgradeVersion(upgradeVersion);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListGrafanaWorkspaceResponse.Data["+ i +"].tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].tags["+ j +"].key"));
				tagsItem.setValue(_ctx.stringValue("ListGrafanaWorkspaceResponse.Data["+ i +"].tags["+ j +"].value"));

				tags.add(tagsItem);
			}
			grafanaWorkspace.setTags(tags);

			data.add(grafanaWorkspace);
		}
		listGrafanaWorkspaceResponse.setData(data);
	 
	 	return listGrafanaWorkspaceResponse;
	}
}