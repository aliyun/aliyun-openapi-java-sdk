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

import com.aliyuncs.live.model.v20161101.DescribeLiveAIStudioResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveAIStudioResponse.SubtitleConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveAIStudioResponseUnmarshaller {

	public static DescribeLiveAIStudioResponse unmarshall(DescribeLiveAIStudioResponse describeLiveAIStudioResponse, UnmarshallerContext _ctx) {
		
		describeLiveAIStudioResponse.setRequestId(_ctx.stringValue("DescribeLiveAIStudioResponse.RequestId"));
		describeLiveAIStudioResponse.setTotal(_ctx.integerValue("DescribeLiveAIStudioResponse.Total"));
		describeLiveAIStudioResponse.setPageNumber(_ctx.integerValue("DescribeLiveAIStudioResponse.PageNumber"));
		describeLiveAIStudioResponse.setPageSize(_ctx.integerValue("DescribeLiveAIStudioResponse.PageSize"));

		List<SubtitleConfig> studioConfigs = new ArrayList<SubtitleConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveAIStudioResponse.StudioConfigs.Length"); i++) {
			SubtitleConfig subtitleConfig = new SubtitleConfig();
			subtitleConfig.setMediaType(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].MediaType"));
			subtitleConfig.setMediaLayout(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].MediaLayout"));
			subtitleConfig.setMediaResourceUrl(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].MediaResourceUrl"));
			subtitleConfig.setMediaResourceId(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].MediaResourceId"));
			subtitleConfig.setBackgroundType(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].BackgroundType"));
			subtitleConfig.setBackgroundResourceUrl(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].BackgroundResourceUrl"));
			subtitleConfig.setBackgroundResourceId(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].BackgroundResourceId"));
			subtitleConfig.setDescription(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].Description"));
			subtitleConfig.setTemplateId(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].TemplateId"));
			subtitleConfig.setTemplateName(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].TemplateName"));
			subtitleConfig.setMattingLayout(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].MattingLayout"));
			subtitleConfig.setMattingType(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].MattingType"));
			subtitleConfig.setHeight(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].Height"));
			subtitleConfig.setWidth(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].Width"));

			List<String> ruleIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.stringValue("DescribeLiveAIStudioResponse.StudioConfigs["+ i +"].RuleIds["+ j +"]"));
			}
			subtitleConfig.setRuleIds(ruleIds);

			studioConfigs.add(subtitleConfig);
		}
		describeLiveAIStudioResponse.setStudioConfigs(studioConfigs);
	 
	 	return describeLiveAIStudioResponse;
	}
}