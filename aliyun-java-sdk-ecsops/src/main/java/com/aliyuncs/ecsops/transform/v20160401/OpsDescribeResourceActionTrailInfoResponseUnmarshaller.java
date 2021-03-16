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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceActionTrailInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceActionTrailInfoResponse.Resource;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceActionTrailInfoResponse.Resource.ResourceAction;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceActionTrailInfoResponse.Resource.ResourceAction.ActionRelatedResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeResourceActionTrailInfoResponseUnmarshaller {

	public static OpsDescribeResourceActionTrailInfoResponse unmarshall(OpsDescribeResourceActionTrailInfoResponse opsDescribeResourceActionTrailInfoResponse, UnmarshallerContext _ctx) {
		
		opsDescribeResourceActionTrailInfoResponse.setRequestId(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.RequestId"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeResourceActionTrailInfoResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setResourceId(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceId"));
			resource.setRelatedResourceId(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].RelatedResourceId"));
			resource.setRelatedResourceType(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].RelatedResourceType"));
			resource.setStartTime(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].StartTime"));
			resource.setEndTime(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].EndTime"));
			resource.setNextToken(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].NextToken"));

			List<ResourceAction> resourceActions = new ArrayList<ResourceAction>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions.Length"); j++) {
				ResourceAction resourceAction = new ResourceAction();
				resourceAction.setActionApiVersion(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionApiVersion"));
				resourceAction.setActionErrorMessage(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionErrorMessage"));
				resourceAction.setUserInfoAk(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].UserInfoAk"));
				resourceAction.setActionRequestId(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionRequestId"));
				resourceAction.setActionSourceIpAddress(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionSourceIpAddress"));
				resourceAction.setActionEventType(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionEventType"));
				resourceAction.setActionEventSource(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionEventSource"));
				resourceAction.setActionEventId(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionEventId"));
				resourceAction.setActionErrorCode(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionErrorCode"));
				resourceAction.setActionEventTime(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionEventTime"));
				resourceAction.setActionSuccess(_ctx.booleanValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionSuccess"));
				resourceAction.setActionEventName(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionEventName"));

				List<ActionRelatedResource> actionRelatedResources = new ArrayList<ActionRelatedResource>();
				for (int k = 0; k < _ctx.lengthValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionRelatedResources.Length"); k++) {
					ActionRelatedResource actionRelatedResource = new ActionRelatedResource();
					actionRelatedResource.setActionResourceType(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionRelatedResources["+ k +"].ActionResourceType"));

					List<String> actionResourceIds = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionRelatedResources["+ k +"].ActionResourceIds.Length"); l++) {
						actionResourceIds.add(_ctx.stringValue("OpsDescribeResourceActionTrailInfoResponse.Resources["+ i +"].ResourceActions["+ j +"].ActionRelatedResources["+ k +"].ActionResourceIds["+ l +"]"));
					}
					actionRelatedResource.setActionResourceIds(actionResourceIds);

					actionRelatedResources.add(actionRelatedResource);
				}
				resourceAction.setActionRelatedResources(actionRelatedResources);

				resourceActions.add(resourceAction);
			}
			resource.setResourceActions(resourceActions);

			resources.add(resource);
		}
		opsDescribeResourceActionTrailInfoResponse.setResources(resources);
	 
	 	return opsDescribeResourceActionTrailInfoResponse;
	}
}