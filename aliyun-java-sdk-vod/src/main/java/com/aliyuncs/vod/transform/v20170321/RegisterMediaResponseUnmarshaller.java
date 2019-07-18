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

import com.aliyuncs.vod.model.v20170321.RegisterMediaResponse;
import com.aliyuncs.vod.model.v20170321.RegisterMediaResponse.RegisteredMedia;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterMediaResponseUnmarshaller {

	public static RegisterMediaResponse unmarshall(RegisterMediaResponse registerMediaResponse, UnmarshallerContext _ctx) {
		
		registerMediaResponse.setRequestId(_ctx.stringValue("RegisterMediaResponse.RequestId"));

		List<String> failedFileURLs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RegisterMediaResponse.FailedFileURLs.Length"); i++) {
			failedFileURLs.add(_ctx.stringValue("RegisterMediaResponse.FailedFileURLs["+ i +"]"));
		}
		registerMediaResponse.setFailedFileURLs(failedFileURLs);

		List<RegisteredMedia> registeredMediaList = new ArrayList<RegisteredMedia>();
		for (int i = 0; i < _ctx.lengthValue("RegisterMediaResponse.RegisteredMediaList.Length"); i++) {
			RegisteredMedia registeredMedia = new RegisteredMedia();
			registeredMedia.setMediaId(_ctx.stringValue("RegisterMediaResponse.RegisteredMediaList["+ i +"].MediaId"));
			registeredMedia.setFileURL(_ctx.stringValue("RegisterMediaResponse.RegisteredMediaList["+ i +"].FileURL"));
			registeredMedia.setNewRegister(_ctx.booleanValue("RegisterMediaResponse.RegisteredMediaList["+ i +"].NewRegister"));

			registeredMediaList.add(registeredMedia);
		}
		registerMediaResponse.setRegisteredMediaList(registeredMediaList);
	 
	 	return registerMediaResponse;
	}
}