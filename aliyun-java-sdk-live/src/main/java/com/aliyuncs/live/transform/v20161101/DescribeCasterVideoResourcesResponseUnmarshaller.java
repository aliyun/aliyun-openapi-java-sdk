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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeCasterVideoResourcesResponse;
import com.aliyuncs.live.model.v20161101.DescribeCasterVideoResourcesResponse.VideoResource;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterVideoResourcesResponseUnmarshaller {

	public static DescribeCasterVideoResourcesResponse unmarshall(DescribeCasterVideoResourcesResponse describeCasterVideoResourcesResponse, UnmarshallerContext context) {
		
		describeCasterVideoResourcesResponse.setRequestId(context.stringValue("DescribeCasterVideoResourcesResponse.RequestId"));
		describeCasterVideoResourcesResponse.setTotal(context.integerValue("DescribeCasterVideoResourcesResponse.Total"));

		List<VideoResource> videoResources = new ArrayList<VideoResource>();
		for (int i = 0; i < context.lengthValue("DescribeCasterVideoResourcesResponse.VideoResources.Length"); i++) {
			VideoResource videoResource = new VideoResource();
			videoResource.setMaterialId(context.stringValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].MaterialId"));
			videoResource.setResourceId(context.stringValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].ResourceId"));
			videoResource.setResourceName(context.stringValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].ResourceName"));
			videoResource.setLocationId(context.stringValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].LocationId"));
			videoResource.setLiveStreamUrl(context.stringValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].LiveStreamUrl"));
			videoResource.setRepeatNum(context.integerValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].RepeatNum"));
			videoResource.setVodUrl(context.stringValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].VodUrl"));
			videoResource.setBeginOffset(context.integerValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].BeginOffset"));
			videoResource.setEndOffset(context.integerValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].EndOffset"));

			videoResources.add(videoResource);
		}
		describeCasterVideoResourcesResponse.setVideoResources(videoResources);
	 
	 	return describeCasterVideoResourcesResponse;
	}
}