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

import com.aliyuncs.live.model.v20161101.DescribeLiveAISubtitleResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveAISubtitleResponse.SubtitleConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveAISubtitleResponseUnmarshaller {

	public static DescribeLiveAISubtitleResponse unmarshall(DescribeLiveAISubtitleResponse describeLiveAISubtitleResponse, UnmarshallerContext _ctx) {
		
		describeLiveAISubtitleResponse.setRequestId(_ctx.stringValue("DescribeLiveAISubtitleResponse.RequestId"));

		List<SubtitleConfig> subtitleConfigs = new ArrayList<SubtitleConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveAISubtitleResponse.SubtitleConfigs.Length"); i++) {
			SubtitleConfig subtitleConfig = new SubtitleConfig();
			subtitleConfig.setDstLanguage(_ctx.stringValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].DstLanguage"));
			subtitleConfig.setSrcLanguage(_ctx.stringValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].SrcLanguage"));
			subtitleConfig.setFontColor(_ctx.stringValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].FontColor"));
			subtitleConfig.setFontName(_ctx.stringValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].FontName"));
			subtitleConfig.setShowSourceLan(_ctx.integerValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].ShowSourceLan"));
			subtitleConfig.setMaxLines(_ctx.integerValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].MaxLines"));
			subtitleConfig.setWordPerline(_ctx.integerValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].WordPerline"));
			subtitleConfig.setBgColor(_ctx.stringValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].BgColor"));
			subtitleConfig.setBgWidthNormalized(_ctx.floatValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].BgWidthNormalized"));
			subtitleConfig.setBorderWidthNormalized(_ctx.floatValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].BorderWidthNormalized"));
			subtitleConfig.setWidth(_ctx.stringValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].Width"));
			subtitleConfig.setHeight(_ctx.stringValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].Height"));
			subtitleConfig.setSubtitleName(_ctx.stringValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].SubtitleName"));
			subtitleConfig.setSubtitleId(_ctx.stringValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].SubtitleId"));
			subtitleConfig.setFontSizeNormalized(_ctx.stringValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].FontSizeNormalized"));
			subtitleConfig.setDescription(_ctx.stringValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].Description"));

			List<Float> positionNormalized = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].PositionNormalized.Length"); j++) {
				positionNormalized.add(_ctx.floatValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].PositionNormalized["+ j +"]"));
			}
			subtitleConfig.setPositionNormalized(positionNormalized);

			List<String> rulesRefer = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].RulesRefer.Length"); j++) {
				rulesRefer.add(_ctx.stringValue("DescribeLiveAISubtitleResponse.SubtitleConfigs["+ i +"].RulesRefer["+ j +"]"));
			}
			subtitleConfig.setRulesRefer(rulesRefer);

			subtitleConfigs.add(subtitleConfig);
		}
		describeLiveAISubtitleResponse.setSubtitleConfigs(subtitleConfigs);
	 
	 	return describeLiveAISubtitleResponse;
	}
}