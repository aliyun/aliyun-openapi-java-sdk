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

import com.aliyuncs.live.model.v20161101.DescribeToutiaoLivePublishResponse;
import com.aliyuncs.live.model.v20161101.DescribeToutiaoLivePublishResponse.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeToutiaoLivePublishResponseUnmarshaller {

	public static DescribeToutiaoLivePublishResponse unmarshall(DescribeToutiaoLivePublishResponse describeToutiaoLivePublishResponse, UnmarshallerContext _ctx) {
		
		describeToutiaoLivePublishResponse.setRequestId(_ctx.stringValue("DescribeToutiaoLivePublishResponse.RequestId"));
		describeToutiaoLivePublishResponse.setDescription(_ctx.stringValue("DescribeToutiaoLivePublishResponse.Description"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeToutiaoLivePublishResponse.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setApp(_ctx.stringValue("DescribeToutiaoLivePublishResponse.Content["+ i +"].App"));
			contentItem.setBitrate(_ctx.floatValue("DescribeToutiaoLivePublishResponse.Content["+ i +"].Bitrate"));
			contentItem.setBwDiff(_ctx.floatValue("DescribeToutiaoLivePublishResponse.Content["+ i +"].BwDiff"));
			contentItem.setCdnName(_ctx.stringValue("DescribeToutiaoLivePublishResponse.Content["+ i +"].CdnName"));
			contentItem.setDomain(_ctx.stringValue("DescribeToutiaoLivePublishResponse.Content["+ i +"].Domain"));
			contentItem.setFlr(_ctx.floatValue("DescribeToutiaoLivePublishResponse.Content["+ i +"].Flr"));
			contentItem.setFps(_ctx.floatValue("DescribeToutiaoLivePublishResponse.Content["+ i +"].Fps"));
			contentItem.setStreamName(_ctx.stringValue("DescribeToutiaoLivePublishResponse.Content["+ i +"].StreamName"));
			contentItem.setTimestamp(_ctx.longValue("DescribeToutiaoLivePublishResponse.Content["+ i +"].Timestamp"));

			content.add(contentItem);
		}
		describeToutiaoLivePublishResponse.setContent(content);
	 
	 	return describeToutiaoLivePublishResponse;
	}
}