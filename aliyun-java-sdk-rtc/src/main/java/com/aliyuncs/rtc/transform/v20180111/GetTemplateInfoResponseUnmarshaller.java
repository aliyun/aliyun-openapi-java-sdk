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

	public static GetTemplateInfoResponse unmarshall(GetTemplateInfoResponse getTemplateInfoResponse, UnmarshallerContext context) {
		
		getTemplateInfoResponse.setRequestId(context.stringValue("GetTemplateInfoResponse.RequestId"));
		getTemplateInfoResponse.setMixMode(context.integerValue("GetTemplateInfoResponse.MixMode"));
		getTemplateInfoResponse.setServiceMode(context.integerValue("GetTemplateInfoResponse.ServiceMode"));
		getTemplateInfoResponse.setCallBack(context.stringValue("GetTemplateInfoResponse.CallBack"));
		getTemplateInfoResponse.setMaxMixStreamCount(context.integerValue("GetTemplateInfoResponse.MaxMixStreamCount"));
		getTemplateInfoResponse.setMediaConfig(context.integerValue("GetTemplateInfoResponse.MediaConfig"));

		LayOut layOut = new LayOut();
		layOut.setColor(context.stringValue("GetTemplateInfoResponse.LayOut.Color"));
		layOut.setCutmode(context.integerValue("GetTemplateInfoResponse.LayOut.Cutmode"));
		layOut.setLayoutID(context.integerValue("GetTemplateInfoResponse.LayOut.LayoutID"));
		getTemplateInfoResponse.setLayOut(layOut);

		RecordConfig recordConfig = new RecordConfig();
		recordConfig.setStorageType(context.stringValue("GetTemplateInfoResponse.RecordConfig.StorageType"));
		recordConfig.setFileFormat(context.integerValue("GetTemplateInfoResponse.RecordConfig.FileFormat"));
		recordConfig.setOssEndpoint(context.stringValue("GetTemplateInfoResponse.RecordConfig.OssEndpoint"));
		recordConfig.setOssBucket(context.stringValue("GetTemplateInfoResponse.RecordConfig.OssBucket"));
		recordConfig.setVodTranscodeGroupId(context.integerValue("GetTemplateInfoResponse.RecordConfig.VodTranscodeGroupId"));
		getTemplateInfoResponse.setRecordConfig(recordConfig);

		LiveConfig liveConfig = new LiveConfig();
		liveConfig.setDomainName(context.stringValue("GetTemplateInfoResponse.LiveConfig.DomainName"));
		liveConfig.setAppName(context.stringValue("GetTemplateInfoResponse.LiveConfig.AppName"));
		getTemplateInfoResponse.setLiveConfig(liveConfig);
	 
	 	return getTemplateInfoResponse;
	}
}