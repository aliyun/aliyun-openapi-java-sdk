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

import com.aliyuncs.live.model.v20161101.DescribeToutiaoLivePlayResponse;
import com.aliyuncs.live.model.v20161101.DescribeToutiaoLivePlayResponse.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeToutiaoLivePlayResponseUnmarshaller {

	public static DescribeToutiaoLivePlayResponse unmarshall(DescribeToutiaoLivePlayResponse describeToutiaoLivePlayResponse, UnmarshallerContext _ctx) {
		
		describeToutiaoLivePlayResponse.setRequestId(_ctx.stringValue("DescribeToutiaoLivePlayResponse.RequestId"));
		describeToutiaoLivePlayResponse.setDescription(_ctx.stringValue("DescribeToutiaoLivePlayResponse.Description"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeToutiaoLivePlayResponse.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setApp(_ctx.stringValue("DescribeToutiaoLivePlayResponse.Content["+ i +"].App"));
			contentItem.setBandwidth(_ctx.floatValue("DescribeToutiaoLivePlayResponse.Content["+ i +"].Bandwidth"));
			contentItem.setCdnName(_ctx.stringValue("DescribeToutiaoLivePlayResponse.Content["+ i +"].CdnName"));
			contentItem.setDomain(_ctx.stringValue("DescribeToutiaoLivePlayResponse.Content["+ i +"].Domain"));
			contentItem.setPlayNum(_ctx.longValue("DescribeToutiaoLivePlayResponse.Content["+ i +"].PlayNum"));
			contentItem.setStreamName(_ctx.stringValue("DescribeToutiaoLivePlayResponse.Content["+ i +"].StreamName"));
			contentItem.setTimestamp(_ctx.longValue("DescribeToutiaoLivePlayResponse.Content["+ i +"].Timestamp"));

			content.add(contentItem);
		}
		describeToutiaoLivePlayResponse.setContent(content);
	 
	 	return describeToutiaoLivePlayResponse;
	}
}