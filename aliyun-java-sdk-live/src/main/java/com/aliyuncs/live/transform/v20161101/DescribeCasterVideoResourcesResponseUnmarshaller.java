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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterVideoResourcesResponseUnmarshaller {

	public static DescribeCasterVideoResourcesResponse unmarshall(DescribeCasterVideoResourcesResponse describeCasterVideoResourcesResponse, UnmarshallerContext _ctx) {
		
		describeCasterVideoResourcesResponse.setRequestId(_ctx.stringValue("DescribeCasterVideoResourcesResponse.RequestId"));
		describeCasterVideoResourcesResponse.setTotal(_ctx.integerValue("DescribeCasterVideoResourcesResponse.Total"));

		List<VideoResource> videoResources = new ArrayList<VideoResource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasterVideoResourcesResponse.VideoResources.Length"); i++) {
			VideoResource videoResource = new VideoResource();
			videoResource.setEndOffset(_ctx.integerValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].EndOffset"));
			videoResource.setFlvUrl(_ctx.stringValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].FlvUrl"));
			videoResource.setBeginOffset(_ctx.integerValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].BeginOffset"));
			videoResource.setPtsCallbackInterval(_ctx.integerValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].PtsCallbackInterval"));
			videoResource.setMaterialId(_ctx.stringValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].MaterialId"));
			videoResource.setLocationId(_ctx.stringValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].LocationId"));
			videoResource.setLiveStreamUrl(_ctx.stringValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].LiveStreamUrl"));
			videoResource.setVodUrl(_ctx.stringValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].VodUrl"));
			videoResource.setResourceId(_ctx.stringValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].ResourceId"));
			videoResource.setRepeatNum(_ctx.integerValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].RepeatNum"));
			videoResource.setResourceName(_ctx.stringValue("DescribeCasterVideoResourcesResponse.VideoResources["+ i +"].ResourceName"));

			videoResources.add(videoResource);
		}
		describeCasterVideoResourcesResponse.setVideoResources(videoResources);
	 
	 	return describeCasterVideoResourcesResponse;
	}
}