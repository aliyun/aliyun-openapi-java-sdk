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

package com.aliyuncs.tag.transform.v20180828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.tag.model.v20180828.TagResourcesResponse;
import com.aliyuncs.tag.model.v20180828.TagResourcesResponse.FailedResource;
import com.aliyuncs.tag.model.v20180828.TagResourcesResponse.FailedResource.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class TagResourcesResponseUnmarshaller {

	public static TagResourcesResponse unmarshall(TagResourcesResponse tagResourcesResponse, UnmarshallerContext _ctx) {
		
		tagResourcesResponse.setRequestId(_ctx.stringValue("TagResourcesResponse.RequestId"));

		List<FailedResource> failedResources = new ArrayList<FailedResource>();
		for (int i = 0; i < _ctx.lengthValue("TagResourcesResponse.FailedResources.Length"); i++) {
			FailedResource failedResource = new FailedResource();
			failedResource.setResourceARN(_ctx.stringValue("TagResourcesResponse.FailedResources["+ i +"].ResourceARN"));

			Result result = new Result();
			result.setCode(_ctx.stringValue("TagResourcesResponse.FailedResources["+ i +"].Result.Code"));
			result.setMessage(_ctx.stringValue("TagResourcesResponse.FailedResources["+ i +"].Result.Message"));
			failedResource.setResult(result);

			failedResources.add(failedResource);
		}
		tagResourcesResponse.setFailedResources(failedResources);
	 
	 	return tagResourcesResponse;
	}
}