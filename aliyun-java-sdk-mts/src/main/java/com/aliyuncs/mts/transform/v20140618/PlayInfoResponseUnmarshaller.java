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

	public static PlayInfoResponse unmarshall(PlayInfoResponse playInfoResponse, UnmarshallerContext _ctx) {
		
		playInfoResponse.setRequestId(_ctx.stringValue("PlayInfoResponse.RequestId"));

		List<String> notFoundCDNDomain = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PlayInfoResponse.NotFoundCDNDomain.Length"); i++) {
			notFoundCDNDomain.add(_ctx.stringValue("PlayInfoResponse.NotFoundCDNDomain["+ i +"]"));
		}
		playInfoResponse.setNotFoundCDNDomain(notFoundCDNDomain);

		List<PlayInfo> playInfoList = new ArrayList<PlayInfo>();
		for (int i = 0; i < _ctx.lengthValue("PlayInfoResponse.PlayInfoList.Length"); i++) {
			PlayInfo playInfo = new PlayInfo();
			playInfo.setUrl(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].Url"));
			playInfo.setDuration(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].duration"));
			playInfo.setSize(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].size"));
			playInfo.setWidth(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].width"));
			playInfo.setHeight(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].height"));
			playInfo.setBitrate(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].bitrate"));
			playInfo.setFps(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].fps"));
			playInfo.setFormat(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].format"));
			playInfo.setDefinition(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].definition"));
			playInfo.setEncryption(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].encryption"));
			playInfo.setRand(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].rand"));
			playInfo.setPlaintext(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].plaintext"));
			playInfo.setComplexity(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].complexity"));
			playInfo.setActivityName(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].activityName"));
			playInfo.setEncryptionType(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].encryptionType"));
			playInfo.setDownloadType(_ctx.stringValue("PlayInfoResponse.PlayInfoList["+ i +"].downloadType"));

			playInfoList.add(playInfo);
		}
		playInfoResponse.setPlayInfoList(playInfoList);
	 
	 	return playInfoResponse;
	}
}