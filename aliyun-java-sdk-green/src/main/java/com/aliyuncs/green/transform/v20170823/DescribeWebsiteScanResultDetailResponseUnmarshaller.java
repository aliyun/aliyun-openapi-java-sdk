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

	public static DescribeWebsiteScanResultDetailResponse unmarshall(DescribeWebsiteScanResultDetailResponse describeWebsiteScanResultDetailResponse, UnmarshallerContext _ctx) {
		
		describeWebsiteScanResultDetailResponse.setRequestId(_ctx.stringValue("DescribeWebsiteScanResultDetailResponse.RequestId"));
		describeWebsiteScanResultDetailResponse.setBaseline(_ctx.stringValue("DescribeWebsiteScanResultDetailResponse.Baseline"));
		describeWebsiteScanResultDetailResponse.setContent(_ctx.stringValue("DescribeWebsiteScanResultDetailResponse.Content"));
		describeWebsiteScanResultDetailResponse.setTamperedSource(_ctx.stringValue("DescribeWebsiteScanResultDetailResponse.TamperedSource"));
		describeWebsiteScanResultDetailResponse.setResourceType(_ctx.stringValue("DescribeWebsiteScanResultDetailResponse.ResourceType"));

		List<String> hitKeywords = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebsiteScanResultDetailResponse.HitKeywords.Length"); i++) {
			hitKeywords.add(_ctx.stringValue("DescribeWebsiteScanResultDetailResponse.HitKeywords["+ i +"]"));
		}
		describeWebsiteScanResultDetailResponse.setHitKeywords(hitKeywords);

		List<ImageScanResult> imageScanResults = new ArrayList<ImageScanResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebsiteScanResultDetailResponse.ImageScanResults.Length"); i++) {
			ImageScanResult imageScanResult = new ImageScanResult();
			imageScanResult.setUrl(_ctx.stringValue("DescribeWebsiteScanResultDetailResponse.ImageScanResults["+ i +"].Url"));

			List<String> labels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebsiteScanResultDetailResponse.ImageScanResults["+ i +"].Labels.Length"); j++) {
				labels.add(_ctx.stringValue("DescribeWebsiteScanResultDetailResponse.ImageScanResults["+ i +"].Labels["+ j +"]"));
			}
			imageScanResult.setLabels(labels);

			imageScanResults.add(imageScanResult);
		}
		describeWebsiteScanResultDetailResponse.setImageScanResults(imageScanResults);
	 
	 	return describeWebsiteScanResultDetailResponse;
	}
}