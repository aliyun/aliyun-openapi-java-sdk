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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeCasterConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeCasterConfigResponse.RecordConfig;
import com.aliyuncs.live.model.v20161101.DescribeCasterConfigResponse.RecordConfig.RecordFormatItem;
import com.aliyuncs.live.model.v20161101.DescribeCasterConfigResponse.TranscodeConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterConfigResponseUnmarshaller {

	public static DescribeCasterConfigResponse unmarshall(DescribeCasterConfigResponse describeCasterConfigResponse, UnmarshallerContext _ctx) {
		
		describeCasterConfigResponse.setRequestId(_ctx.stringValue("DescribeCasterConfigResponse.RequestId"));
		describeCasterConfigResponse.setCasterId(_ctx.stringValue("DescribeCasterConfigResponse.CasterId"));
		describeCasterConfigResponse.setCasterName(_ctx.stringValue("DescribeCasterConfigResponse.CasterName"));
		describeCasterConfigResponse.setDomainName(_ctx.stringValue("DescribeCasterConfigResponse.DomainName"));
		describeCasterConfigResponse.setDelay(_ctx.floatValue("DescribeCasterConfigResponse.Delay"));
		describeCasterConfigResponse.setUrgentMaterialId(_ctx.stringValue("DescribeCasterConfigResponse.UrgentMaterialId"));
		describeCasterConfigResponse.setSideOutputUrl(_ctx.stringValue("DescribeCasterConfigResponse.SideOutputUrl"));
		describeCasterConfigResponse.setCallbackUrl(_ctx.stringValue("DescribeCasterConfigResponse.CallbackUrl"));
		describeCasterConfigResponse.setProgramName(_ctx.stringValue("DescribeCasterConfigResponse.ProgramName"));
		describeCasterConfigResponse.setProgramEffect(_ctx.integerValue("DescribeCasterConfigResponse.ProgramEffect"));
		describeCasterConfigResponse.setChannelEnable(_ctx.integerValue("DescribeCasterConfigResponse.ChannelEnable"));

		TranscodeConfig transcodeConfig = new TranscodeConfig();
		transcodeConfig.setCasterTemplate(_ctx.stringValue("DescribeCasterConfigResponse.TranscodeConfig.CasterTemplate"));

		List<String> liveTemplateIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasterConfigResponse.TranscodeConfig.LiveTemplateIds.Length"); i++) {
			liveTemplateIds.add(_ctx.stringValue("DescribeCasterConfigResponse.TranscodeConfig.LiveTemplateIds["+ i +"]"));
		}
		transcodeConfig.setLiveTemplateIds(liveTemplateIds);
		describeCasterConfigResponse.setTranscodeConfig(transcodeConfig);

		RecordConfig recordConfig = new RecordConfig();
		recordConfig.setOssEndpoint(_ctx.stringValue("DescribeCasterConfigResponse.RecordConfig.OssEndpoint"));
		recordConfig.setOssBucket(_ctx.stringValue("DescribeCasterConfigResponse.RecordConfig.OssBucket"));

		List<RecordFormatItem> recordFormat = new ArrayList<RecordFormatItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat.Length"); i++) {
			RecordFormatItem recordFormatItem = new RecordFormatItem();
			recordFormatItem.setFormat(_ctx.stringValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat["+ i +"].Format"));
			recordFormatItem.setOssObjectPrefix(_ctx.stringValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat["+ i +"].OssObjectPrefix"));
			recordFormatItem.setSliceOssObjectPrefix(_ctx.stringValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat["+ i +"].SliceOssObjectPrefix"));
			recordFormatItem.setCycleDuration(_ctx.integerValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat["+ i +"].CycleDuration"));

			recordFormat.add(recordFormatItem);
		}
		recordConfig.setRecordFormat(recordFormat);
		describeCasterConfigResponse.setRecordConfig(recordConfig);
	 
	 	return describeCasterConfigResponse;
	}
}