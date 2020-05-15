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

import com.aliyuncs.tag.model.v20180828.UntagResourcesResponse;
import com.aliyuncs.tag.model.v20180828.UntagResourcesResponse.FailedResource;
import com.aliyuncs.tag.model.v20180828.UntagResourcesResponse.FailedResource.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UntagResourcesResponseUnmarshaller {

	public static UntagResourcesResponse unmarshall(UntagResourcesResponse untagResourcesResponse, UnmarshallerContext _ctx) {
		
		untagResourcesResponse.setRequestId(_ctx.stringValue("UntagResourcesResponse.RequestId"));

		List<FailedResource> failedResources = new ArrayList<FailedResource>();
		for (int i = 0; i < _ctx.lengthValue("UntagResourcesResponse.FailedResources.Length"); i++) {
			FailedResource failedResource = new FailedResource();
			failedResource.setResourceARN(_ctx.stringValue("UntagResourcesResponse.FailedResources["+ i +"].ResourceARN"));

			Result result = new Result();
			result.setCode(_ctx.stringValue("UntagResourcesResponse.FailedResources["+ i +"].Result.Code"));
			result.setMessage(_ctx.stringValue("UntagResourcesResponse.FailedResources["+ i +"].Result.Message"));
			failedResource.setResult(result);

			failedResources.add(failedResource);
		}
		untagResourcesResponse.setFailedResources(failedResources);
	 
	 	return untagResourcesResponse;
	}
}