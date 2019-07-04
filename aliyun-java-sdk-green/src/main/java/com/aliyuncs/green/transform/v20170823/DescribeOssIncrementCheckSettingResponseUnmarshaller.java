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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeOssIncrementCheckSettingResponse;
import com.aliyuncs.green.model.v20170823.DescribeOssIncrementCheckSettingResponse.BucketConfig;
import com.aliyuncs.green.model.v20170823.DescribeOssIncrementCheckSettingResponse.ImageAutoFreeze;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssIncrementCheckSettingResponseUnmarshaller {

	public static DescribeOssIncrementCheckSettingResponse unmarshall(DescribeOssIncrementCheckSettingResponse describeOssIncrementCheckSettingResponse, UnmarshallerContext _ctx) {
		
		describeOssIncrementCheckSettingResponse.setRequestId(_ctx.stringValue("DescribeOssIncrementCheckSettingResponse.RequestId"));
		describeOssIncrementCheckSettingResponse.setImageEnableLimit(_ctx.booleanValue("DescribeOssIncrementCheckSettingResponse.ImageEnableLimit"));
		describeOssIncrementCheckSettingResponse.setImageScanLimit(_ctx.longValue("DescribeOssIncrementCheckSettingResponse.ImageScanLimit"));
		describeOssIncrementCheckSettingResponse.setVideoFrameInterval(_ctx.integerValue("DescribeOssIncrementCheckSettingResponse.VideoFrameInterval"));
		describeOssIncrementCheckSettingResponse.setVideoMaxFrames(_ctx.integerValue("DescribeOssIncrementCheckSettingResponse.VideoMaxFrames"));
		describeOssIncrementCheckSettingResponse.setVideoMaxSize(_ctx.integerValue("DescribeOssIncrementCheckSettingResponse.VideoMaxSize"));
		describeOssIncrementCheckSettingResponse.setAutoFreezeType(_ctx.stringValue("DescribeOssIncrementCheckSettingResponse.AutoFreezeType"));

		List<String> imageSceneList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssIncrementCheckSettingResponse.ImageSceneList.Length"); i++) {
			imageSceneList.add(_ctx.stringValue("DescribeOssIncrementCheckSettingResponse.ImageSceneList["+ i +"]"));
		}
		describeOssIncrementCheckSettingResponse.setImageSceneList(imageSceneList);

		List<String> videoSceneList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssIncrementCheckSettingResponse.VideoSceneList.Length"); i++) {
			videoSceneList.add(_ctx.stringValue("DescribeOssIncrementCheckSettingResponse.VideoSceneList["+ i +"]"));
		}
		describeOssIncrementCheckSettingResponse.setVideoSceneList(videoSceneList);

		List<String> videoAutoFreezeSceneList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssIncrementCheckSettingResponse.VideoAutoFreezeSceneList.Length"); i++) {
			videoAutoFreezeSceneList.add(_ctx.stringValue("DescribeOssIncrementCheckSettingResponse.VideoAutoFreezeSceneList["+ i +"]"));
		}
		describeOssIncrementCheckSettingResponse.setVideoAutoFreezeSceneList(videoAutoFreezeSceneList);

		ImageAutoFreeze imageAutoFreeze = new ImageAutoFreeze();
		imageAutoFreeze.setEnabled(_ctx.booleanValue("DescribeOssIncrementCheckSettingResponse.ImageAutoFreeze.Enabled"));
		imageAutoFreeze.setPorn(_ctx.stringValue("DescribeOssIncrementCheckSettingResponse.ImageAutoFreeze.Porn"));
		imageAutoFreeze.setTerrorism(_ctx.stringValue("DescribeOssIncrementCheckSettingResponse.ImageAutoFreeze.Terrorism"));
		describeOssIncrementCheckSettingResponse.setImageAutoFreeze(imageAutoFreeze);

		List<BucketConfig> bucketConfigList = new ArrayList<BucketConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssIncrementCheckSettingResponse.BucketConfigList.Length"); i++) {
			BucketConfig bucketConfig = new BucketConfig();
			bucketConfig.setSelected(_ctx.booleanValue("DescribeOssIncrementCheckSettingResponse.BucketConfigList["+ i +"].Selected"));
			bucketConfig.setBucket(_ctx.stringValue("DescribeOssIncrementCheckSettingResponse.BucketConfigList["+ i +"].Bucket"));

			List<String> prefixes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOssIncrementCheckSettingResponse.BucketConfigList["+ i +"].Prefixes.Length"); j++) {
				prefixes.add(_ctx.stringValue("DescribeOssIncrementCheckSettingResponse.BucketConfigList["+ i +"].Prefixes["+ j +"]"));
			}
			bucketConfig.setPrefixes(prefixes);

			bucketConfigList.add(bucketConfig);
		}
		describeOssIncrementCheckSettingResponse.setBucketConfigList(bucketConfigList);
	 
	 	return describeOssIncrementCheckSettingResponse;
	}
}