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

import com.aliyuncs.outboundbot.model.v20191226.ListMediaResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListMediaResponse.Media;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMediaResponseUnmarshaller {

	public static ListMediaResponse unmarshall(ListMediaResponse listMediaResponse, UnmarshallerContext _ctx) {
		
		listMediaResponse.setRequestId(_ctx.stringValue("ListMediaResponse.RequestId"));
		listMediaResponse.setCode(_ctx.stringValue("ListMediaResponse.Code"));
		listMediaResponse.setHttpStatusCode(_ctx.integerValue("ListMediaResponse.HttpStatusCode"));
		listMediaResponse.setMessage(_ctx.stringValue("ListMediaResponse.Message"));
		listMediaResponse.setPageNumber(_ctx.integerValue("ListMediaResponse.PageNumber"));
		listMediaResponse.setPageSize(_ctx.integerValue("ListMediaResponse.PageSize"));
		listMediaResponse.setSuccess(_ctx.booleanValue("ListMediaResponse.Success"));
		listMediaResponse.setTotalCount(_ctx.integerValue("ListMediaResponse.TotalCount"));

		List<Media> mediaList = new ArrayList<Media>();
		for (int i = 0; i < _ctx.lengthValue("ListMediaResponse.MediaList.Length"); i++) {
			Media media = new Media();
			media.setMediaId(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].MediaId"));
			media.setName(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].Name"));

			mediaList.add(media);
		}
		listMediaResponse.setMediaList(mediaList);
	 
	 	return listMediaResponse;
	}
}