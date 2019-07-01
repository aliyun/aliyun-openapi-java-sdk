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

	public static DescribeOssIncrementCheckSettingResponse unmarshall(DescribeOssIncrementCheckSettingResponse describeOssIncrementCheckSettingResponse, UnmarshallerContext context) {
		
		describeOssIncrementCheckSettingResponse.setRequestId(context.stringValue("DescribeOssIncrementCheckSettingResponse.RequestId"));
		describeOssIncrementCheckSettingResponse.setImageEnableLimit(context.booleanValue("DescribeOssIncrementCheckSettingResponse.ImageEnableLimit"));
		describeOssIncrementCheckSettingResponse.setImageScanLimit(context.longValue("DescribeOssIncrementCheckSettingResponse.ImageScanLimit"));
		describeOssIncrementCheckSettingResponse.setVideoFrameInterval(context.integerValue("DescribeOssIncrementCheckSettingResponse.VideoFrameInterval"));
		describeOssIncrementCheckSettingResponse.setVideoMaxFrames(context.integerValue("DescribeOssIncrementCheckSettingResponse.VideoMaxFrames"));
		describeOssIncrementCheckSettingResponse.setVideoMaxSize(context.integerValue("DescribeOssIncrementCheckSettingResponse.VideoMaxSize"));
		describeOssIncrementCheckSettingResponse.setAutoFreezeType(context.stringValue("DescribeOssIncrementCheckSettingResponse.AutoFreezeType"));

		List<String> imageSceneList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeOssIncrementCheckSettingResponse.ImageSceneList.Length"); i++) {
			imageSceneList.add(context.stringValue("DescribeOssIncrementCheckSettingResponse.ImageSceneList["+ i +"]"));
		}
		describeOssIncrementCheckSettingResponse.setImageSceneList(imageSceneList);

		List<String> videoSceneList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeOssIncrementCheckSettingResponse.VideoSceneList.Length"); i++) {
			videoSceneList.add(context.stringValue("DescribeOssIncrementCheckSettingResponse.VideoSceneList["+ i +"]"));
		}
		describeOssIncrementCheckSettingResponse.setVideoSceneList(videoSceneList);

		List<String> videoAutoFreezeSceneList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeOssIncrementCheckSettingResponse.VideoAutoFreezeSceneList.Length"); i++) {
			videoAutoFreezeSceneList.add(context.stringValue("DescribeOssIncrementCheckSettingResponse.VideoAutoFreezeSceneList["+ i +"]"));
		}
		describeOssIncrementCheckSettingResponse.setVideoAutoFreezeSceneList(videoAutoFreezeSceneList);

		ImageAutoFreeze imageAutoFreeze = new ImageAutoFreeze();
		imageAutoFreeze.setEnabled(context.booleanValue("DescribeOssIncrementCheckSettingResponse.ImageAutoFreeze.Enabled"));
		imageAutoFreeze.setPorn(context.stringValue("DescribeOssIncrementCheckSettingResponse.ImageAutoFreeze.Porn"));
		imageAutoFreeze.setTerrorism(context.stringValue("DescribeOssIncrementCheckSettingResponse.ImageAutoFreeze.Terrorism"));
		describeOssIncrementCheckSettingResponse.setImageAutoFreeze(imageAutoFreeze);

		List<BucketConfig> bucketConfigList = new ArrayList<BucketConfig>();
		for (int i = 0; i < context.lengthValue("DescribeOssIncrementCheckSettingResponse.BucketConfigList.Length"); i++) {
			BucketConfig bucketConfig = new BucketConfig();
			bucketConfig.setSelected(context.booleanValue("DescribeOssIncrementCheckSettingResponse.BucketConfigList["+ i +"].Selected"));
			bucketConfig.setBucket(context.stringValue("DescribeOssIncrementCheckSettingResponse.BucketConfigList["+ i +"].Bucket"));

			List<String> prefixes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeOssIncrementCheckSettingResponse.BucketConfigList["+ i +"].Prefixes.Length"); j++) {
				prefixes.add(context.stringValue("DescribeOssIncrementCheckSettingResponse.BucketConfigList["+ i +"].Prefixes["+ j +"]"));
			}
			bucketConfig.setPrefixes(prefixes);

			bucketConfigList.add(bucketConfig);
		}
		describeOssIncrementCheckSettingResponse.setBucketConfigList(bucketConfigList);
	 
	 	return describeOssIncrementCheckSettingResponse;
	}
}