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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeAbnormalPatternDetectionResponse;
import com.aliyuncs.adb.model.v20190315.DescribeAbnormalPatternDetectionResponse.OpenApiFasDetectionItem;
import com.aliyuncs.adb.model.v20190315.DescribeAbnormalPatternDetectionResponse.OpenApiFasDetectionItem.AbnormalPatterns;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAbnormalPatternDetectionResponseUnmarshaller {

	public static DescribeAbnormalPatternDetectionResponse unmarshall(DescribeAbnormalPatternDetectionResponse describeAbnormalPatternDetectionResponse, UnmarshallerContext _ctx) {
		
		describeAbnormalPatternDetectionResponse.setRequestId(_ctx.stringValue("DescribeAbnormalPatternDetectionResponse.RequestId"));
		describeAbnormalPatternDetectionResponse.setTotalCount(_ctx.stringValue("DescribeAbnormalPatternDetectionResponse.TotalCount"));
		describeAbnormalPatternDetectionResponse.setDBClusterId(_ctx.stringValue("DescribeAbnormalPatternDetectionResponse.DBClusterId"));

		List<OpenApiFasDetectionItem> detectionItems = new ArrayList<OpenApiFasDetectionItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAbnormalPatternDetectionResponse.DetectionItems.Length"); i++) {
			OpenApiFasDetectionItem openApiFasDetectionItem = new OpenApiFasDetectionItem();
			openApiFasDetectionItem.setName(_ctx.stringValue("DescribeAbnormalPatternDetectionResponse.DetectionItems["+ i +"].Name"));
			openApiFasDetectionItem.setStatus(_ctx.stringValue("DescribeAbnormalPatternDetectionResponse.DetectionItems["+ i +"].Status"));
			openApiFasDetectionItem.setMessage(_ctx.stringValue("DescribeAbnormalPatternDetectionResponse.DetectionItems["+ i +"].Message"));

			List<AbnormalPatterns> results = new ArrayList<AbnormalPatterns>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAbnormalPatternDetectionResponse.DetectionItems["+ i +"].Results.Length"); j++) {
				AbnormalPatterns abnormalPatterns = new AbnormalPatterns();
				abnormalPatterns.setPatternId(_ctx.stringValue("DescribeAbnormalPatternDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].PatternId"));
				abnormalPatterns.setSQLPattern(_ctx.stringValue("DescribeAbnormalPatternDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].SQLPattern"));
				abnormalPatterns.setDetail(_ctx.stringValue("DescribeAbnormalPatternDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].Detail"));
				abnormalPatterns.setRelatedMetrics(_ctx.stringValue("DescribeAbnormalPatternDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].RelatedMetrics"));
				abnormalPatterns.setUser(_ctx.stringValue("DescribeAbnormalPatternDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].User"));
				abnormalPatterns.setAccessIp(_ctx.stringValue("DescribeAbnormalPatternDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].AccessIp"));
				abnormalPatterns.setTables(_ctx.stringValue("DescribeAbnormalPatternDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].Tables"));
				abnormalPatterns.setQueryCount(_ctx.longValue("DescribeAbnormalPatternDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].QueryCount"));
				abnormalPatterns.setFailedCount(_ctx.longValue("DescribeAbnormalPatternDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].FailedCount"));

				results.add(abnormalPatterns);
			}
			openApiFasDetectionItem.setResults(results);

			detectionItems.add(openApiFasDetectionItem);
		}
		describeAbnormalPatternDetectionResponse.setDetectionItems(detectionItems);
	 
	 	return describeAbnormalPatternDetectionResponse;
	}
}