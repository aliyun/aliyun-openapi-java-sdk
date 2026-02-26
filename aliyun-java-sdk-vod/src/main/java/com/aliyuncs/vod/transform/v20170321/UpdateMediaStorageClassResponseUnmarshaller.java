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

import com.aliyuncs.vod.model.v20170321.UpdateMediaStorageClassResponse;
import com.aliyuncs.vod.model.v20170321.UpdateMediaStorageClassResponse.MediaForbiddenReasonDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMediaStorageClassResponseUnmarshaller {

	public static UpdateMediaStorageClassResponse unmarshall(UpdateMediaStorageClassResponse updateMediaStorageClassResponse, UnmarshallerContext _ctx) {
		
		updateMediaStorageClassResponse.setRequestId(_ctx.stringValue("UpdateMediaStorageClassResponse.RequestId"));
		updateMediaStorageClassResponse.setStatus(_ctx.stringValue("UpdateMediaStorageClassResponse.Status"));

		List<String> ignoredList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateMediaStorageClassResponse.IgnoredList.Length"); i++) {
			ignoredList.add(_ctx.stringValue("UpdateMediaStorageClassResponse.IgnoredList["+ i +"]"));
		}
		updateMediaStorageClassResponse.setIgnoredList(ignoredList);

		List<MediaForbiddenReasonDTO> forbiddenList = new ArrayList<MediaForbiddenReasonDTO>();
		for (int i = 0; i < _ctx.lengthValue("UpdateMediaStorageClassResponse.ForbiddenList.Length"); i++) {
			MediaForbiddenReasonDTO mediaForbiddenReasonDTO = new MediaForbiddenReasonDTO();
			mediaForbiddenReasonDTO.setMediaId(_ctx.stringValue("UpdateMediaStorageClassResponse.ForbiddenList["+ i +"].MediaId"));
			mediaForbiddenReasonDTO.setReason(_ctx.stringValue("UpdateMediaStorageClassResponse.ForbiddenList["+ i +"].Reason"));

			forbiddenList.add(mediaForbiddenReasonDTO);
		}
		updateMediaStorageClassResponse.setForbiddenList(forbiddenList);
	 
	 	return updateMediaStorageClassResponse;
	}
}