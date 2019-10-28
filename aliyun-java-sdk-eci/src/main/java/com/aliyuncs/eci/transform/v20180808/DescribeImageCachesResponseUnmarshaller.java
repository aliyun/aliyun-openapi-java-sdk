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

package com.aliyuncs.eci.transform.v20180808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eci.model.v20180808.DescribeImageCachesResponse;
import com.aliyuncs.eci.model.v20180808.DescribeImageCachesResponse.ImageCache;
import com.aliyuncs.eci.model.v20180808.DescribeImageCachesResponse.ImageCache.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageCachesResponseUnmarshaller {

	public static DescribeImageCachesResponse unmarshall(DescribeImageCachesResponse describeImageCachesResponse, UnmarshallerContext _ctx) {
		
		describeImageCachesResponse.setRequestId(_ctx.stringValue("DescribeImageCachesResponse.RequestId"));

		List<ImageCache> imageCaches = new ArrayList<ImageCache>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageCachesResponse.ImageCaches.Length"); i++) {
			ImageCache imageCache = new ImageCache();
			imageCache.setContainerGroupId(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].ContainerGroupId"));
			imageCache.setImageCacheId(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].ImageCacheId"));
			imageCache.setImageCacheName(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].ImageCacheName"));
			imageCache.setSnapshotId(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].SnapshotId"));
			imageCache.setProgress(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].Progress"));
			imageCache.setStatus(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].Status"));

			List<String> images = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImageCachesResponse.ImageCaches["+ i +"].Images.Length"); j++) {
				images.add(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].Images["+ j +"]"));
			}
			imageCache.setImages(images);

			List<Event> events = new ArrayList<Event>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImageCachesResponse.ImageCaches["+ i +"].Events.Length"); j++) {
				Event event = new Event();
				event.setCount(_ctx.integerValue("DescribeImageCachesResponse.ImageCaches["+ i +"].Events["+ j +"].Count"));
				event.setType(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].Events["+ j +"].Type"));
				event.setName(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].Events["+ j +"].Name"));
				event.setMessage(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].Events["+ j +"].Message"));
				event.setFirstTimestamp(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].Events["+ j +"].FirstTimestamp"));
				event.setLastTimestamp(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].Events["+ j +"].LastTimestamp"));

				events.add(event);
			}
			imageCache.setEvents(events);

			imageCaches.add(imageCache);
		}
		describeImageCachesResponse.setImageCaches(imageCaches);
	 
	 	return describeImageCachesResponse;
	}
}