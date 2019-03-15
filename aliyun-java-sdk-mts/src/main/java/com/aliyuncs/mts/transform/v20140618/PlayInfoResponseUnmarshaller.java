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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.PlayInfoResponse;
import com.aliyuncs.mts.model.v20140618.PlayInfoResponse.PlayInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class PlayInfoResponseUnmarshaller {

	public static PlayInfoResponse unmarshall(PlayInfoResponse playInfoResponse, UnmarshallerContext context) {
		
		playInfoResponse.setRequestId(context.stringValue("PlayInfoResponse.RequestId"));

		List<String> notFoundCDNDomain = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("PlayInfoResponse.NotFoundCDNDomain.Length"); i++) {
			notFoundCDNDomain.add(context.stringValue("PlayInfoResponse.NotFoundCDNDomain["+ i +"]"));
		}
		playInfoResponse.setNotFoundCDNDomain(notFoundCDNDomain);

		List<PlayInfo> playInfoList = new ArrayList<PlayInfo>();
		for (int i = 0; i < context.lengthValue("PlayInfoResponse.PlayInfoList.Length"); i++) {
			PlayInfo playInfo = new PlayInfo();
			playInfo.setUrl(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].Url"));
			playInfo.setDuration(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].duration"));
			playInfo.setSize(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].size"));
			playInfo.setWidth(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].width"));
			playInfo.setHeight(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].height"));
			playInfo.setBitrate(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].bitrate"));
			playInfo.setFps(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].fps"));
			playInfo.setFormat(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].format"));
			playInfo.setDefinition(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].definition"));
			playInfo.setEncryption(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].encryption"));
			playInfo.setRand(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].rand"));
			playInfo.setPlaintext(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].plaintext"));
			playInfo.setComplexity(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].complexity"));
			playInfo.setActivityName(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].activityName"));
			playInfo.setEncryptionType(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].encryptionType"));
			playInfo.setDownloadType(context.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].downloadType"));

			playInfoList.add(playInfo);
		}
		playInfoResponse.setPlayInfoList(playInfoList);
	 
	 	return playInfoResponse;
	}
}