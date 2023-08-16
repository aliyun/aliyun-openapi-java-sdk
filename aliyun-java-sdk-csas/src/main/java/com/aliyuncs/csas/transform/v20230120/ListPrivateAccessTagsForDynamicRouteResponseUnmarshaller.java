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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListPrivateAccessTagsForDynamicRouteResponse;
import com.aliyuncs.csas.model.v20230120.ListPrivateAccessTagsForDynamicRouteResponse.DynamicRoute;
import com.aliyuncs.csas.model.v20230120.ListPrivateAccessTagsForDynamicRouteResponse.DynamicRoute.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivateAccessTagsForDynamicRouteResponseUnmarshaller {

	public static ListPrivateAccessTagsForDynamicRouteResponse unmarshall(ListPrivateAccessTagsForDynamicRouteResponse listPrivateAccessTagsForDynamicRouteResponse, UnmarshallerContext _ctx) {
		
		listPrivateAccessTagsForDynamicRouteResponse.setRequestId(_ctx.stringValue("ListPrivateAccessTagsForDynamicRouteResponse.RequestId"));

		List<DynamicRoute> dynamicRoutes = new ArrayList<DynamicRoute>();
		for (int i = 0; i < _ctx.lengthValue("ListPrivateAccessTagsForDynamicRouteResponse.DynamicRoutes.Length"); i++) {
			DynamicRoute dynamicRoute = new DynamicRoute();
			dynamicRoute.setDynamicRouteId(_ctx.stringValue("ListPrivateAccessTagsForDynamicRouteResponse.DynamicRoutes["+ i +"].DynamicRouteId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListPrivateAccessTagsForDynamicRouteResponse.DynamicRoutes["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagId(_ctx.stringValue("ListPrivateAccessTagsForDynamicRouteResponse.DynamicRoutes["+ i +"].Tags["+ j +"].TagId"));
				tag.setName(_ctx.stringValue("ListPrivateAccessTagsForDynamicRouteResponse.DynamicRoutes["+ i +"].Tags["+ j +"].Name"));
				tag.setDescription(_ctx.stringValue("ListPrivateAccessTagsForDynamicRouteResponse.DynamicRoutes["+ i +"].Tags["+ j +"].Description"));
				tag.setTagType(_ctx.stringValue("ListPrivateAccessTagsForDynamicRouteResponse.DynamicRoutes["+ i +"].Tags["+ j +"].TagType"));
				tag.setCreateTime(_ctx.stringValue("ListPrivateAccessTagsForDynamicRouteResponse.DynamicRoutes["+ i +"].Tags["+ j +"].CreateTime"));

				tags.add(tag);
			}
			dynamicRoute.setTags(tags);

			dynamicRoutes.add(dynamicRoute);
		}
		listPrivateAccessTagsForDynamicRouteResponse.setDynamicRoutes(dynamicRoutes);
	 
	 	return listPrivateAccessTagsForDynamicRouteResponse;
	}
}