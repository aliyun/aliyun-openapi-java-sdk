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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultDetailResponse;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultDetailResponse.MediaAuditResultDetail;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultDetailResponse.MediaAuditResultDetail.ListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMediaAuditResultDetailResponseUnmarshaller {

	public static GetMediaAuditResultDetailResponse unmarshall(GetMediaAuditResultDetailResponse getMediaAuditResultDetailResponse, UnmarshallerContext context) {
		
		getMediaAuditResultDetailResponse.setRequestId(context.stringValue("GetMediaAuditResultDetailResponse.RequestId"));

		MediaAuditResultDetail mediaAuditResultDetail = new MediaAuditResultDetail();
		mediaAuditResultDetail.setTotal(context.integerValue("GetMediaAuditResultDetailResponse.MediaAuditResultDetail.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < context.lengthValue("GetMediaAuditResultDetailResponse.MediaAuditResultDetail.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setPornLabel(context.stringValue("GetMediaAuditResultDetailResponse.MediaAuditResultDetail.List["+ i +"].PornLabel"));
			listItem.setPornScore(context.stringValue("GetMediaAuditResultDetailResponse.MediaAuditResultDetail.List["+ i +"].PornScore"));
			listItem.setTerrorismLabel(context.stringValue("GetMediaAuditResultDetailResponse.MediaAuditResultDetail.List["+ i +"].TerrorismLabel"));
			listItem.setTerrorismScore(context.stringValue("GetMediaAuditResultDetailResponse.MediaAuditResultDetail.List["+ i +"].TerrorismScore"));
			listItem.setTimestamp(context.stringValue("GetMediaAuditResultDetailResponse.MediaAuditResultDetail.List["+ i +"].Timestamp"));
			listItem.setUrl(context.stringValue("GetMediaAuditResultDetailResponse.MediaAuditResultDetail.List["+ i +"].Url"));

			list.add(listItem);
		}
		mediaAuditResultDetail.setList(list);
		getMediaAuditResultDetailResponse.setMediaAuditResultDetail(mediaAuditResultDetail);
	 
	 	return getMediaAuditResultDetailResponse;
	}
}