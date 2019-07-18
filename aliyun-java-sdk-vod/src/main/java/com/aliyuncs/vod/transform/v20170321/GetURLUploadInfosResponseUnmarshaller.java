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

import com.aliyuncs.vod.model.v20170321.GetURLUploadInfosResponse;
import com.aliyuncs.vod.model.v20170321.GetURLUploadInfosResponse.UrlUploadJobInfoDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetURLUploadInfosResponseUnmarshaller {

	public static GetURLUploadInfosResponse unmarshall(GetURLUploadInfosResponse getURLUploadInfosResponse, UnmarshallerContext _ctx) {
		
		getURLUploadInfosResponse.setRequestId(_ctx.stringValue("GetURLUploadInfosResponse.RequestId"));

		List<String> nonExists = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetURLUploadInfosResponse.NonExists.Length"); i++) {
			nonExists.add(_ctx.stringValue("GetURLUploadInfosResponse.NonExists["+ i +"]"));
		}
		getURLUploadInfosResponse.setNonExists(nonExists);

		List<UrlUploadJobInfoDTO> uRLUploadInfoList = new ArrayList<UrlUploadJobInfoDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetURLUploadInfosResponse.URLUploadInfoList.Length"); i++) {
			UrlUploadJobInfoDTO urlUploadJobInfoDTO = new UrlUploadJobInfoDTO();
			urlUploadJobInfoDTO.setJobId(_ctx.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].JobId"));
			urlUploadJobInfoDTO.setUploadURL(_ctx.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].UploadURL"));
			urlUploadJobInfoDTO.setMediaId(_ctx.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].MediaId"));
			urlUploadJobInfoDTO.setFileSize(_ctx.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].FileSize"));
			urlUploadJobInfoDTO.setStatus(_ctx.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].Status"));
			urlUploadJobInfoDTO.setUserData(_ctx.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].UserData"));
			urlUploadJobInfoDTO.setErrorCode(_ctx.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].ErrorCode"));
			urlUploadJobInfoDTO.setErrorMessage(_ctx.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].ErrorMessage"));
			urlUploadJobInfoDTO.setCreationTime(_ctx.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].CreationTime"));
			urlUploadJobInfoDTO.setCompleteTime(_ctx.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].CompleteTime"));

			uRLUploadInfoList.add(urlUploadJobInfoDTO);
		}
		getURLUploadInfosResponse.setURLUploadInfoList(uRLUploadInfoList);
	 
	 	return getURLUploadInfosResponse;
	}
}