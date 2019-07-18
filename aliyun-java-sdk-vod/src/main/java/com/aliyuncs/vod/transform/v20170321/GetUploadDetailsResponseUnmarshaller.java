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

import com.aliyuncs.vod.model.v20170321.GetUploadDetailsResponse;
import com.aliyuncs.vod.model.v20170321.GetUploadDetailsResponse.UploadDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUploadDetailsResponseUnmarshaller {

	public static GetUploadDetailsResponse unmarshall(GetUploadDetailsResponse getUploadDetailsResponse, UnmarshallerContext _ctx) {
		
		getUploadDetailsResponse.setRequestId(_ctx.stringValue("GetUploadDetailsResponse.RequestId"));

		List<String> nonExistMediaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUploadDetailsResponse.NonExistMediaIds.Length"); i++) {
			nonExistMediaIds.add(_ctx.stringValue("GetUploadDetailsResponse.NonExistMediaIds["+ i +"]"));
		}
		getUploadDetailsResponse.setNonExistMediaIds(nonExistMediaIds);

		List<String> forbiddenMediaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUploadDetailsResponse.ForbiddenMediaIds.Length"); i++) {
			forbiddenMediaIds.add(_ctx.stringValue("GetUploadDetailsResponse.ForbiddenMediaIds["+ i +"]"));
		}
		getUploadDetailsResponse.setForbiddenMediaIds(forbiddenMediaIds);

		List<UploadDetail> uploadDetails = new ArrayList<UploadDetail>();
		for (int i = 0; i < _ctx.lengthValue("GetUploadDetailsResponse.UploadDetails.Length"); i++) {
			UploadDetail uploadDetail = new UploadDetail();
			uploadDetail.setMediaId(_ctx.stringValue("GetUploadDetailsResponse.UploadDetails["+ i +"].MediaId"));
			uploadDetail.setTitle(_ctx.stringValue("GetUploadDetailsResponse.UploadDetails["+ i +"].Title"));
			uploadDetail.setFileSize(_ctx.longValue("GetUploadDetailsResponse.UploadDetails["+ i +"].FileSize"));
			uploadDetail.setStatus(_ctx.stringValue("GetUploadDetailsResponse.UploadDetails["+ i +"].Status"));
			uploadDetail.setUploadStatus(_ctx.stringValue("GetUploadDetailsResponse.UploadDetails["+ i +"].UploadStatus"));
			uploadDetail.setCreationTime(_ctx.stringValue("GetUploadDetailsResponse.UploadDetails["+ i +"].CreationTime"));
			uploadDetail.setModificationTime(_ctx.stringValue("GetUploadDetailsResponse.UploadDetails["+ i +"].ModificationTime"));
			uploadDetail.setCompletionTime(_ctx.stringValue("GetUploadDetailsResponse.UploadDetails["+ i +"].CompletionTime"));
			uploadDetail.setUploadSize(_ctx.longValue("GetUploadDetailsResponse.UploadDetails["+ i +"].UploadSize"));
			uploadDetail.setUploadRatio(_ctx.floatValue("GetUploadDetailsResponse.UploadDetails["+ i +"].UploadRatio"));
			uploadDetail.setUploadIP(_ctx.stringValue("GetUploadDetailsResponse.UploadDetails["+ i +"].UploadIP"));
			uploadDetail.setUploadSource(_ctx.stringValue("GetUploadDetailsResponse.UploadDetails["+ i +"].UploadSource"));
			uploadDetail.setDeviceModel(_ctx.stringValue("GetUploadDetailsResponse.UploadDetails["+ i +"].DeviceModel"));

			uploadDetails.add(uploadDetail);
		}
		getUploadDetailsResponse.setUploadDetails(uploadDetails);
	 
	 	return getUploadDetailsResponse;
	}
}