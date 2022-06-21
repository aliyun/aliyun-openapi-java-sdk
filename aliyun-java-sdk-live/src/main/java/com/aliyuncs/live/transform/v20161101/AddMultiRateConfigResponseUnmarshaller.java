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

import com.aliyuncs.live.model.v20161101.AddMultiRateConfigResponse;
import com.aliyuncs.live.model.v20161101.AddMultiRateConfigResponse.FailedTemplates;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMultiRateConfigResponseUnmarshaller {

	public static AddMultiRateConfigResponse unmarshall(AddMultiRateConfigResponse addMultiRateConfigResponse, UnmarshallerContext _ctx) {
		
		addMultiRateConfigResponse.setRequestId(_ctx.stringValue("AddMultiRateConfigResponse.RequestId"));
		addMultiRateConfigResponse.setMessage(_ctx.stringValue("AddMultiRateConfigResponse.Message"));
		addMultiRateConfigResponse.setCode(_ctx.integerValue("AddMultiRateConfigResponse.Code"));

		List<FailedTemplates> body = new ArrayList<FailedTemplates>();
		for (int i = 0; i < _ctx.lengthValue("AddMultiRateConfigResponse.Body.Length"); i++) {
			FailedTemplates failedTemplates = new FailedTemplates();
			failedTemplates.setTemplate(_ctx.stringValue("AddMultiRateConfigResponse.Body["+ i +"].Template"));
			failedTemplates.setTemplateType(_ctx.stringValue("AddMultiRateConfigResponse.Body["+ i +"].TemplateType"));
			failedTemplates.setHeight(_ctx.integerValue("AddMultiRateConfigResponse.Body["+ i +"].Height"));
			failedTemplates.setWidth(_ctx.integerValue("AddMultiRateConfigResponse.Body["+ i +"].Width"));
			failedTemplates.setFps(_ctx.integerValue("AddMultiRateConfigResponse.Body["+ i +"].Fps"));
			failedTemplates.setGop(_ctx.stringValue("AddMultiRateConfigResponse.Body["+ i +"].Gop"));
			failedTemplates.setVideoBitrate(_ctx.integerValue("AddMultiRateConfigResponse.Body["+ i +"].VideoBitrate"));
			failedTemplates.setProfile(_ctx.integerValue("AddMultiRateConfigResponse.Body["+ i +"].Profile"));
			failedTemplates.setAudioProfile(_ctx.stringValue("AddMultiRateConfigResponse.Body["+ i +"].AudioProfile"));
			failedTemplates.setAudioCodec(_ctx.stringValue("AddMultiRateConfigResponse.Body["+ i +"].AudioCodec"));
			failedTemplates.setAudioRate(_ctx.integerValue("AddMultiRateConfigResponse.Body["+ i +"].AudioRate"));
			failedTemplates.setAudioBitrate(_ctx.integerValue("AddMultiRateConfigResponse.Body["+ i +"].AudioBitrate"));
			failedTemplates.setAudioChannelNum(_ctx.integerValue("AddMultiRateConfigResponse.Body["+ i +"].AudioChannelNum"));
			failedTemplates.setBandWidth(_ctx.integerValue("AddMultiRateConfigResponse.Body["+ i +"].BandWidth"));

			body.add(failedTemplates);
		}
		addMultiRateConfigResponse.setBody(body);
	 
	 	return addMultiRateConfigResponse;
	}
}