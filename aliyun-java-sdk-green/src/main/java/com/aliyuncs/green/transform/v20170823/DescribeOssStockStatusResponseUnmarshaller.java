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

	public static DescribeOssStockStatusResponse unmarshall(DescribeOssStockStatusResponse describeOssStockStatusResponse, UnmarshallerContext context) {
		
		describeOssStockStatusResponse.setRequestId(context.stringValue("DescribeOssStockStatusResponse.RequestId"));
		describeOssStockStatusResponse.setStockStatus(context.integerValue("DescribeOssStockStatusResponse.StockStatus"));
		describeOssStockStatusResponse.setFinishedTime(context.stringValue("DescribeOssStockStatusResponse.FinishedTime"));
		describeOssStockStatusResponse.setImageTotalCount(context.integerValue("DescribeOssStockStatusResponse.ImageTotalCount"));
		describeOssStockStatusResponse.setImagePornCount(context.integerValue("DescribeOssStockStatusResponse.ImagePornCount"));
		describeOssStockStatusResponse.setImageTerrorismCount(context.integerValue("DescribeOssStockStatusResponse.ImageTerrorismCount"));
		describeOssStockStatusResponse.setVideoTotalCount(context.integerValue("DescribeOssStockStatusResponse.VideoTotalCount"));
		describeOssStockStatusResponse.setVideoPornCount(context.integerValue("DescribeOssStockStatusResponse.VideoPornCount"));
		describeOssStockStatusResponse.setVideoTerrorismCount(context.integerValue("DescribeOssStockStatusResponse.VideoTerrorismCount"));

		List<String> sceneList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeOssStockStatusResponse.SceneList.Length"); i++) {
			sceneList.add(context.stringValue("DescribeOssStockStatusResponse.SceneList["+ i +"]"));
		}
		describeOssStockStatusResponse.setSceneList(sceneList);

		List<String> resouceTypeList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeOssStockStatusResponse.ResouceTypeList.Length"); i++) {
			resouceTypeList.add(context.stringValue("DescribeOssStockStatusResponse.ResouceTypeList["+ i +"]"));
		}
		describeOssStockStatusResponse.setResouceTypeList(resouceTypeList);

		List<Bucket> bucketList = new ArrayList<Bucket>();
		for (int i = 0; i < context.lengthValue("DescribeOssStockStatusResponse.BucketList.Length"); i++) {
			Bucket bucket = new Bucket();
			bucket.setSelected(context.booleanValue("DescribeOssStockStatusResponse.BucketList["+ i +"].Selected"));
			bucket.setBucket(context.stringValue("DescribeOssStockStatusResponse.BucketList["+ i +"].Bucket"));

			List<String> prefixes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeOssStockStatusResponse.BucketList["+ i +"].Prefixes.Length"); j++) {
				prefixes.add(context.stringValue("DescribeOssStockStatusResponse.BucketList["+ i +"].Prefixes["+ j +"]"));
			}
			bucket.setPrefixes(prefixes);

			bucketList.add(bucket);
		}
		describeOssStockStatusResponse.setBucketList(bucketList);
	 
	 	return describeOssStockStatusResponse;
	}
}