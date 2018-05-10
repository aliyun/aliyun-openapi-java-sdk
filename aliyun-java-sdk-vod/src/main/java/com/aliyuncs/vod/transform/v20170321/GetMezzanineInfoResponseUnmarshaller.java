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

import com.aliyuncs.vod.model.v20170321.GetMezzanineInfoResponse;
import com.aliyuncs.vod.model.v20170321.GetMezzanineInfoResponse.Mezzanine;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMezzanineInfoResponseUnmarshaller {

	public static GetMezzanineInfoResponse unmarshall(GetMezzanineInfoResponse getMezzanineInfoResponse, UnmarshallerContext context) {
		
		getMezzanineInfoResponse.setRequestId(context.stringValue("GetMezzanineInfoResponse.RequestId"));

		Mezzanine mezzanine = new Mezzanine();
		mezzanine.setVideoId(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoId"));
		mezzanine.setBitrate(context.stringValue("GetMezzanineInfoResponse.Mezzanine.Bitrate"));
		mezzanine.setCreationTime(context.stringValue("GetMezzanineInfoResponse.Mezzanine.CreationTime"));
		mezzanine.setDuration(context.stringValue("GetMezzanineInfoResponse.Mezzanine.Duration"));
		mezzanine.setFps(context.stringValue("GetMezzanineInfoResponse.Mezzanine.Fps"));
		mezzanine.setHeight(context.longValue("GetMezzanineInfoResponse.Mezzanine.Height"));
		mezzanine.setWidth(context.longValue("GetMezzanineInfoResponse.Mezzanine.Width"));
		mezzanine.setSize(context.longValue("GetMezzanineInfoResponse.Mezzanine.Size"));
		mezzanine.setStatus(context.stringValue("GetMezzanineInfoResponse.Mezzanine.Status"));
		mezzanine.setFileURL(context.stringValue("GetMezzanineInfoResponse.Mezzanine.FileURL"));
		mezzanine.setFileName(context.stringValue("GetMezzanineInfoResponse.Mezzanine.FileName"));
		mezzanine.setCRC64(context.stringValue("GetMezzanineInfoResponse.Mezzanine.CRC64"));
		mezzanine.setPreprocessStatus(context.stringValue("GetMezzanineInfoResponse.Mezzanine.PreprocessStatus"));
		getMezzanineInfoResponse.setMezzanine(mezzanine);
	 
	 	return getMezzanineInfoResponse;
	}
}