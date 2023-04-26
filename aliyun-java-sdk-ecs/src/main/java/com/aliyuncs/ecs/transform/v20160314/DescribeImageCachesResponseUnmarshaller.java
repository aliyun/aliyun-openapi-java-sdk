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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeImageCachesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeImageCachesResponse.ImageCache;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageCachesResponseUnmarshaller {

	public static DescribeImageCachesResponse unmarshall(DescribeImageCachesResponse describeImageCachesResponse, UnmarshallerContext _ctx) {
		
		describeImageCachesResponse.setRequestId(_ctx.stringValue("DescribeImageCachesResponse.RequestId"));
		describeImageCachesResponse.setNextToken(_ctx.stringValue("DescribeImageCachesResponse.NextToken"));
		describeImageCachesResponse.setTotalCount(_ctx.integerValue("DescribeImageCachesResponse.TotalCount"));

		List<ImageCache> imageCaches = new ArrayList<ImageCache>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageCachesResponse.ImageCaches.Length"); i++) {
			ImageCache imageCache = new ImageCache();
			imageCache.setImageId(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].ImageId"));
			imageCache.setCreationTime(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].CreationTime"));
			imageCache.setProgress(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].Progress"));
			imageCache.setStatus(_ctx.stringValue("DescribeImageCachesResponse.ImageCaches["+ i +"].Status"));

			imageCaches.add(imageCache);
		}
		describeImageCachesResponse.setImageCaches(imageCaches);
	 
	 	return describeImageCachesResponse;
	}
}