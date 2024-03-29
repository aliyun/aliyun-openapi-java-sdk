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

import com.aliyuncs.live.model.v20161101.GetMultiRateConfigResponse;
import com.aliyuncs.live.model.v20161101.GetMultiRateConfigResponse.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMultiRateConfigResponseUnmarshaller {

	public static GetMultiRateConfigResponse unmarshall(GetMultiRateConfigResponse getMultiRateConfigResponse, UnmarshallerContext _ctx) {
		
		getMultiRateConfigResponse.setRequestId(_ctx.stringValue("GetMultiRateConfigResponse.RequestId"));
		getMultiRateConfigResponse.setDomain(_ctx.stringValue("GetMultiRateConfigResponse.Domain"));
		getMultiRateConfigResponse.setGroupId(_ctx.stringValue("GetMultiRateConfigResponse.GroupId"));
		getMultiRateConfigResponse.setApp(_ctx.stringValue("GetMultiRateConfigResponse.App"));
		getMultiRateConfigResponse.setAvFormat(_ctx.stringValue("GetMultiRateConfigResponse.AvFormat"));
		getMultiRateConfigResponse.setStream(_ctx.stringValue("GetMultiRateConfigResponse.Stream"));
		getMultiRateConfigResponse.setCode(_ctx.integerValue("GetMultiRateConfigResponse.Code"));
		getMultiRateConfigResponse.setMessage(_ctx.stringValue("GetMultiRateConfigResponse.Message"));
		getMultiRateConfigResponse.setIsLazy(_ctx.stringValue("GetMultiRateConfigResponse.IsLazy"));
		getMultiRateConfigResponse.setIsTimeAlign(_ctx.stringValue("GetMultiRateConfigResponse.IsTimeAlign"));

		List<Detail> templatesInfo = new ArrayList<Detail>();
		for (int i = 0; i < _ctx.lengthValue("GetMultiRateConfigResponse.TemplatesInfo.Length"); i++) {
			Detail detail = new Detail();
			detail.setAudioBitrate(_ctx.integerValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].AudioBitrate"));
			detail.setTemplate(_ctx.stringValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].Template"));
			detail.setHeight(_ctx.integerValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].Height"));
			detail.setTemplateType(_ctx.stringValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].TemplateType"));
			detail.setBandWidth(_ctx.integerValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].BandWidth"));
			detail.setProfile(_ctx.integerValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].Profile"));
			detail.setAudioRate(_ctx.integerValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].AudioRate"));
			detail.setAudioCodec(_ctx.stringValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].AudioCodec"));
			detail.setGop(_ctx.stringValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].Gop"));
			detail.setWidth(_ctx.integerValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].Width"));
			detail.setVideoBitrate(_ctx.integerValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].VideoBitrate"));
			detail.setAudioChannelNum(_ctx.integerValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].AudioChannelNum"));
			detail.setFps(_ctx.integerValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].Fps"));
			detail.setAudioProfile(_ctx.stringValue("GetMultiRateConfigResponse.TemplatesInfo["+ i +"].AudioProfile"));

			templatesInfo.add(detail);
		}
		getMultiRateConfigResponse.setTemplatesInfo(templatesInfo);
	 
	 	return getMultiRateConfigResponse;
	}
}