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

import com.aliyuncs.green.model.v20170823.DescribeWebsiteScanResultDetailResponse;
import com.aliyuncs.green.model.v20170823.DescribeWebsiteScanResultDetailResponse.ImageScanResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebsiteScanResultDetailResponseUnmarshaller {

	public static DescribeWebsiteScanResultDetailResponse unmarshall(DescribeWebsiteScanResultDetailResponse describeWebsiteScanResultDetailResponse, UnmarshallerContext context) {
		
		describeWebsiteScanResultDetailResponse.setRequestId(context.stringValue("DescribeWebsiteScanResultDetailResponse.RequestId"));
		describeWebsiteScanResultDetailResponse.setBaseline(context.stringValue("DescribeWebsiteScanResultDetailResponse.Baseline"));
		describeWebsiteScanResultDetailResponse.setContent(context.stringValue("DescribeWebsiteScanResultDetailResponse.Content"));
		describeWebsiteScanResultDetailResponse.setTamperedSource(context.stringValue("DescribeWebsiteScanResultDetailResponse.TamperedSource"));
		describeWebsiteScanResultDetailResponse.setResourceType(context.stringValue("DescribeWebsiteScanResultDetailResponse.ResourceType"));

		List<String> hitKeywords = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeWebsiteScanResultDetailResponse.HitKeywords.Length"); i++) {
			hitKeywords.add(context.stringValue("DescribeWebsiteScanResultDetailResponse.HitKeywords["+ i +"]"));
		}
		describeWebsiteScanResultDetailResponse.setHitKeywords(hitKeywords);

		List<ImageScanResult> imageScanResults = new ArrayList<ImageScanResult>();
		for (int i = 0; i < context.lengthValue("DescribeWebsiteScanResultDetailResponse.ImageScanResults.Length"); i++) {
			ImageScanResult imageScanResult = new ImageScanResult();
			imageScanResult.setUrl(context.stringValue("DescribeWebsiteScanResultDetailResponse.ImageScanResults["+ i +"].Url"));

			List<String> labels = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeWebsiteScanResultDetailResponse.ImageScanResults["+ i +"].Labels.Length"); j++) {
				labels.add(context.stringValue("DescribeWebsiteScanResultDetailResponse.ImageScanResults["+ i +"].Labels["+ j +"]"));
			}
			imageScanResult.setLabels(labels);

			imageScanResults.add(imageScanResult);
		}
		describeWebsiteScanResultDetailResponse.setImageScanResults(imageScanResults);
	 
	 	return describeWebsiteScanResultDetailResponse;
	}
}