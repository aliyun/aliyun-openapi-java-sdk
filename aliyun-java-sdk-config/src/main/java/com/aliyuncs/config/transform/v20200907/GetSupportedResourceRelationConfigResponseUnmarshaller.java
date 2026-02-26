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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.GetSupportedResourceRelationConfigResponse;
import com.aliyuncs.config.model.v20200907.GetSupportedResourceRelationConfigResponse.ResourceRelationConfigListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSupportedResourceRelationConfigResponseUnmarshaller {

	public static GetSupportedResourceRelationConfigResponse unmarshall(GetSupportedResourceRelationConfigResponse getSupportedResourceRelationConfigResponse, UnmarshallerContext _ctx) {
		
		getSupportedResourceRelationConfigResponse.setRequestId(_ctx.stringValue("GetSupportedResourceRelationConfigResponse.RequestId"));

		List<ResourceRelationConfigListItem> resourceRelationConfigList = new ArrayList<ResourceRelationConfigListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSupportedResourceRelationConfigResponse.ResourceRelationConfigList.Length"); i++) {
			ResourceRelationConfigListItem resourceRelationConfigListItem = new ResourceRelationConfigListItem();
			resourceRelationConfigListItem.setTargetResourceType(_ctx.stringValue("GetSupportedResourceRelationConfigResponse.ResourceRelationConfigList["+ i +"].TargetResourceType"));
			resourceRelationConfigListItem.setRelationType(_ctx.stringValue("GetSupportedResourceRelationConfigResponse.ResourceRelationConfigList["+ i +"].RelationType"));

			resourceRelationConfigList.add(resourceRelationConfigListItem);
		}
		getSupportedResourceRelationConfigResponse.setResourceRelationConfigList(resourceRelationConfigList);
	 
	 	return getSupportedResourceRelationConfigResponse;
	}
}