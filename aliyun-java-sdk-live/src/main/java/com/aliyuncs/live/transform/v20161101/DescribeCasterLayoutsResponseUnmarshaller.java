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

import com.aliyuncs.live.model.v20161101.DescribeCasterLayoutsResponse;
import com.aliyuncs.live.model.v20161101.DescribeCasterLayoutsResponse.Layout;
import com.aliyuncs.live.model.v20161101.DescribeCasterLayoutsResponse.Layout.AudioLayer;
import com.aliyuncs.live.model.v20161101.DescribeCasterLayoutsResponse.Layout.VideoLayer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterLayoutsResponseUnmarshaller {

	public static DescribeCasterLayoutsResponse unmarshall(DescribeCasterLayoutsResponse describeCasterLayoutsResponse, UnmarshallerContext context) {
		
		describeCasterLayoutsResponse.setRequestId(context.stringValue("DescribeCasterLayoutsResponse.RequestId"));
		describeCasterLayoutsResponse.setTotal(context.integerValue("DescribeCasterLayoutsResponse.Total"));

		List<Layout> layouts = new ArrayList<Layout>();
		for (int i = 0; i < context.lengthValue("DescribeCasterLayoutsResponse.Layouts.Length"); i++) {
			Layout layout = new Layout();
			layout.setLayoutId(context.stringValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].LayoutId"));

			List<String> blendList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].BlendList.Length"); j++) {
				blendList.add(context.stringValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].BlendList["+ j +"]"));
			}
			layout.setBlendList(blendList);

			List<String> mixList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].MixList.Length"); j++) {
				mixList.add(context.stringValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].MixList["+ j +"]"));
			}
			layout.setMixList(mixList);

			List<VideoLayer> videoLayers = new ArrayList<VideoLayer>();
			for (int j = 0; j < context.lengthValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].VideoLayers.Length"); j++) {
				VideoLayer videoLayer = new VideoLayer();
				videoLayer.setFillMode(context.stringValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].VideoLayers["+ j +"].FillMode"));
				videoLayer.setHeightNormalized(context.floatValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].VideoLayers["+ j +"].HeightNormalized"));
				videoLayer.setWidthNormalized(context.floatValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].VideoLayers["+ j +"].WidthNormalized"));
				videoLayer.setPositionRefer(context.stringValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].VideoLayers["+ j +"].PositionRefer"));
				videoLayer.setFixedDelayDuration(context.integerValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].VideoLayers["+ j +"].FixedDelayDuration"));

				List<String> positionNormalizeds = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].VideoLayers["+ j +"].PositionNormalizeds.Length"); k++) {
					positionNormalizeds.add(context.stringValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].VideoLayers["+ j +"].PositionNormalizeds["+ k +"]"));
				}
				videoLayer.setPositionNormalizeds(positionNormalizeds);

				videoLayers.add(videoLayer);
			}
			layout.setVideoLayers(videoLayers);

			List<AudioLayer> audioLayers = new ArrayList<AudioLayer>();
			for (int j = 0; j < context.lengthValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].AudioLayers.Length"); j++) {
				AudioLayer audioLayer = new AudioLayer();
				audioLayer.setVolumeRate(context.floatValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].AudioLayers["+ j +"].VolumeRate"));
				audioLayer.setValidChannel(context.stringValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].AudioLayers["+ j +"].ValidChannel"));
				audioLayer.setFixedDelayDuration(context.integerValue("DescribeCasterLayoutsResponse.Layouts["+ i +"].AudioLayers["+ j +"].FixedDelayDuration"));

				audioLayers.add(audioLayer);
			}
			layout.setAudioLayers(audioLayers);

			layouts.add(layout);
		}
		describeCasterLayoutsResponse.setLayouts(layouts);
	 
	 	return describeCasterLayoutsResponse;
	}
}