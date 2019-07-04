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

	public static DescribeWebsiteScanResultResponse unmarshall(DescribeWebsiteScanResultResponse describeWebsiteScanResultResponse, UnmarshallerContext _ctx) {
		
		describeWebsiteScanResultResponse.setRequestId(_ctx.stringValue("DescribeWebsiteScanResultResponse.RequestId"));
		describeWebsiteScanResultResponse.setPageSize(_ctx.integerValue("DescribeWebsiteScanResultResponse.PageSize"));
		describeWebsiteScanResultResponse.setCurrentPage(_ctx.integerValue("DescribeWebsiteScanResultResponse.CurrentPage"));
		describeWebsiteScanResultResponse.setTotalCount(_ctx.integerValue("DescribeWebsiteScanResultResponse.TotalCount"));

		List<WebsiteScanResult> websiteScanResultList = new ArrayList<WebsiteScanResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList.Length"); i++) {
			WebsiteScanResult websiteScanResult = new WebsiteScanResult();
			websiteScanResult.setInstanceId(_ctx.stringValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].InstanceId"));
			websiteScanResult.setScanTime(_ctx.stringValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].ScanTime"));
			websiteScanResult.setDomain(_ctx.stringValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].Domain"));
			websiteScanResult.setSourceRiskCount(_ctx.integerValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].SourceRiskCount"));
			websiteScanResult.setImageRiskCount(_ctx.integerValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].ImageRiskCount"));
			websiteScanResult.setHandleStatus(_ctx.integerValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].HandleStatus"));
			websiteScanResult.setId(_ctx.integerValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].Id"));
			websiteScanResult.setTextRiskCount(_ctx.integerValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].TextRiskCount"));
			websiteScanResult.setTaskId(_ctx.stringValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].TaskId"));
			websiteScanResult.setUrl(_ctx.stringValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].Url"));

			List<String> labels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].Labels.Length"); j++) {
				labels.add(_ctx.stringValue("DescribeWebsiteScanResultResponse.WebsiteScanResultList["+ i +"].Labels["+ j +"]"));
			}
			websiteScanResult.setLabels(labels);

			websiteScanResultList.add(websiteScanResult);
		}
		describeWebsiteScanResultResponse.setWebsiteScanResultList(websiteScanResultList);
	 
	 	return describeWebsiteScanResultResponse;
	}
}