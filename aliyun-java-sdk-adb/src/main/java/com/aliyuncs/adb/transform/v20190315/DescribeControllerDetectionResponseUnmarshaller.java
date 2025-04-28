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

import com.aliyuncs.adb.model.v20190315.DescribeControllerDetectionResponse;
import com.aliyuncs.adb.model.v20190315.DescribeControllerDetectionResponse.BaseDetectionItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeControllerDetectionResponseUnmarshaller {

	public static DescribeControllerDetectionResponse unmarshall(DescribeControllerDetectionResponse describeControllerDetectionResponse, UnmarshallerContext _ctx) {
		
		describeControllerDetectionResponse.setRequestId(_ctx.stringValue("DescribeControllerDetectionResponse.RequestId"));
		describeControllerDetectionResponse.setTotalCount(_ctx.stringValue("DescribeControllerDetectionResponse.TotalCount"));
		describeControllerDetectionResponse.setDBClusterId(_ctx.stringValue("DescribeControllerDetectionResponse.DBClusterId"));

		List<BaseDetectionItem> detectionItems = new ArrayList<BaseDetectionItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeControllerDetectionResponse.DetectionItems.Length"); i++) {
			BaseDetectionItem baseDetectionItem = new BaseDetectionItem();
			baseDetectionItem.setMessage(_ctx.stringValue("DescribeControllerDetectionResponse.DetectionItems["+ i +"].Message"));
			baseDetectionItem.setName(_ctx.stringValue("DescribeControllerDetectionResponse.DetectionItems["+ i +"].Name"));
			baseDetectionItem.setStatus(_ctx.stringValue("DescribeControllerDetectionResponse.DetectionItems["+ i +"].Status"));

			detectionItems.add(baseDetectionItem);
		}
		describeControllerDetectionResponse.setDetectionItems(detectionItems);
	 
	 	return describeControllerDetectionResponse;
	}
}