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

import com.aliyuncs.live.model.v20161101.DescribeStudioLayoutsResponse;
import com.aliyuncs.live.model.v20161101.DescribeStudioLayoutsResponse.StudioLayout;
import com.aliyuncs.live.model.v20161101.DescribeStudioLayoutsResponse.StudioLayout.BgImageConfig;
import com.aliyuncs.live.model.v20161101.DescribeStudioLayoutsResponse.StudioLayout.CommonConfig;
import com.aliyuncs.live.model.v20161101.DescribeStudioLayoutsResponse.StudioLayout.LayerOrderConfig;
import com.aliyuncs.live.model.v20161101.DescribeStudioLayoutsResponse.StudioLayout.MediaInputConfig;
import com.aliyuncs.live.model.v20161101.DescribeStudioLayoutsResponse.StudioLayout.ScreenInputConfig;
import com.aliyuncs.live.model.v20161101.DescribeStudioLayoutsResponse.StudioLayout.ScreenInputConfig.AudioConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStudioLayoutsResponseUnmarshaller {

	public static DescribeStudioLayoutsResponse unmarshall(DescribeStudioLayoutsResponse describeStudioLayoutsResponse, UnmarshallerContext _ctx) {
		
		describeStudioLayoutsResponse.setRequestId(_ctx.stringValue("DescribeStudioLayoutsResponse.RequestId"));
		describeStudioLayoutsResponse.setTotal(_ctx.integerValue("DescribeStudioLayoutsResponse.Total"));

		List<StudioLayout> studioLayouts = new ArrayList<StudioLayout>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStudioLayoutsResponse.StudioLayouts.Length"); i++) {
			StudioLayout studioLayout = new StudioLayout();
			studioLayout.setLayoutType(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].LayoutType"));
			studioLayout.setLayoutId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].LayoutId"));
			studioLayout.setLayoutName(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].LayoutName"));

			CommonConfig commonConfig = new CommonConfig();
			commonConfig.setChannelId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].CommonConfig.ChannelId"));
			commonConfig.setVideoResourceId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].CommonConfig.VideoResourceId"));
			studioLayout.setCommonConfig(commonConfig);

			BgImageConfig bgImageConfig = new BgImageConfig();
			bgImageConfig.setMaterialId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].BgImageConfig.MaterialId"));
			bgImageConfig.setImageUrl(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].BgImageConfig.ImageUrl"));
			bgImageConfig.setId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].BgImageConfig.Id"));
			bgImageConfig.setLocationId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].BgImageConfig.LocationId"));
			studioLayout.setBgImageConfig(bgImageConfig);

			List<ScreenInputConfig> screenInputConfigList = new ArrayList<ScreenInputConfig>();
			for (int j = 0; j < _ctx.lengthValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].ScreenInputConfigList.Length"); j++) {
				ScreenInputConfig screenInputConfig = new ScreenInputConfig();
				screenInputConfig.setPortraitType(_ctx.integerValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].ScreenInputConfigList["+ j +"].PortraitType"));
				screenInputConfig.setIndex(_ctx.integerValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].ScreenInputConfigList["+ j +"].Index"));
				screenInputConfig.setPositionX(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].ScreenInputConfigList["+ j +"].PositionX"));
				screenInputConfig.setColor(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].ScreenInputConfigList["+ j +"].Color"));
				screenInputConfig.setOnlyAudio(_ctx.booleanValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].ScreenInputConfigList["+ j +"].OnlyAudio"));
				screenInputConfig.setHeightNormalized(_ctx.floatValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].ScreenInputConfigList["+ j +"].HeightNormalized"));
				screenInputConfig.setPositionY(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].ScreenInputConfigList["+ j +"].PositionY"));
				screenInputConfig.setChannelId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].ScreenInputConfigList["+ j +"].ChannelId"));
				screenInputConfig.setVideoResourceId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].ScreenInputConfigList["+ j +"].VideoResourceId"));
				screenInputConfig.setId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].ScreenInputConfigList["+ j +"].Id"));

				AudioConfig audioConfig = new AudioConfig();
				audioConfig.setVolumeRate(_ctx.floatValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].ScreenInputConfigList["+ j +"].AudioConfig.VolumeRate"));
				audioConfig.setValidChannel(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].ScreenInputConfigList["+ j +"].AudioConfig.ValidChannel"));
				screenInputConfig.setAudioConfig(audioConfig);

				screenInputConfigList.add(screenInputConfig);
			}
			studioLayout.setScreenInputConfigList(screenInputConfigList);

			List<MediaInputConfig> mediaInputConfigList = new ArrayList<MediaInputConfig>();
			for (int j = 0; j < _ctx.lengthValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].MediaInputConfigList.Length"); j++) {
				MediaInputConfig mediaInputConfig = new MediaInputConfig();
				mediaInputConfig.setIndex(_ctx.integerValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].MediaInputConfigList["+ j +"].Index"));
				mediaInputConfig.setHeightNormalized(_ctx.floatValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].MediaInputConfigList["+ j +"].HeightNormalized"));
				mediaInputConfig.setFillMode(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].MediaInputConfigList["+ j +"].FillMode"));
				mediaInputConfig.setPositionRefer(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].MediaInputConfigList["+ j +"].PositionRefer"));
				mediaInputConfig.setChannelId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].MediaInputConfigList["+ j +"].ChannelId"));
				mediaInputConfig.setVideoResourceId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].MediaInputConfigList["+ j +"].VideoResourceId"));
				mediaInputConfig.setWidthNormalized(_ctx.floatValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].MediaInputConfigList["+ j +"].WidthNormalized"));
				mediaInputConfig.setImageMaterialId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].MediaInputConfigList["+ j +"].ImageMaterialId"));
				mediaInputConfig.setId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].MediaInputConfigList["+ j +"].Id"));

				List<Float> positionNormalized = new ArrayList<Float>();
				for (int k = 0; k < _ctx.lengthValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].MediaInputConfigList["+ j +"].PositionNormalized.Length"); k++) {
					positionNormalized.add(_ctx.floatValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].MediaInputConfigList["+ j +"].PositionNormalized["+ k +"]"));
				}
				mediaInputConfig.setPositionNormalized(positionNormalized);

				mediaInputConfigList.add(mediaInputConfig);
			}
			studioLayout.setMediaInputConfigList(mediaInputConfigList);

			List<LayerOrderConfig> layerOrderConfigList = new ArrayList<LayerOrderConfig>();
			for (int j = 0; j < _ctx.lengthValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].LayerOrderConfigList.Length"); j++) {
				LayerOrderConfig layerOrderConfig = new LayerOrderConfig();
				layerOrderConfig.setType(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].LayerOrderConfigList["+ j +"].Type"));
				layerOrderConfig.setId(_ctx.stringValue("DescribeStudioLayoutsResponse.StudioLayouts["+ i +"].LayerOrderConfigList["+ j +"].Id"));

				layerOrderConfigList.add(layerOrderConfig);
			}
			studioLayout.setLayerOrderConfigList(layerOrderConfigList);

			studioLayouts.add(studioLayout);
		}
		describeStudioLayoutsResponse.setStudioLayouts(studioLayouts);
	 
	 	return describeStudioLayoutsResponse;
	}
}