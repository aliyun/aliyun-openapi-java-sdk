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

	public static DescribeCasterConfigResponse unmarshall(DescribeCasterConfigResponse describeCasterConfigResponse, UnmarshallerContext context) {
		
		describeCasterConfigResponse.setRequestId(context.stringValue("DescribeCasterConfigResponse.RequestId"));
		describeCasterConfigResponse.setCasterId(context.stringValue("DescribeCasterConfigResponse.CasterId"));
		describeCasterConfigResponse.setCasterName(context.stringValue("DescribeCasterConfigResponse.CasterName"));
		describeCasterConfigResponse.setDomainName(context.stringValue("DescribeCasterConfigResponse.DomainName"));
		describeCasterConfigResponse.setDelay(context.floatValue("DescribeCasterConfigResponse.Delay"));
		describeCasterConfigResponse.setUrgentMaterialId(context.stringValue("DescribeCasterConfigResponse.UrgentMaterialId"));
		describeCasterConfigResponse.setSideOutputUrl(context.stringValue("DescribeCasterConfigResponse.SideOutputUrl"));
		describeCasterConfigResponse.setCallbackUrl(context.stringValue("DescribeCasterConfigResponse.CallbackUrl"));
		describeCasterConfigResponse.setProgramName(context.stringValue("DescribeCasterConfigResponse.ProgramName"));
		describeCasterConfigResponse.setProgramEffect(context.integerValue("DescribeCasterConfigResponse.ProgramEffect"));

		TranscodeConfig transcodeConfig = new TranscodeConfig();
		transcodeConfig.setCasterTemplate(context.stringValue("DescribeCasterConfigResponse.TranscodeConfig.CasterTemplate"));

		List<String> liveTemplateIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeCasterConfigResponse.TranscodeConfig.LiveTemplateIds.Length"); i++) {
			liveTemplateIds.add(context.stringValue("DescribeCasterConfigResponse.TranscodeConfig.LiveTemplateIds["+ i +"]"));
		}
		transcodeConfig.setLiveTemplateIds(liveTemplateIds);
		describeCasterConfigResponse.setTranscodeConfig(transcodeConfig);

		RecordConfig recordConfig = new RecordConfig();
		recordConfig.setOssEndpoint(context.stringValue("DescribeCasterConfigResponse.RecordConfig.OssEndpoint"));
		recordConfig.setOssBucket(context.stringValue("DescribeCasterConfigResponse.RecordConfig.OssBucket"));

		List<RecordFormatItem> recordFormat = new ArrayList<RecordFormatItem>();
		for (int i = 0; i < context.lengthValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat.Length"); i++) {
			RecordFormatItem recordFormatItem = new RecordFormatItem();
			recordFormatItem.setFormat(context.stringValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat["+ i +"].Format"));
			recordFormatItem.setOssObjectPrefix(context.stringValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat["+ i +"].OssObjectPrefix"));
			recordFormatItem.setSliceOssObjectPrefix(context.stringValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat["+ i +"].SliceOssObjectPrefix"));
			recordFormatItem.setCycleDuration(context.integerValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat["+ i +"].CycleDuration"));

			recordFormat.add(recordFormatItem);
		}
		recordConfig.setRecordFormat(recordFormat);
		describeCasterConfigResponse.setRecordConfig(recordConfig);
	 
	 	return describeCasterConfigResponse;
	}
}