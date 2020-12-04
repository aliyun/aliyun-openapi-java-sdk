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

import com.aliyuncs.green.model.v20170823.DescribeOssStockStatusResponse;
import com.aliyuncs.green.model.v20170823.DescribeOssStockStatusResponse.Bucket;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssStockStatusResponseUnmarshaller {

	public static DescribeOssStockStatusResponse unmarshall(DescribeOssStockStatusResponse describeOssStockStatusResponse, UnmarshallerContext _ctx) {
		
		describeOssStockStatusResponse.setRequestId(_ctx.stringValue("DescribeOssStockStatusResponse.RequestId"));
		describeOssStockStatusResponse.setStockStatus(_ctx.integerValue("DescribeOssStockStatusResponse.StockStatus"));
		describeOssStockStatusResponse.setFinishedTime(_ctx.stringValue("DescribeOssStockStatusResponse.FinishedTime"));
		describeOssStockStatusResponse.setImageTotalCount(_ctx.integerValue("DescribeOssStockStatusResponse.ImageTotalCount"));
		describeOssStockStatusResponse.setImagePornCount(_ctx.integerValue("DescribeOssStockStatusResponse.ImagePornCount"));
		describeOssStockStatusResponse.setImageTerrorismCount(_ctx.integerValue("DescribeOssStockStatusResponse.ImageTerrorismCount"));
		describeOssStockStatusResponse.setImageAdCount(_ctx.integerValue("DescribeOssStockStatusResponse.ImageAdCount"));
		describeOssStockStatusResponse.setImageLiveCount(_ctx.integerValue("DescribeOssStockStatusResponse.ImageLiveCount"));
		describeOssStockStatusResponse.setVideoTotalCount(_ctx.integerValue("DescribeOssStockStatusResponse.VideoTotalCount"));
		describeOssStockStatusResponse.setVideoPornCount(_ctx.integerValue("DescribeOssStockStatusResponse.VideoPornCount"));
		describeOssStockStatusResponse.setVideoTerrorismCount(_ctx.integerValue("DescribeOssStockStatusResponse.VideoTerrorismCount"));
		describeOssStockStatusResponse.setVideoAdCount(_ctx.integerValue("DescribeOssStockStatusResponse.VideoAdCount"));
		describeOssStockStatusResponse.setVideoLiveCount(_ctx.integerValue("DescribeOssStockStatusResponse.VideoLiveCount"));
		describeOssStockStatusResponse.setVideoVoiceAntispamCount(_ctx.integerValue("DescribeOssStockStatusResponse.VideoVoiceAntispamCount"));
		describeOssStockStatusResponse.setAudioTotalCount(_ctx.integerValue("DescribeOssStockStatusResponse.AudioTotalCount"));
		describeOssStockStatusResponse.setAudioAntispamCount(_ctx.integerValue("DescribeOssStockStatusResponse.AudioAntispamCount"));

		List<String> sceneList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssStockStatusResponse.SceneList.Length"); i++) {
			sceneList.add(_ctx.stringValue("DescribeOssStockStatusResponse.SceneList["+ i +"]"));
		}
		describeOssStockStatusResponse.setSceneList(sceneList);

		List<String> resouceTypeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssStockStatusResponse.ResouceTypeList.Length"); i++) {
			resouceTypeList.add(_ctx.stringValue("DescribeOssStockStatusResponse.ResouceTypeList["+ i +"]"));
		}
		describeOssStockStatusResponse.setResouceTypeList(resouceTypeList);

		List<Bucket> bucketList = new ArrayList<Bucket>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssStockStatusResponse.BucketList.Length"); i++) {
			Bucket bucket = new Bucket();
			bucket.setSelected(_ctx.booleanValue("DescribeOssStockStatusResponse.BucketList["+ i +"].Selected"));
			bucket.setBucket(_ctx.stringValue("DescribeOssStockStatusResponse.BucketList["+ i +"].Bucket"));

			List<String> prefixes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOssStockStatusResponse.BucketList["+ i +"].Prefixes.Length"); j++) {
				prefixes.add(_ctx.stringValue("DescribeOssStockStatusResponse.BucketList["+ i +"].Prefixes["+ j +"]"));
			}
			bucket.setPrefixes(prefixes);

			bucketList.add(bucket);
		}
		describeOssStockStatusResponse.setBucketList(bucketList);
	 
	 	return describeOssStockStatusResponse;
	}
}