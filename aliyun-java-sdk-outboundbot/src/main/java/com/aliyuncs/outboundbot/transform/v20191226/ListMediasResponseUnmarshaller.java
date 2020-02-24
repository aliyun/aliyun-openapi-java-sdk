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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListMediasResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListMediasResponse.Media;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMediasResponseUnmarshaller {

	public static ListMediasResponse unmarshall(ListMediasResponse listMediasResponse, UnmarshallerContext _ctx) {
		
		listMediasResponse.setRequestId(_ctx.stringValue("ListMediasResponse.RequestId"));
		listMediasResponse.setSuccess(_ctx.booleanValue("ListMediasResponse.Success"));
		listMediasResponse.setCode(_ctx.stringValue("ListMediasResponse.Code"));
		listMediasResponse.setMessage(_ctx.stringValue("ListMediasResponse.Message"));
		listMediasResponse.setHttpStatusCode(_ctx.integerValue("ListMediasResponse.HttpStatusCode"));
		listMediasResponse.setTotalCount(_ctx.integerValue("ListMediasResponse.TotalCount"));
		listMediasResponse.setPageNumber(_ctx.integerValue("ListMediasResponse.PageNumber"));
		listMediasResponse.setPageSize(_ctx.integerValue("ListMediasResponse.PageSize"));

		List<Media> mediaList = new ArrayList<Media>();
		for (int i = 0; i < _ctx.lengthValue("ListMediasResponse.MediaList.Length"); i++) {
			Media media = new Media();
			media.setMediaId(_ctx.stringValue("ListMediasResponse.MediaList["+ i +"].MediaId"));
			media.setName(_ctx.stringValue("ListMediasResponse.MediaList["+ i +"].Name"));

			mediaList.add(media);
		}
		listMediasResponse.setMediaList(mediaList);
	 
	 	return listMediasResponse;
	}
}