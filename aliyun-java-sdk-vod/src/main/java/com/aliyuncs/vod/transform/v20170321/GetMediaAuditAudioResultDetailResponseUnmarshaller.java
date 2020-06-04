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

import com.aliyuncs.vod.model.v20170321.GetMediaAuditAudioResultDetailResponse;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditAudioResultDetailResponse.MediaAuditAudioResultDetail;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditAudioResultDetailResponse.MediaAuditAudioResultDetail.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMediaAuditAudioResultDetailResponseUnmarshaller {

	public static GetMediaAuditAudioResultDetailResponse unmarshall(GetMediaAuditAudioResultDetailResponse getMediaAuditAudioResultDetailResponse, UnmarshallerContext _ctx) {
		
		getMediaAuditAudioResultDetailResponse.setRequestId(_ctx.stringValue("GetMediaAuditAudioResultDetailResponse.RequestId"));

		MediaAuditAudioResultDetail mediaAuditAudioResultDetail = new MediaAuditAudioResultDetail();
		mediaAuditAudioResultDetail.setTotal(_ctx.integerValue("GetMediaAuditAudioResultDetailResponse.MediaAuditAudioResultDetail.Total"));
		mediaAuditAudioResultDetail.setPageTotal(_ctx.integerValue("GetMediaAuditAudioResultDetailResponse.MediaAuditAudioResultDetail.PageTotal"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditAudioResultDetailResponse.MediaAuditAudioResultDetail.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setStartTime(_ctx.longValue("GetMediaAuditAudioResultDetailResponse.MediaAuditAudioResultDetail.List["+ i +"].StartTime"));
			listItem.setEndTime(_ctx.longValue("GetMediaAuditAudioResultDetailResponse.MediaAuditAudioResultDetail.List["+ i +"].EndTime"));
			listItem.setText(_ctx.stringValue("GetMediaAuditAudioResultDetailResponse.MediaAuditAudioResultDetail.List["+ i +"].Text"));
			listItem.setLabel(_ctx.stringValue("GetMediaAuditAudioResultDetailResponse.MediaAuditAudioResultDetail.List["+ i +"].Label"));

			list.add(listItem);
		}
		mediaAuditAudioResultDetail.setList(list);
		getMediaAuditAudioResultDetailResponse.setMediaAuditAudioResultDetail(mediaAuditAudioResultDetail);
	 
	 	return getMediaAuditAudioResultDetailResponse;
	}
}