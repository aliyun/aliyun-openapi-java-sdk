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

import com.aliyuncs.green.model.v20170823.DescribeWebsiteScanResultResponse;
import com.aliyuncs.green.model.v20170823.DescribeWebsiteScanResultResponse.WebsiteScanResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebsiteScanResultResponseUnmarshaller {

	public static DescribeWebsiteScanResultResponse unmarshall(DescribeWebsiteScanResultResponse describeWebsiteScanResultResponse, UnmarshallerContext context) {
		
		describeWebsiteScanResultResponse.setRequestId(context.stringValue("DescribeWebsiteScanResultResponse.RequestId"));
		describeWebsiteScanResultResponse.setPageSize(context.integerValue("DescribeWebsiteScanResultResponse.PageSize"));
		describeWebsiteScanResultResponse.setCurrentPage(context.integerValue("DescribeWebsiteScanResultResponse.CurrentPage"));
		describeWebsiteScanResultResponse.setTotalCount(context.integerValue("DescribeWebsiteScanResultResponse.TotalCount"));

		List<WebsiteScanResult> websiteScanResultList = new ArrayList<WebsiteScanResult>();
		for (int i = 0; i < context.lengthValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList.Length"); i++) {
			WebsiteScanResult websiteScanResult = new WebsiteScanResult();
			websiteScanResult.setInstanceId(context.stringValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].InstanceId"));
			websiteScanResult.setScanTime(context.stringValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].ScanTime"));
			websiteScanResult.setDomain(context.stringValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].Domain"));
			websiteScanResult.setSourceRiskCount(context.integerValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].SourceRiskCount"));
			websiteScanResult.setImageRiskCount(context.integerValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].ImageRiskCount"));
			websiteScanResult.setHandleStatus(context.integerValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].HandleStatus"));
			websiteScanResult.setId(context.integerValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].Id"));
			websiteScanResult.setTextRiskCount(context.integerValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].TextRiskCount"));
			websiteScanResult.setTaskId(context.stringValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].TaskId"));
			websiteScanResult.setUrl(context.stringValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].Url"));

			List<String> labels = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].Labels.Length"); j++) {
				labels.add(context.stringValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].Labels["+ j +"]"));
			}
			websiteScanResult.setLabels(labels);

			websiteScanResultList.add(websiteScanResult);
		}
		describeWebsiteScanResultResponse.setWebsiteScanResultList(websiteScanResultList);
	 
	 	return describeWebsiteScanResultResponse;
	}
}