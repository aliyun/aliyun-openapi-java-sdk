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

	public static GetURLUploadInfosResponse unmarshall(GetURLUploadInfosResponse getURLUploadInfosResponse, UnmarshallerContext context) {
		
		getURLUploadInfosResponse.setRequestId(context.stringValue("GetURLUploadInfosResponse.RequestId"));

		List<String> nonExists = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetURLUploadInfosResponse.NonExists.Length"); i++) {
			nonExists.add(context.stringValue("GetURLUploadInfosResponse.NonExists["+ i +"]"));
		}
		getURLUploadInfosResponse.setNonExists(nonExists);

		List<UrlUploadJobInfoDTO> uRLUploadInfoList = new ArrayList<UrlUploadJobInfoDTO>();
		for (int i = 0; i < context.lengthValue("GetURLUploadInfosResponse.URLUploadInfoList.Length"); i++) {
			UrlUploadJobInfoDTO urlUploadJobInfoDTO = new UrlUploadJobInfoDTO();
			urlUploadJobInfoDTO.setJobId(context.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].JobId"));
			urlUploadJobInfoDTO.setUploadURL(context.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].UploadURL"));
			urlUploadJobInfoDTO.setMediaId(context.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].MediaId"));
			urlUploadJobInfoDTO.setFileSize(context.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].FileSize"));
			urlUploadJobInfoDTO.setStatus(context.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].Status"));
			urlUploadJobInfoDTO.setUserData(context.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].UserData"));
			urlUploadJobInfoDTO.setErrorCode(context.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].ErrorCode"));
			urlUploadJobInfoDTO.setErrorMessage(context.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].ErrorMessage"));
			urlUploadJobInfoDTO.setCreationTime(context.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].CreationTime"));
			urlUploadJobInfoDTO.setCompleteTime(context.stringValue("GetURLUploadInfosResponse.URLUploadInfoList["+ i +"].CompleteTime"));

			uRLUploadInfoList.add(urlUploadJobInfoDTO);
		}
		getURLUploadInfosResponse.setURLUploadInfoList(uRLUploadInfoList);
	 
	 	return getURLUploadInfosResponse;
	}
}