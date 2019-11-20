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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListAllMediaBucketResponse;
import com.aliyuncs.mts.model.v20140618.ListAllMediaBucketResponse.MediaBucket;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllMediaBucketResponseUnmarshaller {

	public static ListAllMediaBucketResponse unmarshall(ListAllMediaBucketResponse listAllMediaBucketResponse, UnmarshallerContext _ctx) {
		
		listAllMediaBucketResponse.setRequestId(_ctx.stringValue("ListAllMediaBucketResponse.RequestId"));
		listAllMediaBucketResponse.setNextPageToken(_ctx.stringValue("ListAllMediaBucketResponse.NextPageToken"));

		List<MediaBucket> mediaBucketList = new ArrayList<MediaBucket>();
		for (int i = 0; i < _ctx.lengthValue("ListAllMediaBucketResponse.MediaBucketList.Length"); i++) {
			MediaBucket mediaBucket = new MediaBucket();
			mediaBucket.setBucket(_ctx.stringValue("ListAllMediaBucketResponse.MediaBucketList["+ i +"].Bucket"));
			mediaBucket.setType(_ctx.stringValue("ListAllMediaBucketResponse.MediaBucketList["+ i +"].Type"));

			mediaBucketList.add(mediaBucket);
		}
		listAllMediaBucketResponse.setMediaBucketList(mediaBucketList);
	 
	 	return listAllMediaBucketResponse;
	}
}