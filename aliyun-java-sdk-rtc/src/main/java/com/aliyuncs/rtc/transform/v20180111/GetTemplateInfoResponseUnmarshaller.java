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

package com.aliyuncs.rtc.transform.v20180111;

import com.aliyuncs.rtc.model.v20180111.GetTemplateInfoResponse;
import com.aliyuncs.rtc.model.v20180111.GetTemplateInfoResponse.LayOut;
import com.aliyuncs.rtc.model.v20180111.GetTemplateInfoResponse.LiveConfig;
import com.aliyuncs.rtc.model.v20180111.GetTemplateInfoResponse.RecordConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateInfoResponseUnmarshaller {

	public static GetTemplateInfoResponse unmarshall(GetTemplateInfoResponse getTemplateInfoResponse, UnmarshallerContext _ctx) {
		
		getTemplateInfoResponse.setRequestId(_ctx.stringValue("GetTemplateInfoResponse.RequestId"));
		getTemplateInfoResponse.setMixMode(_ctx.integerValue("GetTemplateInfoResponse.MixMode"));
		getTemplateInfoResponse.setServiceMode(_ctx.integerValue("GetTemplateInfoResponse.ServiceMode"));
		getTemplateInfoResponse.setCallBack(_ctx.stringValue("GetTemplateInfoResponse.CallBack"));
		getTemplateInfoResponse.setMaxMixStreamCount(_ctx.integerValue("GetTemplateInfoResponse.MaxMixStreamCount"));
		getTemplateInfoResponse.setMediaConfig(_ctx.integerValue("GetTemplateInfoResponse.MediaConfig"));

		LayOut layOut = new LayOut();
		layOut.setColor(_ctx.stringValue("GetTemplateInfoResponse.LayOut.Color"));
		layOut.setCutmode(_ctx.integerValue("GetTemplateInfoResponse.LayOut.Cutmode"));
		layOut.setLayoutID(_ctx.integerValue("GetTemplateInfoResponse.LayOut.LayoutID"));
		getTemplateInfoResponse.setLayOut(layOut);

		RecordConfig recordConfig = new RecordConfig();
		recordConfig.setStorageType(_ctx.stringValue("GetTemplateInfoResponse.RecordConfig.StorageType"));
		recordConfig.setFileFormat(_ctx.integerValue("GetTemplateInfoResponse.RecordConfig.FileFormat"));
		recordConfig.setOssEndpoint(_ctx.stringValue("GetTemplateInfoResponse.RecordConfig.OssEndpoint"));
		recordConfig.setOssBucket(_ctx.stringValue("GetTemplateInfoResponse.RecordConfig.OssBucket"));
		recordConfig.setVodTranscodeGroupId(_ctx.integerValue("GetTemplateInfoResponse.RecordConfig.VodTranscodeGroupId"));
		getTemplateInfoResponse.setRecordConfig(recordConfig);

		LiveConfig liveConfig = new LiveConfig();
		liveConfig.setDomainName(_ctx.stringValue("GetTemplateInfoResponse.LiveConfig.DomainName"));
		liveConfig.setAppName(_ctx.stringValue("GetTemplateInfoResponse.LiveConfig.AppName"));
		getTemplateInfoResponse.setLiveConfig(liveConfig);
	 
	 	return getTemplateInfoResponse;
	}
}